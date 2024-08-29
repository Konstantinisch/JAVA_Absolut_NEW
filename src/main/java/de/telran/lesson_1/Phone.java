package de.telran.lesson_1;

public class Phone {
    String name;
    String model;

    private String company;
    public int year;

   public void call() {
        System.out.println("Visivaju abonenta - " + name);
    }

    public void receive() {
        System.out.println("Prinimau svonok -" + name);

    }

    public Phone() {

    }

    public Phone(String name) {
        this.name = name;
    }


    public Phone(String name, String model, String company, int year) {
        this.name = name;
        this.model = model;
        this.company = company;
        this.year = year;
    }

    public void setCompany(String company) {
       if(company ==null || company == "") {
           System.out.println("Ne korrect snachenie");
       }
            else {
           this.company = company;
       }
    }

    public String getCompany() {
       //proverka dostupnosti dannoj charachketistiki po sekjuriti
        if (company != "Sekretnaja")
        return company;
        return null;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    
}





























































