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

WebUI.callTestCase(findTestCase('block_login'), [('username') : 'John Doe', ('password') : 'ThisIsNotAPassword'], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('appointment/select_Hongkong'), facility, false)

if (hospital_readmission == true) {
    WebUI.check(findTestObject('appointment/check_hospital readmission'))
}

switch (healthcare_program) {
    case 'Medicare':
        //Select the Medicare
        WebUI.click(findTestObject('appointment/radio_Medicare'))

        break
    case 'Medicaid':
        //Select the Medicaid
        WebUI.click(findTestObject('appointment/radio_Medicaid'))

        break
    default:
        WebUI.click(findTestObject('ObjSpy/Appointment/radio_None'))

        break
}

WebUI.setText(findTestObject('appointment/input_Visit Date'), visit_date)

WebUI.setText(findTestObject('appointment/input_comment'), comment)

WebUI.click(findTestObject('appointment/btn_Book Appointment'))

WebUI.waitForElementPresent(findTestObject('appointment/btn_Go to Homepage'), 0)

WebUI.verifyElementPresent(findTestObject('appointment/h2_Appointment Confirmation'), 0)

WebUI.verifyElementText(findTestObject('appointment/txt_facility'), facility)

if (hospital_readmission == true) {
    WebUI.verifyElementText(findTestObject('appointment/txt_Hospital Readmission'), 'Yes')
} else {
    WebUI.verifyElementText(findTestObject('appointment/txt_Hospital Readmission'), 'No')
}

switch (healthcare_program) {
    case 'Medicare':
        //Verify element text Medicare
        WebUI.verifyElementText(findTestObject('appointment/txt_program'), 'Medicare')

        break
    case 'Medicaid':
        //Verify element text Medicaid
        WebUI.verifyElementText(findTestObject('appointment/txt_program'), 'Medicaid')

        break
    default:
        WebUI.verifyElementText(findTestObject('ObjSpy/Confirmation Page/txt_Program'), 'None')

        break
}

WebUI.verifyElementText(findTestObject('appointment/txt_visit date'), visit_date)

WebUI.verifyElementText(findTestObject('appointment/txt_comment'), comment)

WebUI.click(findTestObject('appointment/btn_Go to Homepage'))

WebUI.waitForElementPresent(findTestObject('appointment/h1_CURA Healthcare Service'), 0)

WebUI.verifyElementNotPresent(findTestObject('appointment/btn_Go to Homepage'), 0)

WebUI.closeBrowser()

