  @hotelbooking
  Feature: Hotel booking
 	@smoke
  Scenario Outline: Hotel booking login page
    Given open browser with chrome
    And load adaction "url"
    When login with valied "<userName>" and "<passWord>" 
    Then I validate login homepage
    
 Examples:   
		|userName|passWord|
    |kingKong|M0B0WA|
		
	@regerssion
	Scenario: Hotel booking login page
    Given open browser with chrome
    And load adaction "url"
    When login with valied "kingKong" and "M0B0WA"
    Then I validate login homepage
    
    