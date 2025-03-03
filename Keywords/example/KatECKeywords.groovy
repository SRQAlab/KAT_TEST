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

public class KatECKeywords {
	
	
	
	
	
	@Keyword
	def KatECAppLogin () {
		
		
		WebUI.navigateToUrl('https://cms.demo.katalon.com/')
		
		WebUI.waitForPageLoad(5)
		
		WebUI.maximizeWindow()
		
		WebUI.click(findTestObject('Object Repository/Katalon ecommerce/Page_Katalon Shop  Katalon Ecommerce/a_My account'))
		
		WebUI.setText(findTestObject('Object Repository/Katalon ecommerce/Page_My account  Katalon Shop/input__username'), 'customer')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Katalon ecommerce/Page_My account  Katalon Shop/input__password'),
			'fcttOx1e+dws0mP0AWb2uMRTnZbRfS0W')
		
		WebUI.click(findTestObject('Object Repository/Katalon ecommerce/Page_My account  Katalon Shop/button_Log in'))
		
		WebUI.verifyElementText(findTestObject('Object Repository/Katalon ecommerce/Page_My account  Katalon Shop/strong_KatalonLover'),
			'KatalonLover')
		
		
	}
	
	
	@Keyword
	def KatECAppLogout () {
		
		
		WebUI.click(findTestObject('Object Repository/Katalon ecommerce/Page_Cart  Katalon Shop/a_My account'))
		
		WebUI.click(findTestObject('Object Repository/Katalon ecommerce/Page_My account  Katalon Shop/a_Log out'))


	}

	
	@Keyword
	def KatECCongrats () {
		println("Congrats !! You have completed the course !")
	}

		
}
