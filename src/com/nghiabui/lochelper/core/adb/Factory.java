package com.nghiabui.lochelper.core.adb;

public class Factory {
	
	public static DeviceList createDeviceList() {
		return new DeviceList(new AdbExecutorImpl());
	}
	
}
