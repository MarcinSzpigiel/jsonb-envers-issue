package com.example.jsonbenversissue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotAuditedRepository extends JpaRepository<NotAuditedTable, Long> {
}
