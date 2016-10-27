package com.nghiabui.lochelper.core.adb;

public class AdbFactory {
	
	public static DeviceList createDeviceList() {
		return new DeviceList(new AdbExecutorImpl());
	}
	
}
