package br.ifce.lp2.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping
@RestController
public class StatusController {

    @GetMapping
    public Map<String, String> ok() {
        return Map.of("status", "ok");
    }

}
