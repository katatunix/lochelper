package com.nghiabui.lochelper.adapter;

import com.nghiabui.kommon.AppException;
import com.nghiabui.lochelper.usecase.UcScreenCap;
import com.nghiabui.lochelper.view.UiScreenCap;

import java.awt.*;
import java.util.function.Supplier;

public class AdScreenCap {
	
	private final UcScreenCap uc;
	private UiScreenCap ui;
	
	public AdScreenCap(UcScreenCap uc) {
		this.uc = uc;
	}
	
	public void setUi(UiScreenCap ui) {
		this.ui = ui;
	}
	
	public void capture() {
		handle(uc::capture);
	}
	
	public void loadFromFile(String path) {
		handle(() -> uc.loadFromFile(path));
	}
	
	private void handle(Supplier<Image> supplier) {
		final Image image;
		try {
			image = supplier.get();
		} catch (AppException e) {
			ui.error(e.getMessage());
			return;
		}
		ui.setImage(image);
	}
	
}
