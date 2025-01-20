package com.it.foodibd.utilities;

import com.it.foodibd.drivers.BaseDriver;

public class CommonMethods extends BaseDriver{
	public void timeout() throws InterruptedException {
		Thread.sleep(5000);
	}
	public void timeout(int time) throws InterruptedException {
		Thread.sleep(time);
	}

}
