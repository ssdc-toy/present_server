package com.wednesday.present_server.present_server.service;

import com.wednesday.present_server.present_server.database_table.USER_INFO;
import com.wednesday.present_server.present_server.model.USER_model;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class JPATestService {

    private final USER_model user_model;

    public USER_INFO findById(Long id) {
        return user_model.findById(id).get();
    }
}

