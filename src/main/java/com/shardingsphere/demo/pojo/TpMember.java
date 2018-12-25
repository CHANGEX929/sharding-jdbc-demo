package com.shardingsphere.demo.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Xie Chenxi
 * @date 2018-12-25 12:09
 */
@Data
@TableName(value = "tp_member")
public class TpMember extends Model<TpMember> {
    private Long id;
    private Long cityId;
    private String userName;
    private Integer isValid;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
