package net.catalogue.service;

import java.util.List;

import net.catalogue.form.Apparel;

public interface CatalogueService {

	public void addApparel(Apparel a);
	public void updateApparel(Apparel a);
	public List<Apparel> listApparels();
	public Apparel getApparelById(int id);
	public void removeApparel(int id);
	
}