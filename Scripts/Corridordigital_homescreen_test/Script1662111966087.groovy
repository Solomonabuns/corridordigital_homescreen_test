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

WebUI.openBrowser('https://www.corridordigital.com/season/1')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Corridordigital_homescreen_test/Page_Son of a Dungeon - Season 1/a_Got it'))

WebUI.verifyElementClickable(findTestObject('Corridordigital_homescreen_test/Page_Son of a Dungeon - Season 1/div_EPISODES'))

WebUI.enhancedClick(findTestObject('Corridordigital_homescreen_test/Page_Son of a Dungeon - Season 1/div_Oldest  Oldest Newest'))

WebUI.enhancedClick(findTestObject('Corridordigital_homescreen_test/Page_Son of a Dungeon - Season 1/div_Newest'))

WebUI.enhancedClick(findTestObject('Corridordigital_homescreen_test/Page_Son of a Dungeon - Season 1/div_Oldest  Oldest Newest'))

WebUI.enableSmartWait()

WebUI.enhancedClick(findTestObject('Corridordigital_homescreen_test/Page_Son of a Dungeon - Season 1/div_Season 1  Season 1  Season 2'))

WebUI.enhancedClick(findTestObject('Corridordigital_homescreen_test/Page_Son of a Dungeon - Season 1/div_Season 2'))

WebUI.enhancedClick(findTestObject('Corridordigital_homescreen_test/Page_Son of a Dungeon - Season 1/div_Season 1  Season 1  Season 2'))

WebUI.mouseOverOffset(findTestObject('Page_Son of a Dungeon - Season 1/div_The encounter with the Orcs turns bloody as th_thumb-hover p-1 p-md-2'), 
    0, 0)

WebUI.enhancedClick(findTestObject('Page_Son of a Dungeon - Season 1/div_With the Horde attacking Wentinghamshire, the_thumb-hover p-1 p-md-2'))

WebUI.closeBrowser()

WebUI.openBrowser('https://www.corridordigital.com/season/1')

WebUI.scrollToElement(findTestObject('Corridordigital_homescreen_test/Page_Son of a Dungeon - Season 1/div_Son of a Dungeon is here  Enjoy WEEKLY episodes every Wednesday at Noon US Pacific, now through November 10'), 
    0)

WebUI.waitForElementNotClickable(findTestObject('Corridordigital_homescreen_test/Page_Son of a Dungeon - Season 1/div_Son of a Dungeon is here  Enjoy WEEKLY episodes every Wednesday at Noon US Pacific, now through November 10'), 
    0)

WebUI.getAllLinksOnCurrentPage(false, [])

WebUI.verifyAllLinksOnCurrentPageAccessible(false, [])

WebUI.closeBrowser()

