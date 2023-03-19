package com.github.vinyprogramador.exercisesspring.exercicio01.model.exercicio02;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {
    List<Product> products = new ArrayList<>();

    int count = 0;

    @GetMapping
    public List<Product> showAllProducts(){
        return products;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product newProduct){
        newProduct.setId(++count);
        products.add(newProduct);
        return newProduct;
    }

    @GetMapping("/{id}")
    public Product searchProductById(@PathVariable int id){
        for (Product product : products){
            if (product.getId()==id){
                return product;
            }
        }
        return null;
    }

    @GetMapping("/{promotion}")
    public Product searchProductByPromotion(@PathVariable int promotion){
        for (Product product : products){
            if (product.isPromocao()){
                return product;
            }
        }
        return null;
    }

    @PutMapping("/{id}")
    public Product showWithOutId(@RequestBody Product newProduct, @PathVariable int id){
        for (int i = 0; i < ; i++) {
            if ()
        }
        return null;
    }

}
