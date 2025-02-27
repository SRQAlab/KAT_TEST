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

WebUI.callTestCase(findTestCase('RSAcademy/RSALogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_Filters_search'))

WebUI.setText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_Price Range_minPrice'), '32000')

WebUI.setText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_Price Range_maxPrice'), '35000')

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/app-dashboard_AutomationAutomation Practice_538625'))

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_No Products Found'), 'No Products Found')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_No Products Found'), 0)

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_checkbox'))

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_No Products Found'), 'No Products Found')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_No Products Found'), 0)

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_checkbox_1'))

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_No Products Found'), 'No Products Found')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_No Products Found'), 0)

WebUI.setText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_Price Range_minPrice'), '31500')

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/app-dashboard_AutomationAutomation Practice_538625'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_Price Range_minPrice'))

WebUI.setText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_Price Range_minPrice'), '31500')

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/app-dashboard_AutomationAutomation Practice_538625'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_checkbox_1'))

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/b_ZARA COAT 3'), 'ZARA COAT 33', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/b_ZARA COAT 3'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/b_ADIDAS ORIGINAL'), 'ADIDAS ORIGINAL')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/b_ADIDAS ORIGINAL'), 0)

WebUI.callTestCase(findTestCase('RSAcademy/RSALogout'), [:], FailureHandling.STOP_ON_FAILURE)

