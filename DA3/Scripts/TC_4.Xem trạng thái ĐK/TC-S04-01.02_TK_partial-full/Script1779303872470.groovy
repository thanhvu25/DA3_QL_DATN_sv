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

WebUI.callTestCase(findTestCase('Common/Login'), [('username') : '4', ('password') : 'gbf4444'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Ban_lam_viec/btn_open_sidebar'))

WebUI.click(findTestObject('Object Repository/Page_Ban_lam_viec/tab_Dang_ky_DT'))

WebUI.setText(findTestObject('Object Repository/Xem TTDK/Page_Dang_ky_DT/input_Tim_kiem_DT'), tenDT)

WebUI.click(findTestObject('Object Repository/Xem TTDK/Page_Dang_ky_DT/button_Tim kiem'))

WebUI.verifyTextPresent(tenDT, false)

WebUI.closeBrowser()
