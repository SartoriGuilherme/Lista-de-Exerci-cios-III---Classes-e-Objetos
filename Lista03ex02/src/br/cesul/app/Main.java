package br.cesul.app;

import br.cesul.shape.Eleicao;

public class Main {
    public static void main(String[] args) {
        Eleicao eleicao = new Eleicao(120,50, 6, 7);
        System.out.println(eleicao.votacaoApurada());
    }
}
