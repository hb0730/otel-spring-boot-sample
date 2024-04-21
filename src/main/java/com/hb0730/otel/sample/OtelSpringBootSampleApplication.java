package com.hb0730.otel.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:huangbing0730@gmail">hb0730</a>
 * @date 2024/4/20
 */
@SpringBootApplication
@RestController
public class OtelSpringBootSampleApplication {
    private static final Logger logger = LoggerFactory.getLogger(OtelSpringBootSampleApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(OtelSpringBootSampleApplication.class, args);
    }

    @GetMapping("/")
    public ResponseEntity<String> hello() {
        logger.info("Hello, World!");
        return ResponseEntity.ok("Hello, World!");
    }
}
