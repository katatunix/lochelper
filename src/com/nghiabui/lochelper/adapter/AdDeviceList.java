package com.nghiabui.lochelper.adapter;

import com.nghiabui.kommon.Tuple;
import com.nghiabui.lochelper.usecase.UcSelectDevice;
import com.nghiabui.lochelper.usecase.UcRefreshDeviceList;
import com.nghiabui.lochelper.view.UiDeviceList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AdDeviceList {
	
	private final UcRefreshDeviceList ucRefresh;
	private final UcSelectDevice ucSelect;
	private UiDeviceList ui;
	
	private List<String> serials = new ArrayList<>();
	
	public AdDeviceList(UcRefreshDeviceList ucRefresh, UcSelectDevice ucSelect) {
		this.ucRefresh = ucRefresh;
		this.ucSelect = ucSelect;
	}
	
	public void setUi(UiDeviceList ui) {
		this.ui = ui;
	}
	
	public void refresh() {
		final List<Tuple<String, String>> deviceTup = ucRefresh.exec();
		serials = deviceTup.stream().map(tup -> tup.y).collect(Collectors.toList());
		ui.apply(deviceTup.stream().map(tup -> tup.x + " " + tup.y).collect(Collectors.toList()));
	}
	
	public void select(int index) {
		if (index < 0 || index >= serials.size()) {
			ucSelect.clear();
		} else {
			ucSelect.set(serials.get(index));
		}
		System.out.println(ucSelect.get());
	}
	
}
