package com.nghiabui.lochelper.core.adb;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DeviceListTest {
	
	@Test
	public void noDevice() {
		final DeviceList list = new DeviceList(new AdbExecutor() {
			@Override
			public List<String> devices() {
				return Arrays.asList(
					"List of devices attached",
					"* daemon not running.starting it now on port 5037 *",
					"* daemon started successfully *"
				);
			}
			
			@Override
			public List<String> getprop(String serial) {
				return null;
			}
		});
		assertTrue(list.get().isEmpty());
	}
	
	@Test
	public void hasDevice() {
		final DeviceList list = new DeviceList(new AdbExecutor() {
			@Override
			public List<String> devices() {
				return Arrays.asList(
					"List of devices attached",
					"emulator-5554\tdevice",
					"emulator-1234\tfoo"
				);
			}
			
			@Override
			public List<String> getprop(String serial) {
				return null;
			}
		});
		final List<Device> devices = list.get();
		assertEquals(2, devices.size());
		
		assertEquals("emulator-5554", devices.get(0).serial());
		assertEquals("emulator-1234", devices.get(1).serial());
	}
	
}
