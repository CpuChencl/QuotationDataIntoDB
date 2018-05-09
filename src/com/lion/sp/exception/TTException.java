package com.lion.sp.exception;

public class TTException extends Exception {
	
	private static final long serialVersionUID = -2846006885368179292L;
	
	private String code;
	private String msg;
	
	public TTException (String errCode, String errMsg){ 
		this.code = errCode;
		this.msg = errMsg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}