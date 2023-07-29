package com.Assignment6.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    //    ブラウザ上で[localhost:8080/capybara]と入力→[/capybara] はパス?　@GetMapping()の中の記述と同じ
    //    Rest APIの原則？で返すものは統一する→名前を表示させる場合、パスは
    @GetMapping("/names")
    public Name names() {
        return new Name("Saki", "Fujita");
    }

}
