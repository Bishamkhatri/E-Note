package com.enote.Entity;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class BaseCategory {

    private Boolean isActive;
    private Boolean isDelete;

    private Integer createdOn;

    private Date createdDate;

    private Integer updatedOn;

    private Date updatedDate;
}
