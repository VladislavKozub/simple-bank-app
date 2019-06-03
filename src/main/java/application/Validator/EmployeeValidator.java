package application.Validator;

import application.Entity.Employee;

/**
 * Created by Cirus on 02-June-19.
 */
public class EmployeeValidator {

    public boolean validate(Employee employee) {
        return validateEmail(employee.getEmail()) && validateSalary(employee.getSalary());
    }

    private boolean validateName(String name) {
        return name.matches("^[a-zA-Z\\\\s]*$");
    }
    private boolean validateSalary(Double salary) {
        return salary > 0;
    }
    private boolean validateEmail(String email) {
        return email.contains("@") && email.contains(".com");
    }

    private boolean validatePhone(String phone) {
        return phone.matches("[07][0-9]{9}");
    }
}
