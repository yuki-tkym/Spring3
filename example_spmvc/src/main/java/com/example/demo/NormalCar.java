package com.example.demo;

public class NormalCar implements Car{
	private String velocity;
	private String distance;
	
	public void setVelocity(String velocity) {
		this.velocity = velocity;
	}
	
	public void setDistance(String distance) {
		this.distance = distance;
	}
	
	public void run() {
		System.out.println("���s���x��"+ velocity + "�ł��B");
	}
	
	public void stop() {
		System.out.println("���s������"+ distance + "�ł��B");
	}
}