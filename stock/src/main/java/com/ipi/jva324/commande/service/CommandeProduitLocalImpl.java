package com.ipi.jva324.commande.service;

import com.ipi.jva324.stock.model.ProduitEnStock;
import com.ipi.jva324.stock.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class CommandeProduitLocalImpl implements CommandeProduitService{

    @Autowired
    private ProduitService ProduitService;

    @Override
    public ProduitEnStock getProduit(Long id) {
        return ProduitService.getProduit(id);
    }
}
