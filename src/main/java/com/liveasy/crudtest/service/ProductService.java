package com.liveasy.crudtest.service;

import com.liveasy.crudtest.entity.Product;
import com.liveasy.crudtest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> saveProducts(List<Product> products){
        return productRepository.saveAll(products);
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(int id){
        return productRepository.findById(id).orElse(null);
    }

    public String deleteProduct(int id){
        productRepository.deleteById(id);
        return "product removed!!" + id;
    }

    public Product updateProduct(Product product){
        Product existingProduct= productRepository.findById(product.getId()).orElse(null);
        existingProduct.setLoadingPoint(product.getLoadingPoint());
        existingProduct.setUnloadingPoint(product.getUnloadingPoint());
        existingProduct.setWeight(product.getWeight());
        existingProduct.setShipperId(product.getShipperId());
        existingProduct.setDate(product.getDate());
        existingProduct.setProductType(product.getProductType());
        existingProduct.setTruckType(product.getTruckType());
        return productRepository.save(existingProduct);
    }
}
