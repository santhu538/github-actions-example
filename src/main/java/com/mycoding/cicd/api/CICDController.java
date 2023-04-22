package com.mycoding.cicd.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/cicd")
public class CICDController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Github Actions!!";
    }
    /*
    git init
git add README.md
git commit -m "first commit"
git branch -M master
git remote add origin https://github.com/santhu538/github-actions-example.git
git push -u origin master
     */
}
