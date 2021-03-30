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

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/a_.us'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/a_6pmScore dealson fashion brands'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/a_7                                                Cart'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/a_AbeBooksBooks, art collectibles'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/a_AbeBooksBooks, art collectibles (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/a_Amazon AdvertisingFind, attract, andengage customers'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Gold Box Deals  Todays Deals - Amazon.com/a_Amazon Basics'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Gold Box Deals  Todays Deals - Amazon.com/a_Amazon Home'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Gold Box Deals  Todays Deals - Amazon.com/a_Best Sellers'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Gold Box Deals  Todays Deals - Amazon.com/a_Pet Supplies'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Gold Box Deals  Todays Deals - Amazon.com/a_Pharmacy'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Gold Box Deals  Todays Deals - Amazon.com/a_Shop gift ideas for Mom'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Gold Box Deals  Todays Deals - Amazon.com/a_Shopper Toolkit'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Gold Box Deals  Todays Deals - Amazon.com/a_Subscribe  Save'), 
    0)

WebUI.scrollToElement(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/a_Amazon DriveCloud storagefrom Amazon'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/a_Amazon DriveCloud storagefrom Amazon'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/a_Amazon FreshGroceries  MoreRight To Your Door'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/a_Amazon MusicStream millionsof songs'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/a_Amazon PhotosUnlimited Photo StorageFree With Prime'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/a_Amazon Subscription BoxesTop subscription boxes  right to your door'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/a_AmazonGlobalShip OrdersInternationally'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/a_Buy Again'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/a_Computers'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/a_Coupons'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/a_Deliver to SDQ                                                   Miami 33192'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/a_DPReviewDigitalPhotography'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/a_GoodreadsBook reviews recommendations'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/a_Home ServicesExperienced ProsHappiness Guarantee'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/a_IMDbMovies, TV Celebrities'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/a_Kindle Direct PublishingIndie Digital  Print PublishingMade Easy'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/a_PillPackPharmacy Simplified'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/span_Returns'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/span_Miami 33192'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/span_Deliver to SDQ'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/span_All_icp-nav-link-inner'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/span_Account  Lists'), 
    0)

WebUI.verifyElementPresent(findTestObject('ELEMENT_TO_VERIFY_OR/Page_Amazon.com Online Shopping for Electronics, Apparel, Computers, Books, DVDs  more/span_ Orders'), 
    0)

WebUI.delay(3)

WebUI.closeBrowser()

