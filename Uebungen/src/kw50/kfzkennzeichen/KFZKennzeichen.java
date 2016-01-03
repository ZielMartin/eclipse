package kw50.kfzkennzeichen;

import java.util.HashMap;
import java.util.Map.Entry;

public class KFZKennzeichen {
	HashMap<String, String> kennzeichen;									//HashMap, welche NUR mit 2 String gefüllt werden kann

	public String sucheLandkreis(String kfzKürzel) {						//Methode, die den Eintrag unter dem übergebenen Key zurückgibt
			return kennzeichen.get(kfzKürzel);
	}

	public String sucheKürzel(String landkreis) {							//Methode, die den zuletzt hinzugefügten Key, welcher den übergebenen Eintrag besitzt, zurückgibt
		for (Entry<String, String> entry : kennzeichen.entrySet()) {
			if (entry.getValue().equals(landkreis)) {
				return entry.getKey();
			}
		}
		return null;
	}

	public void print() {	//Methode um alle Schlüssel-Eintrag Kombinationen in der Map auszugeben
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
	 * @param kürzel
	 * @param kreis
	 */
	public void addLandkreis(String kürzel, String kreis){					//Methode um einen neuen Eintrag mit übergebenem Schlüssel & Eintrag hinzuzufügen
		kennzeichen.put(kürzel, kreis);
	}
	
	public void delLandkreis(String kürzel){								//Methode um den übergebenen Schlüssel und den dazugehörigen Eintrag aus der Map zu löschen
		kennzeichen.remove(kürzel);
	}
	
	public void delLandkreis(String kürzel, String landkreis){				//Lösch-Methode überladen, hier wird nur gelöscht, wenn sichergestellt ist, dass kürzel und landkreis zusammengehören
		kennzeichen.remove(kürzel, landkreis);
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
