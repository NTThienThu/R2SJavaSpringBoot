package r2s.com.demo.SpringWebDemo.service;

import r2s.com.demo.SpringWebDemo.dto.request.CreateAddressRequestDTO;
import r2s.com.demo.SpringWebDemo.dto.request.CreateProductRequestDTO;

import java.util.ArrayList;
import java.util.List;

public class AddressService {
    public List<CreateAddressRequestDTO> getListAddress(){
        List<CreateAddressRequestDTO> addressList= new ArrayList<>();
        CreateAddressRequestDTO ad1= new CreateAddressRequestDTO(1,"Thanh Huyen","123","Lam Dong","Dam Rong","aaa",true, true, true,1);
        CreateAddressRequestDTO ad2= new CreateAddressRequestDTO(1,"Thanh Thao","123","Lam Dong","Dam Rong","aaa",true, true, true,1);
        addressList.add(ad1);
        addressList.add(ad2);
        return addressList;
    }
}
