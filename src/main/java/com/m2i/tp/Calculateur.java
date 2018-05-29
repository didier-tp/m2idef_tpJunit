package com.m2i.tp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculateur {
	private static Logger logger = LoggerFactory.getLogger(Calculateur.class);
	
	public 	double tva(double ht, double tauxTvaEnPct){
		logger.trace("tva() appele sur Calculateur avec ht=" + ht + ", taux = " + tauxTvaEnPct);
		return ht * tauxTvaEnPct / 100;
		}
	
	public 	double ttc(double ht, double tauxTvaEnPct){
		return ht * (1+ tauxTvaEnPct / 100);
	}
}
