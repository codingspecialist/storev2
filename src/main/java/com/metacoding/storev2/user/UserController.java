package com.metacoding.storev2.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class UserController {
    private final UserService userService;
}
