package com.wednesday.present_server.present_server.database_table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "user_info")
public class USER_INFO {
    @Id
    private Long id;

    @Column(nullable = false)
    private String user_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String pw;

    @Builder
    public USER_INFO(String name, String pw, String user_id) {
        this.name = name;
        this.pw = pw;
        this.user_id = user_id;
    }
}