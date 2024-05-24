package com.tsr.custom.health;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component("paymentService")
public class PaymentServiceStatusCheck implements HealthIndicator {

	@Value("${payment.service.url}")
	private String serviceURL;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Health health() {
		Health health = null;
		ResponseEntity<String> responseEntity = null;
		try {
			responseEntity = restTemplate.getForEntity(serviceURL, String.class);
			if (responseEntity.getStatusCode() == HttpStatus.OK) {
				health = Health.up().build();
			}
		} catch (Exception e) {
			return Health.down(e).build();
		}

		return health;
	}

}
