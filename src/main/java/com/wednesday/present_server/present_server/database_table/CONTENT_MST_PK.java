package com.wednesday.present_server.present_server.database_table;

import lombok.Data;

import java.io.Serializable;

@Data
public class CONTENT_MST_PK implements Serializable {
        private Long id;
        private String MST_NO;
}
