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

WebUI.navigateToUrl('https://www.espn.in/')

WebUI.waitForPageLoad(5)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/button_Create Account'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/button_Create Account'), 
    'Create Account')

WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/button_Log In'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/button_Log In'), 
    'Log In')

WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/h2_ESPN'), 
    0)

WebUI.click(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/button_Create Account'))

WebUI.setText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/input_Enter your email address to continue_InputIdentityFlowValue'), 
    'kat@psl.com')

WebUI.click(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/button_Continue'))

WebUI.click(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/input_Avoid using the same password from an_70fa4b'))

WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_Create an account to continue'), 
    'Create an account to continue')

WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_Create an account to continue'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/p_By creating an account, I agree to the Te_2b39dd'), 
    'By creating an account, I agree to the Terms of Use and acknowledge that I have read the Privacy Policy.')

WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/p_By creating an account, I agree to the Te_2b39dd'), 
    0)

WebUI.click(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/button_Agree  Continue'))

WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_Please enter your first name'), 
    'Please enter your first name.')

WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_Please enter your first name'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_Please enter your surname'), 
    'Please enter your surname.')

WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_Please enter your surname'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_Please enter a password'), 
    'Please enter a password.')

WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_Please enter a password'), 
    0)

WebUI.setText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/input_katpsl.com_InputFirstName'), 
    'kat')

WebUI.click(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/button_Agree  Continue'))

WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_Please enter your surname'), 
    'Please enter your surname.')

WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_Please enter your surname'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_Please enter a password'), 
    'Please enter a password.')

WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_Please enter a password'), 
    0)

WebUI.setText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/input_katpsl.com_InputLastName'), 
    'test')

WebUI.click(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/button_Agree  Continue'))

WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_Please enter a password'), 
    'Please enter a password.')

WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_Please enter a password'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/div_Use a minimum of six characters (case s_229bc0'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/div_Use letters with at least one number or_bd7966'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/div_Avoid using the same password from anot_7fccd7'), 
    0)

WebUI.setText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/input_katpsl.com_InputFirstName'), 
    'kat')

WebUI.setEncryptedText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/input_katpsl.com_password-new'), 
    'HwXnxaZD17M=')

WebUI.click(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/button_Agree  Continue'))

WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_Please make sure your password is at l_41d89e'), 
    'Please make sure your password is at least six characters, includes at least one number or special character, and is not a commonly used password.')

WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_Please make sure your password is at l_41d89e'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/p_With a MyDisney account, you can log into_de2eed'), 
    'With a MyDisney account, you can log into ESPN and other services across The Walt Disney Family of Companies. Create your account using kat@psl.com edit')

WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/p_With a MyDisney account, you can log into_de2eed'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_katpsl.com'), 
    'kat@psl.com')

WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_katpsl.com'), 
    0)

WebUI.click(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/path'))

WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/button_Create Account'), 
    'Create Account')

WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/button_Create Account'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/button_Log In'), 
    'Log In')

WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/button_Log In'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/h2_ESPN'), 
    0)

WebUI.closeBrowser()

