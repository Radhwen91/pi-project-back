package tn.esprit.benromdhaneahmed.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.benromdhaneahmed.entities.Product;
import tn.esprit.benromdhaneahmed.services.IProduct;
import tn.esprit.benromdhaneahmed.services.ProductServiceIMP;

import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {
    private final IProduct productService;

    private ProductServiceIMP productServiceIMP;

    @PostMapping( "/addProduct")
    public ResponseEntity<Product> addProduct(@RequestBody Product product)
    {

        productService.addProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(product);

    }



    @GetMapping("/getProduct")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product product) {
        product.setId(id);
        productService.UpdateProduct(product);
        return ResponseEntity.ok(product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }
}
