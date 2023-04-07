package dio.strategy;

import dio.singleton.SingletonEager;
import dio.singleton.SingletonLazy;
import dio.singleton.SingletonLazyHolder;

public class Test {

    public static void main(String[] args) {

        // Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
    }
}
