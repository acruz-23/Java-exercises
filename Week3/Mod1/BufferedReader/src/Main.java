import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("employee.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String employee;
            while ((employee = bufferedReader.readLine()) != null){
                System.out.println(employee);
                int index = employee.indexOf("|");
                int nextIndex = employee.indexOf("|", index + 1);
                int id = Integer.parseInt(employee.substring(0, index));
                String name = employee.substring(index + 1, nextIndex);
                index = nextIndex;
                nextIndex = employee.indexOf("|", index + 1);
                float hours = Float.parseFloat(employee.substring(index+1, nextIndex));
                float rate = Float.parseFloat(employee.substring(nextIndex + 1));
                Employee profile = new Employee(id, hours, rate, name);
                profile.displayEmployee();

            }
            bufferedReader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}