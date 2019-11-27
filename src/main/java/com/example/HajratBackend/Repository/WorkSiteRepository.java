package com.example.HajratBackend.Repository;

import com.example.HajratBackend.Module.WorkSite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface WorkSiteRepository extends CrudRepository<WorkSite, UUID> {
}
