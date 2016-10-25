package com.nghiabui.lochelper.core.adb;

import com.nghiabui.lochelper.core.image.Image;

public class Device {
	
	private final String adbDevicesLine;
	private final AdbExecutor adbExecutor;
	
	public Device(String adbDevicesLine, AdbExecutor adbExecutor) {
		this.adbDevicesLine = adbDevicesLine;
		this.adbExecutor = adbExecutor;
	}
	
	public String modelName() {
		for (String line : adbExecutor.getprop(serial())) {
			if (line.startsWith("[ro.product.model]")) {
				return line.substring(line.indexOf(":") + 1).trim();
			}
		}
		return "Unknown";
	}
	
	public String serial() {
		final int sep = adbDevicesLine.indexOf('\t');
		return sep == -1 ? adbDevicesLine : adbDevicesLine.substring(0, sep);
	}
	
	public Image screencap() {
		return null; // TODO
	}
	
}
