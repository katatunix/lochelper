package com.nghiabui.lochelper.usecase;

import java.util.Optional;

public class UcSelectDevice {
	
	private String serial = null;
	
	public void set(String serial) {
		this.serial = serial;
	}
	
	public Optional<String> get() {
		return serial == null ? Optional.empty() : Optional.of(serial);
	}
	
	public void clear() {
		serial = null;
	}
	
}
