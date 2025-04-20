package org.mrshoffen.tasktracker.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableConfigServer
public class TaskTrackerConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskTrackerConfigServerApplication.class, args);
    }

}
