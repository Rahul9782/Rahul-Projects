Feature: Midnight
  
Scenario: Login with Credentials
Given Open the Browser
Given open the URL "https://rc.vsmidnight.com" 
When Click on UserName field and enter username "vsuser"
When  Click on Password field and enter password "Inthemidnighthour"
Then Click on Login Button
