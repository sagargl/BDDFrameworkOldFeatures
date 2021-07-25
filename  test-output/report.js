$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/swath/eclipse-workspace/BDDFramework/src/main/java/Feature/Test.feature");
formatter.feature({
  "line": 1,
  "name": "Login to the Test Application",
  "description": "",
  "id": "login-to-the-test-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login to the App",
  "description": "",
  "id": "login-to-the-test-application;login-to-the-app",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user enters to the amazon app",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "search the \"Applemac\" and price 100",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "\"Apple\" should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters \"\u003cproducts\u003e\" and \"\u003cpricetag\u003e\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Testclass.user_enters_to_the_amazon_app()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Applemac",
      "offset": 12
    },
    {
      "val": "100",
      "offset": 32
    }
  ],
  "location": "Testclass.search_the_and_price(String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Apple",
      "offset": 1
    }
  ],
  "location": "Testclass.should_be_displayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});