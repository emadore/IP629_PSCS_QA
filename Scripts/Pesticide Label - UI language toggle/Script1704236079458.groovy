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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL_PesticideLabel)

WebUI.verifyElementText(findTestObject('Pesticide Label/page title_Pesticide Label'), 'Pesticide Label')

WebUI.click(findTestObject('Page_New Pesticide Label/span_Franais'))

WebUI.click(findTestObject('Page_New Pesticide Label/button_NoClose overlay'))

WebUI.verifyElementText(findTestObject('Pesticide Label/page title_Pesticide Label'), 'Pesticide Label')

WebUI.click(findTestObject('Page_New Pesticide Label/span_Franais'))

WebUI.click(findTestObject('Page_New Pesticide Label/button_Yes'))

WebUI.verifyElementText(findTestObject('Pesticide Label FR/section title_Principal Panel FR'), 'Aire d’affichage principale')

WebUI.click(findTestObject('Page_Nouvelle tiquette de pesticides/span_English'))

WebUI.click(findTestObject('Page_Nouvelle tiquette de pesticides/button_NonClose overlay'))

WebUI.verifyElementText(findTestObject('Pesticide Label FR/section title_Principal Panel FR'), 'Aire d’affichage principale')

WebUI.click(findTestObject('Page_Nouvelle tiquette de pesticides/span_English'))

WebUI.click(findTestObject('Page_Nouvelle tiquette de pesticides/button_Oui'))

WebUI.verifyElementText(findTestObject('Pesticide Label/page title_Pesticide Label'), 'Pesticide Label')

WebUI.closeBrowser()

