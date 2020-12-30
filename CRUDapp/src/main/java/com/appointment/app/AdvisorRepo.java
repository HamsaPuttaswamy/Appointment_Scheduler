package com.appointment.app;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvisorRepo extends JpaRepository<Advisor,Long> {

	public List<Advisor> findAllByDepartment(String department);

}
