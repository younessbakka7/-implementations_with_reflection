# -implementations_with_reflection

<img width="1282" height="351" alt="image" src="https://github.com/user-attachments/assets/41a1c6b3-7b32-48f7-922a-e35ca129f2de" />

**Description :**  
Cette capture montre l’exécution de l’application avec succès. Le conteneur instancie les classes `DaoImpl` et `MetierImpl` grâce à la réflexion Java. Ensuite, la couche DAO récupère la valeur `100.0`, puis la couche métier effectue le calcul en multipliant cette valeur par 2. Le résultat final affiché est `200.0`.

<img width="1278" height="279" alt="image" src="https://github.com/user-attachments/assets/cb7ab471-0212-4b18-ba79-9ca639b365c7" />

**Description :**  
Cette capture montre l’exécution de l’application avec la deuxième implémentation DAO, `DaoImpl2`. Grâce à la réflexion Java, le conteneur instancie automatiquement les classes `DaoImpl2` et `MetierImpl`. La couche DAO retourne la valeur `150.0`, puis la couche métier effectue le calcul en multipliant cette valeur par 2. Le résultat final affiché est `300.0`.
