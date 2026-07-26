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

// Login
WebUI.callTestCase(findTestCase('Common/Login'), [('username') : '12345678901234567890', ('password') : '098765'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Ban_lam_viec/btn_open_sidebar'))

WebUI.click(findTestObject('Object Repository/Xem quy trình HD/Page_Bn lm vic/a_Thong tin sinh vien'))

// Verify trạng thái đề tài
TestObject txtStatus = findTestObject('Object Repository/Xem quy trình HD/Page_Bn lm vic/input_project_status')

WebUI.verifyElementAttributeValue(txtStatus, 'value', 'Chưa nhận đề tài', 10)

WebUI.click(findTestObject('Page_Ban_lam_viec/tab_Bao cao ket qua lam datn'))

WebUI.click(findTestObject('Xem quy trình HD/Page_BCTN/button_QTHD'))

// Verify không có dữ liệu
WebUI.verifyTextPresent('Không tồn tại bản ghi nào.', false)

WebUI.closeBrowser()

