Feature:
  Scenario:
    Given the API endpoint '/v1/data'
    When a GET request is sent
    Then the response status code should be 200
    And the response should contain "United Kingdom"