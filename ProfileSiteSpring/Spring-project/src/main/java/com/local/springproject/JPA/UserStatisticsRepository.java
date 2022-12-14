package com.local.springproject.JPA;

import com.local.springproject.statistics.UserStatistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserStatisticsRepository extends JpaRepository<UserStatistics, Integer> {

    Optional<UserStatistics> findByName(String name);

}
