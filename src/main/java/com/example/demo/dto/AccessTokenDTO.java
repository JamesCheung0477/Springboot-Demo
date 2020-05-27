package com.example.demo.dto;

import lombok.Data;

/**
 * Created by ZhangYu on 2020-5-25
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
