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

WebUI.setText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_Email_userEmail'), 'swan@mailinator.com')

WebUI.setEncryptedText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_Password_userPassword'), '/5S6MFFLcE4mlsixtc6/Tg==')

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_Password_login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Login Successfully'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Login Successfully'), 'Login Successfully')

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/b_ZARA COAT 3'), 'ZARA COAT 3')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/b_ZARA COAT 3'), 0)

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_Add To Cart'))

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Product Added To Cart'), 'Product Added To Cart')

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/b_ADIDAS ORIGINAL'), 'ADIDAS ORIGINAL')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/b_ADIDAS ORIGINAL'), 0)

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_Add To Cart_1'))

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Product Added To Cart'), 'Product Added To Cart')

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/b_IPHONE 13 PRO'), 'IPHONE 13 PRO')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/b_IPHONE 13 PRO'), 0)

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_Add To Cart_1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Product Added To Cart'), 'Product Added To Cart')

WebUI.setText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_Price Range_minPrice'), '31500')

WebUI.setText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_Price Range_maxPrice'), '35000')

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/app-dashboard_AutomationAutomation Practice_d70d87'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_checkbox'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/app-dashboard_AutomationAutomation Practice_d70d87'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_checkbox_1'))

WebUI.setText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_Price Range_minPrice'), '32500')

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/app-dashboard_AutomationAutomation Practice_d70d87'))

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_No Products Found'), 'No Products Found')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_No Products Found'), 0)

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_Cart 3'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_Buy Now_btn btn-danger'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/i_Buy Now_fa fa-trash-o'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input__input txt'), '123')

WebUI.setText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_Name on Card_input txt'), 'SWAN')

WebUI.setText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_swanmailinator.com_input txt text-validated'), 
    'India')

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/span_India'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/a_Place Order'))

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Order Placed Successfully'), 'Order Placed Successfully')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Order Placed Successfully'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_IPHONE 13 PRO'), 'IPHONE 13 PRO')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_IPHONE 13 PRO'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/h1_Thankyou for the order'), 'THANKYOU FOR THE ORDER.')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/h1_Thankyou for the order'), 0)

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_ORDERS'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_View'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_HOME'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_ORDERS'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_Go Back to Shop'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_ORDERS'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_Go Back to Cart'))

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/h1_No Products in Your Cart'), 'No Products in Your Cart !')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/h1_No Products in Your Cart'), 0)

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_Continue Shopping'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_ORDERS'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_Delete'))

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Orders Deleted Successfully'), 'Orders Deleted Successfully')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Orders Deleted Successfully'), 
    0)

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_Go Back to Shop_1'))

WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_Sign Out'))

WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Logout Successfully'), 'Logout Successfully')

WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Logout Successfully'), 0)

WebUI.closeBrowser()

