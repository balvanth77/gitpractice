package springScheduling;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext ac =new AnnotationConfigApplicationContext(AppConfig.class);
		ProductReportService ps=ac.getBean(ProductReportService.class);

	}

}
