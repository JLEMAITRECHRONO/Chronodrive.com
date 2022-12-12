import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/cb/lqn9t8q16jx7xgdybpvh4x3w0000gn/T/Katalon/Test Cases/chemin critique 01/20221212_163723/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://www.chronodrive.com/')

not_run: WebUI.click(findTestObject('Choix mag/Page_Courses en ligne, faire son drive - Ch_f53ba1/span_Tous nos drives'))

not_run: WebUI.click(findTestObject('Choix mag/Page_Chronodrive - Courses en ligne, course_34a53b/span_Tout accepter'))

not_run: WebUI.click(findTestObject('Choix mag/Page_Chronodrive - Courses en ligne, course_34a53b/span_Choisir'))

not_run: WebUI.click(findTestObject('Object Repository/CC 01/Page_Courses en ligne, faire son drive - Ch_f53ba1/span_Me connecter'))

not_run: WebUI.setText(findTestObject('Object Repository/CC 01/Page_Chronodrive/input_Dj client_login'), GlobalVariable.client_login)

not_run: WebUI.setText(findTestObject('Object Repository/CC 01/Page_Chronodrive/input_E-mail ou numro client_password'), 
    GlobalVariable.client_password)

not_run: WebUI.click(findTestObject('Object Repository/CC 01/Page_Chronodrive/span_Me connecter'))

not_run: WebUI.click(findTestObject('Object Repository/CC 01/Page_Courses en ligne, faire son drive - Ch_f53ba1/span_Rayons'))

not_run: WebUI.click(findTestObject('Object Repository/CC 01/Page_Courses en ligne, faire son drive - Ch_f53ba1/span_Fruits  Lgumes'))

not_run: WebUI.click(findTestObject('Object Repository/CC 01/Page_Courses en ligne, faire son drive - Ch_f53ba1/span_Fruits'))

not_run: WebUI.click(findTestObject('Object Repository/CC 01/Page_Courses en ligne, faire son drive - Ch_f53ba1/span_Raisins'))

not_run: WebUI.click(findTestObject('Object Repository/CC 01/Page_chronodrive  rayon raisins/svg_Retirer du panier  Raisin blanc sans pp_aedfe6'))

not_run: WebUI.click(findTestObject('Object Repository/CC 01/Page_Courses en ligne, faire son drive - Ch_f53ba1/span_Favoris'))

not_run: WebUI.click(findTestObject('Object Repository/CC 01/Page_Favoris - Chronodrive/button_Ajouter au panier  Pomme de terre  c_fe3ab7'))

not_run: WebUI.click(findTestObject('Object Repository/CC 01/Page_Favoris - Chronodrive/button_Ajouter au panier  Raisin blanc sans_941937'))

not_run: WebUI.click(findTestObject('Object Repository/CC 01/Page_Favoris - Chronodrive/span_Promos'))

not_run: WebUI.click(findTestObject('Object Repository/CC 01/Page_Promotions et offres spciales - chronodrive/button_Ajouter au panier  Bouches au chocol_38e4f9'))

not_run: WebUI.click(findTestObject('Object Repository/CC 01/Page_Promotions et offres spciales - chronodrive/span_Ol'))

not_run: WebUI.click(findTestObject('Object Repository/CC 01/Page_Promotions et offres spciales - chronodrive/button_Ajouter au panier  Infusion de fruit_bed88e'))

not_run: WebUI.click(findTestObject('Object Repository/CC 01/Page_Promotions et offres spciales - chronodrive/span_25,69'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Promotions et offres spciales - chronodrive/button_Retirer du panier  Infusion de fruit_8c9426'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Promotions et offres spciales - chronodrive/span_Oui'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Promotions et offres spciales - chronodrive/button_Retirer du panier  Bouches au chocol_5fefbf'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Promotions et offres spciales - chronodrive/span_Oui'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Promotions et offres spciales - chronodrive/svg_Mon panier_ui-icon -size-32'))

WebUI.setText(findTestObject('Object Repository/CC 01/Page_Promotions et offres spciales - chronodrive/input_Rechercher_search-term'), 
    'Chocolat')

WebUI.click(findTestObject('Object Repository/CC 01/Page_Promotions et offres spciales - chronodrive/span_Voir les rsultats'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Rsultats de la recherche Chocolat - Ch_e82dc0/button_Ajouter au panier  Chocolat en poudre'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Rsultats de la recherche Chocolat - Ch_e82dc0/span_Rayons'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Rsultats de la recherche Chocolat - Ch_e82dc0/span_Vins, Bires  Spiritueux'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Rsultats de la recherche Chocolat - Ch_e82dc0/span_Apritifs et spiritueux'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Rsultats de la recherche Chocolat - Ch_e82dc0/span_Whiskies'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Whiskies - Courses drive - chronodrive/button_Ajouter au panier  Whisky old n7'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Whiskies - Courses drive - chronodrive/span_46,14'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Whiskies - Courses drive - chronodrive/span_Voir mon panier 46,14'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Mon panier - Chronodrive/span_Valider mon panier 46,14'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Chronodrive/span_Choisir'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Chronodrive/input_Forte affluence_timeslot-items'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Chronodrive/span_Choisir'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Chronodrive/span_la borne'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Chronodrive/input_(TVA incluse)_legals'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Chronodrive/input_conditions gnrales de vente_alcohol-legals'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Chronodrive/span_Terminer ma commande'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Chronodrive/span_Compte'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Compte - Chronodrive/span_Mes commandes'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Mes commandes - Chronodrive/span_Annuler cette commande'))

WebUI.click(findTestObject('Object Repository/CC 01/Page_Mes commandes - Chronodrive/button_Oui, annuler cette commande'))

WebUI.closeBrowser()

''', 'Test Cases/chemin critique 01', new TestCaseBinding('Test Cases/chemin critique 01',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
