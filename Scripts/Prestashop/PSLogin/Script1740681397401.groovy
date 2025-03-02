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

WebUI.navigateToUrl('https://demo.prestashop.com/#/en/front')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/a_Contact us'), 0)

WebUI.click(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/input_Art_s'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/input_Art_s'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/img__logo img-fluid'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h2_Popular Products'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h2_Popular Products'), 'POPULAR PRODUCTS')

WebUI.click(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/span_Sign in'))

WebUI.verifyElementText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h1_Log in to your account'), 
    'Log in to your account')

WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h1_Log in to your account'), 
    0)

WebUI.setText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/input_Email_email'), 'admin@mystore.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/button_Sign in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/li_Authentication failed'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/li_Authentication failed'), 
    'Authentication failed.')

WebUI.click(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/span_Home'))

WebUI.click(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/span_Cart'))

WebUI.click(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/div_shopping_cart        Cart        (0)'))

