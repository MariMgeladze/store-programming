package softlab.homework.storeprogramming.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import softlab.homework.storeprogramming.entities.Product;
import softlab.homework.storeprogramming.services.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class productController {
    private final ProductService productService;


    @GetMapping("products")
    public List<Product> search(String name, String ean,Integer companyId, Integer id){
        return productService.search(name,ean,companyId,id);
    }
    @GetMapping("products/{id}")
    public Product product(@PathVariable Integer id){
        return productService.getProduct(id);
    }
}
