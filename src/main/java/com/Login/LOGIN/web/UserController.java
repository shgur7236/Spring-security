package com.Login.LOGIN.web;

import com.Login.LOGIN.service.UserService;
import com.Login.LOGIN.web.dto.UserInfoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;

    @PostMapping("/user")// signup api
    public String signup(UserInfoDto infoDto){
        userService.save(infoDto);
        return "redirect:/login";
    }
}
