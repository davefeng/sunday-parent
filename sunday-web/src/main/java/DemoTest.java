import com.accp.service.DubboTestService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 *@author wangfeng
 *@create 2020-12-29 10:41
 */
public class DemoTest {

	@Test
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		DubboTestService service = ac.getBean(DubboTestService.class);
		System.out.println(service.getMessage("hello world"));
	}

}
