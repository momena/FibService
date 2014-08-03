About FibService project:
------------------------
The project provides a RESTful web service. The web service accepts a number, n, as input and returns the first n Fibonacci numbers, starting from 0. i.e. given n = 5, appropriate output would represent the sequence "0 1 1 2 3". The service returns the values in a JSON document. Given a negative number, it will respond with an appropriate error, the error is also be in JSON format. Some positive and negative unit tests are included. CUrrently the upper boundary is 1000.

Note: I could not come up with a better name than  FibService :)

The file system structure:
-------------------------
 src
   - main/java - contains java source code
   - test/java - contains junit source code for test suit and testcases

WebContent
   - contains all the files required to create the war file

dist
   - contains a copy of FibService.war file, in case you do not want to build it, but just deploy it
.classpath etc 
   - contains the build environment for me.

How to build:
-------------
I tried to develop this project with just eclipse IDE and tried to keep it as simple as possible without any build tools, like maven or gradle. I used jdk1.7.0_45. After building it, manually created the FibService.war by exporting/packaging everything in WebContent folder. 
Two ways to generate the war:
1. From IDE, choose FibService project and right click and then choose "Export" from menu. Then fromm the Export dialog, choose Web/War file, click next and then choose the destination where you want to save it.Click Finish and it should create the FibService.war.
2. Or from a command prompt, go to WebContent directory and run "jar cvf FibService.war *". This would create the war under current directory. Make sure you have your JAVA_HOME set properly and JAVA_HOME/bin is in your path.

Note: As mentioned above, I put the latest war under dist directory

How to deploy:
-------------
Once you build the war, you deploy it under any app server. I did it on APache tomcat7.0.50 and 6.0.35, both. Make sure your JAVA version matches with the war. For tomcat, you can just drop it under <CATALINA_HOME>/webapps directory and it will be deplyed. You can also configure server inside IDE and deploy there.

How to run it:
-------------
Start your app server (or webcontainer) and make sure FibServer.war is deployed without any error. Since the response is in JSON, you should use a client that understands JSON. I used POSTMAN from google for my testing. Go to the following url in postman for a GET call and you should get the response back:

http://<your_host>"<port>/FibService/fngResource/<number>, where number is the input.
Here is an example :
http://localhost:8080/FibService/fngResource/10

In POSTMAN< you should set your output type as JSON.
The output should look like this:
{
    "Status": "SUCCESS",
    "Input": "10",
    "Output": "0 1 1 2 3 5 8 13 21 34"
}

What to expect as output:
-------------------------
It should return three elements in output, even if he number is invalid. "Status" shouws SUCCESS or FAILURE depending on the result. "Input" shows what inout you sent. "Output" shows the actual result, the fibonacci number separated by space in a string. The HTTP status code should be 200 in case of success. Otherwise it would be 400. The input can not be anything other than a number between 1-1000.

My Comments/Disclaimers:
-----------------------
I tried to keep the project simple, but also considered it to be a full blown big project. So I made a judgement call on what I should and should not tacle within this short time. Four things I would do to make this project better:
1. add either maven or gradle to build and package it properly instead of depending on IDE
2. add message catalog to put messages separately than the code for clarity and localizations sake. I would use CAL10N (http://www.slf4j.org/localization.html) that is open source and better.
3. I only added unit test for my method, but did not test end-to-end. I would add some integration tests, using probably Apache JMeter.
4. I would make the validation centralized. Because that is what our security specialists are recommending these days.

I never used github and did not know much about it. Hope it works fine with the upload.