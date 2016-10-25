package com.nghiabui.lochelper.usecase;

import com.nghiabui.kommon.Tuple;
import com.nghiabui.lochelper.core.adb.DeviceList;
import com.nghiabui.lochelper.core.adb.Factory;

import java.util.List;
import java.util.stream.Collectors;

public class UcRefreshDeviceList {
	
	private final DeviceList deviceList = Factory.createDeviceList();
	
	public List<Tuple<String, String>> exec() {
		return deviceList.get().stream()
			.map(device -> new Tuple<>(device.modelName(), device.serial()))
			.collect(Collectors.toList());
	}
	
}
