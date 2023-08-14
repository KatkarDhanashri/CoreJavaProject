package com.tnsif.Multiprocess;

public class ChildThread extends Thread{
	int n;
	String Msg;
	
	public ChildThread(int n,String Msg) {
		this.n=n;
		this.Msg=Msg;
	}
	@Override
	public void run() {
		for(int i=1;i<=n;i++) {
			
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
			System.out.println(i+" "+"Msg");
		}
	}

}
