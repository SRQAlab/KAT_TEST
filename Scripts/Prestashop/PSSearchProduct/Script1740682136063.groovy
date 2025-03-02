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

WebUI.verifyElementText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h2_Popular Products'), 'POPULAR PRODUCTS')

WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h2_Popular Products'), 
    0)

WebUI.setText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/input_Art_s'), 'mug')

WebUI.sendKeys(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/input_Art_s'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h1_Search results'), 'SEARCH RESULTS')

WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h1_Search results'), 0)

WebUI.click(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/img'))

WebUI.verifyElementText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h1_Mug The best is yet to come'), 
    'MUG THE BEST IS YET TO COME')

WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h1_Mug The best is yet to come'), 
    0)

WebUI.click(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/span_Home'))

WebUI.click(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/img_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h1_Today is a good day Framed poster'), 
    'TODAY IS A GOOD DAY FRAMED POSTER')

WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h1_Today is a good day Framed poster'), 
    0)

WebUI.click(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/span_Home'))

WebUI.click(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/img_1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h1_Hummingbird printed t-shirt'), 
    'HUMMINGBIRD PRINTED T-SHIRT')

WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h1_Hummingbird printed t-shirt'), 
    0)

WebUI.click(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/button_Add to cart'))

WebUI.waitForPageLoad(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h4_Product successfully added to your shopp_0bf508'), 
    0)

WebUI.click(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/a_Proceed to checkout'))

WebUI.verifyElementText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h1_Shopping Cart'), 'SHOPPING CART')

WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h1_Shopping Cart'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/a_Proceed to checkout_1'), 
    0)

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/i_delete'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/span_There are no more items in your cart'), 
    0)

WebUI.click(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/a_chevron_leftContinue shopping'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/img__logo img-fluid_1'), 
    0)

WebUI.closeBrowser()

