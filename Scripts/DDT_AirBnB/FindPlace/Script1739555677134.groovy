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

WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/DB_Checkpoint'), false)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.airbnb.co.in/?locale=en&_set_bev_on_new_domain=1739296211_EAMGEwMjBmM2U0Mj')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Airbnb/input_Where_query'), city)

WebUI.click(findTestObject('Object Repository/Page_Airbnb/div_Atlanta, Georgia, United States'))

WebUI.click(findTestObject('Object Repository/Page_Airbnb/div_Check in'))

WebUI.click(findTestObject('Object Repository/Page_Airbnb/span_3 days'))

WebUI.click(findTestObject('Object Repository/Page_Airbnb/span_Add guests_t1dqvypu atm_9s_1ulexfb atm_023ad9'))

WebUI.verifyTextPresent(expectedResult, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

