package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

/**
 * This class is based in the old format of Page objects. See the package services in the new format.
 */
public class PhpAPKHome extends PageBaseMobile {

    private final String VISA_BUTON_ACCESIBILITY_ID = "VISA";
    private final String BUTON_FROM_ID = "com.phptravelsnative:id/btn_origin";
    private final String INPUT_FROM_TO_ID = "com.phptravelsnative:id/country_picker_search";
    private final String BUTON_COUNTRY_ID = "com.phptravelsnative:id/row_title";
    private final String BUTON_TO_ID = "com.phptravelsnative:id/car_to";
    private final String INPUT_FIRST_NAME_ID = "com.phptravelsnative:id/first_name";
    private final String INPUT_LAST_NAME_ID = "com.phptravelsnative:id/last_name";
    private final String INPUT_EMAIL_ID = "com.phptravelsnative:id/email";
    private final String INPUT_PHONE_ID = "com.phptravelsnative:id/phone";
    private final String INPUT_NOTES_ID = "com.phptravelsnative:id/notes";
    private final String BUTON_SUBMIT_ID = "com.phptravelsnative:id/search_hotels";
    private final String CHECK_TEXT_ID = "com.phptravelsnative:id/text1";

    public PhpAPKHome(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

  public void tapVisaButon(){
      //clickElement(MobileBy.AccessibilityId(VISA_BUTON_ACCESIBILITY_ID));
  }
  public void ingresarDestinos(String from, String to){
      tapFrom();
      completeField(By.id(INPUT_FROM_TO_ID),from);
      tapCountry();
      tapTo();
      completeField(By.id(INPUT_FROM_TO_ID),to);
      tapCountry();
  }
    public void completeFormData(String fName, String lName, String email, String phone, String notes){
        completeField(By.id(INPUT_FIRST_NAME_ID),fName);
        completeField(By.id(INPUT_LAST_NAME_ID),lName);
        completeField(By.id(INPUT_EMAIL_ID),email);
        completeField(By.id(INPUT_PHONE_ID),phone);
        completeField(By.id(INPUT_NOTES_ID),notes);
    }

    public void tapFrom(){
        clickElement(By.id(BUTON_FROM_ID));
    }

    public void tapTo(){
        clickElement(By.id(BUTON_TO_ID));
    }

         public void tapCountry(){
         clickElement(By.id(BUTON_COUNTRY_ID));
     }

     public void tapSubmit(){
         clickElement(By.id(BUTON_SUBMIT_ID));
     }
      public void check(){
          Assert.assertTrue(getElementText(By.id(CHECK_TEXT_ID)).equals("Reservation Submitted"),"Error al completar la reserva");
      }

}
