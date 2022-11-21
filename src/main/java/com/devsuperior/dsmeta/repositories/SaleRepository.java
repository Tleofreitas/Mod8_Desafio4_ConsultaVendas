package com.devsuperior.dsmeta.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.projections.ReportProjection;
import com.devsuperior.dsmeta.projections.SummaryProjection;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query(nativeQuery = true, value = "SELECT SEL.NAME, SUM(SAL.AMOUNT) "
			+ "FROM TB_SALES SAL "
			+ "JOIN TB_SELLER SEL ON SAL.SELLER_ID=SEL.ID "
			+ "WHERE SAL.DATE BETWEEN :min AND :max "
			+ "GROUP BY SEL.NAME ")
	List<SummaryProjection> getSummary(LocalDate min, LocalDate max);

	@Query(nativeQuery = true, value ="SELECT SEL.ID, SAL.DATE, SAL.AMOUNT, SEL.NAME "
			+ "FROM TB_SALES SAL "
			+ "JOIN TB_SELLER SEL ON SAL.SELLER_ID=SEL.ID "
			+ "WHERE SAL.DATE BETWEEN :min AND :max AND UPPER(SEL.NAME) LIKE UPPER(CONCAT('%', :name, '%'))")
	List<ReportProjection> getReport(LocalDate min, LocalDate max, String name);
}
