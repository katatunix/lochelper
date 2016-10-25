package com.nghiabui.lochelper.adapter;

import com.nghiabui.lochelper.usecase.UcDeviceList;
import com.nghiabui.lochelper.view.UiDeviceList;

import java.util.stream.Collectors;

public class AdDeviceList {
	
	private final UcDeviceList uc;
	private UiDeviceList ui;
	
	public AdDeviceList(UcDeviceList uc) {
		this.uc = uc;
	}
	
	public void setUi(UiDeviceList ui) {
		this.ui = ui;
	}
	
	public void refresh() {
		ui.apply(uc.refresh().stream().map(tup -> tup.x + " " + tup.y).collect(Collectors.toList()));
	}
	
	public void select(int index) {
		uc.selectDevice(index);
	}
	
}
