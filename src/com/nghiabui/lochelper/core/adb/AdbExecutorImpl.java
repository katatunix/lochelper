package com.nghiabui.lochelper.core.adb;

import com.nghiabui.kommon.System;
import com.nghiabui.kommon.io.MyProcess;

import java.util.List;

class AdbExecutorImpl implements AdbExecutor {
	
	private static final String ADB_PATH = "tools/" + (System.IS_UNIX ? "mac/adb" : "win/adb.exe");
	
	@Override
	public List<String> devices() {
		return new MyProcess(ADB_PATH + " devices").exec();
	}
	
	@Override
	public List<String> getprop(String serial) {
		return new MyProcess(ADB_PATH + " -s " + serial + " shell getprop").exec();
	}
	
}
