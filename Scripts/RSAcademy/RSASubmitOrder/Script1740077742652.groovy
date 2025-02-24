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

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_Add To Cart'))

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Product Added To Cart'), 'Product Added To Cart')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Product Added To Cart'), 0)

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_Cart 1'))

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/h3_IPHONE 13 PRO'), 'IPHONE 13 PRO')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/h3_IPHONE 13 PRO'), 0)

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input__input txt'), '123')

WebUI.setText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_Name on Card_input txt'), 'SWAN')

WebUI.setText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_swanmailinator.com_input txt text-validated'), 
    'India')

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/span_India'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/a_Place Order'))

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Order Placed Successfully'), 'Order Placed Successfully')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Order Placed Successfully'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/h1_Thankyou for the order'), 'Thankyou for the order.', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/h1_Thankyou for the order'), 'THANKYOU FOR THE ORDER.', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/h1_Thankyou for the order'), 0)

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/label_Orders History Page'))

WebUI.callTestCase(findTestCase('RSAcademy/RSALogout'), [:], FailureHandling.STOP_ON_FAILURE)

