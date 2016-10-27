package com.nghiabui.lochelper.adapter;

import com.nghiabui.kommon.AppException;
import com.nghiabui.kommon.Tuple;
import com.nghiabui.lochelper.usecase.UcDeviceList;
import com.nghiabui.lochelper.view.UiDeviceList;

import java.util.List;
import java.util.stream.Collectors;

public class AdDeviceList {
	
	private final UcDeviceList uc;
	private final UiDeviceList ui;
	
	public AdDeviceList(UcDeviceList uc, UiDeviceList ui) {
		this.uc = uc;
		this.ui = ui;
	}
	
	public void refresh() {
		final List<Tuple<String, String>> list;
		try {
			list = uc.refresh();
		} catch (AppException e) {
			ui.error(e.getMessage());
			return;
		}
		ui.apply(list.stream().map(tup -> tup.x + " " + tup.y).collect(Collectors.toList()));
	}
	
	public void select(int index) {
		uc.selectDevice(index);
	}
	
}
