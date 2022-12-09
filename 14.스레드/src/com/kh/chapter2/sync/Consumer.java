package com.kh.chapter2.sync;

public class Consumer implements Runnable {

	private Storage storage;
	
	public Consumer(Storage storage) {
		super();
		this.storage = storage;
	}
	
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
		
			try {
				storage.getData();
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
