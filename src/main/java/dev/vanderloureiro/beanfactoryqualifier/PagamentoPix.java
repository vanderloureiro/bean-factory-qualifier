package dev.vanderloureiro.beanfactoryqualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PIX")
public class PagamentoPix implements Pagamento {

    @Override
    public void debitar() {
        System.out.println("Pagamento por Pix");
    }
}
