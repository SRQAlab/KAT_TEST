package example

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class PAKeywords {
	
	
	
	@Keyword
	def PAAppLogin () {
		
		
		WebUI.navigateToUrl('https://practicetestautomation.com/practice-test-login/')
		
		WebUI.maximizeWindow()
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/img_concat(Press , , Enter, ,  to skip to c_ef5b00'),
			0)
		
		WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/h2_Test login'),
			'Test login')
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/h2_Test login'),
			0)
		

		WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/li_This is a simple Login page. Students ca_843821'), 
		    'This is a simple Login page. Students can use this page to practice writing simple positive and negative LogIn tests. Login functionality is something that most of the test automation engineers need to automate.')
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/li_This is a simple Login page. Students ca_843821'), 
		    0)
		
		WebUI.setText(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/input_Username_username'), 
		    'student')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/input_Password_password'), 
		    'p4y+y39Ir5PJb2ispxT0Ew==')
		
		WebUI.click(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/button_Submit'))
		
		WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Logged In Successfully  Practice Test _c87e4f/h1_Logged In Successfully'), 
		    'Logged In Successfully')
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Logged In Successfully  Practice Test _c87e4f/h1_Logged In Successfully'), 
		    0)
		
		WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Logged In Successfully  Practice Test _c87e4f/strong_Congratulations student. You success_9f23b9'), 
		    'Congratulations student. You successfully logged in!')
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Logged In Successfully  Practice Test _c87e4f/strong_Congratulations student. You success_9f23b9'), 
		    0)
	}

	
	
	@Keyword
	def PAAppLogout () {
		
		WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Logged In Successfully  Practice Test _c87e4f/a_Log out'), 
		    'Log out')
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Logged In Successfully  Practice Test _c87e4f/a_Log out'), 
		    0)
		
		WebUI.click(findTestObject('Object Repository/PracticeAutomation/Page_Logged In Successfully  Practice Test _c87e4f/a_Log out'))
		
		WebUI.verifyElementText(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/h2_Test login'), 
		    'Test login')
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/PracticeAutomation/Page_Test Login  Practice Test Automation/h2_Test login'), 
		    0)
	}

	@Keyword
	def PACongrats () {
		println("Congrats !! You have completed the course !")
	}


}
