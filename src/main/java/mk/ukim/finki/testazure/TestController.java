package mk.ukim.finki.testazure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Value("${david.test-azure-secrets.david}")
    String test;

    @GetMapping
    public void david() {
        System.out.println("test       " + test);
    }
}
