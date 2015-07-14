package com.demo.geo;

public class Client {
	public static void main(String[] args) throws Exception {
		GeoAttributesService service = GeoAttributesServiceImpl.getInstance();
		System.out.println(" City = " + service.getCity("128.101.101.101"));
		System.out.println(" City = " + service.getCity("61.246.231.130"));
	}
}
