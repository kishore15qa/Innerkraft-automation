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

WebUI.callTestCase(findTestCase('Login/Login_valid'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Innerkraft/svg_Logout_lucide lucide-chevrons-right'))

WebUI.click(findTestObject('Object Repository/Page_Innerkraft/span_Avatar_whitespace-nowrap text-sm font-_647140'))

WebUI.click(findTestObject('Object Repository/Page_Innerkraft/button_Students by origin_btn btn-primary d_3bca5c'))

WebUI.setText(findTestObject('Object Repository/Page_Innerkraft/input_First Name_first_name'), 'Newuser')

WebUI.setText(findTestObject('Object Repository/Page_Innerkraft/input_Last name_last_name'), 'Automate')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Innerkraft/select_Origin_student_origin'), 'b2b', true)

WebUI.setText(findTestObject('Object Repository/Page_Innerkraft/input_Roll number_roll_number'), 'Auto001')

WebUI.click(findTestObject('Object Repository/Page_Innerkraft/button_College_college_id'))

WebUI.click(findTestObject('Object Repository/Page_Innerkraft/input_Action_checkbox checkbox-primary chec_f7dbfe'))

WebUI.click(findTestObject('Object Repository/Page_Innerkraft/button__btn btn-primary disabledcursor-not-_073f81'))

WebUI.click(findTestObject('Object Repository/Page_Innerkraft/button_Cancel_btn btn-primary disabledcurso_c9a63a'))

WebUI.setText(findTestObject('Object Repository/Page_Innerkraft/input_Email_email'), 'kishore.r+auto01@spritle.com')

CustomKeywords.'util.EmailGenerator.clickElement'(findTestObject(null))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_Innerkraft/button_Cancel_btn btn-primary disabledcurso_c9a63a'))

WebUI.click(findTestObject('Object Repository/Page_Innerkraft/button_Cancel_btn btn-primary disabledcurso_c9a63a'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Innerkraft/li'))

