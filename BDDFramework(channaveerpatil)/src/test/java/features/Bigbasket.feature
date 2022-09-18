Feature: Search the product and place the order in bigbasket


@offerpagae1
Scenario:Tc01- Search the product in homepage and offer page
Given User lanuch the browser and navigative to GreenCart landing page
When user searched with Shortname "Tom" and extract actual name of product
Then user searched  for "Tom" shortname in offer page
And validate product name in offer page matches with Lanidng page 

#***********************************************************************************************************
@offerpage2
Scenario Outline:Tc02- Search the product in homepage and multiple offer page
Given User lanuch the browser and navigative to GreenCart landing page
When user searched with Shortname "<Scenario>" and extract actual name of product
Then user searched  for "<Scenario>" shortname in offer page
And validate product name in offer page matches with Lanidng page 

Examples:
|Scenario|
| Tom    |
| Cap    |

#***************************************************************************************************************
@placeorder
Scenario Outline:Tc03- Search the product in homepage and place order
Given User lanuch the browser and navigative to GreenCart landing page
When user searched with Shortname "<Scenario>" and extract actual name of product
And Add "2" items  of selected product  to cart
Then user Proceeds to checkout and  validate "<Scenario>" items in checkout page
And verify user has  ability to enter promo code and place the order

Examples:
|Scenario|
| Tom    |
| Cap    |