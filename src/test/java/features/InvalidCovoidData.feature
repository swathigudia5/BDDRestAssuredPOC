Feature: Retrieve COVID-19 data for an invalid area
  @Regression
  Scenario: Requesting COVID-19 data for an invalid area
    Given the API endpoint "/v2/data/invalid"
    When the response status code should be 404
    Then the error message should be "Resource not found"