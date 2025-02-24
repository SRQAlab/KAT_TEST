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
 * This use case is for generating script that calls other scripts using studio assist
 */
/**
 * I have a list of test objects -
 * - Options: 'Page_CuraAppointment/lst_Facility'
 * - Health program : 'Page_CuraAppointment/chk_Medicaid'
 * - Date : 'Page_CuraAppointment/txt_VisitDate'
 * - Comment : 'Page_CuraAppointment/txt_Comment'
 * - Make Appointment button : 'Page_CuraAppointment/btn_BookAppointment'
 * 
 * Write me a script to perform the steps as follows 
 * - Find and call the 'StudioAssist/Reusable Tests/Login' test case with the variable 'Username' as 'John Doe' and 'Password'  as the Password local variable in login 
 * - Select the option with the label 'Hongkon Cura Healthcare Center' and the label is not regex
 * - Check the health program 
 * - set the date to '11/02/2025'
 * - Write 'Appointment for Hongkong as soon as possible' on comment 
 * - Submit the appointment 
 * - Capture the screenshot of the page 
 * - Close the browser 
 */
// Call the 'Login' test case with specified parameters
WebUI.callTestCase(findTestCase('StudioAssist/Reusable Tests/Login'), [('Username') : 'John Doe', ('Password') : Password], 
    FailureHandling.STOP_ON_FAILURE)

// Select the facility option with the specified label
WebUI.selectOptionByLabel(findTestObject('Page_CuraAppointment/lst_Facility'), 'Hongkong CURA Healthcare Center', false)

// Check the health program checkbox
WebUI.check(findTestObject('Page_CuraAppointment/chk_Medicaid'))

// Set the visit date
WebUI.setText(findTestObject('Page_CuraAppointment/txt_VisitDate'), '11/02/2025')

// Write a comment for the appointment
WebUI.setText(findTestObject('Page_CuraAppointment/txt_Comment'), 'Appointment for Hongkong as soon as possible')

// Click the 'Make Appointment' button to submit the appointment
WebUI.click(findTestObject('Page_CuraAppointment/btn_BookAppointment'))

// Capture a screenshot of the current page
WebUI.takeScreenshot()

// Close the browser
WebUI.closeBrowser()

