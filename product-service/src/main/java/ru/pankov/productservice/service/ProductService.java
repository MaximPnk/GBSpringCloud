package ru.pankov.productservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.pankov.dto.ProductDTO;
import ru.pankov.productservice.dao.ProductRepository;
import ru.pankov.productservice.entity.ProductEntity;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<ProductDTO> findAll() {
        return productRepository.findAll().stream().map(p -> new ProductDTO(p.getId(), p.getTitle(), p.getPrice(), p.getCount())).collect(Collectors.toList());
    }

    public ProductDTO findById(Long id) {
        ProductEntity product = productRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Product not found"));
        return new ProductDTO(product.getId(), product.getTitle(), product.getPrice(), product.getCount());
    }
}
