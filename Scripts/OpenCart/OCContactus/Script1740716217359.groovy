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

WebUI.callTestCase(findTestCase('OpenCart/OCLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/OpenCart/Page_My Account/a_Contact Us'), 0)

WebUI.click(findTestObject('Object Repository/OpenCart/Page_My Account/a_Contact Us'))

WebUI.verifyElementText(findTestObject('Object Repository/OpenCart/Page_Contact Us/h1_Contact Us'), 'Contact Us')

WebUI.verifyElementPresent(findTestObject('Object Repository/OpenCart/Page_Contact Us/h1_Contact Us'), 0)

WebUI.setText(findTestObject('Object Repository/OpenCart/Page_Contact Us/textarea_Enquiry_enquiry'), 'This is a Test Enquiry.')

WebUI.scrollToElement(findTestObject('Object Repository/OpenCart/Page_Contact Us/button_Submit'), 0)

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Contact Us/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/OpenCart/Page_Contact Us/h1_Contact Us'), 'Contact Us')

WebUI.verifyElementPresent(findTestObject('Object Repository/OpenCart/Page_Contact Us/h1_Contact Us'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/OpenCart/Page_Contact Us/p_Your enquiry has been successfully sent t_58ea59'), 
    'Your enquiry has been successfully sent to the store owner!')

WebUI.verifyElementPresent(findTestObject('Object Repository/OpenCart/Page_Contact Us/p_Your enquiry has been successfully sent t_58ea59'), 
    0)

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Contact Us/a_Continue'))

WebUI.scrollToElement(findTestObject('Object Repository/OpenCart/Page_Your Store/i_My Account_fa-solid fa-caret-down'), 
    0)

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Your Store/i_My Account_fa-solid fa-caret-down'))

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Your Store/a_Logout'))

WebUI.verifyElementText(findTestObject('Object Repository/OpenCart/Page_Account Logout/h1_Account Logout'), 'Account Logout')

WebUI.verifyElementPresent(findTestObject('Object Repository/OpenCart/Page_Account Logout/h1_Account Logout'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/OpenCart/Page_Account Logout/p_You have been logged off your account. It_3147bb'), 
    'You have been logged off your account. It is now safe to leave the computer.')

WebUI.verifyElementPresent(findTestObject('Object Repository/OpenCart/Page_Account Logout/p_You have been logged off your account. It_3147bb'), 
    0)

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Account Logout/a_Continue'))

WebUI.closeBrowser()

