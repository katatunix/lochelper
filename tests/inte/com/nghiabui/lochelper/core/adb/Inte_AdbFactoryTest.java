package com.nghiabui.lochelper.core.adb;

import org.junit.Test;

import java.util.List;

public class Inte_AdbFactoryTest {
	
	@Test
	public void createDeviceList() {
		final List<Device> list = AdbFactory.createDeviceList().get();
		System.out.println(list.toString());
	}
	
}
