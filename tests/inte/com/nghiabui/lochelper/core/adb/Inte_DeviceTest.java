package com.nghiabui.lochelper.core.adb;

import com.nghiabui.lochelper.core.image.AwtImage;
import org.junit.Test;
import static org.junit.Assert.*;

public class Inte_DeviceTest {
	
	@Test
	public void screencap() {
		final Device device = AdbFactory.createDeviceList().get().get(0);
		final AwtImage image = device.screencap();
		assertEquals(1152, image.width());
		assertEquals(648, image.height());
	}
	
}
