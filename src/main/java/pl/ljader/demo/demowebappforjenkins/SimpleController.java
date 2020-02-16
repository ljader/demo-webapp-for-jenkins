package pl.ljader.demo.demowebappforjenkins;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	@GetMapping("/sampleDateTime")
	public String sampleDateTime() {
		return "response: " + LocalDateTime.now();
	}

	@GetMapping("/sampleDate")
	public String sampleDate() {
		return "response: " + LocalDate.now();
	}
}
