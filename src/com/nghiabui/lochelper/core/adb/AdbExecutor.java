package com.nghiabui.lochelper.core.adb;

import java.util.List;

interface AdbExecutor {
	
	List<String> devices();
	
	List<String> getprop(String serial);
	
}
