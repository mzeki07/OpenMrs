package Task;

import Method.BaseDriver;

public class Task01 {
    public class Main extends BaseDriver {
        public static void main(String[] args) {

            driver.get("https://demo.openmrs.org/openmrs/login.htm");
            driver.quit();

        }
    }
}
