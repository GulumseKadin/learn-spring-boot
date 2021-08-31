package com.serifhaniskl.api;

import com.serifhaniskl.entity.Users;
import com.serifhaniskl.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersApi {

    @Autowired
    private UsersRepository usersRepository;

    @PostConstruct
    public void init(){
        Users user = new Users();
        user.setName("Serifhan");
        user.setUsername("Isıklı");
        usersRepository.save(user);
    }

    @PostMapping
    public ResponseEntity<Users> add(@RequestBody Users user){
        return ResponseEntity.ok(usersRepository.save(user));

    }

    @GetMapping
    public ResponseEntity<List<Users>> listofAll(){
        return ResponseEntity.ok(usersRepository.findAll());

    }
}
