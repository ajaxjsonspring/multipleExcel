package com.fty.model;


import com.fty.annotation.ExcelAnnotation;

import java.io.Serializable;
import java.util.Date;

@ExcelAnnotation(sheetName = "申诉表",isHashHeader = false)
public class MultipleFootage implements Serializable {
    private Integer id;

    @ExcelAnnotation(headerName = "矿井名称",
            index = 0, level = 0, parentIndex = -1)
    private String mineName;

    @ExcelAnnotation(headerName = "综采工作面",
            index = 1, level = 0, parentIndex = -1)
    private String workFaceName;

    @ExcelAnnotation(headerName = "回风巷（m）",
            index = 2, level = 0, parentIndex = -1)
    private String returnAirWay;

    @ExcelAnnotation(headerName = "防突评价允许进尺",
            index = 3, level = 1, parentIndex = 2)
    private Integer permissionFootageReturn;

    @ExcelAnnotation(headerName = "当日进尺",
            index = 4, level = 1, parentIndex = 2)
    private Integer currentFootageReturn;

    @ExcelAnnotation(headerName = "本循环累计进尺",
            index = 5, level = 1, parentIndex = 2)
    private Integer totalFootageReturn;

    @ExcelAnnotation(headerName = "剩余允许进尺",
            index = 6, level = 1, parentIndex = 2)
    private Integer leftPermissionFootageReturn;

    @ExcelAnnotation(headerName = "进风巷（m）",
            index = 7, level = 0, parentIndex = -1)
    private String intakeAiyWay;

    @ExcelAnnotation(headerName = "防突评价允许进尺",
            index = 8, level = 1, parentIndex = 7)
    private Integer permissionFootageIntake;

    @ExcelAnnotation(headerName = "当日进尺",
            index = 9, level = 1, parentIndex = 7)
    private Integer currentFootageIntake;

    @ExcelAnnotation(headerName = "本循环累计进尺",
            index = 10, level = 1, parentIndex = 7)
    private Integer totalFootageIntake;

    @ExcelAnnotation(headerName = "剩余允许进尺",
            index = 11, level = 1, parentIndex = 7)
    private Integer leftPermissionFootageIntake;

    @ExcelAnnotation(headerName = "备注",
            index = 12, level = 0, parentIndex = -1)
    private String remark;

    private Date createTime;

    private Date updateTime;

    private Integer sysdeptId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMineName() {
        return mineName;
    }

    public void setMineName(String mineName) {
        this.mineName = mineName;
    }

    public String getWorkFaceName() {
        return workFaceName;
    }

    public void setWorkFaceName(String workFaceName) {
        this.workFaceName = workFaceName;
    }

    public String getReturnAirWay() {
        return returnAirWay;
    }

    public void setReturnAirWay(String returnAirWay) {
        this.returnAirWay = returnAirWay;
    }

    public Integer getPermissionFootageReturn() {
        return permissionFootageReturn;
    }

    public void setPermissionFootageReturn(Integer permissionFootageReturn) {
        this.permissionFootageReturn = permissionFootageReturn;
    }

    public Integer getCurrentFootageReturn() {
        return currentFootageReturn;
    }

    public void setCurrentFootageReturn(Integer currentFootageReturn) {
        this.currentFootageReturn = currentFootageReturn;
    }

    public Integer getTotalFootageReturn() {
        return totalFootageReturn;
    }

    public void setTotalFootageReturn(Integer totalFootageReturn) {
        this.totalFootageReturn = totalFootageReturn;
    }

    public Integer getLeftPermissionFootageReturn() {
        return leftPermissionFootageReturn;
    }

    public void setLeftPermissionFootageReturn(Integer leftPermissionFootageReturn) {
        this.leftPermissionFootageReturn = leftPermissionFootageReturn;
    }

    public String getIntakeAiyWay() {
        return intakeAiyWay;
    }

    public void setIntakeAiyWay(String intakeAiyWay) {
        this.intakeAiyWay = intakeAiyWay;
    }

    public Integer getPermissionFootageIntake() {
        return permissionFootageIntake;
    }

    public void setPermissionFootageIntake(Integer permissionFootageIntake) {
        this.permissionFootageIntake = permissionFootageIntake;
    }

    public Integer getCurrentFootageIntake() {
        return currentFootageIntake;
    }

    public void setCurrentFootageIntake(Integer currentFootageIntake) {
        this.currentFootageIntake = currentFootageIntake;
    }

    public Integer getTotalFootageIntake() {
        return totalFootageIntake;
    }

    public void setTotalFootageIntake(Integer totalFootageIntake) {
        this.totalFootageIntake = totalFootageIntake;
    }

    public Integer getLeftPermissionFootageIntake() {
        return leftPermissionFootageIntake;
    }

    public void setLeftPermissionFootageIntake(Integer leftPermissionFootageIntake) {
        this.leftPermissionFootageIntake = leftPermissionFootageIntake;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getSysdeptId() {
        return sysdeptId;
    }

    public void setSysdeptId(Integer sysdeptId) {
        this.sysdeptId = sysdeptId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}