package com.wednesday.present_server.present_server.controller;

import com.wednesday.present_server.present_server.database_table.USER_INFO;
import com.wednesday.present_server.present_server.service.JPATestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class JPATestController {

    private final JPATestService jpa;

    @GetMapping("/database_table/USER/{id}")
    public USER_INFO getUser(@PathVariable Long id) {
        return jpa.findById(id);
    }
}
