package com.x.java.enums;

import lombok.Getter;

/**
 * @author xiaohong
 */
@Getter
public enum DeleteEnum {

    NOT_DEL(0),
    DELETED(1);

    private Integer status;

    DeleteEnum(Integer status) {
        this.status = status;
    }

}
