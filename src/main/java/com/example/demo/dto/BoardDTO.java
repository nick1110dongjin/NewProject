package com.example.demo.dto;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Repository
@Data
public class BoardDTO {

    private Long id;
    private String userId;
    private String password;
    private String phoneNumber;
    private String address;
    private String email;

}
