package Task;

import Method.BaseDriver;

public class Task01 extends BaseDriver {

        public static void main(String[] args) {

            driver.get("https://demo.openmrs.org/openmrs/login.htm");

            String expectedUrl = "https://demo.openmrs.org/openmrs/login.htm";
            String actualUrl = driver.getCurrentUrl();

            if (actualUrl.equals(expectedUrl)) {
                System.out.println("You are on the correct page.");
            } else {
                System.out.println("You are on a different page.");
            }

            // Close the browser
            driver.quit();


        }
    }

