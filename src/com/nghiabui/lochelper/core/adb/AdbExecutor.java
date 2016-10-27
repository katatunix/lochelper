package com.nghiabui.lochelper.core.adb;

import com.nghiabui.lochelper.core.image.AwtImage;

import java.util.List;

interface AdbExecutor {
	
	List<String> devices();
	
	List<String> getprop(String serial);
	
	void pull(String serial, String devFile, String localFolder);
	
	AwtImage screencap(String serial);
	
}
