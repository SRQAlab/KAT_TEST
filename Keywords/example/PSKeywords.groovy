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

public class PSKeywords {




	@Keyword
	def PSAppLogin () {


		WebUI.navigateToUrl('https://demo.prestashop.com/#/en/front')

		WebUI.maximizeWindow()

		WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/a_Contact us'), 0)

		WebUI.click(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/input_Art_s'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/input_Art_s'), 0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/img__logo img-fluid'),
				0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h2_Popular Products'),
				0)

		WebUI.verifyElementText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h2_Popular Products'), 'POPULAR PRODUCTS')
	}
	
	
	
	@Keyword
	def PSCongrats () {
		println("Congrats !! You have completed the course !")
	}


	@Keyword
	def PSContactUs () {


		WebUI.verifyElementText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/a_Contact us'), 'Contact us')

		WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/a_Contact us'), 0)

		WebUI.click(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/a_Contact us'))

		WebUI.verifyElementText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h4_Store information'), 'STORE INFORMATION')

		WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h4_Store information'),
				0)

		WebUI.verifyElementText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h3_Contact us'), 'CONTACT US')

		WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/h3_Contact us'), 0)

		WebUI.setText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/input_Email address_from'), 'admin@mystore.com')

		WebUI.setText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/textarea_Message_message'), 'This is a test message')

		WebUI.click(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/input_Message_submitMessage'))

		WebUI.verifyElementText(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/li_Your message has been successfully sent _18241a'),
				'Your message has been successfully sent to our team.')

		WebUI.verifyElementPresent(findTestObject('Object Repository/Prestashop/Page_PrestaShop Live Demo/li_Your message has been successfully sent _18241a'),
				0)
	}
}
