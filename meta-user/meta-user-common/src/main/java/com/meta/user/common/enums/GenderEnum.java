package com.meta.user.common.enums;

import com.meta.user.common.config.utils.StringUtils;

/**
 * @program: metaverse
 * @description:
 * @packagename: com.meta.user.common.enums
 * @author: cxy
 * @date: 2022-02-19 18:26:03
 **/
public enum GenderEnum {
    MALE("male", "男"),
    FEMALE("female", "女");

    private String code;
    private String desc;

    GenderEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static GenderEnum covert2Enum(String code) {
        if (StringUtils.isBlank(code)) {
            return null;
        }
        for (GenderEnum gender : GenderEnum.values()) {
            if (gender.code.equals(code)) {
                return gender;
            }
        }
        return null;
    }

    public static String covert2Desc(String code) {
        if (StringUtils.isBlank(code)) {
            return null;
        }
        for (GenderEnum gender : GenderEnum.values()) {
            if (gender.code.equals(code)) {
                return gender.desc;
            }
        }
        return null;
    }
}
