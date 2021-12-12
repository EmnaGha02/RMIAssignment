import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        try {
           MyInterface service = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            Scanner input = new Scanner(System.in);
            
            System.out.println("Donner la premier chaine de caractére à inverser ");
            String s = input.nextLine();
            System.out.println(service.reverse(s));
            
            System.out.println("Donner la deuxieme chaine de caractére : ");
            s= input.nextLine();
            System.out.println(service.caseChanger(s));
            
            System.out.println("Donner la troisieme chaine de caractére: ");
            s= input.nextLine();
            System.out.println(service.min(s));
            
            obj.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
