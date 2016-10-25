package com.nghiabui.lochelper.core.adb;

import java.util.List;
import java.util.stream.Collectors;

public class DeviceList {
	
	private final AdbExecutor adbExecutor;
	
	public DeviceList(AdbExecutor adbExecutor) {
		this.adbExecutor = adbExecutor;
	}
	
	public List<Device> get() {
		return adbExecutor.devices().stream()
			.filter(line ->
				!line.trim().isEmpty() &&
				!line.startsWith("List of devices attached") &&
				!line.startsWith("*")
			)
			.map(line -> new Device(line, adbExecutor))
			.collect(Collectors.toList());
	}
	
}
