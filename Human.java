public class Human {
    public Animal pet;
    public String name;
    public String surname;
    public Car car;
    private Double salary;


    public Car getCar() {

        return this.car;
    }
    public Double getSalary() {
        System.out.println(java.time.LocalDate.now());
        System.out.println(this.salary);
        return this.salary;
    }
    public void setSalary(Double newSalary) {
        if (newSalary < 0) {
            System.out.println("Na koncie nie moze byc ujemna wartość");
        } else {
            System.out.println("Wysyłanie nowych danych do systemu księgowości");
            System.out.println("Konieczność odebrania umowy w kadrach");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
            this.salary = newSalary;
        }
    }

}
