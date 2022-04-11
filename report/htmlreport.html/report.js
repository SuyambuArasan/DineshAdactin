$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/dines/eclipse-workspace/DineshAdactin/src/test/java/runnerclass/suyambu.feature");
formatter.feature({
  "line": 1,
  "name": "Validating a Hotel Booking Application",
  "description": "",
  "id": "validating-a-hotel-booking-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Adactin hotel booking user login and booking",
  "description": "",
  "id": "validating-a-hotel-booking-application;adactin-hotel-booking-user-login-and-booking",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@suyambuarasan"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user enters the url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters the username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters the password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User login in to hotel booking page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User select the desired inputs",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionCheck.user_enters_the_url()"
});
formatter.result({
  "duration": 8045713100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionCheck.user_enters_the_username()"
});
formatter.result({
  "duration": 298721800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionCheck.user_enters_the_password()"
});
formatter.result({
  "duration": 164874200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionCheck.user_login_in_to_hotel_booking_page()"
});
formatter.result({
  "duration": 2018327200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionCheck.user_select_the_desired_inputs()"
});
formatter.result({
  "duration": 4351323700,
  "status": "passed"
});
});