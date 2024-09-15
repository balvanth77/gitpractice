package springScheduling;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ProductReportService {
	
	@Scheduled(cron="10 * * * * *")// 2 secs
	public void generatereport() {
		System.out.println("HELLO" + new Date());
		
	}

}
	