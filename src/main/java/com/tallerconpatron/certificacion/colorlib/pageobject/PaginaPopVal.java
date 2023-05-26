package com.tallerconpatron.certificacion.colorlib.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class PaginaPopVal extends PageObject {
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[1]/div/div/header/h5")
    public WebElementFacade header;

    @FindBy(id = "req")
    public WebElementFacade required;

    @FindBy(xpath = "//*[@id=\"sport\"]/option[3]" )
    public WebElementFacade select;

    @FindBy(xpath = "//*[@id=\"sport2\"]/option[3]")
    public WebElementFacade multiSelec;

    @FindBy(id = "url1")
    public WebElementFacade url;

    @FindBy(id = "email1")
    public WebElementFacade email;

    @FindBy(id = "pass1")
    public WebElementFacade passw;

    @FindBy(id = "pass2")
    public WebElementFacade confPassw;

    @FindBy(id = "minsize1")
    public WebElementFacade minField;
    @FindBy(id = "maxsize1")
    public WebElementFacade maxField;
    @FindBy(xpath = "//*[@id=\"popup-validation\"]/div[14]/input")
    public WebElementFacade btnValidation;
    @FindBy(id = "number2")
    public WebElementFacade number;

    @FindBy(id = "ip")
    public WebElementFacade ip;

    @FindBy(id = "date3")
    public WebElementFacade date;

    @FindBy(id = "past")
    public WebElementFacade dateEarly;








}
