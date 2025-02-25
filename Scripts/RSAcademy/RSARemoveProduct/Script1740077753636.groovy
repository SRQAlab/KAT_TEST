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

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/b_ADIDAS ORIGINAL'), 'ADIDAS ORIGINAL')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/b_ADIDAS ORIGINAL'), 0)

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_View'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_Add To Cart'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_Add To Cart'))

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Product Added To Cart'), 'Product Added To Cart')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Product Added To Cart'), 0)

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_HOME'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_Add To Cart'))

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Product Added To Cart'), 'Product Added To Cart')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Product Added To Cart'), 0)

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_Cart 2'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/i_Buy Now_fa fa-trash-o'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/i_Buy Now_fa fa-trash-o'))

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_No Product in Your Cart'), 'No Product in Your Cart')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_No Product in Your Cart'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/h1_No Products in Your Cart'), 'No Products in Your Cart !')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/h1_No Products in Your Cart'), 0)

WebUI.callTestCase(findTestCase('RSAcademy/RSALogout'), [:], FailureHandling.STOP_ON_FAILURE)

