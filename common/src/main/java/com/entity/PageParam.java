package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.naming.Name;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @BelongsProject: project
 * @BelongsPackage: com.entity
 * @Author: 库伦
 * @CreateTime: 2020-06-09 10:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageParam {
    @NotNull
    private Integer pageNum;
    @NotNull
    private Integer PageSize;
}
