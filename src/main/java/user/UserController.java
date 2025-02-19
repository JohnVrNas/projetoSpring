/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package user;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author alunocmc
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/")
}
