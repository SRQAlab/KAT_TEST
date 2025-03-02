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
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


public class RSAKeywords {
	
	@Keyword
	def RSAAppLogin() {
		
		WebUI.navigateToUrl('https://rahulshettyacademy.com/client')
		
		WebUI.maximizeWindow()
		
		WebUI.setText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_Email_userEmail'), 'swan@mailinator.com')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_Password_userPassword'), '/5S6MFFLcE4mlsixtc6/Tg==')
		
		WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/input_Password_login'))
		
		WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Login Successfully'), 'Login Successfully')
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Login Successfully'), 0)
	}
	
	@Keyword
	def RSAAppLogout() {
		
		WebUI.click(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/button_Sign Out'))
		
		WebUI.verifyElementText(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Logout Successfully'), 'Logout Successfully')
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/RSAcademy/Page_Lets Shop/div_Logout Successfully'), 0)
		
	}
	
	@Keyword
	def RSACongrats () {
		println("Congrats !! You have completed the course !")
	}
	
	@Keyword
	def RSARefreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

}
