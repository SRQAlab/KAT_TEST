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

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Phones  PDAs/span_Shopping Cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OpenCart/Page_Shopping Cart/a_HTC Touch HD'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OpenCart/Page_Shopping Cart/a_iPhone'), 0)

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Shopping Cart/i_Product 1_fa-solid fa-circle-xmark'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OpenCart/Page_Shopping Cart/div_Success You have removed an item from y_9ce22f'), 
    0)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/OpenCart/Page_Shopping Cart/i_Product 1_fa-solid fa-circle-xmark'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OpenCart/Page_Shopping Cart/h1_Shopping Cart'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OpenCart/Page_Shopping Cart/p_Your shopping cart is empty'), 
    0)

WebUI.callTestCase(findTestCase('OpenCart/OCLogout'), [:], FailureHandling.STOP_ON_FAILURE)

