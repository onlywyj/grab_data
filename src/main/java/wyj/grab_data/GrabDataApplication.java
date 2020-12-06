package wyj.grab_data;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mybatisplus.*.*")
public class GrabDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrabDataApplication.class, args);
    }

}
