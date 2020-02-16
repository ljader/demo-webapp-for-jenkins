package pl.ljader.demo.demowebappforjenkins;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	@Autowired
	private DateTimeProvider dateTimeProvider;

	@GetMapping("/sampleDateTime")
	public String sampleDateTime() {
		return "response: " + dateTimeProvider.getDateTime();
	}

	@GetMapping("/sampleDate")
	public String sampleDate() {
		return "response: " + dateTimeProvider.getDate();
	}
}
