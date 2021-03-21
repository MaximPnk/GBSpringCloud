package ru.pankov.feign;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.pankov.dto.ProductDTO;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*")
public class ProductController {

    private final ProductClient productClient;

    @GetMapping("/product")
    public List<ProductDTO> getProducts() {
        return productClient.getProducts();
    }

    @GetMapping("/product/{id}")
    public ProductDTO getProduct(@PathVariable(value = "id") Long id) {
        return productClient.getProduct(id);
    }
}
