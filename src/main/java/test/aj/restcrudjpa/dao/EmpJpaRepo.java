package test.aj.restcrudjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import test.aj.restcrudjpa.entity.Employee;
//test
public interface EmpJpaRepo extends JpaRepository<Employee, Integer>{};
