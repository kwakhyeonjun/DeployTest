package std.hyeonjun.deploy.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import std.hyeonjun.deploy.domain.Product;
import std.hyeonjun.deploy.service.ProductServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductServiceImpl productService;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {
        logger.info("info log {}", "Call Method = getProducts()");
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }
}
