package pl.ljader.demo.demowebappforjenkins;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class DateTimeProvider {

	public String getDate() {
		return LocalDate.now().toString();
	}

	public String getDateTime() {
		return LocalDateTime.now().toString();
	}

}
