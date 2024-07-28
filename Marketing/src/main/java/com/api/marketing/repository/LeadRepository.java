package com.api.marketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.marketing.Entities.Marketing;

public interface LeadRepository extends JpaRepository<Marketing, Long> {

}
