package nanaev.backend.webrest.init;

import org.springframework.boot.SpringApplication;

public class EnrtyPoint {
    private EnrtyPoint() {
    }
    public static void main(final String[] args){
        SpringApplication.run(SpringBootConfig.class, args);
    }
}
