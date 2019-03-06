package com.qf.domain;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Student {
    private String sid;
    private String sname;
    private String ssex;
    private Integer sage;
}
