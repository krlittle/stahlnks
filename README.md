# STALNKS

> "Stalnks" is a play on "Stonks" which is a play on "Stocks."

This is a simple demo of a calculator for the game Animal Crossing where bells are the currency and turnips are essentially stocks. 

This app was built comprehensively with Spring Boot dependencies and Gradle and deployed using Heroku's free hobby tier.

The front-end uses Thymeleaf which is a way to utilize Spring Expression Language (SpEL) inside of the Document Object Model (DOM) to bind data to the view.

This approach can appeal more to back-end developers who want a simplistic front-end without the need for node dependency management or javascript libraries.


### VIEW
This is what the user sees; it gives the model a place; and the view can do things by asking the controller
	
```
src/main/resources/templates/home.html
src/main/resources/templates/result.html
```

### CONTROLLER

This let's the view do actions such as manipulate a model or ask for a model or model changes

```
src/main/java/krlittle/stalnks/controllers/StanksController.java
```

### MODEL

This represents your data; it let's your view be dynamic in what it presents

```
src/main/java/krlittle/stalnks/models/Stalnks.java
```
