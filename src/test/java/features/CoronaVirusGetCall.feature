Feature:

  @smoke
  Scenario Outline:Retrieve data from the API
    Given the API endpoint '/v1/data'
    When  the response status code should be 200
    Then the response should contain <fieldName> <expectedFields>

    Examples:
    |fieldName|expectedFields       |
    |'areaCode'| 'K02000001'        |
    |'areaName'| 'United Kingdom'   |


    Scenario Outline: Get latest covid cases for given date
      Given the API endpoint '/v1/data'
      When  the response status code should be 200
      And the response should contain the latest COVID-19 <givenDate>
    Examples:
       |givenDate|
       |'2022-05-19'|
       |'2022-05-20'|