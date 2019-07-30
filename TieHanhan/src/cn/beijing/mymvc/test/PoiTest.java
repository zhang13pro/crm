package cn.beijing.mymvc.test;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;

import java.io.FileOutputStream;

/**
 * @author bobobo
 * @version 1.0
 * @date 2019/7/29 22:54
 */
public class PoiTest {
    @Test
    public void createXls() throws Exception{
        //声明一个工作薄
        HSSFWorkbook wb = new HSSFWorkbook();
        //声明表
        HSSFSheet sheet = wb.createSheet("第一个表");
        //声明行
        HSSFRow row = sheet.createRow(7);
        //声明列
        HSSFCell cel = row.createCell(3);
        //写入数据
        cel.setCellValue("你也好");

        FileOutputStream fileOut = new FileOutputStream("d:/t1.xls");
        wb.write(fileOut);
        fileOut.close();
    }
}
