package ma.emsi.mvcspring.repositories;

import ma.emsi.mvcspring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
