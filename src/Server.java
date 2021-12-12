import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();
        java.rmi.registry.LocateRegistry.createRegistry(1250);
        Naming.rebind("rmi://127.0.0.1:1250/server", server);
         }
    
    
    
    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    
    
    public Character min(String s) {
        char min = 'z';
        for (int i = 0; i < s.length(); i++) 
            if (s.charAt(i) <= min)
                min = s.charAt(i);
                return min;
    }

    
    
    public String caseChanger(String s) {
        StringBuilder chaine = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                char res = (char) (s.charAt(i) + 32);
                chaine.append(res);
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                char res = (char) (s.charAt(i) - 32);
                chaine.append(res);
            } else {
                chaine.append(s.charAt(i));
            }
        }
        return chaine.toString();
    }
}
