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

WebUI.navigateToUrl('http://14.241.80.87:9993/login')

WebUI.setText(findTestObject('Đăng nhập/Page_Cng thng tin s ha Khoa CNTT/Login-input-username'), username)

WebUI.setText(findTestObject('Đăng nhập/Page_Cng thng tin s ha Khoa CNTT/Login-input-password'), password)

WebUI.click(findTestObject('Object Repository/Đăng nhập/Page_Cng thng tin s ha Khoa CNTT/Page_Cng thng tin s ha Khoa CNTT/button_ng nhp'))

// - Nếu không phải admin/gvk
// - Và username sai format
boolean isSpecialUser = username.equalsIgnoreCase('gvk') || username.equalsIgnoreCase('admin')

boolean isInvalidFormat = !(username.matches('^[0-9]+$'))

if (!(isSpecialUser) && isInvalidFormat) {
    // Expect: hiển thị lỗi format
    WebUI.verifyElementVisible(findTestObject('Đăng nhập/Page_Cng thng tin s ha Khoa CNTT/Login-icon-user-bao-loi'))

    WebUI.verifyElementText(findTestObject('Đăng nhập/Page_Cng thng tin s ha Khoa CNTT/div_Thng tin bt buc'), 'Tài khoản chỉ được chứa số')

    // Đồng thời KHÔNG được login thành công
    WebUI.verifyElementNotPresent(findTestObject('Page_Ban_lam_viec/txt-Trang-chu'), 3) // Case hợp lệ (admin/gvk hoặc toàn số)
} else {
    WebUI.verifyElementPresent(findTestObject('Page_Ban_lam_viec/txt-Trang-chu'), 3)
}

WebUI.closeBrowser()

