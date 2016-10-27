package com.nghiabui.lochelper.core.image;

import com.nghiabui.kommon.AppException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImageFactory {
	
	public static AwtImage createRawImageFromFile(String path) {
		final BufferedImage bi;
		try {
			bi = ImageIO.read(new File(path));
		} catch (Exception e) {
			throw ex(path);
		}
		if (bi == null) {
			throw ex(path);
		}
		return new AwtImage(bi);
	}
	
	private static AppException ex(String path) {
		return new AppException("Could not load the image file \"" + path + "\"");
	}
	
}
