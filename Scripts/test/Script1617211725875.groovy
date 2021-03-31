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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials')

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('ORANGE/Page_OrangeHRM/span_( Username  Admin  Password  admin123 )'), 0)

WebUI.verifyElementPresent(findTestObject('ORANGE/Page_OrangeHRM/div_OrangeHRM 4.7 2005 - 2021 OrangeHRM, Inc. All rights reserved'), 
    0)

WebUI.verifyElementPresent(findTestObject('ORANGE/Page_OrangeHRM/input_Username_txtPassword'), 0)

WebUI.verifyElementPresent(findTestObject('ORANGE/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 0)

WebUI.verifyElementPresent(findTestObject('ORANGE/Page_OrangeHRM/div_OrangeHRM 4.7 2005 - 2021 OrangeHRM, Inc. All rights reserved'), 
    0)

WebUI.click(findTestObject('ORANGE/Page_OrangeHRM/input_LOGIN Panel_txtUsername'))

WebUI.setText(findTestObject('ORANGE/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'admin')

WebUI.focus(findTestObject('ORANGE/Page_OrangeHRM/input_Username_txtPassword'))

WebUI.setText(findTestObject('ORANGE/Page_OrangeHRM/input_Username_txtPassword'), 'admin123')

WebUI.click(findTestObject('ORANGE/Page_OrangeHRM/input_Password_Submit'))

WebUI.waitForPageLoad(5)

WebUI.refresh(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('ORANGE/NAV_BAR/Page_OrangeHRM/a_Welcome Paul'))

WebUI.verifyElementPresent(findTestObject('ORANGE/NAV_BAR/Page_OrangeHRM/a_Welcome Paul'), 0)

WebUI.verifyElementPresent(findTestObject('ORANGE/Page_OrangeHRM/input_People who like this post_Subscriber_link'), 0)

WebUI.verifyElementClickable(findTestObject('ORANGE/NAV_BAR/Page_OrangeHRM/b_Admin'))

WebUI.verifyElementPresent(findTestObject('ORANGE/NAV_BAR/Page_OrangeHRM/b_Admin'), 0)

WebUI.verifyElementClickable(findTestObject('ORANGE/NAV_BAR/Page_OrangeHRM/b_Buzz'))

WebUI.verifyElementPresent(findTestObject('ORANGE/NAV_BAR/Page_OrangeHRM/b_Buzz'), 0)

WebUI.verifyElementClickable(findTestObject('ORANGE/NAV_BAR/Page_OrangeHRM/b_Dashboard'))

WebUI.verifyElementPresent(findTestObject('ORANGE/NAV_BAR/Page_OrangeHRM/b_Dashboard'), 0)

WebUI.verifyElementClickable(findTestObject('ORANGE/NAV_BAR/Page_OrangeHRM/b_Directory'))

WebUI.verifyElementPresent(findTestObject('ORANGE/Page_OrangeHRM/b_Directory'), 0)

WebUI.verifyElementClickable(findTestObject('ORANGE/Page_OrangeHRM/b_Leave'))

WebUI.verifyElementPresent(findTestObject('ORANGE/Page_OrangeHRM/b_Leave'), 0)

WebUI.verifyElementClickable(findTestObject('ORANGE/Page_OrangeHRM/b_Maintenance'))

WebUI.verifyElementPresent(findTestObject('ORANGE/Page_OrangeHRM/b_Maintenance'), 0)

WebUI.verifyElementClickable(findTestObject('ORANGE/Page_OrangeHRM/b_My Info'))

WebUI.verifyElementPresent(findTestObject('ORANGE/Page_OrangeHRM/b_My Info'), 0)

WebUI.verifyElementClickable(findTestObject('ORANGE/Page_OrangeHRM/b_Performance'))

WebUI.verifyElementPresent(findTestObject('ORANGE/Page_OrangeHRM/b_Performance'), 0)

WebUI.verifyElementClickable(findTestObject('ORANGE/Page_OrangeHRM/b_PIM'))

WebUI.verifyElementPresent(findTestObject('ORANGE/Page_OrangeHRM/b_PIM'), 0)

WebUI.verifyElementClickable(findTestObject('ORANGE/Page_OrangeHRM/b_Recruitment'))

WebUI.verifyElementPresent(findTestObject('ORANGE/Page_OrangeHRM/b_Recruitment'), 0)

WebUI.verifyElementClickable(findTestObject('ORANGE/Page_OrangeHRM/b_Time'))

WebUI.verifyElementPresent(findTestObject('ORANGE/Page_OrangeHRM/b_Time'), 0)

WebUI.refresh(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ORANGE/NAV_BAR/Page_OrangeHRM/b_Admin'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForPageLoad(3)

WebUI.verifyElementPresent(findTestObject('ORANGE/ADMIN_NAV/Page_OrangeHRM/input_Employee Name_searchSystemUseremployeeNameempName'), 
    0)

WebUI.verifyElementPresent(findTestObject('ORANGE/ADMIN_NAV/Page_OrangeHRM/input_Username_searchSystemUseruserName'), 0)

WebUI.focus(findTestObject('ORANGE/ADMIN_NAV/Page_OrangeHRM/input_Username_searchSystemUseruserName'))

WebUI.setText(findTestObject('ORANGE/NAV_BAR/Page_OrangeHRM/Page_OrangeHRM/input_Username_searchSystemUseruserName'), 'admin')

WebUI.setText(findTestObject('ORANGE/NAV_BAR/Page_OrangeHRM/Page_OrangeHRM/input_Employee Name_searchSystemUseremployeeNameempName'), 
    'manuel')

WebUI.click(findTestObject('ORANGE/ADMIN_NAV/Page_OrangeHRM/input_Status__search'))

WebUI.clearText(findTestObject('ORANGE/NAV_BAR/Page_OrangeHRM/Page_OrangeHRM/input_Employee Name_searchSystemUseremployeeNameempName'))

WebUI.clearText(findTestObject('ORANGE/NAV_BAR/Page_OrangeHRM/Page_OrangeHRM/input_Username_searchSystemUseruserName'))

WebUI.waitForPageLoad(5)

WebUI.delay(3)

WebUI.back()

WebUI.delay(3)

WebUI.click(findTestObject('ORANGE/ADMIN_NAV/Page_OrangeHRM/input_Status_btnAdd'))

WebUI.verifyElementPresent(findTestObject('ORANGE/ADMIN_NAV/Page_OrangeHRM/select_AdminESS'), 0)

WebUI.verifyElementPresent(findTestObject('ORANGE/ADMIN_NAV/Page_OrangeHRM/input__systemUseremployeeNameempName'), 0)

WebUI.verifyElementPresent(findTestObject('ORANGE/ADMIN_NAV/Page_OrangeHRM/input__systemUseruserName'), 0)

WebUI.verifyElementPresent(findTestObject('ORANGE/ADMIN_NAV/Page_OrangeHRM/select_EnabledDisabled'), 0)

WebUI.verifyElementPresent(findTestObject('ORANGE/ADMIN_NAV/Page_OrangeHRM/input__systemUserpassword'), 0)

WebUI.verifyElementPresent(findTestObject('ORANGE/ADMIN_NAV/Page_OrangeHRM/input__systemUserconfirmPassword'), 0)

WebUI.click(findTestObject('ORANGE/ADMIN_NAV/Page_OrangeHRM/select_AdminESS'))

WebUI.selectOptionByLabel(findTestObject('ORANGE/ADMIN_NAV/Page_OrangeHRM/select_AdminESS'), 'Admin', false)

WebUI.focus(findTestObject('ORANGE/ADMIN_NAV/Page_OrangeHRM/input__systemUseremployeeNameempName'))

WebUI.setText(findTestObject('ORANGE/ADMIN_NAV/Page_OrangeHRM/input__systemUseremployeeNameempName'), 'David Morris')

WebUI.focus(findTestObject('ORANGE/ADMIN_NAV/Page_OrangeHRM/input__systemUseruserName'))

WebUI.setText(findTestObject('ORANGE/ADMIN_NAV/Page_OrangeHRM/input__systemUseruserName'), 'david-morris')

WebUI.click(findTestObject('ORANGE/ADMIN_NAV/Page_OrangeHRM/select_EnabledDisabled'))

WebUI.selectOptionByIndex(findTestObject('ORANGE/ADMIN_NAV/Page_OrangeHRM/select_EnabledDisabled'), 0)

WebUI.delay(3)

WebUI.setText(findTestObject('ORANGE/ADMIN_NAV/Page_OrangeHRM/input__systemUserpassword'), 'Admin123')

WebUI.setText(findTestObject('ORANGE/ADMIN_NAV/Page_OrangeHRM/input__systemUserconfirmPassword'), 'Admin123')

WebUI.click(findTestObject('ORANGE/ADMIN_NAV/Page_OrangeHRM/input__btnSave'))

WebUI.delay(3)

WebUI.closeBrowser()

