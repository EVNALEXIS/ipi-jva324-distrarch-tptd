package com.ipi.jva324.stock;

import com.ipi.jva324.Jva324Application;
import com.ipi.jva324.commande.service.CommandeProduitServiceRESTHALImpl;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class) // Junit 4 : @RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(Jva324Application.class)
public class CommandeProduitServiceRestHalImplIntegrationTest {

    @Autowired
    private CommandeProduitServiceRESTHALImpl commandeProduitServiceRESTHALImpl;

}
