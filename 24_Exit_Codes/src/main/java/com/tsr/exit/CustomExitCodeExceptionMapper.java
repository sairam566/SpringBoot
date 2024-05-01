package com.tsr.exit;

import org.springframework.boot.ExitCodeExceptionMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomExitCodeExceptionMapper implements ExitCodeExceptionMapper{

	@Override
	public int getExitCode(Throwable exception) {
		if(exception.getCause() instanceof NumberFormatException) {
			return 898;
		}
		return 1;
	}

}
