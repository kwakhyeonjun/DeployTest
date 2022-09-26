package std.hyeonjun.deploy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import std.hyeonjun.deploy.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
