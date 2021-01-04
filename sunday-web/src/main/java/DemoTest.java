import com.accp.service.DubboTestService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 *@author wangfeng
 *@create 2020-12-29 10:41
 */
public class DemoTest {

	private static final Logger log = Logger.getLogger(DemoTest.class);

	@Test
	public static void main(String[] args) {
		//log.info("进入测试方法");
		System.out.println("进入测试方法");
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//log.info("开始进入接口方法");
		System.out.println("开始进入接口方法");
		try {
			DubboTestService service = (DubboTestService) ac.getBean("dubboTestService");
			System.out.println("============================="+service.getMessage("hello world2"));
			DubboTestService service2 = ac.getBean(DubboTestService.class);
			System.out.println("============================="+service2.getMessage("hello world1"));

		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

		//log.info("进入接口方法结束");
		System.out.println("进入接口方法结束");

	}

}
