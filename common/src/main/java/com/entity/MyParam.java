package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsProject: project
 * @BelongsPackage: com.entity
 * @Author: 库伦
 * @CreateTime: 2020-06-09 10:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyParam<T> {
    private PageParam pageParam;
    private String[] orderParam;
    private T t;
}
