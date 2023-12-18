package dev.vanderloureiro.beanfactoryqualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("BOLETO")
public class PagamentoBoleto implements Pagamento {

    @Override
    public void debitar() {
        System.out.println("Pagamento por Boleto");
    }
}
