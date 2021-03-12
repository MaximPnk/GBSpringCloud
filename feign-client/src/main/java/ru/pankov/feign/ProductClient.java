package ru.pankov.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.pankov.dto.ProductDTO;

import java.util.List;

@FeignClient("product-client")
@RequestMapping("/api/v1/product")
public interface ProductClient {

    @GetMapping("/")
    List<ProductDTO> getProducts();

    @GetMapping("/{id}")
    ProductDTO getProduct(@PathVariable(value = "id") Long id);
}
