package kawajava.github.io.konsument;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class KonsumentApplication {

    public static void main(String[] args) {
        SpringApplication.run(KonsumentApplication.class, args);
    }

}
