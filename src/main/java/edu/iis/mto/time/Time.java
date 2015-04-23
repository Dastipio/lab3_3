package edu.iis.mto.time;

import org.joda.time.DateTime;

public class Time implements DataTimeSource {

	@Override
	public DateTime now() {
		return new DateTime();
	}

}