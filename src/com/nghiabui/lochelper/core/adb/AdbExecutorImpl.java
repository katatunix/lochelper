package com.nghiabui.lochelper.core.adb;

import com.nghiabui.kommon.AppException;
import com.nghiabui.kommon.System;
import com.nghiabui.kommon.Tuple;
import com.nghiabui.kommon.io.MyProcess;
import com.nghiabui.lochelper.core.image.AwtImage;
import com.nghiabui.lochelper.core.image.ImageFactory;

import java.util.List;

class AdbExecutorImpl implements AdbExecutor {
	
	private static final String ADB_PATH = "tools/" + (System.IS_UNIX ? "mac/adb" : "win/adb.exe");
	
	@Override
	public List<String> devices() {
		final Tuple<Integer, List<String>> tup = new MyProcess(ADB_PATH + " devices").exec();
		if (tup.x != 0) throw new AppException("ADB could not get device list");
		return tup.y;
	}
	
	@Override
	public List<String> getprop(String serial) {
		final Tuple<Integer, List<String>> tup = new MyProcess(ADB_PATH + " -s " + serial + " shell getprop").exec();
		if (tup.x != 0) throw new AppException("ADB could not get prop of the device");
		return tup.y;
	}
	
	@Override
	public void pull(String serial, String devFile, String localFolder) {
		final Tuple<Integer, List<String>> tup =
			new MyProcess(ADB_PATH + " -s " + serial + " pull " + devFile + " " + localFolder).exec();
		if (tup.x != 0) throw new AppException("ADB could not pull file from the device");
	}
	
	@Override
	public AwtImage screencap(String serial) {
		final String FILE_NAME = "temp.png";
		final String DEV_FILE = "/sdcard/" + FILE_NAME;
		
		final Tuple<Integer, List<String>> tup =
			new MyProcess(ADB_PATH + " -s " + serial + " shell screencap " + DEV_FILE).exec();
		if (tup.x != 0) throw new AppException("ADB could not capture screen of the device");
		
		try {
			pull(serial, DEV_FILE, ".");
		} catch (AppException e) {
			throw new AppException("ADB could not pull the screenshot file from the device");
		}
		return ImageFactory.createRawImageFromFile(FILE_NAME);
	}
	
}
