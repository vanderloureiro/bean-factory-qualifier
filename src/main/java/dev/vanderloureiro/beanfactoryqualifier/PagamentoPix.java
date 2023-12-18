package dev.vanderloureiro.beanfactoryqualifier;

public class PagamentoPix implements Pagamento {

    @Override
    public void debitar() {
        System.out.println("Pagamento por Pix");
    }
}
