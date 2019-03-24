package com.fty.model;


import com.fty.annotation.ExcelAnnotation;

import java.io.Serializable;

@ExcelAnnotation(sheetName = "申诉表",isHashHeader = false)
public class TestExcelModel implements Serializable {
    private Integer id;

    @ExcelAnnotation(headerName = "表头0",
            index = 0, level = 0, parentIndex = -1)
    private String foot1;

    @ExcelAnnotation(headerName = "表头1",
            index = 1, level = 0, parentIndex = -1)
    private String foot2;

    @ExcelAnnotation(headerName = "表头2",
            index = 2, level = 0, parentIndex = -1)
    private String foot3;

    @ExcelAnnotation(headerName = "表头3",
            index = 3, level = 0, parentIndex = -1)
    private String foot4;


    @ExcelAnnotation(headerName = "表头4",
            index = 4, level = 0, parentIndex = -1)
    private String foot5;


    @ExcelAnnotation(headerName = "表头5",
            index = 5, level = 1, parentIndex = 4)
    private String foot6;

    @ExcelAnnotation(headerName = "表头6",
            index = 6, level = 1, parentIndex = 4)
    private String foot7;

    @ExcelAnnotation(headerName = "表头7",
            index = 7, level = 1, parentIndex = 4)
    private String foot8;

    @ExcelAnnotation(headerName = "表头8",
            index = 8, level = 1, parentIndex = 4)
    private String foot9;


    @ExcelAnnotation(headerName = "表头9",
            index = 9, level = 0, parentIndex = -1)
    private String foot10;


    @ExcelAnnotation(headerName = "表头10-测试长度",
            index = 10, level = 0, parentIndex = -1)
    private String foot11;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFoot1() {
        return foot1;
    }

    public void setFoot1(String foot1) {
        this.foot1 = foot1;
    }

    public String getFoot2() {
        return foot2;
    }

    public void setFoot2(String foot2) {
        this.foot2 = foot2;
    }

    public String getFoot3() {
        return foot3;
    }

    public void setFoot3(String foot3) {
        this.foot3 = foot3;
    }

    public String getFoot4() {
        return foot4;
    }

    public void setFoot4(String foot4) {
        this.foot4 = foot4;
    }

    public String getFoot5() {
        return foot5;
    }

    public void setFoot5(String foot5) {
        this.foot5 = foot5;
    }

    public String getFoot6() {
        return foot6;
    }

    public void setFoot6(String foot6) {
        this.foot6 = foot6;
    }

    public String getFoot7() {
        return foot7;
    }

    public void setFoot7(String foot7) {
        this.foot7 = foot7;
    }

    public String getFoot8() {
        return foot8;
    }

    public void setFoot8(String foot8) {
        this.foot8 = foot8;
    }

    public String getFoot9() {
        return foot9;
    }

    public void setFoot9(String foot9) {
        this.foot9 = foot9;
    }

    public String getFoot10() {
        return foot10;
    }

    public void setFoot10(String foot10) {
        this.foot10 = foot10;
    }

    public String getFoot11() {
        return foot11;
    }

    public void setFoot11(String foot11) {
        this.foot11 = foot11;
    }
}
