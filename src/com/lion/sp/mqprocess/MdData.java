package com.lion.sp.mqprocess;

import com.lion.flatbuffers.FbEsTapAPIQuoteWhole;

public class MdData {
	private volatile FbEsTapAPIQuoteWhole data;
	private volatile long time;
	private volatile boolean flushed = false;
	
	
	public MdData(FbEsTapAPIQuoteWhole data, long time) {
		super();
		this.data = data;
		this.time = time;
	}
	public FbEsTapAPIQuoteWhole getData() {
		return data;
	}
	public void setData(FbEsTapAPIQuoteWhole data) {
		this.data = data;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public boolean getFlushed() {
		return flushed;
	}
	public void setFlushed(boolean flushed) {
		this.flushed = flushed;
	}
	
}
