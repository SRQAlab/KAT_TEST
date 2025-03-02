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

WebUI.callTestCase(findTestCase('OpenCart/OCLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/OpenCart/Page_My Account/a_Tablets'))

WebUI.navigateToUrl('https://demo.opencart.com/en-gb/catalog/tablet')

WebUI.verifyElementPresent(findTestObject('Object Repository/OpenCart/Page_Tablets/a_Samsung Galaxy Tab 10.1'), 0)

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Tablets/img_Show_img-fluid'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OpenCart/Page_Samsung Galaxy Tab 10.1/h1_Samsung Galaxy Tab 10.1'), 
    0)

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Samsung Galaxy Tab 10.1/img_Samsung Galaxy Tab 10.1_img-thumbnail mb-3'))

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Samsung Galaxy Tab 10.1/button_Loading_mfp-arrow mfp-arrow-right mf_6e5f20'))

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Samsung Galaxy Tab 10.1/button_Loading_mfp-arrow mfp-arrow-right mf_6e5f20'))

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Samsung Galaxy Tab 10.1/button_Loading_mfp-arrow mfp-arrow-right mf_6e5f20'))

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Samsung Galaxy Tab 10.1/button_Loading_mfp-arrow mfp-arrow-right mf_6e5f20'))

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Samsung Galaxy Tab 10.1/button_Loading_mfp-arrow mfp-arrow-right mf_6e5f20'))

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Samsung Galaxy Tab 10.1/button_Loading_mfp-arrow mfp-arrow-right mf_6e5f20'))

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Samsung Galaxy Tab 10.1/button_'))

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Samsung Galaxy Tab 10.1/a_Write a review'))

WebUI.setText(findTestObject('Object Repository/OpenCart/Page_Samsung Galaxy Tab 10.1/textarea_Your Review_text'), 'my review')

WebUI.scrollToElement(findTestObject('OpenCart/Page_Samsung Galaxy Tab 10.1/button_Continue'), 0)

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Samsung Galaxy Tab 10.1/input_Bad Good_rating'))

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Samsung Galaxy Tab 10.1/button_Continue'))

WebUI.refresh()

WebUI.scrollToElement(findTestObject('OpenCart/Page_My Account/span_My Account'), 0)

WebUI.callTestCase(findTestCase('OpenCart/OCLogout'), [:], FailureHandling.STOP_ON_FAILURE)

