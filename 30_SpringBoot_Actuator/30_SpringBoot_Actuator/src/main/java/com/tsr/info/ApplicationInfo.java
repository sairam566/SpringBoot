package com.tsr.info;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class ApplicationInfo implements InfoContributor {

	@Override
	public void contribute(Builder builder) {

		Map<String, Object> details = new HashMap<>();
		details.put("Developer", "TSR");

		builder.withDetails(details).build();
	}

}
