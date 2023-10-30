package com.git.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitDockerTestApplication {

    @GetMapping("/home")
    public String getHome() {
        return "My Git App";
    }

    public static void main(String[] args) {
        SpringApplication.run(GitDockerTestApplication.class, args);
    }

//	echo "# git-test-app" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin git@github.com:dhaneshvl/git-test-app.git
//	git push -u origin main

}
