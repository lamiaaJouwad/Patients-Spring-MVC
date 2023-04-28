<h1>Spring MVC avec Thymeleaf & Spring Security </h1>
<h4>Une application Web JEE basée sur Spring MVC, Thylemeaf et Spring Data JPA qui permet de gérer les patients.
</h4>

<ul>
<h3> Les tâches : </h3>
<li> Afficher les patients </li>
<li> Faire la pagination</li>
<li> Chercher les patients</li>
<li> Supprimer un patient</li>
</ul>

<img src="Captures/capture1.png" width="250" height="300">
<h4>2. Création de l'entité JPA Patient ayant les attributs :</h4>
<ul>
<li> id de type Long</li>
<li> nom de type String</li>
<li> dateNaissance de type Date</li>
<li> malade de type boolean</li>
<li> score de type int</li></ul>

<h4> Entity : Patient</h4>
<img src="Captures/capture2.png" width="300" height="190">
<h4>PatientController.java</h4></p>
<img src="Captures/controller1.png" height="300" width="300">

<img src="Captures/controller2.png" width="300" height="300">

<img src="Captures/controller3.png" width="300" height="300">
<h4>SecurityConfig.java</h4></p>
<img src="Captures/securityconfig1.png" width="300" height="150">
<img src="Captures/securityconfig2.png" width="300" height="150">

<h4> La page Home ( Utilisateur normal )  </h4>
<img src="Captures/capture_user.png">
<h4> La page Home ( Admin ) </h4>
<img src="Captures/capture_admin.png">


