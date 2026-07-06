package com.example.learning.service;
import com.example.learning.Object.UserDetailedDTO;
import com.example.learning.entity.UserEntity;
import com.example.learning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity saveUser(UserEntity user) {
        return userRepository.save(user);
    }

    public List<UserEntity> fillAllUsers(){
        return userRepository.findAll();
    }

    public void deleteUsers(List<Long> ids){
            userRepository.deleteAllById(ids);
    }

    public void userDetails(UserDetailedDTO UDTO){
        UserEntity userEntity = userRepository.findById(UDTO.getId()).orElse(null);
        if(userEntity != null)
            UDTO.setNameAndAge(userEntity.getUserName(), userEntity.getAge());
    }
}