import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://www.katalon.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.katalon.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://www.phptravels.net/login")
selenium.click("name=username")
selenium.type("name=username", "user@phptravels.com")
selenium.type("name=password", "demouser")
selenium.sendKeys("name=password", "${KEY_ENTER}")
selenium.click("//img[contains(@src,'https://www.phptravels.net/themes/default/assets/img/icons/flight.png')]")
selenium.selectFrame("index=0")
selenium.click("id=airports-inline-orig-e4f44e22-c20b-483a-94c6-eae1d48884b2")
selenium.type("id=airports-inline-orig-e4f44e22-c20b-483a-94c6-eae1d48884b2", "BWI")
selenium.click("//li[@id='typeahead-29-7452-option-0']/a/span[2]/span/span[2]")
selenium.click("id=airports-inline-dest-e4f44e22-c20b-483a-94c6-eae1d48884b2")
selenium.type("id=airports-inline-dest-e4f44e22-c20b-483a-94c6-eae1d48884b2", "MKE")
selenium.click("//li[@id='typeahead-31-9090-option-0']/a/span[2]/span[2]/span")
selenium.click("//button[@id='search-for-flights-button']/span")
selenium.click("//span[@id='depart-date-link-e4f44e22-c20b-483a-94c6-eae1d48884b2']/span/span[2]/span[2]")
selenium.click("//tr[2]/td[3]/button")
selenium.click("//span[@id='return-date-link-e4f44e22-c20b-483a-94c6-eae1d48884b2']/span/span[2]/span[2]")
selenium.click("//span[@id='return-date-link-e4f44e22-c20b-483a-94c6-eae1d48884b2']/span/span[2]/span[2]")
selenium.click("//tr[4]/td[4]/button")
selenium.click("//button[@id='search-for-flights-button']/span")
