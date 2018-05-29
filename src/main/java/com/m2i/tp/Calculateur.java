package com.m2i.tp;

public class Calculateur {
	public 	double tva(double ht, double tauxTvaEnPct){
		return ht * tauxTvaEnPct / 100;
		}
	
	public 	double ttc(double ht, double tauxTvaEnPct){
		return ht * (1+ tauxTvaEnPct / 100);
	}
}
