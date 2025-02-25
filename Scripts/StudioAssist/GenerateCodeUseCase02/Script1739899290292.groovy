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
 * This Use case first is for generating the code with studio assist by separating objects and variables with the actions
 */
/**
 * I have List of test objects as below 
 * Make appointment button : Page_CuraHomepage/btn_MakeAppointment
 * Username :Page_Login/txt_UserName
 * Password :Page_Login/txt_Password
 * Login button :Object Repository/Page_Login/btn_Login
 * Appointment div element :Object Repository/Page_CuraAppointment/div_Appointment
 * I also have a URL GlobalVariable.G_SiteURL And two local variables 'Username' and 'Password'

 * Write me a test case to perform the following steps 

 * Open browser to the URL stored in G_SiteURL
 * Click the make appointment button 
 * Fill in the username and password fields based on the variables 
 * Click the login button 
 * Verify that the appointment div exists with time out 10 second 
 * Close the browser 
 */

// Open browser to the URL stored in G_SiteURL
WebUI.openBrowser(GlobalVariable.G_SiteURL)

// Click the make appointment button
WebUI.click(findTestObject('Page_CuraHomepage/btn_MakeAppointment'))

// Fill in the username and password fields based on the variables
WebUI.setText(findTestObject('Page_Login/txt_UserName'), Username)
WebUI.setText(findTestObject('Page_Login/txt_Password'), Password)

// Click the login button
WebUI.click(findTestObject('Object Repository/Page_Login/btn_Login'))

// Verify that the appointment div exists with timeout 10 seconds
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CuraAppointment/div_Appointment'), 10)

// Close the browser
WebUI.closeBrowser()