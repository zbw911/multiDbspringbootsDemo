package com.zhangbaowei.multidbtempl.dto;

import java.io.Serializable;

/**
 * @author
 */
public class Vinfo implements Serializable {
    private Integer id;
    private Byte cateid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getCateid() {
        return cateid;
    }

    public void setCateid(Byte cateid) {
        this.cateid = cateid;
    }


}