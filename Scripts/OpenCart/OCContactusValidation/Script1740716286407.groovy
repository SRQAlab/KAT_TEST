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

WebUI.click(findTestObject('Object Repository/OpenCart/Page_My Account/i_My Account_fa-solid fa-caret-down'))

WebUI.click(findTestObject('Object Repository/OpenCart/Page_My Account/a_My Account'))

WebUI.navigateToUrl('https://demo.opencart.com/en-gb?route=account/account&customer_token=9ca1acbf0dd662d87c0bd08eb3')

WebUI.click(findTestObject('Object Repository/OpenCart/Page_My Account/i_My Account_fa-solid fa-caret-down'))

WebUI.click(findTestObject('Object Repository/OpenCart/Page_My Account/i_My Account_fa-solid fa-caret-down'))

WebUI.scrollToElement(findTestObject('Object Repository/OpenCart/Page_My Account/a_Contact Us'), 0)

WebUI.click(findTestObject('Object Repository/OpenCart/Page_My Account/a_Contact Us'))

WebUI.verifyElementText(findTestObject('Object Repository/OpenCart/Page_Contact Us/h1_Contact Us'), 'Contact Us')

WebUI.verifyElementPresent(findTestObject('Object Repository/OpenCart/Page_Contact Us/h1_Contact Us'), 0)

WebUI.setText(findTestObject('Object Repository/OpenCart/Page_Contact Us/textarea_Enquiry_enquiry'), 'This is a Test Enquiry.')

WebUI.scrollToElement(findTestObject('Object Repository/OpenCart/Page_Contact Us/button_Submit'), 0)

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Contact Us/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/OpenCart/Page_Contact Us/div_Name must be between 3 and 32 characters'), 
    'Name must be between 3 and 32 characters!')

WebUI.verifyElementPresent(findTestObject('Object Repository/OpenCart/Page_Contact Us/div_Name must be between 3 and 32 characters'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/OpenCart/Page_Contact Us/div_E-Mail Address does not appear to be valid'), 
    'E-Mail Address does not appear to be valid!')

WebUI.verifyElementPresent(findTestObject('Object Repository/OpenCart/Page_Contact Us/div_E-Mail Address does not appear to be valid'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/OpenCart/Page_Contact Us/span_My Account'), 0)

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Contact Us/span_My Account'))

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Contact Us/span_My Account'))

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Contact Us/i_Show All MP3 Players_fas fa-home'))

WebUI.navigateToUrl('https://demo.opencart.com/en-gb?route=common/home')

WebUI.closeBrowser()

