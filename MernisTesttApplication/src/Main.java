import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		KPSPublicSoapProxy kpsPublic=new KPSPublicSoapProxy();
		boolean result=kpsPublic.TCKimlikNoDogrula(
				Long.parseLong("12345678912"),
						"S�BEL", 
						"KAHYA", 
						1992);
		System.out.println("DO�RULAMA :"+(result? "Ba�ar�l� Giri� " : "Ba�ar�s�z Giri�"));
		

	}

}
