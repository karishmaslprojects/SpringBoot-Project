package com.dev.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dev.project.model.FinanceRecord;
import com.dev.project.repository.FinanceRecordRepository;

@Service
public class FinanceRecordService {
	
	private FinanceRecordRepository financeRecordRepository;
	
	public FinanceRecordRepository getFinanceRecordRepository() {
		return financeRecordRepository;
	}
	
	@Autowired
	public void setFinanceRepo(FinanceRecordRepository financeRecordRepository)
	{
		this.financeRecordRepository=financeRecordRepository;
	}

	public void setFinanceRecordRepository(FinanceRecordRepository financeRecordRepository) {
		this.financeRecordRepository = financeRecordRepository;
	}

	public void addRecord(FinanceRecord financeRecord) {
		financeRecordRepository.save(financeRecord);
	}
	
	public List<FinanceRecord> getRecords(){
		return financeRecordRepository.findAll();
	}
}
