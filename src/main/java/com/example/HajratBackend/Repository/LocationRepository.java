package com.example.HajratBackend.Repository;

import com.example.HajratBackend.Module.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface LocationRepository extends CrudRepository<Location, UUID> {
}
