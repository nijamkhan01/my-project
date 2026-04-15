@echo off
setlocal enabledelayedexpansion
rem Before run you need change 'EnvName','Tag','LoginType','Browser','SendEmail','TestModeFlag'

rem set the environment name as in the EMS
set "EnvName=BTP/CC 25.4 Util Regression - integrated"

set EnvNameNew=

rem set Tag
set "Tag=@regressionUtil"
rem set login type
set "LoginType=EMP"
rem set browser
set "Browser=Chrome"
rem set Send email
set "SendEmail=true"
rem set test mode flag
set "TestModeFlag=false"

echo New Environment is: !EnvName!
echo Tag name is : !Tag!
echo Login type is: !LoginType!
echo Running on browser: !Browser!
echo Send email: !SendEmail!
echo Test mode flag: !TestModeFlag!

rem replace the spaces in the environment name with %20
for %%A in (%EnvName%) do (
	set EnvNameNew=!EnvNameNew!%%A%%20
	rem echo !EnvNameNew!
	)
	
rem remove the %20 at the end
set "EnvNameNew=!EnvNameNew:~0,-3!"
rem echo !EnvNameNew!

echo invoking the EMS API
rem build the URL for invoking the API
set "Product_application=http://d32d-cmo-ato02.us.teo.earth:3333/automation/jenkinsappinfo?Environment_Name=!EnvNameNew!&Product_Application=BTOD&searchKey=Application_URL"

rem echo !Product_application!

rem save the output for the curl command to the variable BTP_URL
FOR /F "tokens=*" %%A IN ('curl -s "!Product_application!"') DO SET BTP_URL=%%A

set "Product_application=http://d32d-cmo-ato02.us.teo.earth:3333/automation/jenkinsappinfo?Environment_Name=!EnvNameNew!&Product_Application=CC&searchKey=Application_URL"
FOR /F "tokens=*" %%A IN ('curl -s "!Product_application!"') DO SET CC_URL=%%A

set "Product_application=http://d32d-cmo-ato02.us.teo.earth:3333/automation/jenkinsappinfo?Environment_Name=!EnvNameNew!&Product_Application=BTOD&searchKey=DB_Host"
FOR /F "tokens=*" %%A IN ('curl -s "!Product_application!"') DO SET DB_Host=%%A

set "Product_application=http://d32d-cmo-ato02.us.teo.earth:3333/automation/jenkinsappinfo?Environment_Name=!EnvNameNew!&Product_Application=BTOD&searchKey=DB_Schema"
FOR /F "tokens=*" %%A IN ('curl -s "!Product_application!"') DO SET DB_Schema=%%A

 echo BTP_URL is: !BTP_URL!
 echo CC_URL is: !CC_URL!
 echo DB Host is: !DB_Host!
 echo DB Schema is: !DB_Schema!
 
echo The current user's profile directory is: %UserProfile%


REM Set repository variables
set REPO_URL=https://Nijamuddinkhan@bitbucket.org/TEOCOSCM/cmregtest.git
set LOCAL_DIR=%UserProfile%\Downloads\cmregtest

echo ============================================
echo Checking Bitbucket Repository: %REPO_URL%
echo Target Folder: %LOCAL_DIR%
echo ============================================

REM Check if local repo already exists
if exist "%LOCAL_DIR%\.git" (
    echo Repository already exists. Pulling latest changes...
    cd "%LOCAL_DIR%"
    git pull
	echo Repository updated successfully.
) else (
    echo Cloning new repository to: %LOCAL_DIR%
    git clone %REPO_URL% "%LOCAL_DIR%"
	echo Repository cloned successfully.
)
 
rem navigate to the project pom file location
cd %UserProfile%\Downloads\cmregtest\CostMgmtAutomation\BillTrakSuite
 
rem Run Maven command
mvn clean install exec:java -Dexec.cleanupDaemonThreads=false -Dbrowser="!Browser!" -DsendMail="!SendEmail!" -Dtest_mode_flag="!TestModeFlag!" -Dapp_name="BillTrak" -Dlogin_type="!login_type!" -Drelease_number="25.4" -Dlog_location="\\us.teo.earth/shares/Engineering/Achievers/RunResults" -Dbt_url="!BTP_URL!" -Dcc_url="!CC_URL!" -Ddb_schema="!DB_Schema!" -Denvironment_name="!EnvName!" -Ddb_host="!DB_Host!" -Dcucumber.filter.tags="!Tag!"
