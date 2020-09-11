package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Reid
 * @Date 2020/9/10
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperProvider8002 {
    public static void main(String[] args) {
        SpringApplication.run(ZookeeperProvider8002.class);
    }
}
