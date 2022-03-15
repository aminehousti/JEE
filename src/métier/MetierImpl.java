package métier;

import dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao;  //couplage faible

    @Override
    public double calcul() {
        double temp=dao.getData();
        double res=temp*540/Math.cos(temp*Math.PI);
        return res;
    }

    /* Injecter dans la varibale dao un object de la classe
    qui implemente l interface Idao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
