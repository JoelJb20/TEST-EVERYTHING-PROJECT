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




//HACER LOGIN CON USUARIO VALIDO Y CONTRASEÑA INVALIDA------TEST-C-2---------



//ABRI NAVEGADOR
WebUI.openBrowser(null)
//NAVEGAR MEDIANTE LA URL
WebUI.navigateToUrl('https://www.amazon.com/-/es/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&')
//MAXIMIZE LA VENTANA
WebUI.maximizeWindow()
//ESPERAR 2 SEGUNDOS DESPUES "PARA QUE SE TERMINE DE AJUSTAR LA PANTALLA" 
WebUI.delay(2)
//VERIFICANDO LA PRESENCIA DEL ELEMENTO MENCIONADO
WebUI.verifyElementPresent(findTestObject('LOGIN_OR/Page_Amazon Sign-In/input_Email or mobile phone number_email'), 
    0)
//VERIFICANDO LA PROPIEDAD CLICKABLE DEL ELEMENTO MENCIONADO
WebUI.verifyElementClickable(findTestObject('LOGIN_OR/Page_Amazon Sign-In/input_Email or mobile phone number_email'))

WebUI.click(findTestObject('LOGIN_OR/Page_Amazon Sign-In/input_Email or mobile phone number_email'))
//INSERTANDO LA DATA DE PRUEBA EN EL INPUT
WebUI.setText(findTestObject('LOGIN_OR/Page_Amazon Sign-In/input_Email or mobile phone number_email'), GlobalVariable.USERNAME_VAL)
//CLICK BOTON CONTINUAR
WebUI.click(findTestObject('LOGIN_OR/Page_Amazon Sign-In/input_Enter your email or mobile phone number_continue'))
//VERIFICANDO LA PRESENCIA DEL ELEMENTO MENCIONADO 
WebUI.verifyElementPresent(findTestObject('LOGIN_OR/Page_Amazon Sign-In/input_Forgot your password_password'), 0)
//VERIFICANDO LA PROPIEDAD CLICKABLE DEL ELEMENTO MENCIONADO
WebUI.verifyElementClickable(findTestObject('LOGIN_OR/Page_Amazon Sign-In/input_Forgot your password_password'))

WebUI.click(findTestObject('LOGIN_OR/Page_Amazon Sign-In/input_Forgot your password_password'))
//INSERTANDO LA DATA DE PRUEBA EN EL INPUT
WebUI.setText(findTestObject('LOGIN_OR/Page_Amazon Sign-In/input_Forgot your password_password'), GlobalVariable.INV_PASSWORD)
//CLICK BOTON "SUBMIT O INICIAR SECCION"
WebUI.click(findTestObject('LOGIN_OR/Page_Amazon Sign-In/input_Enter your password_signInSubmit'))
//VERIFICANDO LA PRESENCIA DEL ELEMENTO QUE NOS ESTA AVISANDO QUE EL PASSWORD NO ES CORRECTO.
WebUI.verifyElementPresent(findTestObject('LOGIN_OR/Page_Amazon Sign-In/span_Your password is incorrect'), 0)

WebUI.delay(2)

WebUI.closeBrowser()




