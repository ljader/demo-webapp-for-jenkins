package pl.ljader.demo.demowebappforjenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class DateTimeProviderTest {

	@Test
	final void testGetDate() {
		DateTimeProvider provider = new DateTimeProvider();
		String date = provider.getDate();
		assertEquals(date, LocalDate.now().toString());
	}

	@Test
	final void testGetDateTime() {
		DateTimeProvider provider = new DateTimeProvider();
		String date = provider.getDateTime();
		assertEquals(date, LocalDateTime.now().toString());
	}

}
