const {test, expect} = require('@playwright/test');

test.only('Browser context-validating Error login', async({page})=>{
 await page.goto("https://rahulshettyacademy.com/client/#/auth/login");
 await page.locator("#userEmail").fill("nijamuddinkhan084@gmail.com");
 await page.locator("#userPassword").fill("Admin@123");
 await page.locator("[value='Login']").click();
 await page.waitForSelector('networkidle');
const titles= await page.locator(".card-body b").allTextContents(); 
console.log(titles);

});