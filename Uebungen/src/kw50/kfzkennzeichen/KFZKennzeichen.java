package kw50.kfzkennzeichen;

import java.util.HashMap;
import java.util.Map.Entry;

public class KFZKennzeichen {
	HashMap<String, String> kennzeichen;									//HashMap, welche NUR mit 2 String gef�llt werden kann

	public String sucheLandkreis(String kfzK�rzel) {						//Methode, die den Eintrag unter dem �bergebenen Key zur�ckgibt
			return kennzeichen.get(kfzK�rzel);
	}

	public String sucheK�rzel(String landkreis) {							//Methode, die den zuletzt hinzugef�gten Key, welcher den �bergebenen Eintrag besitzt, zur�ckgibt
		for (Entry<String, String> entry : kennzeichen.entrySet()) {
			if (entry.getValue().equals(landkreis)) {
				return entry.getKey();
			}
		}
		return null;
	}

	public void print() {	//Methode um alle Schl�ssel-Eintrag Kombinationen in der Map auszugeben
//		for(String key: kennzeichen.keySet()){
//			System.out.println(kennzeichen.get(key));
//		}
		
		for (Entry<String, String> entry : kennzeichen.entrySet()) {
			System.out.println(entry);
//			Optionale Darstellung
//			System.out.println("Kennzeichen:\t" + entry.getKey() + "\t\tLandkreis:\t" + entry.getValue());
		}
	}
	/**
	 * Kommentarbeispiel
	 * @param k�rzel
	 * @param kreis
	 */
	public void addLandkreis(String k�rzel, String kreis){					//Methode um einen neuen Eintrag mit �bergebenem Schl�ssel & Eintrag hinzuzuf�gen
		kennzeichen.put(k�rzel, kreis);
	}
	
	public void delLandkreis(String k�rzel){								//Methode um den �bergebenen Schl�ssel und den dazugeh�rigen Eintrag aus der Map zu l�schen
		kennzeichen.remove(k�rzel);
	}
	
	public void delLandkreis(String k�rzel, String landkreis){				//L�sch-Methode �berladen, hier wird nur gel�scht, wenn sichergestellt ist, dass k�rzel und landkreis zusammengeh�ren
		kennzeichen.remove(k�rzel, landkreis);
	}

	public static void main(String[] args) {
		KFZKennzeichen a = new KFZKennzeichen();
		a.kennzeichen = new HashMap();
		a.addLandkreis("MI", "Minden");
		a.addLandkreis("MI", "Minden2");
		a.addLandkreis("SHG", "Schaumburg");
		a.addLandkreis("LIP", "Lippe");
		a.print();
		System.out.println();
		a.delLandkreis("LIP", "Lippe");
		a.print();
	}
}
