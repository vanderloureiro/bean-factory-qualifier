package dev.vanderloureiro.beanfactoryqualifier;

public class PagamentoBoleto implements Pagamento {

    @Override
    public void debitar() {
        System.out.println("Pagamento por Boleto");
    }
}
