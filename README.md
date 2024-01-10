# Selenium Testng empty template

Empty template for Test Automation project with Selenium

# Instruction:

1. Download template and unpack in appropriate folder

2. Open project in IDE (for example IntelliJIdea)

3. Reporting: Allure is enabled, after running tests just run **allure:serve** in maven plugins (allure should be
   installed locally)

4. Parameters that can be changed:

- File src/test/resources/config.properties There are settings to define base url of your site under tests, browser to
  define chrome/safari/ie/firefox/edge which driver to use

5. TestNg Retry and before after listeners: You can also modify rules of retry tests (now it is 1 retry for each test)
   and actions before/after all tests (now it prints test name and result) in **testng** folder
