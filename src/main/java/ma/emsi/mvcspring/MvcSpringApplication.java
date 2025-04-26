package ma.emsi.mvcspring;

import ma.emsi.mvcspring.entities.Product;
import ma.emsi.mvcspring.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MvcSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvcSpringApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository) {
        return args -> {
            Product product = Product.builder()
                    .name("Computer")
                    .price(547473)
                    .quantity(99)
                    .build();
            productRepository.save(product);
            productRepository.save(Product.builder().name("Printer").price(5173).quantity(22).build());
            productRepository.save(Product.builder().name("Smart phone").price(74723).quantity(36).build());

            productRepository.findAll().forEach(p ->
                    System.out.println(p.toString()));
        };
    }
}
