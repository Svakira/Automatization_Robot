package com.tallerconpatron.certificacion.colorlib.step;

import com.tallerconpatron.certificacion.colorlib.common.BasePage;
import com.tallerconpatron.certificacion.colorlib.pageobject.PaginaHome;
import com.tallerconpatron.certificacion.colorlib.pageobject.PaginaLogin;
import com.tallerconpatron.certificacion.colorlib.pageobject.PaginaPopVal;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class TaskAction extends BasePage {
    private PaginaLogin paginaLogin;
    private PaginaHome paginaHome;
    private PaginaPopVal paginaPopVal;

    @Step
    public void openPage() {
        openApp();
    }

    @Step
    public void signIn(String strUser, String strPassword) {
        sendKeysUser(strUser);
        sendKeysPassword(strPassword);
        paginaLogin.btnSingIn.waitUntilClickable().click();
    }

    public void sendKeysUser(String strUser) {
        paginaLogin.user.click();
        paginaLogin.user.clear();
        paginaLogin.user.sendKeys(strUser);
    }

    public void sendKeysPassword(String strPassword) {
        paginaLogin.password.click();
        paginaLogin.password.clear();
        paginaLogin.password.sendKeys(strPassword);
    }

    public void enterMenu() {

        paginaHome.menu.waitUntilClickable().click();
    }

    public void selectFormValidation() {
        paginaHome.formValidation.waitUntilClickable().click();
    }

    public boolean assertTittle() throws Exception {
        if (paginaPopVal.header.getText().equals("Popup Validation")) {
            System.out.print("si entro");
            return true;
        } else {
            return false;

        }
    }

    public void fillTheSpaces(String required, String select, String multiSelec, String url, String email, String passw, String confPassw, String minField, String maxField,
                              String num, String ip, String date, String dateEarly) {
        paginaPopVal.required.click();
        paginaPopVal.required.clear();
        paginaPopVal.required.sendKeys(required);
        paginaPopVal.select.click();
        paginaPopVal.multiSelec.click();

        paginaPopVal.url.click();
        paginaPopVal.url.clear();
        paginaPopVal.url.sendKeys(url);

        paginaPopVal.email.click();
        paginaPopVal.email.clear();
        paginaPopVal.email.sendKeys(email);

        paginaPopVal.passw.click();
        paginaPopVal.passw.clear();
        paginaPopVal.passw.sendKeys(passw);

        paginaPopVal.confPassw.click();
        paginaPopVal.confPassw.clear();
        paginaPopVal.confPassw.sendKeys(confPassw);

        paginaPopVal.minField.click();
        paginaPopVal.minField.clear();
        paginaPopVal.minField.sendKeys(minField);

        paginaPopVal.maxField.click();
        paginaPopVal.maxField.clear();
        paginaPopVal.maxField.sendKeys(maxField);

        paginaPopVal.number.click();
        paginaPopVal.number.clear();
        paginaPopVal.number.sendKeys(num);

        paginaPopVal.ip.click();
        paginaPopVal.ip.clear();
        paginaPopVal.ip.sendKeys(ip);

        paginaPopVal.date.click();
        paginaPopVal.date.clear();
        paginaPopVal.date.sendKeys(date);

        paginaPopVal.dateEarly.click();
        paginaPopVal.dateEarly.clear();
        paginaPopVal.dateEarly.sendKeys(dateEarly);
    }

    public void btnValidate() {
        paginaPopVal.btnValidation.waitUntilClickable().click();

    }

    public void reqEmptyValidation() {
        assert (paginaPopVal.required.getText().equals(""));
    }
}
