package repository;

import org.springframework.data.repository.CrudRepository;

import com.example.employee.model.EmployeeDetails;

public interface EmployeeRepository extends CrudRepository<EmployeeDetails, Long>{

}
