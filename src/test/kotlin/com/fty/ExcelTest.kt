package com.fty

import com.fty.model.MultipleFootage
import com.fty.model.TestExcelModel
import com.fty.util.ExcelUtil
import com.fty.util.ExcelUtil.getHeaderInfoByClass
import com.fty.util.ExcelUtil.getSheetInfoByClass
import org.junit.Test
import java.io.File
import java.io.FileOutputStream

class ExcelTest {
    @Test
    fun testWriteExcel(){
        var file = File("E:\\申诉表.xls")
        if(file.exists()){
            file.delete()
        }else{
            file.createNewFile()
        }
        val out = FileOutputStream(file)
        var  list = mutableListOf<MultipleFootage>()
        var data = MultipleFootage()
        data.id=1
        data.mineName="hahaha"
        data.remark="备注"
        data.workFaceName="hahahaha"
        list.add(data)
        var workbook = ExcelUtil.exportExcel("申诉表",mutableListOf<MultipleFootage>(),MultipleFootage::class.java)
        workbook.write(out)
        out.close()
    }

    @Test
    fun testExcel(){
        var file = File("E:\\测试表.xls")
        if(file.exists()){
            file.delete()
        }else{
            file.createNewFile()
        }
        var list = mutableListOf<TestExcelModel>()
        var data = TestExcelModel()
        data.id=1
        data.foot1="123"
        data.foot2="123"
        data.foot3="123"
        data.foot4="123"
        data.foot5="123"
        data.foot6="123"
        data.foot7="123"
        data.foot8="123"
        data.foot9="123"
        data.foot10="123"
        data.foot11="123"
        list.add(data)
        var workbook = ExcelUtil.exportExcel("测试表",list, TestExcelModel::class.java)
        val out = FileOutputStream(file)
        workbook.write(out)
        out.close()
    }


    @Test
    fun getAnnotations(){
        getSheetInfoByClass(TestExcelModel::class.java)
       getHeaderInfoByClass(TestExcelModel::class.java)
    }
}
