# Les Design Patterns
---

 ### **Equipe et Rôles** : 
- Elisée **LEYDIER** (Animateur)
- Ethan **TESTA** (Gestionnaire de temps)
- Lucas **MURATET** (Animateur)
- Aurélien **MATTERA** (Scribe)
- Mathieu **YAHIA-AMAR** (Secrétaire)
- Paul **BIGA** 
---

### Introduction

Un Design Pattern, ou aussi appelé Patron de conception, est un arrangement de caractéristique de modules, reconnu comme bonnes pratique en réponse à un problème de conception d'un logiciel.

---

## Sommaire

- [ 1.Le Design Pattern : Décorateur](#deco)  
  - 1.1 Définition  
  - 1.2 Cas d'utilisation  
  - 1.3 Exemple  
- [2. Le Modèle-Vue-Contrôleur](#mvc)  
  - 2.1 Définition  
  - 2.2 Cas d'utilisation  
  - 2.3 Exemple  
- [3. Sources](#sources)  

---

## <a id="deco" /> Le Design Pattern : Décorateur 


### Définition
Le Décorateur appartient à la famille des design patterns structurels.

L’avantage du Design Pattern Décorateur est qu’il permet d'ajouter (et de supprimer) facilement des nouvelles fonctionnalités qu’on souhaite intégrer à une classe, et tout ça de façon dynamique sans impacter les classes qui l’utilisent ou en héritent.

Ce pattern apporte plus de souplesse que l’héritage.

### Cas d'utilisation  

### Exemple  

---

## <a id="mvc" /> Le Modèle-Vue-Contrôleur

### Définition
Le pattern MVC (Modèle-Vue-Contrôleur) permet d’organiser de façon efficace son code source. Il aide à définir leur rôle et s’organiser. L'intérêt est de détacher le code en trois parties dans 3 fichiers distincts.

Les 3 parties du MVC sont :

Le **Modèle** :  
Le modèle est l’élément qui contient les données ainsi que de la logique en rapport avec les données. Il permet de contenir des informations sous différentes formes (SQL…). La logique permet par exemple de sécuriser une mise à jour d’une valeur (condition…).

La **Vue** :  
La vue contient des éléments visuels provenant du modèle (est peut être un diagramme, un formulaire, des boutons, etc. Elle peut également mettre à jour le modèle en envoyant des requêtes appropriées. Par exemple, une application web avec une vue possédant des balises HTML.

Le **Contrôleur** :  
Le contrôleur permet de traiter les actions de l'utilisateur qui modifient les données du modèle et de la vue.

### Cas d'utilisation  
Le MVC est souvent utilisé dans des frameworks comme par exemple : 
AngularJs (framework pour applications web développé par Google) ou bien Grails (basé sur le langage Groovy, est un framework pour les applications web).

### Exemple  

---
 
## <a id="sources" /> Sources  
MVC:  
[Modèle-vue-contrôleur — Wikipédia](https://fr.wikipedia.org/wiki/Mod%C3%A8le-vue-contr%C3%B4leur)  
[Découvrez comment fonctionne une architecture MVC](https://openclassrooms.com/fr/courses/4670706-adoptez-une-architecture-mvc-en-php/7847928-decouvrez-comment-fonctionne-une-architecture-mvc)  

Decorateur:  
[Décorateur (patron de conception) — Wikipédia](https://fr.wikipedia.org/wiki/D%C3%A9corateur_(patron_de_conception))  
[Le design pattern Decorator (Décorateur) | Le blog de Cellenza](https://blog.cellenza.com/developpement-specifique/le-design-pattern-decorator-decorateur/)  

