Feature:Add Address Functionality

  Background:
    Given navigate to site
    When enter the username and password click sign in button

  Scenario Outline:

    And click on the element
      | actionSwitch |
      | myAccount    |
      | addressBook  |
      | aNewAddress  |

    And user sending keys in the element
      | aPhoneNumber   | <number>         |
      | aStreetAddress | <street-address> |
      | aZip           | <zip>            |
      | aCity          | <city>           |

    And click on the element
      | aTrOption   |
      | aSaveButton |

    And user should add address successfully

    Examples:
      | number        | street-address     | zip       | city      |
      | 2341212123432 | sdfsdagsdsfdsfdfds | 123123    | dasfasdfs |
      | 2342341123112 | dsfgdsfdassf       | 1231      | sfsdffs   |
      | 324234121123  | dsgdsaafsdsga      | 123123132 | awewra    |
