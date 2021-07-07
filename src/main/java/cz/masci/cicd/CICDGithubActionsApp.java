package cz.masci.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CICDGithubActionsApp {

    public static void main(String[] args) {
        SpringApplication.run(CICDGithubActionsApp.class, args);
    }

}
