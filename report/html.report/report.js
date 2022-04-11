$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/dines/eclipse-workspace/DineshAdactin/src/test/java/runnerclass/suyambu.feature");
formatter.feature({
  "line": 1,
  "name": "Validating a Hotel Booking Application",
  "description": "",
  "id": "validating-a-hotel-booking-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": ": Login page",
  "description": "",
  "id": "validating-a-hotel-booking-application;:-login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@suyambuarasan"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user enter the \"\u003cusername\u003e\" in username field",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enter the \"\u003cpassword\u003e\" in password field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user click the login Button  and it navigates to search hotel page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user select the desired inputs",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "validating-a-hotel-booking-application;:-login-page;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 15,
      "id": "validating-a-hotel-booking-application;:-login-page;;1"
    },
    {
      "cells": [
        "Dineshkasiraman34215",
        "QD4INB"
      ],
      "line": 16,
      "id": "validating-a-hotel-booking-application;:-login-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user Launch The Adactin Url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionCheck.user_Launch_The_Adactin_Url()"
});
formatter.result({
  "duration": 8474347400,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": ": Login page",
  "description": "",
  "id": "validating-a-hotel-booking-application;:-login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@suyambuarasan"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user enter the \"Dineshkasiraman34215\" in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enter the \"QD4INB\" in password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user click the login Button  and it navigates to search hotel page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user select the desired inputs",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Dineshkasiraman34215",
      "offset": 16
    }
  ],
  "location": "StepDefinitionCheck.user_enter_the_in_username_field(String)"
});
formatter.result({
  "duration": 172243700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "QD4INB",
      "offset": 16
    }
  ],
  "location": "StepDefinitionCheck.user_enter_the_in_password_field(String)"
});
formatter.result({
  "duration": 112051900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionCheck.user_click_the_login_Button_and_it_navigates_to_search_hotel_page()"
});
formatter.result({
  "duration": 1474135500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionCheck.user_select_the_desired_inputs()"
});
formatter.result({
  "duration": 3936502600,
  "status": "passed"
});
});