package GenericLibrary;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class Excell_Utility 
{
	public String readingsingleData(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException
	{
		File file=new File("/AdvanceSelenium/src/test/resources/excell/Book1TestCase.xlsx");
		Workbook workbook=WorkbookFactory.create(file);
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
		
		
	}
	@DataProvider(name="testdata")
	public Object[][] readingMultipleData() throws EncryptedDocumentException, IOException
	{
		File file=new File("/AdvanceSelenium/src/test/resources/excell/Book1TestCase.xlsx");
		Workbook workbook=WorkbookFactory.create(file);
		Sheet sheet= workbook.getSheet("sheet1");
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		Object [][]data=new Object[rowCount][cellCount];
		for(int row=0;row<rowCount;row++)
		{
			Row actualRow = sheet.getRow(row);
		  for(int cell=0;cell<actualRow.getLastCellNum();cell++)
		  {
			   data [row][cell]=actualRow.getCell(cell).toString();
		  }
		}
		return data;
		
		
	}
}
//public static void main(String[] args) throws EncryptedDocumentException, IOException {
//	ExcelUtility a=new ExcelUtility();

	//Object[][]obj=a.readingMultipleData();
//	
//	for(int i=0;i<obj.length;i++)
//	{
//		for(int j=0;j<obj[i].length;j++)
//		{
//			System.out.println(obj[i][j]);
//		}
//	}
//	System.out.println(a.singleData("Sheet1", 1, 1));
	
//	
//}


