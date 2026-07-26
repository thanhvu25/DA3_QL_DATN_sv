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

WebUI.callTestCase(findTestCase('Common/Login1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Thông tin SV/Page_Thng tin sinh vin/Page_Bn lm vic/Index-button-sidebar-drop'))

WebUI.click(findTestObject('Object Repository/Thông tin SV/Page_Thng tin sinh vin/Page_Bn lm vic/tab-Thong-tin-SV'))

WebUI.click(findTestObject('Object Repository/Thông tin SV/Page_Thng tin sinh vin/Page_Thng tin sinh vin/div_Ngy sinh'))

WebUI.setText(findTestObject('Thông tin SV/Page_Thng tin sinh vin/Page_Thng tin sinh vin/input_Ngay-sinh'), 
    '08/03/2005')

WebUI.click(findTestObject('Object Repository/Thông tin SV/Page_Thng tin sinh vin/Page_Thng tin sinh vin/div_Ngy sinh'))

WebUI.setText(findTestObject('Object Repository/Thông tin SV/Page_Thng tin sinh vin/Page_Thng tin sinh vin/input_S in thoi_ng-untouched ng-pristine ng_f28ef0'), 
    '1234512345')

WebUI.setText(findTestObject('Object Repository/Thông tin SV/Page_Thng tin sinh vin/Page_Thng tin sinh vin/input_Email_ng-untouched ng-pristine ng-val_3b2cd7'), 
    'thanh@gmail.com')

WebUI.click(findTestObject('Object Repository/Thông tin SV/Page_Thng tin sinh vin/Page_Thng tin sinh vin/i_VuVyThanh-BCDA1.pdf_itn fa fa-times-circle itnc'))

WebUI.click(findTestObject('Object Repository/Thông tin SV/Page_Thng tin sinh vin/Page_Thng tin sinh vin/input_button'))

WebUI.click(findTestObject('Object Repository/Thông tin SV/Page_Thng tin sinh vin/Page_Thng tin sinh vin/button_Luu-thong-tin'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Thông tin SV/Page_Thng tin sinh vin/Page_Thng tin sinh vin/Page_Thng tin sinh vin/TTCN-TB-thanh-cong'), 
    0)

WebUI.closeBrowser()

