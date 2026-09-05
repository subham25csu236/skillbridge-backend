package com.skillbridge.skillbridge_backend.repository;

import com.skillbridge.skillbridge_backend.entity.AssessmentSkillResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssessmentSkillResultRepository
        extends JpaRepository<AssessmentSkillResult, Long> {
}