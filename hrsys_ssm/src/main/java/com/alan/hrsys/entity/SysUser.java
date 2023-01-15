package com.alan.hrsys.entity;

import java.util.List;

public class SysUser {
    private Integer id;
    private String username;
    private String password;
    private List<SysRole> roles;
}
