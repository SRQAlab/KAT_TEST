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

WebUI.callTestCase(findTestCase('Prestashop/PSLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/a_Contact us'), 'Contact us')

WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/a_Contact us'), 0)

WebUI.click(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/a_Contact us'))

WebUI.verifyElementText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h4_Store information'), 'STORE INFORMATION')

WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h4_Store information'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h3_Contact us'), 'CONTACT US')

WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h3_Contact us'), 0)

WebUI.setText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/input_Email address_from'), 'admin@mystore.com')

WebUI.setText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/textarea_Message_message'), 'This is a test message')

WebUI.click(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/input_Message_submitMessage'))

WebUI.verifyElementText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/li_Your message has been successfully sent _18241a'), 
    'Your message has been successfully sent to our team.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/li_Your message has been successfully sent _18241a'), 
    0)

