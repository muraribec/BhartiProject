Feature: Facebook Features

@RegressionTest
Scenario Outline: Facebook Login Test
    Given user is already on "<url>" page
    When title of the facebook login page
    Then close the browser
 

    Examples: 
      | url                       | username            | password |
      | https://www.facebook.com/ | muraribec@gmail.com | hdgfhdf  |



  #Scenario Outline: Facebook Login Test
    #Given user is already on "<url>" page
    #When title of the facebook login page is Facebook
    #Then user enters "<username>" and "<password>"
    #And user click on login button
    #Then close the browser
#
    #Examples: 
      #| url                       | username        | password |
      #| https://www.facebook.com/ | kumar@gmail.com | jdhfjdhg |
      #| https://www.amazon.com/in | kumar@gmail.com | jdhfjdhg |
      #| https://www.facebook.com/us | kumar@gmail.com | jdhfjdhg |
      #| https://www.facebook.com/uk | kumar@gmail.com | jdhfjdhg |
      
      
      
      
      
