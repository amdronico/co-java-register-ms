package co.com.register.controller;


import co.com.register.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @GetMapping("/save-user")
    public ResponseEntity<UserDto> saveUser(@RequestBody UserDto userDto){
        //return ResponseEntity.status(200).build();
        return ResponseEntity.ok(userDto);
    }
}
