package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogTestController {


    @GetMapping("/log-test")
    public String logTest() {
        String name = "Spring";
        String name2 = "Spring2";

        log.trace("trace log = {}", name);
        log.debug("debug log = {}", name);
        log.info("info log={} {}", name, name2);
        log.warn("warn log = {}", name);
        log.error("error log = {}", name);

        return "ok";
    }
}
