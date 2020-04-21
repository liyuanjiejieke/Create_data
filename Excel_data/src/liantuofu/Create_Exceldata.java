package liantuofu;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import java.io.File;
public class Create_Exceldata {

        public static void main(String[] args) {
            writeExcel();
        }
        public static void writeExcel() {
            double random = Math.random();
            int num = new Double(Math.random() * 100).intValue();
            System.out.println(num+"-------------------------");
            String numbera=String.valueOf(num);
            String filename="D:/TestFile"+numbera+".xls";
            String[] titleA = {"大类", "中类","小类","子类","商品编码","商品条码","商品名称","单位","配送价","进货价","批发价","采购因子","商品图片","商品描述"};
            //创建Excel文件
            File fileA = new File(filename);
            if (fileA.exists()){
                fileA.delete();
            }
            try {
                fileA.createNewFile();
                //创建工作簿
                WritableWorkbook workbook= Workbook.createWorkbook(fileA);
                //创建shell
                WritableSheet sheetA=workbook.createSheet("sheet1",0);
                Label labelA=null;


                for (int i=0;i<titleA.length;i++){
                    labelA=new Label(i,0,titleA[i]);
                    sheetA.addCell(labelA);
                }
                //获取数据源
                for (int i=1;i<=200;i++){


                    labelA = new Label(0,i,"水果大类" + i);
                    sheetA.addCell(labelA);
                    labelA = new Label(1,i,"水果中类");
                    sheetA.addCell(labelA);
                    labelA = new Label(2,i,"水果小类");
                    sheetA.addCell(labelA);
                    labelA = new Label(3,i,"水果子类");
                    sheetA.addCell(labelA);
                    labelA = new Label(4,i,""+215555455+i);
                    sheetA.addCell(labelA);
                    labelA = new Label(5,i,""+215445455+i);
                    sheetA.addCell(labelA);
                    labelA = new Label(6,i,"苹果00000"+i);
                    sheetA.addCell(labelA);
                    labelA = new Label(7,i,"瓶"+i);
                    sheetA.addCell(labelA);
                    labelA = new Label(8,i,""+i);
                    sheetA.addCell(labelA);
                    labelA = new Label(9,i,""+i+1);

                    sheetA.addCell(labelA);


                    labelA = new Label(10,i,""+i);
                    sheetA.addCell(labelA);
                    labelA = new Label(11,i,""+i);
                    sheetA.addCell(labelA);
                }
                //开始写入数据
                workbook.write();
                //关闭连接
                workbook.close();
                System.out.println("结果输出完毕");
            }
            catch (Exception e) {
                e.printStackTrace();
            }


        }







}
