package com.meta.user.common.entity.base;

import com.meta.user.common.config.utils.DateUtils;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: metaverse
 * @description:
 * @packagename: com.meta.user.common.domain.base
 * @author: cxy
 * @date: 2022-02-19 15:54:33
 **/
public abstract class BaseEntity implements Serializable {
    private static final long serialVersionUID = -5430722577795212259L;
    private Long createUserId;
    private Date createTime;
    private Long updateUserId;
    private Date updateTime;
    private Boolean deleted;

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public BaseEntity() {
        this.createTime = DateUtils.getNowDate();
        this.updateTime = DateUtils.getNowDate();
        this.deleted = Boolean.FALSE;
    }
}
