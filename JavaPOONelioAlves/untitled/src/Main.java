import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ler quantos funcionarios serao cadastrados.
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees will be registered? ");
        int N = sc.nextInt();

        // Adicionar os funcionarios numa lista.
        List<Employee> Employees = new ArrayList<>();
        for(int i = 1; i <= N; i++){
            System.out.println("Employee #"+i +":");
            System.out.println("Id: ");
            int id = sc.nextInt();
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary: ");
            float salary = sc.nextFloat();

            Employees.add(new Employee(id, name, salary));
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int idF = sc.nextInt();
        int cont = 0;
        for(Employee emp : Employees){
            if(emp.getId() == idF){
                System.out.println("Enter the percentage: ");
                emp.setSalary(emp.getSalary()*(1 +(sc.nextFloat()/100)));
                cont = 1;
                break;
            } 
        }
        if(cont == 0){
            System.out.println("This id does not exist!");
        }
        System.out.println(Employees);
    }
}
