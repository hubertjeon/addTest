package addTest.com.sungho;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		GenericXmlApplicationContext gxac = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		adder a = gxac.getBean("add", adder.class);
		int sum = a.adder();
		System.out.println(sum);
		gxac.close();

	}

}
