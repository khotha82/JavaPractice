package com.example.effjava.spf;

/**
 * Created by krishna_hotha on 6/22/15 2015.
 */
public class TrainProvider implements Provider {
	@Override
	public TravelService createService() {
		return new TrainService();
	}
}
