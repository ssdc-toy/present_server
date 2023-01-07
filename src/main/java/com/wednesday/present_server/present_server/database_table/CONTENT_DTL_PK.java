package com.wednesday.present_server.present_server.database_table;

import lombok.Data;

import java.io.Serializable;

@Data
public class CONTENT_DTL_PK implements Serializable {
        private Long id;
        private String DTL_NO;
        private String DAY_SQ;
}
