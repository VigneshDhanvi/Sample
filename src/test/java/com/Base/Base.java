package com.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	public static WebDriver driver;
	public static Select select;
	// public static JavascriptExecutor js;

	public static void loadURL(String a) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(a);
	}

	public static void sendKeys(WebElement element, String testData) {
		element.sendKeys(testData);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void selectData(WebElement element, String a) {
		select = new Select(element);
		select.selectByVisibleText(a);
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static String PrintBookingId(WebElement element) {
	String string = element.getAttribute("value");
	return string;
	}

	public static void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arugments[0].scrollIntiView(true);",element);
	}

	public static void waits(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static String dataRead(int a, int b) {
		String data = null;
		try {
			File file = new File("D:\\eclipse-workspace-new\\App\\src\\TestData\\RoomBooking.xlsx");
			FileInputStream fileInput = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(fileInput);
			Sheet sheet = workbook.getSheet("Sheet1");
			Row row = sheet.getRow(a);
			Cell cell = row.getCell(b);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				data = cell.getStringCellValue();

			} else if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
					data = format.format(date);

				} else {
					long longNumeric = (long) cell.getNumericCellValue();
					data = String.valueOf(longNumeric);
				}

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;

	}

//	public static void excel_write(String OrderId) {
//
//		try {
//			FileInputStream fis = new FileInputStream(
//					new File("C:\\Users\\ADMIN\\eclipse-workspace-new\\App\\src\\TestData\\RoomBooking.xlsx"));
//			Workbook wb = new XSSFWorkbook(fis);
//			Sheet createSheet = wb.createSheet("Sample");
//			Row createRow = createSheet.createRow(0);
//			Cell createCell = createRow.createCell(0);
//			createCell.setCellValue(OrderId);
//			FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\ADMIN\\eclipse-workspace-new\\App\\src\\TestData\\RoomBooking.xlsx"));
//
//			FileOutputStream fos = new FileOutputStream(new File(
//				"C:\\Users\\ADMIN\\eclipse-workspace-new\\App\\src\\TestData\\RoomBooking.xlsx"));
//		wb.write(fos);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}

	public static String read_Prop(String a) {
		String value = null;
		try {
			File file = new File("D:\\eclipse-workspace-new\\App\\src\\TestData\\LoginCred.Properties");
			FileReader fRead = new FileReader(file);
			Properties prop = new Properties();
			prop.load(fRead);
			value = prop.getProperty(a);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return value;

	}

}
