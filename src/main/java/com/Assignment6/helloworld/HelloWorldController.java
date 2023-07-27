package com.Assignment6.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class HelloWorldController {

    //    ブラウザ上で[localhost:8080/capybara]と入力→[/capybara] はパス?　@GetMapping()の中の記述と同じ　
    @GetMapping("/capybara")
    public String sayhello() {
        return "Welcome to RaiseTech!";
    }


}
