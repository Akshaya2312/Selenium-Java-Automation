Feature: Employee data can be deleted by clicking delete

  Scenario: Delete the employee from employee list
    Given Employee is present in employee list
    When User click on Delete button
    Then User get deleted from employee list
