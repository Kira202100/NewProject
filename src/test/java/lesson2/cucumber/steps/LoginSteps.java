package lesson2.cucumber.steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lesson2.lesson3base.BaseTest;
import lesson2.pages.LoginPage;

public class LoginSteps  extends BaseTest {
    LoginPage loginPage;
    @Given("^User is on Login page$")
    public void user_is_on_Login_page(){
      loginPage = openApp("pixel 10")
                .clickLoginMenuButton();
    }

    @When("^User click login button$")
    public void user_click_login_button(){

        loginPage.clickLoginButton();
    }

    @Then("^User should see error message \"([^\"]*)\"$")
    public void user_should_see_error_message(String errorText){
        loginPage.checkLoginErrorText(errorText);
    }


    @When("^User set login: (\\w+)$")
    public void user_set_login_Bill(String name) throws Exception {
        System.out.println("name");
    }
    @When("^User set password: (\\d+)$")
    public void user_set_password (int password) throws Exception {
        System.out.println("password");
    }
    @Then("^User should see welcome message\\.$")
    public void user_should_see_welcome_message()  {

    }




}
