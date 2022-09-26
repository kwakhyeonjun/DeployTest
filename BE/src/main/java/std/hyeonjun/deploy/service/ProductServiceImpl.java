package std.hyeonjun.deploy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import std.hyeonjun.deploy.domain.Product;
import std.hyeonjun.deploy.repository.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
