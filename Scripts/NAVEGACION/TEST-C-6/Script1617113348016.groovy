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

WebUI.navigateToUrl('https://www.amazon.com/-/es/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&')

WebUI.maximizeWindow()

WebUI.delay(0)

WebUI.setText(findTestObject('LOGIN_OR/Page_Amazon Sign-In/input_Email or mobile phone number_email'), GlobalVariable.USERNAME_VAL)

WebUI.click(findTestObject('LOGIN_OR/Page_Amazon Sign-In/input_Enter your email or mobile phone number_continue'))

WebUI.setText(findTestObject('LOGIN_OR/Page_Amazon Sign-In/input_Forgot your password_password'), GlobalVariable.PASSWORD_VAL)

WebUI.click(findTestObject('LOGIN_OR/Page_Amazon Sign-In/input_Enter your password_signInSubmit'))

for (def rowdata = 1; rowdata <= 14; rowdata++) {
	
    WebUI.setText(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Gold Box Deals  Todays Deals - Amazon.com/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/input_All_field-keywords'), 
         findTestData("Data Files/BUSCADOR/BUSCADOR_DATA").getValue(1, rowdata))

    WebUI.click(findTestObject('Object Repository/ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/input_All_nav-search-submit-button'))

	//WebUI.delay(2)
	
	WebUI.back()
	
	//WebUI.delay(1)
    Thread.sleep(300)
}

WebUI.delay(3)


