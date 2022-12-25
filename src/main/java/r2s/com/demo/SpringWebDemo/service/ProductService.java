package r2s.com.demo.SpringWebDemo.service;

import r2s.com.demo.SpringWebDemo.dto.request.CreateProductRequestDTO;
import r2s.com.demo.SpringWebDemo.dto.request.CreateUserRequestDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductService {
    public List<CreateProductRequestDTO> getListProduct(){
        List<CreateProductRequestDTO> productList= new ArrayList<>();
        CreateProductRequestDTO product1= new CreateProductRequestDTO(1,"aaa",10000,"thu nguyen",false,1);
        productList.add(product1);
        return productList;
    }
}
