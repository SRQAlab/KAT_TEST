package example
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.util.KeywordUtil

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
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

public class MyKeywords {

	@Keyword
	def AppLogin () {

		WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

		WebUI.maximizeWindow()

		WebUI.click(findTestObject('Cura_Healthcare/Page_CURA Healthcare Service/btn_MakeAppointment'))

		WebUI.setText(findTestObject('Cura_Healthcare/Page_CURA Healthcare Service/txt_Username'), 'John Doe')

		WebUI.setEncryptedText(findTestObject('Cura_Healthcare/Page_CURA Healthcare Service/txt_Password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

		WebUI.click(findTestObject('Cura_Healthcare/Page_CURA Healthcare Service/btn_Login'))
	}

	@Keyword
	def AppLogout () {
		WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

		WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/a_Logout'), 0)

		WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Logout'))
	}

	@Keyword
	def Congrats () {
		println("Congrats !! You have completed the course !")
	}

	/**
	 * Refresh browser
	 */
	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}


	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def clickElement(TestObject to) {
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
}
