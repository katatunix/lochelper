package com.nghiabui.lochelper.core.adb;

import com.nghiabui.lochelper.core.image.AwtImage;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DeviceTest {
	
	@Test
	public void onlySerial() {
		final Device device = new Device("1234567", fake);
		assertEquals("1234567", device.serial());
	}
	
	@Test
	public void serialAndType_SeparatedByTab() {
		final Device device = new Device("890\tdevice", fake);
		assertEquals("890", device.serial());
	}
	
	@Test
	public void modelName() {
		final Device device = new Device("1234", fake);
		assertEquals("Samsung Galaxy", device.modelName());
	}
	
	//==========================================================================================================
	
	private final AdbExecutor fake = new AdbExecutor() {
		@Override
		public List<String> devices() {
			return null;
		}
		
		@Override
		public List<String> getprop(String serial) {
			return Arrays.asList("foo", "bar", "[ro.product.model]: Samsung Galaxy");
		}
		
		@Override
		public void pull(String serial, String devFile, String localFolder) {
			
		}
		
		@Override
		public AwtImage screencap(String serial) {
			return null;
		}
	};
	
}
