package net.catalogue.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.catalogue.dao.CatalogueDAO;
import net.catalogue.form.Apparel;

@Service
public class CatalogueServiceImpl implements CatalogueService {
	
	private CatalogueDAO catalogueDAO;

	public void setCatalogueDAO(CatalogueDAO catalogueDAO) {
		this.catalogueDAO = catalogueDAO;
	}

	@Override
	@Transactional
	public void addApparel(Apparel a) {
		this.catalogueDAO.addApparel(a);
	}

	@Override
	@Transactional
	public void updateApparel(Apparel a) {
		this.catalogueDAO.updateApparel(a);
	}

	@Override
	@Transactional
	public List<Apparel> listApparels() {
		return this.catalogueDAO.listApparels();
	}

	@Override
	@Transactional
	public Apparel getApparelById(int id) {
		return this.catalogueDAO.getApparelById(id);
	}

	@Override
	@Transactional
	public void removeApparel(int id) {
		this.catalogueDAO.removeApparel(id);
	}

}
