package dev.vanderloureiro.beanfactoryqualifier;

public class PagamentoCartao implements Pagamento {

    @Override
    public void debitar() {
        System.out.println("Pagamento por Cartão");
    }
}
