package com.tsr.exit;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

@Component
public class CustomExitCode implements ExitCodeGenerator {

	@Override
	public int getExitCode() {
		return 5660;
	}

}
