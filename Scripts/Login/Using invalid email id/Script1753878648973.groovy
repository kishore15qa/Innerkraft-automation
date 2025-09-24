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

WebUI.navigateToUrl('https://app-dev.innerkraft.com/')

WebUI.setText(findTestObject('Object Repository/Page_Innerkraft/input_Email_email'), 'dfgh@ff')

WebUI.click(findTestObject('Object Repository/Page_Innerkraft/button_Password_btn btn-primary disabledcur_f05e8b'))

WebUI.click(findTestObject('Object Repository/Page_Innerkraft/body'))

TestObject emaillengtherror = new TestObject('Email_Length_Error')
emaillengtherror.addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS,
	"//p[contains(text(),'Invalid email address')]")

boolean isErrorVisible = WebUI.verifyElementPresent(emaillengtherror, 5, FailureHandling.OPTIONAL)

if (isErrorVisible) {
	WebUI.comment("✅ Test Passed: Email validation message is visible.")
} else {
	WebUI.comment("❌ Test Failed: Email  validation message not found.")
	WebUI.verifyElementPresent(emaillengtherror, 5)
}