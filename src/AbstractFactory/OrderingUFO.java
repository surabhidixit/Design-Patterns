package AbstractFactory;

import Ship.EnemyShip;

/**
 * Created by surabhi on 12/6/16.
 */
public abstract class OrderingUFO {
    public abstract EnemyShip makeEnemyShip(String type);
    public EnemyShip orderShip(String type){
        EnemyShip theEnemyShip= makeEnemyShip(type);
        theEnemyShip.
    }
}
