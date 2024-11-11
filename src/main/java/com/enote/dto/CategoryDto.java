package com.enote.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {

    private Long id;
    private String name;
    private String description;

    private Boolean isActive;

    private Integer createdOn;

    private Date createdDate;

    private Integer updatedOn;

    private Date updatedDate;
}
