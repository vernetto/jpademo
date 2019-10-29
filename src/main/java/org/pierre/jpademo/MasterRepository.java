package org.pierre.jpademo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MasterRepository extends JpaRepository<Master, Long> {
    @Query("SELECT m FROM Master m LEFT JOIN FETCH  m.details ")
    Master fetchEager();

}
