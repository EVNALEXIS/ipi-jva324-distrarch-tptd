package com.ipi.jva324.commande.service;

import com.ipi.jva324.stock.model.ProduitEnStock;
import com.ipi.jva324.stock.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

@Component
public class CommandeProduitServiceRESTHALImpl implements CommandeProduitService {

    @Autowired
    @Qualifier("springDataRestTemplate")
    private RestTemplate springDataRestTemplate;

    @Autowired
    private ProduitService ProduitService;

    /**
     * URL serveur : (configurée dans application.properties, sinon valeur par défaut)
     */
    @Value("${stockapiserver.url:http://localhost:8080/}")
    private String url;


    @Override
    public ProduitEnStock getProduit(Long id) {
        String fullUrl = url + "api/data-rest/produitEnStocks/" + id;
        return springDataRestTemplate.getForObject(fullUrl, ProduitEnStock.class);
    }

}
