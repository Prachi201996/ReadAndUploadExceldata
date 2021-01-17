package service;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import helper.ExcelHelper;
import model.FreightRegisterTemplate;
import repository.FreightRegisterTemplate_Repository;

@Service
public class Excel_Service {

	FreightRegisterTemplate_Repository repository;

	//save all data from freight template
	public void save(MultipartFile file) {
		try {
			List<FreightRegisterTemplate> Freight_Registers = ExcelHelper.excelToFreight_Register(file.getInputStream());
			repository.saveAll(Freight_Registers);
		} catch (IOException e) {
			throw new RuntimeException("fail to store excel data: " + e.getMessage());
		}
	}

	//get all data from freight template
	public List<FreightRegisterTemplate> getAllFreight_Register() {
		return repository.findAll();
	}
}
