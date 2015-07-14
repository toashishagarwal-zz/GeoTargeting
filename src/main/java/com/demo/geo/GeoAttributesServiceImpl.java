package com.demo.geo;

import java.net.InetAddress;

import com.maxmind.geoip2.model.CityResponse;
import com.maxmind.geoip2.model.CountryResponse;

public class GeoAttributesServiceImpl extends GeoService implements GeoAttributesService {
	private GeoAttributesServiceImpl() throws Exception {
		super();
	}
	
	public static GeoAttributesServiceImpl getInstance() throws Exception {
		return new GeoAttributesServiceImpl();
	}
	
	public String getCity(final String paramIpAddress) throws Exception {
		InetAddress ipAddress = InetAddress.getByName(paramIpAddress);
		CityResponse response = reader.city(ipAddress);
		return response.getCity().getName(); 				
	}

	public String getCountry(String paramIpAddress) throws Exception {
		InetAddress ipAddress = InetAddress.getByName(paramIpAddress);
		CountryResponse response = reader.country(ipAddress);
		return response.getCountry().getName(); 	
	}
}

