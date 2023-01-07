package com.wednesday.present_server.present_server.database_table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@IdClass(CONTENT_MST_PK.class)

public class CONTENT_MST {
    @Id
    @Column(name = "id")
    private Long id;

    @Id
    @Column(name = "MST_NO")
    private String MST_NO;

    @Column(nullable = false)
    private String user_id;

    @Column(nullable = false)
    private String MST_TITLE;

    @Column
    private String MST_PW;

    @Builder
    public CONTENT_MST(String MST_NO, String MST_TITLE, String MST_PW, String user_id) {
        this.MST_NO = MST_NO;
        this.MST_TITLE = MST_TITLE;
        this.MST_PW = MST_PW;
        this.user_id = user_id;
    }
}