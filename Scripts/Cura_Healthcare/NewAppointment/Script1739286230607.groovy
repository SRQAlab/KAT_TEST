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

WebUI.openBrowser('')

CustomKeywords.'example.MyKeywords.AppLogin'()

CustomKeywords.'example.MyKeywords.refreshBrowser'()

for (def n : (0..2)) {
    WebUI.selectOptionByIndex(findTestObject('Cura_Healthcare/Page_CURA Healthcare Service/ddl_HealthcareCenter'), 1)

    WebUI.click(findTestObject('Cura_Healthcare/Page_CURA Healthcare Service/cb_Readmission'))

    if (n == 0) {
        WebUI.click(findTestObject('Cura_Healthcare/Page_CURA Healthcare Service/cb_Medicare'))

        WebUI.delay(1)
    } else if (n == 1) {
        WebUI.click(findTestObject('Cura_Healthcare/Page_CURA Healthcare Service/cb_Medicaid'))

        WebUI.delay(1)
    } else {
        WebUI.click(findTestObject('Cura_Healthcare/Page_CURA Healthcare Service/cb_None'))

        WebUI.delay(1)
    }
    
    WebUI.setText(findTestObject('Cura_Healthcare/Page_CURA Healthcare Service/txt_Date'), '02/27/2025')

    WebUI.setText(findTestObject('Cura_Healthcare/Page_CURA Healthcare Service/txt_Comment'), 'I will type comment')

    WebUI.click(findTestObject('Cura_Healthcare/Page_CURA Healthcare Service/btn_BookAppointment'))

    WebUI.verifyElementPresent(findTestObject('Cura_Healthcare/Page_CURA Healthcare Service/h2_Appointment_Confirmation'), 
        3)

    WebUI.click(findTestObject('Cura_Healthcare/Page_CURA Healthcare Service/btn_GotoHomepage'))

    WebUI.click(findTestObject('Cura_Healthcare/Page_CURA Healthcare Service/btn_MakeAppointment'))
}

CustomKeywords.'example.MyKeywords.Congrats'()

CustomKeywords.'example.MyKeywords.AppLogout'()

WebUI.closeBrowser()

