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
The following use case is for generating code with studio assist by listing out actions as steps in plain English language

Write a katalon studio test case to perform the following steps
**/

/**
* 1 Open a Browser to the URL stored in the GlobalVariable.G_siteURL
* 2 click the make appointment button with the id 'Object Repository/Page_CURA Healthcare Service/btn_MakeAppointment'
* 3 fill in the username 'Object Repository/Page_CURA Healthcare Service/txt_username' with the value of the local variable 'Username'
* 4 fill in the password 'Object Repository/Page_CURA Healthcare Service/txt_password' with the value in the local variable 'Password'
* 5 click login button with the id 'Object Repository/Cura_Healthcare/Page_CURA Healthcare Service/btn_Login'
* 6 verify that the appointment div 'Object Repository/Page_CuraAppointment/div_Appointment' exists with timeout 10 second
* 7 close the browser
**/
// Open a browser to the specified URL
WebUI.openBrowser(GlobalVariable.G_SiteURL)

// Click the make appointment button
WebUI.click(findTestObject('Object Repository/Cura_Healthcare/Page_CURA Healthcare Service/btn_MakeAppointment'))

// Fill in the username field with the local variable 'Username'
WebUI.setText(findTestObject('Object Repository/Cura_Healthcare/Page_CURA Healthcare Service/txt_username'), Username)

// Fill in the password field with the local variable 'Password'
WebUI.setText(findTestObject('Object Repository/Cura_Healthcare/Page_CURA Healthcare Service/txt_password'), Password)

// Click the login button
WebUI.click(findTestObject('Object Repository/Cura_Healthcare/Page_CURA Healthcare Service/btn_Login'))

// Verify that the appointment confirmation div exists with a timeout of 10 seconds
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CuraAppointment/div_Appointment'), 10)

// Close the browser
WebUI.closeBrowser()