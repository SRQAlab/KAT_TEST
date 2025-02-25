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


/**
 * The following use case is for generating the script that contains custom keyword which studio assist
 */

/**
 * 1 Open browser to the GlobalVariable.G_siteURL URL
 * 2 click the 'Object Repository/Page_CuraHomepage/btn_MakeAppointment' Button using 'com.example.CustomKeyword.ClickElement'(String testObjectId) custom keyword
 * 3 set the username object 'Object Repository/Page_Login/txt_UserName' with the 'Username' local variable
 * 4 set the password object 'Object Repository/Page_Login/txt_Password' with the 'Password' local variable
 * 5 click the 'Object Repository/Page_Login/button_Login' with the same 'ClickElement' custom keyword
 * 6 verify the page 'Object Repository/Page_CuraAppointment/div_Appointment' element is present with 10 seconds timeout
 * 7 close the browser
 * 
 * 
 */

// Open browser to the GlobalVariable.G_siteURL URL
WebUI.openBrowser(GlobalVariable.G_SiteURL)

// Click the 'btn_MakeAppointment' Button using 'com.example.CustomKeyword.ClickElement' custom keyword
CustomKeywords.'com.example.CustomKeyword.ClickElement'('Object Repository/Page_CuraHomepage/btn_MakeAppointment')

// Set the username object with the 'Username' local variable
WebUI.setText(findTestObject('Object Repository/Page_Login/txt_UserName'), Username)

// Set the password object with the 'Password' local variable
WebUI.setText(findTestObject('Object Repository/Page_Login/txt_Password'), Password)

// Click the 'button_Login' with the same 'ClickElement' custom keyword
CustomKeywords.'com.example.CustomKeyword.ClickElement'('Object Repository/Page_Login/button_Login')

// Verify the page 'div_Appointment' element is present with 10 seconds timeout
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CuraAppointment/div_Appointment'), 10)

// Close the browser
WebUI.closeBrowser()







