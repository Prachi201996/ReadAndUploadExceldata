package helper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import model.FreightRegisterTemplate;

public class ExcelHelper {

	public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
	static String[] HEADERs = { "Invoice No", "Date", "Invoice Account", "Name", "Customer Group", "Factory Site",
			"Sales Branch", "Gross Weight", "Sales", "Cogs", "Carrier", "Delivery State", "Delivery City", "LR Number",
			"LR Date", "Vehicle No", "Load Type", "Vehicle Capacity", "Chargable Weight", "Consignment Type",
			"Freight Amount", "Remarks", "Destination code" };
	static String SHEET = "Freight_Register";

	public static boolean hasExcelFormat(MultipartFile file) {

		if (!TYPE.equals(file.getContentType())) {
			return false;
		}

		return true;
	}

	public static List<FreightRegisterTemplate> excelToFreight_Register(InputStream is) {
		try {
			Workbook workbook = new XSSFWorkbook(is);

			Sheet sheet = workbook.getSheet(SHEET);
			Iterator<Row> rows = sheet.iterator();

			List<FreightRegisterTemplate> Freight_Registers = new ArrayList<FreightRegisterTemplate>();

			int rowNumber = 0;
			while (rows.hasNext()) {
				Row currentRow = rows.next();

				// skip header
				if (rowNumber == 0) {
					rowNumber++;
					continue;
				}

				Iterator<Cell> cellsInRow = currentRow.iterator();

				FreightRegisterTemplate Freight_Registerss = new FreightRegisterTemplate();
				int cellIdx = 0;
				while (cellsInRow.hasNext()) {
					Cell currentCell = cellsInRow.next();

					switch (cellIdx) {
					case 0:
						Freight_Registerss.setInvoice_No(currentCell.getStringCellValue());
						break;

					case 1:
						Freight_Registerss.setDate(currentCell.getDateCellValue());
						break;

					case 2:
						Freight_Registerss.setInvoice_Account(currentCell.getStringCellValue());
						break;

					case 3:
						Freight_Registerss.setName(currentCell.getStringCellValue());
						break;

					case 4:
						Freight_Registerss.setCustomer_Group(currentCell.getStringCellValue());
						break;

					case 5:
						Freight_Registerss.setFactory_Site(currentCell.getStringCellValue());
						break;

					case 6:
						Freight_Registerss.setSales_Branch(currentCell.getStringCellValue());
						break;

					case 7:
						Freight_Registerss.setGross_Weight(currentCell.getNumericCellValue());
						break;

					case 8:
						Freight_Registerss.setSales(currentCell.getNumericCellValue());
						break;

					case 9:
						Freight_Registerss.setCogs(currentCell.getStringCellValue());
						break;

					case 10:
						Freight_Registerss.setCarrier(currentCell.getStringCellValue());
						break;

					case 11:
						Freight_Registerss.setDelivery_State(currentCell.getStringCellValue());
						break;

					case 12:
						Freight_Registerss.setDelivery_City(currentCell.getStringCellValue());
						break;

					case 13:
						Freight_Registerss.setLR_Number(currentCell.getStringCellValue());
						break;

					case 14:
						Freight_Registerss.setLR_Date(currentCell.getDateCellValue());
						break;

					case 15:
						Freight_Registerss.setVehicle_No(currentCell.getStringCellValue());
						break;

					case 16:
						Freight_Registerss.setLoad_Type(currentCell.getStringCellValue());
						break;

					case 17:
						Freight_Registerss.setVehicle_Capacity(currentCell.getNumericCellValue());
						break;

					case 18:
						Freight_Registerss.setChargable_Weight(currentCell.getNumericCellValue());
						break;

					case 19:
						Freight_Registerss.setConsignment_Type(currentCell.getStringCellValue());
						break;

					case 20:
						Freight_Registerss.setFreight_Amount(currentCell.getNumericCellValue());
						break;

					case 21:
						Freight_Registerss.setRemarks(currentCell.getStringCellValue());
						break;

					case 22:
						Freight_Registerss.setDestination_code(currentCell.getStringCellValue());
						break;

					default:
						break;
					}

					cellIdx++;
				}

				Freight_Registers.add(Freight_Registerss);
			}

			workbook.close();

			return Freight_Registers;
		} catch (IOException e) {
			throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
		}
	}
}
