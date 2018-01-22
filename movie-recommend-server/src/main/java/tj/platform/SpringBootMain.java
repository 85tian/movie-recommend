package tj.platform;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author 85
 * @date 2018/1/22 2018-01-22 18:24
 * @description spring boot 入口函数
 */
@EnableAsync
@SpringBootApplication(scanBasePackages = "tj")
public class SpringBootMain  implements ApplicationContextAware {

    static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringBootMain.applicationContext = applicationContext;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMain.class,args);
    }
}
