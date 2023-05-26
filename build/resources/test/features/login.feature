#Autor: Sara Cardona

  @UserStory
  Feature:  Verify the validation form
    Me as user WANT to enter the colorLib page TO Verify the validation form
  @Formulariocorrecto
  Scenario Outline: Verify the validation form
    Given I enter with my credentials
      |User|Password|
      |<User>|<Password>|
    When I proceed with the authentication
    And go to the main view of the page
    And enter submenu form validations
    And check the title of the form on the screen
    And fill all fields
      | Required | Select | MultipleSelect | Url | Email | Password1 | ConfirmPassword | MinField | MaxField | Number | Ip | Date | DateEarlier |
      |<Required>|<Select>|<MultipleSelect>|<Url>|<Email>|<Password1>|<ConfirmPassword>|<MinField>|<MaxField>|<Number>|<Ip>|<Date>|<DateEarlier>|
    And click button validate
    Then field required will be empty


    Examples:
      | User |Password| Required | Select | MultipleSelect| Url             | Email  | Password1 | ConfirmPassword| MinField | MaxField| Number  | Ip       | Date       | DateEarlier |
      | admin | admin   | tested   | admin  | Tennis        |http://dfsdfd.com| sara@gmial.com | 12264584         | 12264584       | 123456   |    1    | 2020245 | 129.201.20.201 | 2022-02-17 | 2002-02-17  |
