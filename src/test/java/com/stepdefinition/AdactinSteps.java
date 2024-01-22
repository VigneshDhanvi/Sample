package com.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.Base.Base;
import com.locators.Fifth_PageLocators;
import com.locators.First_PageLocators;
import com.locators.Fourth_PageLocators;
import com.locators.Second_PageLocators;
import com.locators.Third_PageLocators;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinSteps extends Fifth_PageLocators {
	@Given("launch URL {string}")
	public void launch_url(String string) {
		Base.loadURL(string);
	}

	@When("enter username {string}")
	public void enter_username(String string) {
		Base.sendKeys(First_PageLocators.getuserName(), string);
	}

	@When("enter Password {string}")
	public void enter_password(String string) {
		Base.sendKeys(First_PageLocators.getpassWord(), string);
	}

	@When("click login")
	public void click_login() {
		Base.click(First_PageLocators.getloginClick());
	}

	@When("select location {string}")
	public void select_location(String string) {
		Base.selectData(Second_PageLocators.getlocation(), string);
	}

	@When("select hotelName {string}")
	public void select_hotel_name(String string) {
		Base.selectData(Second_PageLocators.gethotels(), string);
	}

	@When("select roomType {string}")
	public void select_room_type(String string) {
		Base.selectData(Second_PageLocators.getroomType(), string);
	}

	@When("select no.of.Rooms {string}")
	public void select_no_of_rooms(String string) {
		Base.selectData(Second_PageLocators.getnumOfRoom(), string);
	}

	@When("enter CheckInDate {string}")
	public void enter_check_in_date(String string) {
		Base.sendKeys(Fourth_PageLocators.getcheckIn(), string);
	}

	@When("enter CheckOutDate {string}")
	public void enter_check_out_date(String string) {
		Base.sendKeys(Fourth_PageLocators.getcheckOut(), string);
	}

	@When("select adultsPerRoom {string}")
	public void select_adults_per_room(String string) {
		Base.selectData(Second_PageLocators.getadults(), string);
	}

	@When("select childrenPerRoom {string}")
	public void select_children_per_room(String string) {
		Base.selectData(Second_PageLocators.getchilds(), string);
	}

	@When("click search")
	public void click_search() {
		Base.click(Second_PageLocators.getsearch());
	}

	@When("click hotelRadioBtn")
	public void click_hotel_radio_btn() {
		Base.click(Third_PageLocators.getradioBtn());
	}

	@When("enter firstName {string}")
	public void enter_first_name(String string) {
		Base.sendKeys(Fourth_PageLocators.getfirstName(), string);
	}

	@When("enter lastName {string}")
	public void enter_last_name(String string) {
		Base.sendKeys(Fourth_PageLocators.getlastName(), string);
	}

	@When("enter address {string}")
	public void enter_address(String string) {
		Base.sendKeys(Fourth_PageLocators.getaddress(), string);
	}

	@When("enter ccNo {string}")
	public void enter_cc_no(String string) {
		Base.sendKeys(Fourth_PageLocators.getccNumber(), string);
	}

	@When("select ccType {string}")
	public void select_cc_type(String string) {
		Base.selectData(Fourth_PageLocators.getccType(), string);
	}

	@When("select expiryMonth {string}")
	public void select_expiry_month(String string) {
		Base.selectData(Fourth_PageLocators.getexpiryMonth(), string);
	}

	@When("select ExpiryYear {string}")
	public void select_expiry_year(String string) {
		Base.selectData(Fourth_PageLocators.getexpiryYear(), string);
	}

	@When("enter CVV {string}")
	public void enter_cvv(String string) {
		Base.sendKeys(Fourth_PageLocators.getcvv(), string);
	}

	@When("click BookNow")
	public void click_book_now() {
		Base.click(Fourth_PageLocators.getbookNow());
	}

	@Then("TakeScreenshot")
	public void take_screenshot() {
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		Base.scroll(Fifth_PageLocators.getorderId());
		String OrderId = Base.PrintBookingId(Fifth_PageLocators.getorderId());
		System.out.println(OrderId);
	}

	@When("click continueBtn")
	public void click_continue_btn() {

		Base.click(Third_PageLocators.getcontinueBtn());
	}
	@When("enter cred")
	public void enter_cred( DataTable dataTable) {
	  List<String> list = dataTable.asList();
	  Base.sendKeys(First_PageLocators.getuserName(), list.get(0));
	  Base.sendKeys(First_PageLocators.getpassWord(), list.get(1));
	  
	}
	@When("enter CheckIn&CheckOutDate")
	public void enter_check_in_check_out_date(DataTable dataTable) {
		 List<String> list = dataTable.asList();
		  Base.sendKeys(Second_PageLocators.getcheckIn(), list.get(0));
		  Base.sendKeys(Second_PageLocators.getcheckOut(), list.get(1));
	}
	@When("enter deails")
	public void enter_deails(DataTable dataTable) {
		List<String> list = dataTable.asList();
		  Base.sendKeys(Fourth_PageLocators.getfirstName(), list.get(0));
		  Base.sendKeys(Fourth_PageLocators.getlastName(), list.get(1));
		  Base.sendKeys(Fourth_PageLocators.getaddress(), list.get(2));
		  Base.sendKeys(Fourth_PageLocators.getccNumber(), list.get(3));
	}
	
	@When("enter credasMap")
	public void enter_credas_map(DataTable dataTable) {
	   Map<String, String> map = dataTable.asMap();
	   Base.sendKeys(First_PageLocators.getuserName(), map.get("username"));
	   Base.sendKeys(First_PageLocators.getpassWord(), map.get("password"));
	}
	@When("enter CheckIn&CheckOutDateasMap")
	public void enter_check_in_check_out_dateas_map(DataTable dataTable) {
		 Map<String, String> map = dataTable.asMap();
		   Base.sendKeys(Second_PageLocators.getcheckIn(), map.get("checkin"));
		   Base.sendKeys(Second_PageLocators.getcheckOut(), map.get("checkout"));
	}
	@When("enter deailsasMap")
	public void enter_deailsas_map(DataTable dataTable) {
		Map<String, String> map = dataTable.asMap();
		   Base.sendKeys(Fourth_PageLocators.getfirstName(), map.get("firstname"));
		   Base.sendKeys(Fourth_PageLocators.getlastName(), map.get("lastname"));
		   Base.sendKeys(Fourth_PageLocators.getaddress(), map.get("address"));
		   Base.sendKeys(Fourth_PageLocators.getccNumber(), map.get("ccnumber"));
	}
	@When("enter credasMaps")
	public void enter_credas_maps(DataTable dataTable) {
	    List<Map<String, String>> map = dataTable.asMaps(String.class,String.class);
	    Base.sendKeys(First_PageLocators.getuserName(), map.get(0).get("username"));
	    Base.sendKeys(First_PageLocators.getpassWord(), map.get(0).get("password"));
	}
	@When("enter CheckIn&CheckOutDateasMaps")
	public void enter_check_in_check_out_dateas_maps(DataTable dataTable) {
		 List<Map<String, String>> map = dataTable.asMaps(String.class,String.class);
		    Base.sendKeys(Second_PageLocators.getcheckIn(), map.get(0).get("checkin"));
		    Base.sendKeys(Second_PageLocators.getcheckOut(), map.get(0).get("checkout"));
	}
	@When("enter deailsasMaps")
	public void enter_deailsas_maps(DataTable dataTable) {
		List<Map<String, String>> map = dataTable.asMaps(String.class,String.class);
	    Base.sendKeys(Fourth_PageLocators.getfirstName(), map.get(0).get("firstname"));
	    Base.sendKeys(Fourth_PageLocators.getlastName(), map.get(0).get("lastname"));
	    Base.sendKeys(Fourth_PageLocators.getaddress(), map.get(0).get("address"));
	    Base.sendKeys(Fourth_PageLocators.getccNumber(), map.get(0).get("ccnumber"));
	}

}
