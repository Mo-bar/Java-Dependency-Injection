
#  <p align="center"> Java Dependency Injection</p>
- [Les Types d'architecture](#1)  
- [Inversion de controle](#2)  
- [Couplage faible & couplage fort](#3)   
- [Couplage fort](#3.1)   
- [Couplage faible](#3.2)   
- [Exigences d'un projet informatique](#4)   

### <a name="1"></a> _Les Types d'architecture_ :
- **architecture monolithique :** developer l'application `en un seul bloc`
- **architecture micro-service** : decouper le probleme en plusieurs `peties modules	`

### <a name="2"></a> Inversion de controle :
- permettre au développeur de se concentrer sur le `code métier`, alors que le framework qui va s'occupe des `codes techniques`

### <a name="3"></a> Couplage faible & couplage fort :
- ### <a name="3.1"></a> Couplage fort
  - Ouvert à la modification, fermee à l’extension.
  - la class `Metier` depends la class `Doa` (relation entre deux classes).
  - la class `metier` ne peut rien faire s'il n'ya pas de class `Dao`.
  - Oblige de modifier le code source pour l'evolution.

  <img src="https://github.com/Mo-bar/Java-Dependency-Injection/assets/98557431/46360feb-8411-460c-b327-b475995c8f7f">
  <img src="https://github.com/Mo-bar/Java-Dependency-Injection/assets/98557431/0aadb6c4-7208-4c81-a8dc-bb7db7e3a7ad">

- ### <a name="3.2"></a> Couplage faible : 
  - Ferme à la `modification`, Ouvert à `l'extension`
  - La classe `Métier` dépend de l'interface `Doa` (relation entre classe et interface)
  - la class `Métier` fonctionne avec n'importe quelle class qui implement l'interface `Dao` 
  - Pas besoin de modifier le code source pour `évoluer` du projet
  <img src="https://github.com/Mo-bar/Java-Dependency-Injection/assets/98557431/48b33069-1d3e-4025-bd23-387f5c4ca21e">
  
  - ##### Couche `IDao` : 
    - Fermee à  la modification; l'interface IDao be depend d'aucune autre class.
    - Ouvert à  l'extension; IDao est une interface.
  
  - ##### Couche `IMetier` : 
    - Ferme à la modification; la couche `IMetier` ne depends pas des classes, depends interface
    - Ouvert à l'extension; `IMetier` est une interface alors on peut cree un autre implentations.

  - ##### Couche `Presentation` :
    - On utilise `l'instanciation dynamique` pour eviter le couplage fort

#### <a name="4"></a> Exigences d'un projet informatique
- #### Exigences fonctionnelles
  - Satisfaire les besions fonctionnels (metiers) de l'entreprise.
- #### Exigences techniques
  - Performances : l'application doit etre performante (le temps de reponse)
  - Probleme de montee en charge : 
      - Scalabilite verticale : Augmenter la capacite de serveur(CPU, MEMOIRE, DD ) , Démarrage de l'application en une seul instance.
      - Scalabilite Horizontale : Demarrage l'application en plusieurs instances des diffrentes machines.

  
  
