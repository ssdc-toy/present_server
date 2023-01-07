package com.wednesday.present_server.present_server.database_table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Getter
@DynamicInsert
@NoArgsConstructor
@Entity
@IdClass(CONTENT_DTL_PK.class)

public class CONTENT_DTL {
    @Id
    @Column(name = "id")
    private Long id;

    @Id
    @Column(name = "DTL_NO")
    private String DTL_NO;

    @Id
    @Column(name = "user_id")
    private String user_id;

    @Id
    @Column(name = "DAY_SQ")
    private String DAY_SQ;

    @Column(nullable = false)
    private String DTL_TITLE;

    @Column(nullable = false)
    private String CONTENT;

    @Column
    private String FILE_DC;

    @Column(nullable = false)
    @ColumnDefault("'N'")
    private String TEMP_YN;

    @Builder
    public CONTENT_DTL(String DTL_TITLE, String CONTENT, String FILE_DC, String TEMP_YN, String user_id) {
        this.DTL_TITLE = DTL_TITLE;
        this.CONTENT = CONTENT;
        this.FILE_DC = FILE_DC;
        this.TEMP_YN = TEMP_YN;
        this.user_id = user_id;
    }
}