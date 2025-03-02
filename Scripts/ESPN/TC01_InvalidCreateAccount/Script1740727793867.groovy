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

WebUI.maximizeWindow()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/button_Create Account'))

WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_Enter your email address to continue'), 
    'Enter your email address to continue')

WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_Enter your email address to continue'), 
    0)

WebUI.setText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/input_Enter your email address to continue__28f1f4'), 
    'abc.com')

WebUI.click(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/button_Continue'))

WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_This email address isnt correctly form_809224'), 
    'This email address isn’t correctly formatted. Try again?')

WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_This email address isnt correctly form_809224'), 
    0)

WebUI.click(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/svg'))

WebUI.closeBrowser()

