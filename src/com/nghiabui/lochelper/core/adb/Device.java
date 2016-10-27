package com.nghiabui.lochelper.core.adb;

import com.nghiabui.lochelper.core.image.AwtImage;

public class Device {
	
	private final String devLine;
	private final AdbExecutor adbExecutor;
	
	public Device(String devLine, AdbExecutor adbExecutor) {
		this.devLine = devLine;
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
		final int sep = devLine.indexOf('\t');
		return sep == -1 ? devLine : devLine.substring(0, sep);
	}
	
	public AwtImage screencap() {
		return adbExecutor.screencap(serial());
	}
	
}
