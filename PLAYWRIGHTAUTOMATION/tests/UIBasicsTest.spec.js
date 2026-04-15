const {test, expect} = require('@playwright/test');

test('Browser context paywright test', async({browser})=>{
  //chrome-plugin/coockies
 const context=await browser.newContext();
 const page=await context.newPage();

const userName=page.locator("#username");
const password=page.locator("#password");
const signInBtn=page.locator("#signInBtn");
const errorMsg=page.locator("[style*='block']");
const cardTitles=page.locator(".card-body a");

await page.goto("https://rahulshettyacademy.com/loginpagePractise/");
//css, xpath
await userName.fill("rahulshetty");
await password.fill("learning");
await signInBtn.click();
console.log(await errorMsg.textContent());
await expect(errorMsg).toContainText('Incorrect');
//type - fill 
await userName.fill("");
await userName.fill("rahulshettyacademy");
await password.fill("");
await password.fill("Learning@830$3mK2");
await signInBtn.click();
console.log(await cardTitles.first().textContent());
//await expect(cardTitles).first().toContainText('iphone');
console.log(await cardTitles.nth(1).textContent());
//await expect(cardTitles).toContainText('Samsung');
console.log(await cardTitles.allTextContents());

});


test('Page Playwrigt test', async({page})=>{
await page.goto("https://google.com");
//get title - assertion
console.log(await page.title());
await expect(await page).toHaveTitle("Google");

});
