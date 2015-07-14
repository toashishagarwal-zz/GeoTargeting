package com.demo.geo;

public interface GeoAttributesService {
	String getCity(final String ipAddress) throws Exception;
	String getCountry(final String ipAddress) throws Exception;
}
