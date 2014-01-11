package com.morgner.cex.api;

import com.google.gson.annotations.Expose;

/**
 * @author Christian Morgner
 */
public class Ticker {

	@Expose 
	private long timestamp = 0L;

	@Expose
	private double low = 0.0;

	@Expose
	private double high = 0.0;
	
	@Expose
	private double last = 0.0;
	
	@Expose
	private double volume = 0.0;
	
	@Expose
	private double bid = 0.0;
	
	@Expose
	private double ask = 0.0;

	@Override
	public String toString() {
		return "timestamp: " + timestamp + ", high: " + high + ", low: " + low + ", volume: " + volume + ", bid: " + bid + ", ask: " + ask;
	}
	
	public long getTimestamp() {
		return timestamp;
	}

	public double getLow() {
		return low;
	}

	public double getHigh() {
		return high;
	}

	public double getLast() {
		return last;
	}

	public double getVolume() {
		return volume;
	}

	public double getBid() {
		return bid;
	}

	public double getAsk() {
		return ask;
	}
}
