package com.nxcxdev;

public class Person {
    public String name;

    public String lastName;

    public Number id;

    public Number birthYear;

    public String countryOfBirth;

    public char gender;

    public Person(String name, String sur, Number id, Number year, String country, char gender) {
        this.name = name;
        this.lastName = sur;
        this.id = id;
        this.birthYear = year;
        this.countryOfBirth = country;
        this.gender = gender;
    }

    public void printInfo() {
        System.out.println(this.name + " / " + this.lastName + " / " + this.id + " / " + this.birthYear + " / "
                + this.countryOfBirth + " / " + this.gender);
    }
}
