package com.example;


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
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import com.kms.katalon.core.util.KeywordUtil // Importing the KeywordUtil for logging
import internal.GlobalVariable


//import com.kms.katalon.core.exception.WebElementNotFoundException


public class CustomKeyword {


	/**
	 * The following prompt is for generating a custom keyword with Studio Assist to click an element that we pass in the function
	 */

	/*
	 * 
	 * Write me a ClickElement keyword that receives a test object id of type string and does as follows 
	 * 	1.Click the element  
	 * 	2.If cannot click the element, catch WebElementNotFoundException exception and use KeywordUtil.markFailed to say the you cannot find the element 
	 *  3.If other errors, catch exception saying that you failed to click element with the KeywordUtil.markFailed 
	 *  4.Otherwise, mark the keyword as succeed
	 */




	/**
	 * Clicks an element identified by the provided test object ID.
	 *
	 * @param testObjectId The ID of the test object to be clicked.
	 */
	@Keyword
	def ClickElement(String testObjectId) {
		try {
			// Click the element identified by the test object ID
			WebUI.click(findTestObject(testObjectId))
			// Mark the keyword as succeed if the click is successful
			KeywordUtil.markPassed("Successfully clicked the element: " + testObjectId)
		} catch (WebElementNotFoundException e) {
			// Catch the exception if the element cannot be found
			KeywordUtil.markFailed("Cannot find the element: " + testObjectId)
		} catch (Exception e) {
			// Catch any other exceptions that occur during the click action
			KeywordUtil.markFailed("Failed to click the element: " + testObjectId + ". Error: " + e.message)
		}
	}
}
