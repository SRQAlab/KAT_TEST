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

public class ESPNKeywords {

	@Keyword
	def ESPNAppLogin () {


		WebUI.navigateToUrl('https://www.espn.in/')

		WebUI.maximizeWindow()

		WebUI.waitForPageLoad(5)

		WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/h2_ESPN'),
				3)

		WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/a_Create Account'),
				3)

		WebUI.mouseOver(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/a_Log In'))

		WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/h2_Favourites'),
				'FAVOURITES')

		WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/h2_Favourites'),
				0)

		WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/li_Welcome'),
				'Welcome!')

		WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/li_Welcome'),
				0)

		WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/a_Log In_1'),
				'Log In')

		WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/a_Log In_1'),
				0)

		WebUI.click(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/a_Log In_1'), FailureHandling.STOP_ON_FAILURE)

		WebUI.setText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/input_Enter your email address to continue_InputIdentityFlowValue'),
				'swan@abc.com')

		WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_Enter your email address to continue'),
				0)

		WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_Enter your email address to continue'),
				'Enter your email address to continue')

		WebUI.click(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/button_Continue'))

		WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_Good news You already have a MyDisney account'),
				'Good news! You already have a MyDisney account')

		WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/span_Good news You already have a MyDisney account'),
				0)

		WebUI.setEncryptedText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/input_swanabc.com_InputPassword'),
				'/5S6MFFLcE4r7ieq3suj4w==')

		WebUI.click(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/button_Log In'))



		WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/h2_ESPN'),
				0)
	}





	@Keyword
	def ESPNAppLogout () {


		WebUI.mouseOver(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/a_Sign In'))

		WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/li_WelcomeSwan'),
				'WelcomeSwan!')

		WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/li_WelcomeSwan'),
				0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/div_IndiaCricket'),
				0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/div_Mumbai IndiansCricket'),
				0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/div_Chennai Super KingsCricket'),
				0)

		WebUI.verifyElementText(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/a_signOut'),
				'signOut')

		WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/a_signOut'),
				0)

		WebUI.click(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/a_signOut'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/ESPN/Page_ESPN India - Serving Sports Fans. Anyt_cfbf67/h2_ESPN'),
				0)
	}


	@Keyword
	def ESPNCongrats () {
		println("Congrats !! You have completed the course !")
	}
}
