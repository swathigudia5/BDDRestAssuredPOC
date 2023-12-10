$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/CoronaVirusGetCall.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Get latest covid cases for given date",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "the API endpoint \u0027/v1/data\u0027",
  "keyword": "Given "
});
formatter.step({
  "name": "the response status code should be 200",
  "keyword": "When "
});
formatter.step({
  "name": "the response should contain the latest COVID-19 \u003cgivenDate\u003e",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "givenDate"
      ]
    },
    {
      "cells": [
        "\u00272022-05-19\u0027"
      ]
    },
    {
      "cells": [
        "\u00272022-05-20\u0027"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Get latest covid cases for given date",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "the API endpoint \u0027/v1/data\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "GetRequestStep.sendGetRequest(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response status code should be 200",
  "keyword": "When "
});
formatter.match({
  "location": "GetRequestStep.verifyStatusCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response should contain the latest COVID-19 \u00272022-05-19\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "GetRequestStep.verifyResponseContainLatestCovidCases(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get latest covid cases for given date",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "the API endpoint \u0027/v1/data\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "GetRequestStep.sendGetRequest(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response status code should be 200",
  "keyword": "When "
});
formatter.match({
  "location": "GetRequestStep.verifyStatusCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response should contain the latest COVID-19 \u00272022-05-20\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "GetRequestStep.verifyResponseContainLatestCovidCases(String)"
});
formatter.result({
  "status": "passed"
});
});