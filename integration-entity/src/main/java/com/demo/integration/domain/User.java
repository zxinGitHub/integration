package com.demo.integration.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhangxin
 * @since 2018-10-17
 */
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

        /**
     * 主键ID
     */
         private Long testId;

        /**
     * 租户ID
     */
         private Long tenantId;

        /**
     * 名称
     */
         private String name;

        /**
     * 年龄
     */
         private Integer age;

        /**
     * 测试下划线字段命名类型
     */
         private Integer testType;

        /**
     * 日期
     */
         private LocalDateTime testDate;

        /**
     * 测试
     */
         private Long role;

        /**
     * 手机号码
     */
         private String phone;


    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getTestType() {
        return testType;
    }

    public void setTestType(Integer testType) {
        this.testType = testType;
    }

    public LocalDateTime getTestDate() {
        return testDate;
    }

    public void setTestDate(LocalDateTime testDate) {
        this.testDate = testDate;
    }

    public Long getRole() {
        return role;
    }

    public void setRole(Long role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    protected Serializable pkVal() {
        return this.testId;
    }

    @Override
    public String toString() {
        return "User{" +
        "testId=" + testId +
        ", tenantId=" + tenantId +
        ", name=" + name +
        ", age=" + age +
        ", testType=" + testType +
        ", testDate=" + testDate +
        ", role=" + role +
        ", phone=" + phone +
        "}";
    }
}
