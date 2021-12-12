import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {
   String reverse(String s) throws RemoteException;
   Character min(String s) throws RemoteException;
   String caseChanger(String s) throws RemoteException;

}
