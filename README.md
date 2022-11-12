# In order to run the project:

Please Clone the Logintestsaucedemo repository to Local Repository (Working directory)
Then, using Eclipse import project from git to workspace
Make sure you've the External jar files added to the Project
    1. Selenium jar files
    2. Apache POI jar files
    3. TestNg jar files

Please make sure to change the chrome driver path ("C:\Selenium Webdriver\chromedriver_win32\chromedriver.exe") to the location of your chrome driver
Run as TestNG Test.

================================================================================================

Once the test is complete you should see the Test Results as follows:
PASSED: Logintosaucedemowebsite("valid", "standard_user", "secret_sauce")
PASSED: Logintosaucedemowebsite("invalid", "locked_out_user", "secret_sauce")
PASSED: Logintosaucedemowebsite("valid", "problem_user", "secret_sauce")
PASSED: Logintosaucedemowebsite("valid", "performance_glitch_user", "secret_sauce")
PASSED: Logintosaucedemowebsite("invalid", " ", " ")
PASSED: Logintosaucedemowebsite("invalid", "!@#$%^&*()", "secret_sauce")
PASSED: Logintosaucedemowebsite("invalid", "standard_user", " ")
PASSED: Logintosaucedemowebsite("invalid", "Standard_use", "secret_sauce")
PASSED: Logintosaucedemowebsite("invalid", " ", "secret_sauc")
PASSED: Logintosaucedemowebsite("invalid", "1234567890", "1234567890")

===============================================
    Default test
    Tests run: 10, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 10, Failures: 0, Skips: 0
===============================================
