import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *启动类
 *@author wangfeng
 *@create 2020-12-29 9:53
 */
public class App {

	public static void main(String[] args) throws Exception{
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//挂起当前线程，如果没有该行代码，服务提供者进程会消亡，服务消费者就发现不了提供者了
		Thread.currentThread().join();
		//Thread.sleep(Integer.MAX_VALUE);
	}

}
