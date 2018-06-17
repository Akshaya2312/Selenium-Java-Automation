Feature: User is able to view data by double click on employee in employee list.

   Scenario: User able to view details of an employee
      Given Employee is in employee list
      When User double click on employee
      Then User is able to see the details of employee