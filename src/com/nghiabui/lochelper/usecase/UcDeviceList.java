package com.nghiabui.lochelper.usecase;

import com.nghiabui.kommon.Tuple;
import com.nghiabui.lochelper.core.adb.Device;
import com.nghiabui.lochelper.core.adb.DeviceList;
import com.nghiabui.lochelper.core.adb.AdbFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UcDeviceList {
	
	private final DeviceList deviceList = AdbFactory.createDeviceList();
	private List<Device> curDevices = new ArrayList<>();
	private int selectedIndex = -1;
	
	public List<Tuple<String, String>> refresh() {
		curDevices = deviceList.get();
		return curDevices.stream()
			.map(device -> new Tuple<>(device.modelName(), device.serial()))
			.collect(Collectors.toList());
	}
	
	public void selectDevice(int index) {
		selectedIndex = index;
	}
	
	public Optional<Device> selectedDevice() {
		return selectedIndex >= 0 && selectedIndex < curDevices.size() ?
			Optional.of(curDevices.get(selectedIndex)) :
			Optional.empty();
	}
	
}
