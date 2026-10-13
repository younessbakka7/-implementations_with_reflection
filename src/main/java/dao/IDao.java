
package dao;

/**
 * Interface de persistance.
 * Définit le contrat pour récupérer une valeur numérique.
 */
public interface IDao {

    /**
     * Récupère une valeur depuis la source de données.
     * @return La valeur récupérée.
     */
    double getValue();
}
