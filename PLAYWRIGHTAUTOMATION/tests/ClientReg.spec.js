const {test, expect} = require('@playwright/test');

test('Browser Context User Registration', async({page})=>{
const register=page.locator("[style*='cursor: pointer;']");
const firstName=page.locator("#firstName");
const lastName=page.locator("#lastName");
const email=page.locator("#userEmail");
const phoneNumber=page.locator("#userMobile");
const occupation=page.locator(".custom-select.ng-pristine.ng-valid.ng-touched");
const gender=page.locator("[value*='Male']");
const userPassword=page.locator("#userPassword");
const confirmPassword=page.locator("#confirmPassword");
const ageConfirmation=page.locator("[type='checkbox']");
const registerBtn=page.locator("#login");

page.goto("https://rahulshettyacademy.com/client/#/auth/login");

await register.click();
await firstName.fill("Nijamuddin");
await lastName.fill("Khan");
await email.fill("nijamuddinkhan084@gmail.com");
await phoneNumber.fill("9876543210");   
//await occupation.click().selectOption("Engineer");
await gender.click();
await userPassword.fill("admi@123");
await confirmPassword.fill("admi@123");
await ageConfirmation.click();
await registerBtn.click();
});