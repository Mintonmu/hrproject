package com.alan.hrsys.entity;

import java.util.List;

public class SysRole {
    private Integer id;
    private String code;
    private String name;
    private String sort;
    private List<SysPermission> permissions;
}
