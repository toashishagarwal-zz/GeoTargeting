package com.demo.geo;

import java.io.File;

import com.maxmind.geoip2.DatabaseReader;

public class GeoService {
	private static final String DB_LOCATION = "/Users/agarwala/Desktop/Geotargetting/GeoLite2-City.mmdb";
	
	final private File database;
	final DatabaseReader reader;
	
	public GeoService() throws Exception {
		super();
		database = new File(GeoService.DB_LOCATION);
		reader = new DatabaseReader.Builder(database).build();
	}
}
