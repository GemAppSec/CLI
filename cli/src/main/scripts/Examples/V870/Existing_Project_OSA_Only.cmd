@echo off

pushd "%~dp0"
set JAVA_HOME=
set PATH=%JAVA_HOME%/bin;%PATH%

java -Xmx1024m -jar cx_console.jar OsaScan -ProjectName "CxServer\CLI_OSA_SCAN" -CxServer "http://10.31.1.158" -cxUser "admin@cx" -cxPassword "XXXXX" -locationType shared -locationUser "user" -locationPassword "XXX" -v -osaLocationPath "\\storage\qa\Auto_Tests\Projects\MixedSASTAndOSATest" -OSAHigh 1 -OSAMedium 2 -OSALow 3
set exitCode=%errorlevel%

popd
Exit /B %exitCode%