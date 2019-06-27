package com.wxw.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author ${author}
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user_info")
public class UserInfo extends Model<UserInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("version")
    private String version;

    @TableField("sourceCode")
    private String sourceCode;

    @TableField("userType")
    private String userType;

    @TableField("userAttr")
    private String userAttr;

    @TableField("userCreateTime")
    private String userCreateTime;

    @TableField("userName")
    private String userName;

    @TableField("countries")
    private String countries;

    @TableField("cardType")
    private String cardType;

    @TableField("userIdcardOrg")
    private String userIdcardOrg;

    @TableField("userIdcard")
    private String userIdcard;

    @TableField("userIdcardHash")
    private String userIdcardHash;

    @TableField("userPhoneOrg")
    private String userPhoneOrg;

    @TableField("userPhone")
    private String userPhone;

    @TableField("userPhoneHash")
    private String userPhoneHash;

    @TableField("userUuid")
    private String userUuid;

    @TableField("userLawperson")
    private String userLawperson;

    @TableField("userFund")
    private String userFund;

    @TableField("userProvince")
    private String userProvince;

    @TableField("userAddress")
    private String userAddress;

    @TableField("registerDate")
    private String registerDate;

    @TableField("userSex")
    private String userSex;

    @TableField("userBankAccount")
    private String userBankAccount;

    @TableField("batchNum")
    private String batchNum;

    @TableField("sendTime")
    private String sendTime;

    @TableField("userId")
    private String userId;

    @TableField("assetCompany")
    private String assetCompany;

    @TableField("status")
    private String status;

    @Override
    protected Serializable pkVal() {
        return id;
    }
}