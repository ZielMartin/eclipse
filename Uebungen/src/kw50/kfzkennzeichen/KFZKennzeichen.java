package kw50.kfzkennzeichen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public class KFZKennzeichen {
	HashMap<String, String> kennzeichen;

	public String sucheLandkreis(String kfzK�rzel) {
		try {
			return (String) kennzeichen.get(kfzK�rzel);
		} catch (ClassCastException e) {
			System.out.println("Fehler in der Hashmap");
			return "Error";
		}
	}

	public String sucheK�rzel(String landkreis) {
		
		for (Map.Entry<String, String> entry : kennzeichen.entrySet())
		{
			if(entry.getValue().equals(landkreis)){
				return entry.getKey();
			}
		}
		return null;
	}

	public static void main(String[] args) {
		KFZKennzeichen a = new KFZKennzeichen();
		a.kennzeichen = new HashMap();
		a.kennzeichen.put("MI", "Minden");
		a.kennzeichen.put("MI2", "Minden2");
		System.out.println(a.sucheLandkreis("MI"));
		System.out.println(a.sucheK�rzel("Minden2"));
	}
}
