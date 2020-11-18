package com.study.demo.bootconsumer.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class UserDTO implements Serializable {
    private static final long serialVersionUID = 158113963244564826L;

    private  String userId;

    private String userName;
}
