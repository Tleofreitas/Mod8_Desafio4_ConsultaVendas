package com.devsuperior.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.dto.SaleMinDTO;
import com.devsuperior.dsmeta.dto.SummaryDTO;
import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.projections.SummaryProjection;
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

	public List<SummaryDTO> getSummary(String minDate, String maxDate, Pageable pageable) {

		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		LocalDate min = null;
		LocalDate max = null;

		if (minDate.isEmpty()) {
			min = today.minusYears(1L);
		} else {
			min = LocalDate.parse(minDate);
		}
		
		if (maxDate.isEmpty()) {
			max = today;
		} else {
			max = LocalDate.parse(maxDate);
		}

		List<SummaryProjection> list = repository.getSummary(min, max, pageable);
		List<SummaryDTO> summary = list.stream().map(x -> new SummaryDTO(x)).collect(Collectors.toList());
		return summary;
	}
}
