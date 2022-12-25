package r2s.com.demo.SpringWebDemo.service;

import org.springframework.stereotype.Component;
import r2s.com.demo.SpringWebDemo.dto.request.CreateUserRequestDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserService {

    
    public List<CreateUserRequestDTO> getListUser(){
        List<CreateUserRequestDTO> userList= new ArrayList<>();
        CreateUserRequestDTO user1= new CreateUserRequestDTO(1,"thu", "thu nguyen","123","12345","Nu","thienthu@gmail.com",new Date(2020,1,1));
        CreateUserRequestDTO user2= new CreateUserRequestDTO(2,"thien", "thu thien nguyen","123","12345","Nu","thienthu@gmail.com",new Date(2020,1,1));
        userList.add(user1);
        userList.add(user2);
        return userList;
    }
}
