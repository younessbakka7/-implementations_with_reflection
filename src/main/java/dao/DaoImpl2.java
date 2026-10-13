package dao;

public class DaoImpl2 implements IDao {

    @Override
    public double getValue() {
        System.out.println("DAO 2 : Récupération de la valeur");
        return 150.0;
    }
}