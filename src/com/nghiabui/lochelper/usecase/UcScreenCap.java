package com.nghiabui.lochelper.usecase;

import com.nghiabui.kommon.AppException;
import com.nghiabui.lochelper.core.adb.Device;
import com.nghiabui.lochelper.core.image.ImageFactory;

import java.awt.*;
import java.util.Optional;

public class UcScreenCap {
	
	private final UcDeviceList ucDeviceList;
	
	public UcScreenCap(UcDeviceList ucDeviceList) {
		this.ucDeviceList = ucDeviceList;
	}
	
	public Image capture() {
		final Optional<Device> op = ucDeviceList.selectedDevice();
		if (!op.isPresent()) throw new AppException("No device selected");
		return op.get().screencap().awt();
	}
	
	public Image loadFromFile(String path) {
		return ImageFactory.createRawImageFromFile(path).awt();
	}
	
}
