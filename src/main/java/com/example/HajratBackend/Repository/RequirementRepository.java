package com.example.HajratBackend.Repository;

import com.example.HajratBackend.Module.Requirement;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface RequirementRepository extends CrudRepository<Requirement, UUID> {
}
