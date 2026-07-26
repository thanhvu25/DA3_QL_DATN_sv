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
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Common/Login1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Ban_lam_viec/btn_open_sidebar'), 10)

WebUI.click(findTestObject('Page_Ban_lam_viec/btn_open_sidebar'))

WebUI.waitForElementClickable(findTestObject('Page_Ban_lam_viec/tab_Bao cao ket qua lam datn'), 10)

WebUI.click(findTestObject('Page_Ban_lam_viec/tab_Bao cao ket qua lam datn'))

WebUI.waitForElementClickable(findTestObject('Xem quy trình HD/Page_BCTN/button_QTHD'), 10)

WebUI.click(findTestObject('Xem quy trình HD/Page_BCTN/button_QTHD'))

WebUI.verifyTextPresent('Tìm hiểu hệ thống cần kiểm thử', false)

WebUI.click(findTestObject('Xem quy trình HD/Page_BCTN/button_Thoat'))

WebUI.delay(2)

WebUI.click(findTestObject('Xem quy trình HD/Page_BCTN/span_Xin chao, Vu Vy Thanh'))

WebUI.click(findTestObject('Xem quy trình HD/Page_BCTN/btn_dang xuat'))

WebUI.waitForPageLoad(10)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Common/Login'), [('username') : '10123000', ('password') : '654321'], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Ban_lam_viec/btn_open_sidebar'), 10)

WebUI.click(findTestObject('Page_Ban_lam_viec/btn_open_sidebar'))

WebUI.waitForElementClickable(findTestObject('Page_Ban_lam_viec/tab_Bao cao ket qua lam datn'), 10)

WebUI.click(findTestObject('Page_Ban_lam_viec/tab_Bao cao ket qua lam datn'))

WebUI.waitForElementClickable(findTestObject('Xem quy trình HD/Page_BCTN/button_QTHD'), 10)

WebUI.click(findTestObject('Xem quy trình HD/Page_BCTN/button_QTHD'))

WebUI.verifyTextPresent('Không tồn tại bản ghi nào.', false)

WebUI.click(findTestObject('Xem quy trình HD/Page_BCTN/button_Thoat'))

WebUI.delay(2)

WebUI.closeBrowser()

