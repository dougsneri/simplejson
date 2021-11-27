package br.com.dougg.simplejson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/tests/bro")
    public Object simpleJson(){

        return new LeoObject();

    }
}
