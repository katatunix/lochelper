package com.nghiabui.lochelper.core.adb;

import org.junit.Test;

import java.util.List;

public class FactoryTest {
	
	@Test
	public void createDeviceList() {
		final List<Device> list = Factory.createDeviceList().get();
		System.out.println(list.toString());
	}
	
}
