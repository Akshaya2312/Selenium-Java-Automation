Feature: User is able to edit the details of employee from employee list


  Scenario: User is able to edit details of employee
    Given Create Employee is in employee list
    When User edit the details of employee
    Then Details should be added