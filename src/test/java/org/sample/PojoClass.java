package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {
public PojoClass() {
PageFactory.initElements(driver, this);
}
@FindBy(id="email")
private WebElement email;
@FindBy(id="pass")
private WebElement password;
@FindBy(xpath="//button[@value='1']")
private WebElement logIn;
public WebElement getEmail() {
	return email;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLogIn() {
	return logIn;
}
}
