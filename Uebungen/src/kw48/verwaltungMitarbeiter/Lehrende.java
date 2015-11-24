package kw48.verwaltungMitarbeiter;

public interface Lehrende {
	public static final double TIMERATE = 10.5;
	public static final double FACTOR = 4.28;
	
	public boolean haveToPayTaxes();
	public double getNetto();
	public String[] teaches();
	
}
