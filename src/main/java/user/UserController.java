/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package user;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PatchMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author alunocmc
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/")
    private String retorn(){
        return "Hello World!"
    }
    
    @PostMapping ("/criar")
    private UserModel criar(@RequestBody UserModel userModel){
        var criado = this.userRepository.save(userModel);
        return criado;
    }
    
}
