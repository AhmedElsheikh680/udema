package com.seniorsteps.enums;

public enum LookupType {

	GENDER("GENDER"),
	CATEGORY("CATEGORY");
	
	private String type;
	
	private LookupType(String type) {
		this.type = type;
	}
	
	private String getType() {
		return type;
	}
}
