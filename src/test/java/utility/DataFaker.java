package utility;

import com.github.javafaker.Faker;

public class DataFaker {
    private Faker faker;

    public DataFaker(Faker faker) {
        this.faker = faker;
    }

    public String getFirstName() {
        return faker.name().firstName();
    }

    public String getLastName() {
        return faker.name().lastName();
    }

    public String getEmail() {
        return faker.internet().emailAddress();
    }
}
