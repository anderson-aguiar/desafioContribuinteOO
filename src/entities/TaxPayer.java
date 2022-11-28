package entities;

public class TaxPayer {

    private Double salaryIncome;
    private Double serviceIncome;
    private Double capitalIncome;
    private Double healthSpending;
    private Double educationSpending;

    public TaxPayer(Double salaryIncome, Double serviceIncome, Double capitalIncome, Double healthSpending, Double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.serviceIncome = serviceIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }

    public Double getSalaryIncome() {
        return salaryIncome;
    }

    public void setSalaryIncome(Double salaryIncome) {
        this.salaryIncome = salaryIncome;
    }

    public Double getServiceIncome() {
        return serviceIncome;
    }

    public void setServiceIncome(Double serviceIncome) {
        this.serviceIncome = serviceIncome;
    }

    public Double getCapitalIncome() {
        return capitalIncome;
    }

    public void setCapitalIncome(Double capitalIncome) {
        this.capitalIncome = capitalIncome;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    public Double getEducationSpending() {
        return educationSpending;
    }

    public void setEducationSpending(Double educationSpending) {
        this.educationSpending = educationSpending;
    }

    public double salaryTax(){
        double monthlySalary = salaryIncome / 12;
        if (monthlySalary >= 5000.00){
            return salaryIncome * 0.2;
        }else if (monthlySalary >= 3000.00 && monthlySalary < 5000.00){
            return salaryIncome * 0.1;
        }else{
            return 0.00;
        }
    }
    public double servicesTax(){
        return serviceIncome * 0.15;
    }
    public double capitalTax(){
        return capitalIncome * 0.20;
    }
    public double grossTax(){
        return servicesTax() + capitalTax()  + salaryTax();
    }
    public double taxRebate(){
        if ((healthSpending + educationSpending) > (grossTax()*0.30)){
            return grossTax() * 0.30;
        }else{
            return healthSpending + educationSpending;
        }
    }
    public double netTax(){
        return grossTax() - taxRebate();
    }
    public String toString(){
        return "Imposto bruto total:  "
                + String.format("%.2f%n", grossTax())
                + "Abatimento: "
                + String.format("%.2f%n", taxRebate())
                + "Imposto devido: "
                + String.format("%.2f%n", netTax());
    }



}
