import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://practicetestautomation.com/practice-test-login/')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/img_concat(Press , , Enter, ,  to skip to c_ef5b00'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/h2_Test login'), 
    'Test login')

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/h2_Test login'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/li_This is a simple Login page. Students ca_843821'), 
    'This is a simple Login page. Students can use this page to practice writing simple positive and negative LogIn tests. Login functionality is something that most of the test automation engineers need to automate.')

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/li_This is a simple Login page. Students ca_843821'), 
    0)

WebUI.setText(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/input_Username_username'), 
    'student')

WebUI.setEncryptedText(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/input_Password_password'), 
    'p4y+y39Ir5PJb2ispxT0Ew==')

WebUI.click(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Logged In Successfully  Practice Test _c87e4f/h1_Logged In Successfully'), 
    'Logged In Successfully')

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Logged In Successfully  Practice Test _c87e4f/h1_Logged In Successfully'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Logged In Successfully  Practice Test _c87e4f/strong_Congratulations student. You success_9f23b9'), 
    'Congratulations student. You successfully logged in!')

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Logged In Successfully  Practice Test _c87e4f/strong_Congratulations student. You success_9f23b9'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Logged In Successfully  Practice Test _c87e4f/a_Log out'), 
    'Log out')

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Logged In Successfully  Practice Test _c87e4f/a_Log out'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Logged In Successfully  Practice Test _c87e4f/a_Practice'), 
    'PRACTICE')

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Logged In Successfully  Practice Test _c87e4f/a_Practice'), 
    0)

WebUI.click(findTestObject('Object Repository/PracticeAutomation/Page_Logged In Successfully  Practice Test _c87e4f/a_Practice'))

WebUI.navigateToUrl('https://practicetestautomation.com/practice/')

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Practice  Practice Test Automation/h1_Practice'), 
    'Practice')

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Practice  Practice Test Automation/h1_Practice'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Practice  Practice Test Automation/a_Test Login Page'), 
    'Test Login Page')

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Practice  Practice Test Automation/a_Test Login Page'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Practice  Practice Test Automation/em_Simple login page where testers can exec_a11f7b'), 
    'Simple login page where testers can execute positive and negative login test cases')

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Practice  Practice Test Automation/em_Simple login page where testers can exec_a11f7b'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Practice  Practice Test Automation/a_Test Exceptions'), 
    'Test Exceptions')

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Practice  Practice Test Automation/a_Test Exceptions'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Practice  Practice Test Automation/em_Page to reproduce the most common Seleni_aaf89a'), 
    'Page to reproduce the most common Selenium Exceptions.')

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Practice  Practice Test Automation/em_Page to reproduce the most common Seleni_aaf89a'), 
    0)

WebUI.click(findTestObject('Object Repository/PracticeAutomation/Page_Practice  Practice Test Automation/a_Test Exceptions'))

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Test Exceptions  Practice Test Automation/h2_Test Exceptions'), 
    'Test Exceptions')

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Test Exceptions  Practice Test Automation/h2_Test Exceptions'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Test Exceptions  Practice Test Automation/h5_Create list of your favorite foods'), 
    'Create list of your favorite foods')

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Test Exceptions  Practice Test Automation/h5_Create list of your favorite foods'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Test Exceptions  Practice Test Automation/input_Row 1_input-field'), 
    '')

WebUI.click(findTestObject('Object Repository/PracticeAutomation/Page_Test Exceptions  Practice Test Automation/button_Add'))

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Test Exceptions  Practice Test Automation/div_Row 2 was added'), 
    'Row 2 was added', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Test Exceptions  Practice Test Automation/div_Row 2 was added'), 
    0)

WebUI.setText(findTestObject('Object Repository/PracticeAutomation/Page_Test Exceptions  Practice Test Automation/input_Row 2_input-field'), 
    'Burger')

WebUI.click(findTestObject('Object Repository/PracticeAutomation/Page_Test Exceptions  Practice Test Automation/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Test Exceptions  Practice Test Automation/div_Row 2 was saved'), 
    'Row 2 was saved')

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Test Exceptions  Practice Test Automation/div_Row 2 was saved'), 
    0)

WebUI.click(findTestObject('Object Repository/PracticeAutomation/Page_Test Exceptions  Practice Test Automation/button_Edit'))

WebUI.setText(findTestObject('Object Repository/PracticeAutomation/Page_Test Exceptions  Practice Test Automation/input_Row 2_input-field'), 
    'Sandwitch')

WebUI.click(findTestObject('Object Repository/PracticeAutomation/Page_Test Exceptions  Practice Test Automation/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Test Exceptions  Practice Test Automation/div_Row 2 was saved'), 
    'Row 2 was saved')

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Test Exceptions  Practice Test Automation/div_Row 2 was saved'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Test Exceptions  Practice Test Automation/input_Row 2_input-field'), 
    '')

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Test Exceptions  Practice Test Automation/input_Row 2_input-field'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Test Exceptions  Practice Test Automation/img_concat(Press , , Enter, ,  to skip to c_ef5b00'), 
    0)

WebUI.click(findTestObject('Object Repository/PracticeAutomation/Page_Test Exceptions  Practice Test Automation/a_Home'))

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Practice Test Automation  Learn Seleni_a43ca4/h1_Hello'), 
    'Hello')

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Practice Test Automation  Learn Seleni_a43ca4/h1_Hello'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Practice Test Automation  Learn Seleni_a43ca4/strong_Welcome to Practice Test Automation'), 
    'Welcome to Practice Test Automation!')

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Practice Test Automation  Learn Seleni_a43ca4/strong_Welcome to Practice Test Automation'), 
    0)

