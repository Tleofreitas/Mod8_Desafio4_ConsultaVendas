package com.devsuperior.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.dto.ReportDTO;
import com.devsuperior.dsmeta.dto.SaleMinDTO;
import com.devsuperior.dsmeta.dto.SummaryDTO;
import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.projections.ReportProjection;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;

	public SaleMinDTO findById(Long id) {
		Optional<Sale> result = repository.findById(id);
		Sale entity = result.get();
		return new SaleMinDTO(entity);
	}

	public Page<SummaryDTO> getSummary(String minDate, String maxDate, Pageable pageable) {
		LocalDate min = checkMinDate(minDate);
		LocalDate max = checkMaxDate(maxDate);

		Page<SummaryDTO> summary = repository.getSummary(min, max, pageable);
		return summary;
	}
	
	public List<ReportDTO> getReport(String minDate, String maxDate, String name) {
		LocalDate min = checkMinDate(minDate);
		LocalDate max = checkMaxDate(maxDate);
		
		List<ReportProjection> list = repository.getReport(min, max, name);
		List<ReportDTO> report = list.stream().map(x -> new ReportDTO(x)).collect(Collectors.toList());
		return report;
	};
	
	// Auxiliar Teste para MinDate e Conversão em Data
	private LocalDate checkMinDate(String minDate) {
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		LocalDate min = null;

		if (minDate.isEmpty()) {
			min = today.minusYears(1L);
		} else {
			min = LocalDate.parse(minDate);
		}
		return min;
	}
	
	// Auxiliar Teste para MaxDate e Conversão em Data
	private LocalDate checkMaxDate(String maxDate) {
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		LocalDate max = null;

		if (maxDate.isEmpty()) {
			max = today;
		} else {
			max = LocalDate.parse(maxDate);
		}
		return max;
	}
}
