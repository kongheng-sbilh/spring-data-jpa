package com.kh.springdatajpa.model;

import com.kh.springdatajpa.constant.Gender;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentRequest {

    private String name;
    private Gender gender;
    private String address;
}
