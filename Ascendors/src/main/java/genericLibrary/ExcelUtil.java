package genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil implements FrameWorkConstants {

	public File abspath=new File(Excel_Path);
	public Workbook workbook = null;
	
	public double readNumberDataFromExcel(String sheetName,int rowNum,int cellNum) {
		try {
			FileInputStream fis=new FileInputStream(abspath);
			Workbook workbook=WorkbookFactory.create(fis);
		} catch(EncryptedDocumentException e){
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
    }	
	public boolean readBooleanDataFromExcel(String sheetName,int rowNum,int cellNum) {
		
		try {
			FileInputStream fis=new FileInputStream(abspath);
			Workbook workbook=WorkbookFactory.create(fis);
		} catch(EncryptedDocumentException e){
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getBooleanCellValue();
		}
	
	public String readDataStringFromExcel(String sheetName,int rowNum,int cellNum) {
		try {
			FileInputStream fis=new FileInputStream(abspath);
			Workbook workbook=WorkbookFactory.create(fis);
		}catch(EncryptedDocumentException e) {
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
			
	   return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	   }
	
	 
	  public Date readDateValueFromExcel(String sheetName,int rowNum,int cellNum) {
		try {
			FileInputStream fis=new FileInputStream(abspath);
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getDateCellValue();
	   }
	  
	  
	  public String readAnyDataFromExcelInString(String sheetName,int rowNum,int cellNum) {
			
			try {
				FileInputStream fis=new FileInputStream(abspath);
				workbook = WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
		}
	  
		public  String[][] getMultipleData(String sheetName) {
			try {
				FileInputStream fis=new FileInputStream(abspath);
				workbook = WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			int phyRowCount =workbook.getSheet(sheetName).getPhysicalNumberOfRows();
			int phyCellCount=workbook.getSheet(sheetName).getRow(0).getPhysicalNumberOfCells();
			
			String[][] sarr=new String[phyRowCount][phyCellCount];
			
			for(int i=0; i<phyRowCount;i++) {
			 for(int j=0; j<phyCellCount;j++){
				 sarr[i][j] = workbook.getSheet(sheetName).getRow(i).getCell(j).getStringCellValue();
			 } 
			 }
			 return  sarr;
			}
			}
			
			
	
    

