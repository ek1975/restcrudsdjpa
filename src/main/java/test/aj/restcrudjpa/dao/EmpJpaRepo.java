package test.aj.restcrudjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import test.aj.restcrudjpa.entity.Employee;

@RepositoryRestResource(path="members")
public interface EmpJpaRepo extends JpaRepository<Employee, Integer>{};
