## Java-Dependency-Injection

### Type d'archeticture
	1- architecture monolithique : develope l'application en un seul bloc
	2- architecture micro-service : decouper le probleme en plusieurs peties modules	

### Inversion de controle 
permettre au développeur de se concentrer sur le code métier alors que le framework qui va s'occupe des codes techniques


application fermée à la modification est ouvert à l'extension

### Couplage faible & couplage fort

#### I- Couplage fort : 
- Ouvert à la modification
- la class Metier depends la class Doa (relation entre deux classes)
- la class metier ne peut rien faire s'il n'ya pas de class Dao
- Oblige de modifier le code source pour l'evolution
<img src="https://github.com/Mo-bar/Java-Dependency-Injection/assets/98557431/dbfdfcdd-02b9-493d-9471-d9ef644447e4">
<img src="https://github.com/Mo-bar/Java-Dependency-Injection/assets/98557431/2e26712e-4280-4161-9b9e-ae5f07fc732d">

#### I- Couplage faible : 
- Ouvert à la l'extension
- la class Metier depends l'interface Doa (relation entre class et interface)
- la class metier fonctionne avec n'importe quelle class qui impliment l'interface Dao 
- pas oblige de modifier le code source pour l'evolution
