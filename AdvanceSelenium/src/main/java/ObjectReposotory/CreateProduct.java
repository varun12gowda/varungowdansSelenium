package ObjectReposotory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProduct 
{
public CreateProduct(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
@FindBy(linkText = "Products")
private WebElement ProductLink;

@FindBy (xpath =  "//img[@title='Create Product...']")
private WebElement ProductButton;

@FindBy(xpath = "//input[@name='productname']")
private WebElement ProductName;

@FindBy(xpath = "//input[@name='sales_start_date']")
private WebElement ProductStartDate;

@FindBy(xpath = "//select[@name='productcategory']")
private WebElement ProductCategory;

@FindBy(xpath="//input[@name='sales_end_date']")
private WebElement ProductEndDate;

@FindBy(xpath = "//input[@name='vendor_part_no']")
private WebElement VenderPartNo;

@FindBy (xpath = "//input[@name='productsheet']")
private WebElement ProductSheet;

@FindBy(xpath = "//select[@name='glacct']")
private WebElement GLAccount;

@FindBy(xpath = "//input[@name='productcode']")
private WebElement ProductCode;

@FindBy(xpath = "//select[@name='manufacturer']")
private WebElement Manufacturer;

@FindBy(xpath = "//input[@name='start_date']")
private WebElement SupportStartDate;

@FindBy(xpath = "//input[@name='expiry_date']")
private WebElement SupportEndDate;

@FindBy(xpath = "//input[@name='website']")
private WebElement website;

@FindBy(xpath = "//input[@name='mfr_part_no']")
private WebElement MfrPartNumb;

@FindBy(xpath = "//input[@name='serial_no']")
private WebElement serialNo;

@FindBy(xpath = "//input[@name='unit_price']")
private WebElement unitPrice;

@FindBy(xpath = "//select[@name='usageunit']")
private WebElement usageUnit;

@FindBy(xpath = "//input[@value='T']")
private WebElement group;

@FindBy(xpath = "//select[@name='assigned_group_id']")
private WebElement handlerGroup;

@FindBy(xpath = "//textarea[@name='description']")
private WebElement description;

@FindBy(xpath = "//input[@title='Save [Alt+S]']")
private WebElement save;

public WebElement getProductLink() {
	return ProductLink;
}

public WebElement getProductButton() {
	return ProductButton;
}

public WebElement getProductName() {
	return ProductName;
}

public WebElement getProductStartDate() {
	return ProductStartDate;
}

public WebElement getProductCategory() {
	return ProductCategory;
}

public WebElement getProductEndDate() {
	return ProductEndDate;
}

public WebElement getVenderPartNo() {
	return VenderPartNo;
}

public WebElement getProductSheet() {
	return ProductSheet;
}

public WebElement getGLAccount() {
	return GLAccount;
}

public WebElement getProductCode() {
	return ProductCode;
}

public WebElement getManufacturer() {
	return Manufacturer;
}

public WebElement getSupportStartDate() {
	return SupportStartDate;
}

public WebElement getSupportEndDate() {
	return SupportEndDate;
}

public WebElement getWebsite() {
	return website;
}

public WebElement getMfrPartNumb() {
	return MfrPartNumb;
}

public WebElement getSerialNo() {
	return serialNo;
}

public WebElement getUnitPrice() {
	return unitPrice;
}

public WebElement getUsageUnit() {
	return usageUnit;
}

public WebElement getGroup() {
	return group;
}



public WebElement getHandlerGroup() {
	return handlerGroup;
}

public WebElement getDescription() {
	return description;
}

public WebElement getSave() {
	return save;
}







}
