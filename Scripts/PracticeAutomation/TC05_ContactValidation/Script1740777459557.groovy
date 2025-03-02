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

WebUI.click(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/a_Contact'))

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Contact  Practice Test Automation  Sel_b632b1/h1_Contact'), 
    'Contact')

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Contact  Practice Test Automation  Sel_b632b1/h1_Contact'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Contact  Practice Test Automation  Sel_b632b1/p_If you have questions, suggestions, or bu_f8c306'), 
    'If you have questions, suggestions, or business proposals, fill up the form below and I’ll be in touch as soon as I get it!')

WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Contact  Practice Test Automation  Sel_b632b1/p_If you have questions, suggestions, or bu_f8c306'), 
    0)

WebUI.click(findTestObject('Object Repository/PracticeAutomation/Page_Contact  Practice Test Automation  Sel_b632b1/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Contact  Practice Test Automation  Sel_b632b1/label_This field is required'), 
    'This field is required.')

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Contact  Practice Test Automation  Sel_b632b1/label_This field is required_1'), 
    'This field is required.')

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Contact  Practice Test Automation  Sel_b632b1/label_This field is required_1_2'), 
    'This field is required.')

WebUI.setText(findTestObject('Object Repository/PracticeAutomation/Page_Contact  Practice Test Automation  Sel_b632b1/input__wpformsfields0first'), 
    'Admin')

WebUI.setText(findTestObject('Object Repository/PracticeAutomation/Page_Contact  Practice Test Automation  Sel_b632b1/input_First_wpformsfields0last'), 
    'Test')

WebUI.click(findTestObject('Object Repository/PracticeAutomation/Page_Contact  Practice Test Automation  Sel_b632b1/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Contact  Practice Test Automation  Sel_b632b1/label_This field is required_1_2'), 
    'This field is required.')

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Contact  Practice Test Automation  Sel_b632b1/label_This field is required_1_2_3'), 
    'This field is required.')

WebUI.setText(findTestObject('Object Repository/PracticeAutomation/Page_Contact  Practice Test Automation  Sel_b632b1/input__wpformsfields1'), 
    'student@abc.com')

WebUI.setText(findTestObject('Object Repository/PracticeAutomation/Page_Contact  Practice Test Automation  Sel_b632b1/textarea__wpformsfields2'), 
    'This is Test Message')

WebUI.click(findTestObject('Object Repository/PracticeAutomation/Page_Contact  Practice Test Automation  Sel_b632b1/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Contact  Practice Test Automation  Sel_b632b1/label_Google reCAPTCHA verification failed,_ca1802'), 
    'Google reCAPTCHA verification failed, please try again later.')

WebUI.closeBrowser()

