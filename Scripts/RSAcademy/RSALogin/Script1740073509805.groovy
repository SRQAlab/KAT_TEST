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

WebUI.navigateToUrl('https://rahulshettyacademy.com/client')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_Email_userEmail'), 'swan@mailinator.com')

WebUI.setEncryptedText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_Password_userPassword'), '/5S6MFFLcE4mlsixtc6/Tg==')

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_Password_login'))

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Login Successfully'), 'Login Successfully')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Login Successfully'), 0)

WebUI.verifyElementText(findTestObject('RSAcademy/Page_Lets Shop/b_ZARA COAT 3'), 'ZARA COAT 3')

WebUI.verifyElementPresent(findTestObject('RSAcademy/Page_Lets Shop/b_ZARA COAT 3'), 0)

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_checkbox'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_checkbox_1'))

WebUI.scrollToElement(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_checkbox_1_2'), 0)

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_checkbox_1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_No Products Found'), 'No Products Found')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_No Products Found'), 0)

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_checkbox_1_2'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_checkbox_1'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_checkbox'))

