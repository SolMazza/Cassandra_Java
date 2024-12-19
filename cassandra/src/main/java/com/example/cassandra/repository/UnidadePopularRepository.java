package com.example.cassandra.repository;

import com.example.cassandra.model.UnidadePopular;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface UnidadePopularRepository extends CassandraRepository<UnidadePopular, UUID> {
}
