package com.dev.project;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dev.project.model.FinanceRecord;
import com.dev.project.service.FinanceRecordService;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(ProjectApplication.class, args);
		
		FinanceRecord financeRecord = context.getBean(FinanceRecord.class);
		financeRecord.setId(1L);
		financeRecord.setAmount(new BigDecimal(10000));
		financeRecord.setCategory("Food");
		financeRecord.setNote("Spent on Coffee");
		financeRecord.setDate(LocalDate.now());
		
		FinanceRecordService financeRecordService = context.getBean(FinanceRecordService.class);
		financeRecordService.addRecord(financeRecord);
		
		List<FinanceRecord> financeRecordList = new ArrayList<>();
		financeRecordList.forEach(fr->System.out.println(fr));
	}

}
