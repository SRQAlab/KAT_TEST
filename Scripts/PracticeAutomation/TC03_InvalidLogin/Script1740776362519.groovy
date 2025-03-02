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

WebUI.setText(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/input_Username_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/input_Password_password'), 
    'p4y+y39Ir5PJb2ispxT0Ew==')

WebUI.click(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/div_Your username is invalid'), 
    'Your username is invalid!')

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/div_Your username is invalid'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/li_This is a simple Login page. Students ca_843821'), 
    'This is a simple Login page. Students can use this page to practice writing simple positive and negative LogIn tests. Login functionality is something that most of the test automation engineers need to automate.')

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/li_This is a simple Login page. Students ca_843821'), 
    0)

WebUI.closeBrowser()

