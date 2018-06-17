$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Create.feature");
formatter.feature({
  "line": 1,
  "name": "Application is able to add employee in employee list",
  "description": "",
  "id": "application-is-able-to-add-employee-in-employee-list",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6267851393,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "User is able to add  new employee in employee list",
  "description": "",
  "id": "application-is-able-to-add-employee-in-employee-list;user-is-able-to-add--new-employee-in-employee-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user login in an application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user click on create button and fill employee details and click add button",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "employee is added in employee list",
  "keyword": "Then "
});
formatter.match({
  "location": "EmployeeTest.user_login_in_an_application()"
});
formatter.result({
  "duration": 227157136,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeTest.user_click_on_create_button_and_fill_employee_details_and_click_add_button()"
});
formatter.result({
  "duration": 1387346142,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeTest.employee_is_added_in_employee_list()"
});
formatter.result({
  "duration": 1916725767,
  "status": "passed"
});
formatter.after({
  "duration": 207476304,
  "status": "passed"
});
formatter.uri("Delete.feature");
formatter.feature({
  "line": 1,
  "name": "Employee data can be deleted by clicking delete",
  "description": "",
  "id": "employee-data-can-be-deleted-by-clicking-delete",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3306787875,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Delete the employee from employee list",
  "description": "",
  "id": "employee-data-can-be-deleted-by-clicking-delete;delete-the-employee-from-employee-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Employee is present in employee list",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on Delete button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User get deleted from employee list",
  "keyword": "Then "
});
formatter.match({
  "location": "EmployeeTest.employee_is_present_in_employee_list()"
});
formatter.result({
  "duration": 1287809607,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeTest.user_click_on_Delete_button()"
});
formatter.result({
  "duration": 1617896064,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeTest.user_get_deleted_from_employee_list()"
});
formatter.result({
  "duration": 634526333,
  "status": "passed"
});
formatter.after({
  "duration": 170965812,
  "status": "passed"
});
formatter.uri("Edit.feature");
formatter.feature({
  "line": 1,
  "name": "User is able to edit the details of employee from employee list",
  "description": "",
  "id": "user-is-able-to-edit-the-details-of-employee-from-employee-list",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3031568399,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User is able to edit details of employee",
  "description": "",
  "id": "user-is-able-to-edit-the-details-of-employee-from-employee-list;user-is-able-to-edit-details-of-employee",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Create Employee is in employee list",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User edit the details of employee",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Details should be added",
  "keyword": "Then "
});
formatter.match({
  "location": "EmployeeTest.create_Employee_is_in_employee_list()"
});
formatter.result({
  "duration": 1948532024,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeTest.user_edit_the_details_of_employee()"
});
formatter.result({
  "duration": 2039141875,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeTest.details_should_be_added()"
});
formatter.result({
  "duration": 1891189784,
  "status": "passed"
});
formatter.after({
  "duration": 245587856,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login service",
  "description": "",
  "id": "login-service",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2835538654,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Test Login service with Valid inputs",
  "description": "",
  "id": "login-service;test-login-service-with-valid-inputs",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Valid user_name  and password",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user login  with valid inputs",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user logged in an application",
  "keyword": "Then "
});
formatter.match({
  "location": "EmployeeTest.valid_user_name_and_password()"
});
formatter.result({
  "duration": 74832,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeTest.user_login_with_valid_inputs()"
});
formatter.result({
  "duration": 75181,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeTest.user_logged_in_an_application()"
});
formatter.result({
  "duration": 83699820,
  "status": "passed"
});
formatter.after({
  "duration": 162929995,
  "status": "passed"
});
formatter.uri("Read.feature");
formatter.feature({
  "line": 1,
  "name": "User is able to view data by double click on employee in employee list.",
  "description": "",
  "id": "user-is-able-to-view-data-by-double-click-on-employee-in-employee-list.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2947014739,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User able to view details of an employee",
  "description": "",
  "id": "user-is-able-to-view-data-by-double-click-on-employee-in-employee-list.;user-able-to-view-details-of-an-employee",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Employee is in employee list",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User double click on employee",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User is able to see the details of employee",
  "keyword": "Then "
});
formatter.match({
  "location": "EmployeeTest.employee_is_in_employee_list()"
});
formatter.result({
  "duration": 1724010513,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeTest.user_double_click_on_employee()"
});
formatter.result({
  "duration": 1270309538,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeTest.user_is_able_to_see_the_details_of_employee()"
});
formatter.result({
  "duration": 523710284,
  "status": "passed"
});
formatter.after({
  "duration": 197394657,
  "status": "passed"
});
});