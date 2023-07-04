#  <p align="center"> Java Dependency Injection</p>

### [1 Inversion de controle](#1)   

### <a name="1"></a> 1. Inversion de controle
1.  ###  Les Types d'architecture
- architecture monolithique : developper l'application en un seul bloc
- architecture micro-service : decouper le probleme en plusieurs peties modules	

1. [ ] ### Inversion de controle 
permettre au développeur de se concentrer sur le code métier, alors que le framework qui va s'occupe des codes techniques


application fermée à la modification est ouvert à l'extension

1. [ ] ### Couplage faible & couplage fort

#### <a name="cf"></a> Couplage fort
- Ouvert à la modification
- la class Metier depends la class Doa (relation entre deux classes)
- la class metier ne peut rien faire s'il n'ya pas de class Dao
- Oblige de modifier le code source pour l'evolution
<img src="https://github.com/Mo-bar/Java-Dependency-Injection/assets/98557431/46360feb-8411-460c-b327-b475995c8f7f">
<img src="https://github.com/Mo-bar/Java-Dependency-Injection/assets/98557431/0aadb6c4-7208-4c81-a8dc-bb7db7e3a7ad">

#### II Couplage faible : 
- Ferme a la modification 
- Ouvert à la l'extension
- la class Metier depends l'interface Doa (relation entre class et interface)
- la class metier fonctionne avec n'importe quelle class qui impliment l'interface Dao 
- pas oblige de modifier le code source pour l'evolution
<img src="https://github.com/Mo-bar/Java-Dependency-Injection/assets/98557431/48b33069-1d3e-4025-bd23-387f5c4ca21e">

## <a name="about"></a> 📎 About :

##### Couche IDao : 
- Fermee à  la modification; l'interface IDao be depend d'aucune autre class.
- Ouvert à  l'extension; IDao est une interface.
  
##### Couche IMetier : 
- Ferme à la modification; la couche IMetier ne depends pas des classes, depends interface
- Ouvert à l'extension; IMetier est une interface alors on peut cree un autre implentations.

##### Couche Presentation :
- On utilise l'instanciation dynamique pour eviter le couplage fort

##### Exigences d'un projet informatique
###### Exigences fonctionnelles
- Satisfaire les besions fonctionnels (metiers) de l'entreprise.
###### Exigences techniques
- Performances : l'application doit etre performante (le temps de reponse)
- Probleme de montee en charge : 
    - Scalabilite verticale : Augmenter la capacite de serveur(CPU, MEMOIRE, DD ) , Démarrage de l'application en une seul instance.
    - Scalabilite Horizontale : Demarrage l'application en plusieurs instances des diffrentes machines.

  
  
