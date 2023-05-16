package UT.Pages;

import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage inputLogin(String login) {
        findElementByXpath("//input[@formcontrolname='username']").sendKeys(login);
        return this;
    }

    public LoginPage inputPassword(String password) {
        findElementByXpath("//input[@formcontrolname='password']").sendKeys(password);
        return this;

    }

    public LoginPage clickButton() {
        findElementByXpath("//span[@class='mat-button-wrapper']").click();
        return this;
    }

    public LoginPage clickForgotPassword() {
        findElementByXpath("//small").click();
        return this;


    }

    public LoginPage writeEmail(String email) {
        findElementByXpath("//input[@name='email']").sendKeys(email);
        return this;

    }

    public LoginPage clickRestore() {
        findElementByXpath("//button[@type='submit']").click();
        return this;

    }

    public WebElement errorMessage() {
        return findElementByXpath("//div[@class='server-error ng-star-inserted']");

    }

    public LoginPage clickRegistration() {
        findElementByXpath("//strong[text()=\"Реєстрація\"]").click();
        return this;

    }

    public LoginPage chooseRegistration() {
        findElementByXpath("//div[@class=\"mat-form-field-wrapper ng-tns-c68-2\"]").click();
        return this;
    }

    public LoginPage Fop() {
        findElementByXpath(" //mat-option[@id=\"mat-option-0\"]").click();
        return this;
    }

    public LoginPage surName(String surname) {
        findElementByXpath("//input[@formcontrolname='surname']").sendKeys(surname);
        return this;

    }

    public LoginPage firstName(String firstname) {
        findElementByXpath("//input[@formcontrolname='firstName']").sendKeys(firstname);
        return this;
    }

    public LoginPage middleName(String middlename) {
        findElementByXpath("//input[@formcontrolname='middleName']").sendKeys(middlename);
        return this;
    }

    public LoginPage chooseRegion() {
        findElementByXpath("//div[@class=\"mat-select-value ng-tns-c83-5\"]").click();
        return this;

    }

    public LoginPage clickRegion() {
        findElementByXpath(" //mat-option[@id='mat-option-5']").click();
        return this;
    }

    public LoginPage addressRegistration(String address) {
        findElementByXpath("//input[@id='mat-input-2']").sendKeys(address);
        return this;

    }

    public LoginPage contantPerson(String contact) {
        findElementByXpath("//input[@id='mat-input-3']").sendKeys(contact);
        return this;

    }

    public LoginPage addressDelivery(String delivery) {
        findElementByXpath("//input[@id='mat-input-4']").sendKeys(delivery);
        return this;

    }

    public LoginPage phoneNumber(String number) {
        findElementByXpath("//input[@id='mat-input-5']").sendKeys(number);
        return this;
    }

    public LoginPage emailAddress(String email) {
        findElementByXpath("//input[@id='mat-input-6']").sendKeys(email);
        return this;
    }

    public LoginPage individualTaxNumber(String ipn) {
        findElementByXpath("//input[@id='mat-input-10']").sendKeys(ipn);
        return this;
    }

    public LoginPage agreeTerms() {
        findElementByXpath("//mat-checkbox[@name='acceptedTerms']").click();
        return this;
    }

    public LoginPage clickReg() {
        findElementByXpath("//button[@type]").click();
        return this;
    }

    public WebElement errorSurname() {
        return findElementByXpath("//mat-hint[@id='mat-hint-1']");

    }

    public WebElement errorFistName() {
        return findElementByXpath("//mat-hint[@id='mat-hint-2']");
    }

    public WebElement errorMiddleName() {
        return findElementByXpath("//mat-hint[@id='mat-hint-3']");
    }

    public WebElement errorPhoneNumber() {
        return findElementByXpath("//mat-hint[@id='mat-hint-0']");
    }

    public LoginPage clickRegistrationL() {
        findElementByXpath("//strong[text()=\"Реєстрація\"]").click();
        return this;
    }

    public LoginPage chooseRegistrationL() {
        findElementByXpath("//div[@class=\"mat-form-field-wrapper ng-tns-c68-2\"]").click();
        return this;

    }
    public LoginPage clickLegalEnity(){
        findElementByXpath("//mat-option[@id='mat-option-1']").click();
        return this;
    }
    public LoginPage nameCompany(String name){
        findElementByXpath("//input[@id='mat-input-7']").sendKeys(name);
        return this;

    }
    public LoginPage lasyNameAccountHolder(String lastname){
        findElementByXpath("//input[@id='mat-input-8']").sendKeys(lastname);
        return this;
    }
    public LoginPage nameAccountHolder(String name){
        findElementByXpath("//input[@id='mat-input-9']").sendKeys(name);
        return this;
    }
    public LoginPage middleNameAccountHolder(String middleName){
        findElementByXpath("//input[@id='mat-input-10']").sendKeys(middleName);
        return this;
    }
public LoginPage chooseRegionLe(){
        findElementByXpath("//div[@class=\"mat-select-value ng-tns-c83-5\"]").click();
        return this;
}
public LoginPage clickRegionLe(){
        findElementByXpath("//mat-option[@id='mat-option-5']").click();
        return this;
}
    public LoginPage addressRegistrationLe(String address) {
        findElementByXpath("//input[@id='mat-input-2']").sendKeys(address);
        return this;

    }

    public LoginPage contantPersonLe(String contact) {
        findElementByXpath("//input[@id='mat-input-3']").sendKeys(contact);
        return this;

    }

    public LoginPage addressDeliveryLe(String delivery) {
        findElementByXpath("//input[@id='mat-input-4']").sendKeys(delivery);
        return this;

    }

    public LoginPage phoneNumberLe(String number) {
        findElementByXpath("//input[@id='mat-input-5']").sendKeys(number);
        return this;
    }

    public LoginPage emailAddressLe(String email) {
        findElementByXpath("//input[@id='mat-input-6']").sendKeys(email);
        return this;
    }

    public LoginPage chooseEdrpoy(String edrpou){
        findElementByXpath("//input[@id='mat-input-11']").sendKeys(edrpou);
        return this;
    }

    public LoginPage agreeTermsLe() {
        findElementByXpath("//mat-checkbox[@name='acceptedTerms']").click();
        return this;
    }
    public LoginPage clickRegLe() {
        findElementByXpath("//button[@type]").click();
        return this;
    }
    public WebElement errorMessageEdrpou(){
        return findElementByXpath("//span[@class='error ng-tns-c68-15 ng-star-inserted']");

    }
    public WebElement passwordResetSuccessully(){
        return findElementByXpath("//input[@class='search-input ng-pristine ng-invalid ng-touched']");

    }
    public WebElement successfulLogin(){
        return findElementByXpath("//input[@class='search-input ng-pristine ng-invalid ng-touched']");
    }
    }
