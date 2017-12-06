package com.wwq.spring.usb;
public class Computer {
	private USB usb;
	public void setUsb(USB usb) {
		this.usb = usb;
	}
	public void test(){
		usb.write();
		usb.read();
	}

}
