package com.wednesday.present_server.present_server.model;

import com.wednesday.present_server.present_server.database_table.USER_INFO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface USER_model extends JpaRepository<USER_INFO, Long> {
}