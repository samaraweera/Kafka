package com.apache.kafka.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class SimpleModel {

    private String field1;
    private String field2;

    public SimpleModel(String field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }
}
