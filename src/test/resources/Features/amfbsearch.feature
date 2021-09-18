Feature: Multiple browser open and check accessability  


@ShyAMFB
Scenario: Successfully open Amazon and FaceBook one after another 
Given launch chrome browser
Then navigate to Amazon India 
Then search for "Nike shoes"
Then naviage back and page tittle print out
Then open FaceBook home page
Then enter username and password and click login button
Then close FaceBook and quit
