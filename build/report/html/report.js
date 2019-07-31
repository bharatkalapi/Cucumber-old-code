$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/MyTest.feature");
formatter.feature({
  "name": "Checking that Cucumber is running or not ?",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@testing"
    }
  ]
});
formatter.scenario({
  "name": "Verification of Feature File read by cucumber or not ?",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@testing"
    }
  ]
});
formatter.step({
  "name": "Open the Chrome and launch the application",
  "keyword": "Given "
});
formatter.match({});
});