package tn.esprit.benromdhaneahmed.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.benromdhaneahmed.entities.Product;
import tn.esprit.benromdhaneahmed.repositories.ProductRepository;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class ProductServiceIMP implements IProduct{
    @Autowired
    private ProductRepository productRepository;


    @Override
    @Transactional
    public void addProduct(Product product) {

        productRepository.save(product);

    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Transactional
    public void UpdateProduct(Product product) {

        productRepository.save(product);

    }

    @Override
    public void deleteProduct(int id) {
        productRepository.deleteById(id);

    }
}

