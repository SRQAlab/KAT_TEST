package example
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile


class OCKeywords {
	/**
	 * Refresh browser
	 */
	@Keyword
	def OCrefreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def OCclickElement(TestObject to) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			KeywordUtil.logInfo("Clicking element")
			element.click()
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> OCgetHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}
	
	
	@Keyword
	def OCAppLogin () {
		
		
		WebUI.navigateToUrl('https://demo.opencart.com/')
		
		WebUI.click(findTestObject('Object Repository/OpenCart/Page_Your Store/i_My Account_fa-solid fa-caret-down'))
		
		WebUI.click(findTestObject('Object Repository/OpenCart/Page_Your Store/a_Login'))
		
		WebUI.setText(findTestObject('Object Repository/OpenCart/Page_Account Login/input_E-Mail Address_email'), 'spranade@rediffmail.com')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/OpenCart/Page_Account Login/input_Password_password'), 'FTvaCsHX5IR8U7Zml2sd2Q==')
		
		WebUI.click(findTestObject('Object Repository/OpenCart/Page_Account Login/button_Login'))
		
		WebUI.verifyElementText(findTestObject('Object Repository/OpenCart/Page_My Account/h2_My Account'), 'My Account')
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/OpenCart/Page_My Account/h2_My Account'), 0)
		

	}
	
	@Keyword
	def OCAppLogout () {
		
		WebUI.click(findTestObject('Object Repository/OpenCart/Page_My Account/i_My Account_fa-solid fa-caret-down'))
		
		WebUI.click(findTestObject('Object Repository/OpenCart/Page_My Account/a_My Account'))
		
		WebUI.click(findTestObject('Object Repository/OpenCart/Page_My Account/span_My Account'))
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/OpenCart/Page_My Account/a_Logout'), 0)
		
		WebUI.click(findTestObject('Object Repository/OpenCart/Page_My Account/a_Logout'))
		
		WebUI.verifyElementText(findTestObject('Object Repository/OpenCart/Page_Account Logout/h1_Account Logout'), 'Account Logout')
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/OpenCart/Page_Account Logout/h1_Account Logout'), 0)
		
	}

	
	@Keyword
	def OCCongrats () {
		println("Congrats !! You have completed the course !")
	}
	
}