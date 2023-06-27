## Java-Dependency-Injection

### Type d'archeticture
	1- architecture monolithique : develope l'application en un seul bloc
	2- architecture micro-service : decouper le probleme en plusieurs peties modules	

### Inversion de controle 
permettre au développeur de se concentrer sur le code métier alors que le framework qui va s'occupe des codes techniques


application fermée à la modification est ouvert à l'extension

### Couplage faible & couplage fort

#### I- Couplage fort : Ouvert à la modification  
<img src="https://github.com/Mo-bar/Java-Dependency-Injection/tree/main/ressources/Couplage_fort_V1.jpg">
<img src="https://github.com/Mo-bar/Java-Dependency-Injection/tree/main/ressources/Couplage_fort_V2.jpg">


la class metier ne peut rien faire s'il n'ya pas de class Dao 
