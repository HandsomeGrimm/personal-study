package grimm.study.controller;

import grimm.study.mapper.PmsBrandMapper;
import grimm.study.model.PmsBrand;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/common")
@Slf4j
public class CommonController {

    @Autowired
    private PmsBrandMapper brandMapper;

    @RequestMapping("/excel/export")
    @ResponseBody
    public void exportExcel(HttpServletResponse response) throws Exception {

        //文件下载响应头
        response.setHeader("Content-Disposition","attachment;filename=underwrite.xls");
        //响应到浏览器
        WritableWorkbook workbook= Workbook.createWorkbook(response.getOutputStream());
        //创建工作簿sheet
        WritableSheet sheet=workbook.createSheet("underwrite",0);
        // .设置column名
        sheet.addCell(new Label(0, 0, "名称"));
        sheet.addCell(new Label(1, 0, "首字母"));
        sheet.addCell(new Label(2, 0, "排序"));
        sheet.addCell(new Label(3, 0, "是否为品牌制造商"));
        sheet.addCell(new Label(4, 0, "是否显示"));
        sheet.addCell(new Label(5, 0, "产品数量"));
        sheet.addCell(new Label(6, 0, "产品评论数量"));
        sheet.addCell(new Label(7, 0, "品牌logo"));
        sheet.addCell(new Label(8, 0, "专区大图"));
        sheet.addCell(new Label(9, 0, "品牌故事"));
        List<PmsBrand> brands=brandMapper.selectAll();
        PmsBrand brand=new PmsBrand();
        try {
            for (int i=0,j=1;i<brands.size();i++,j++){
                brand=brands.get(i);
                //设置列宽
                sheet.setColumnView(i, 16);
                //重新设置部分列宽
                sheet.setColumnView(3, 14);
                sheet.setColumnView(6, 10);
                sheet.setColumnView(7, 10);
                //设置行高
                sheet.setRowView(i, 350);
                //设置字体的attribute
                WritableFont font1=new WritableFont(WritableFont.createFont("楷体 _GB2312"), 12, WritableFont.NO_BOLD);
                WritableCellFormat format=new WritableCellFormat(font1);
                sheet.addCell(new Label(0,j,brand.getName(),format));
                sheet.addCell(new Label(1,j,brand.getFirstLetter(),format));
                sheet.addCell(new Label(2,j,brand.getSort().toString(),format));
                sheet.addCell(new Label(3,j,brand.getFactoryStatus()==1?"是":"否",format));
                sheet.addCell(new Label(4,j,brand.getShowStatus()==1?"是":"否",format));
                sheet.addCell(new Label(5,j,brand.getProductCount().toString(),format));
                sheet.addCell(new Label(6,j,brand.getProductCommentCount().toString(),format));
                sheet.addCell(new Label(7,j,brand.getLogo(),format));
                sheet.addCell(new Label(8,j,brand.getBigPic(),format));
                sheet.addCell(new Label(9,j,brand.getBrandStory(),format));

            }
        }catch (Exception e){
            log.error(e.getMessage());
        }
        //写入数据
        workbook.write();
        //关闭资源
        workbook.close();
    }

    @RequestMapping("/excel/import")
    @ResponseBody
    public String importFile(MultipartFile file) throws Exception {
        //获取用户上传的文件
        Workbook workbook=Workbook.getWorkbook(file.getInputStream());
        // 2.获取工作簿sheet
        Sheet sheet = workbook.getSheet(0);
        // 3.获取总行数
        int rows = sheet.getRows();
        for (int i = 1; i < rows; i++) {
            PmsBrand pmsBrand = new PmsBrand();
            pmsBrand.setName(sheet.getCell(0, i).getContents());
            pmsBrand.setFirstLetter(sheet.getCell(1, i).getContents());
            pmsBrand.setBrandStory(sheet.getCell(2, i).getContents());
            pmsBrand.setLogo(sheet.getCell(3, i).getContents());
            // 4.添加到数据库中
            brandMapper.insert(pmsBrand);
        }
        // 5.关闭资源
        workbook.close();
        return "success";

    }


}
