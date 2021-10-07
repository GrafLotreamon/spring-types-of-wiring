package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {


    private Egg6 eqq6;


    @Autowired
    public void setDuck5(Egg6 eqq6) {
        this.eqq6 = eqq6;
    }

    @Override
    public String toString() {
        return ", в утке яйцо " + eqq6.toString();
    }
}
