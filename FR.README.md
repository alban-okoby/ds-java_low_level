# De zéro à héro en Java 🚀

## Pourquoi apprendre Java ?
Apprenez Java car :
- [x] Il est simple
- [x] Il est indépendant de la plate-forme
- [x] Il est sécurisé
- [x] Il est multi-threadé
- [x] Il est neutre en termes d'architecture
- [x] Il est portable
- [x] Il est orienté objet
- [x] Il est distribué
- [x] Il offre de hautes performances
- [x] Il est robuste

## Prérequis
Pour exécuter tous les fichiers, vous devez :
### 1- Installer votre IDE préféré
comme IntelliJ, Visual Studio Code ou un autre de votre choix. <br>
[Télécharger Visual Studio Code](https://code.visualstudio.com/download) <br>
[Télécharger IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=mac)

### 2- Installer Java 8 ou une version supérieure
[Télécharger Java](https://www.oracle.com/java/technologies/downloads/)

## Utilisation

Téléchargez le projet. 
[ICI](https://github.com/alban-okoby/ds-java_low_level)
Après l'avoir extrait, ouvrez votre éditeur


## Chapitres
### Chapitre 1 : Les bases de Java ☕
### [00-hello_world](https://github.com/alban-okoby/ds-java_low_level/tree/main/00-hello_world/src)
Écrivez votre premier programme en Java ☕.
```java
public class HelloWorldApplication {
    public static void main(String[] args) {
        System.out.println("Hello World! Bravo, votre premier programme fonctionne ✅🚀");
    }
}
```

### 01-java_basics
Types de données et variables

```
public class BasicDataTypes {
  public static void main(String[] args) {

      // Exemple et explication des bases de Java et des littéraux 👇👇
      /**
       * @byte
       * Un octet est une unité de stockage de données
       * qui représente généralement 8 bits. C'est l'unité fondamentale
       * de stockage dans les systèmes informatiques, et il peut contenir une plage
       * de valeurs de 0 à 255 (non signé) ou de -128 à 127 (signé).
       */
      // Par exemple
      byte a = 68; // déclare une variable "a" de type "byte" qui stocke 68.
      System.out.println(a); // 68

      /**
       * @char Il s'agit d'un type de données utilisé pour représenter un seul caractère dans
       * un ensemble de caractères tels que des lettres, des chiffres, des symboles ou des espaces blancs.
       */
      // Par exemple,
      // déclare une variable "b" de type "char" qui stocke 'B'
      char b = 'B';
      char myUnicode = '\u0001'; // déclare une variable "myUnicode" de type "char" qui stocke '\u0001'
      // AFFICHER LE RÉSULTAT DANS LA CONSOLE
      System.out.println(b); // B
      System.out.println(myUnicode); // \u0001


      /**
       * "boolean" est un type de données qui représente une valeur logique. Il est utilisé pour indiquer si une condition
       * est vraie ou fausse. En Java, le type de données "boolean" est un type primitif qui peut avoir une
       * de deux valeurs : vrai ou faux.
       */
      // Par exemple, déclare une variable "c" de type "boolean" qui stocke "true"
      boolean javaIsStrong = true;
      System.out.println(javaIsStrong); // true


      /**
       * "byte" est un type de données utilisé pour représenter des valeurs entières qui nécessitent une plage plus petite que ce qui peut être
       * accommodé par le type de données "int". En Java, le type de données "byte" est un entier signé de 8 bits.
       *
       * La plage de valeurs pouvant être représentées par une variable "byte" en Java est d'environ
       * de -128 à 127. Cette plage est plus étroite par rapport au type de données "int", qui permet
       * "byte" de stocker des valeurs entières plus petites.
       */
      // Par exemple, déclare une variable "number0" de type "byte" qui stocke "5"
      byte number0 = 5; //
      System.out.println(number0); // 5


      /**
       * "short" est un type de données utilisé pour représenter des valeurs entières qui nécessitent une plage plus petite que ce qui peut être
       * accommodé par le type de données "int". En Java, le type de données "short" est un entier signé de 16 bits.
       *
       * La plage de valeurs pouvant être représentées par une variable "short" en Java est d'environ
       * de -32,768 à 32,767. Cette plage est plus étroite par rapport au type de données "int", qui permet
       * "short" de stocker des valeurs entières plus petites.
       */
      // Par exemple, déclare une variable "number0" de type "short" qui stocke "5"
      short myShortNumber = 5; //
      System.out.println(myShortNumber); // 5


      /**
       * Le type de données "int" est couramment utilisé pour représenter et effectuer des calculs avec des nombres entiers.
       * La plage de valeurs pouvant être représentées par une variable "int" en Java est d'environ
       * de -2,147,483,648 à 2,147,483,647. Cette plage est déterminée par la taille du type de données,
       * qui est de 32 bits ou 4 octets.
       */
      // Par exemple
      int number1 = 14; // déclare une variable "number1" de type "int" qui stocke "14"
      int octal = 0144; // déclare une variable "octal" de type "int" qui stocke "0144"
      int hex = 0x64; // déclare une variable "hex" de type "int" qui stocke "0x64"
      // AFFICHER LE RÉSULTAT DANS LA CONSOLE
      System.out.println(octal); // 100
      System.out.println(hex); // 100


      /**
       * Le "long" est un type de données utilisé pour représenter des valeurs entières qui nécessitent une plage plus grande que ce qui peut être
       * accommodé par le type de données "int". En Java, le type de données "long" est un entier signé de 64 bits.
       *
       * La plage de valeurs pouvant être représentées par une variable "long" en Java est d'environ
       * de -9,223,372,036,854,775,808 à 9,223,372,036,854,775,807. Cette plage élargie permet à "long" de stocker
       * des valeurs entières plus grandes par rapport au type de données "int".
       */
      // Par exemple
      long number2 = 1555555555; // déclare une variable "number2" de type "long" qui stocke "15"
      System.out.println(number2); // 1555555555


      /**
       Le type de données "float" est couramment utilisé lorsque vous devez représenter des nombres avec une partie fractionnaire
       en Java est une valeur de 32 bits qui est conforme à la norme à virgule flottante IEEE 754
       */
      // Par exemple
      float myFloat = 8.4f; // déclare une variable "number3" qui a une partie décimale
      System.out.println(myFloat); //


      /**
       * Le type de données "double" est couramment utilisé lorsque vous devez représenter des nombres avec une partie fractionnaire
       * en Java est une valeur de 64 bits qui est conforme à la norme à virgule flottante IEEE 754
       */
      // Par exemple
      double cote = 8.44444; // déclare une variable "number3" qui a une partie décimale
      System.out.println(cote); // 8.44444


      /**
       * "String" est un type de données utilisé pour représenter une séquence de caractères.
       * En Java, la classe "String" est fournie en tant que classe intégrée pour manipuler des données textuelles.
       */
      // Par exemple
      String anotherUnicode = "\u0001"; // déclare une variable "anotherUnicode" de type "string" qui stocke "\u0001"
      System.out.println(anotherUnicode); // \u0001
  }


  // TRAVAIL SUPER !, BON CODAGE <\🚀> ..
}
```

## Types de modificateurs (Privilèges d'accès)

En Java, il existe deux types principaux de modificateurs :

### Modificateurs d'accès :

Les modificateurs d'accès déterminent l'accessibilité ou la visibilité des classes, méthodes, variables et constructeurs. Voici les quatre modificateurs d'accès en Java :

- `public` : Le modificateur public permet à la classe, à la méthode ou à la variable d'être accessible depuis n'importe quelle autre classe ou package.
- `private` : Le modificateur private restreint l'accessibilité de la classe, de la méthode ou de la variable uniquement à l'intérieur de la même classe.
- `protected` : Le modificateur protected permet l'accès à l'intérieur de la même classe, des sous-classes et du même package.
- Par défaut (sans modificateur) : Si aucun modificateur d'accès n'est spécifié, il est considéré comme par défaut, permettant l'accès uniquement à l'intérieur du même package.

### Modificateurs de non d'accès :

Les modificateurs de non d'accès fournissent des fonctionnalités ou des propriétés supplémentaires aux classes, méthodes, variables et constructeurs. Voici certains des modificateurs non d'accès couramment utilisés :

- `final` : Le modificateur final indique qu'une classe ne peut pas être étendue, qu'une méthode ne peut pas être remplacée, ou qu'une variable ne peut pas être réassignée.
- `static` : Le modificateur static est utilisé pour définir des membres de classe (variables et méthodes) qui peuvent être accédés sans créer d'instance de la classe.
- `abstract` : Le modificateur abstract est utilisé pour définir des classes et des méthodes abstraites. Une classe abstraite ne peut pas être instanciée, et une méthode abstraite doit être implémentée dans une sous-classe.
- `synchronized` : Le modificateur synchronized est utilisé pour contrôler l'accès aux ressources partagées dans des environnements multi-threads.
- `volatile` : Le modificateur volatile est utilisé pour indiquer que la valeur d'une variable peut être modifiée par plusieurs threads.

Ces modificateurs offrent un contrôle supplémentaire sur le comportement et les propriétés des éléments de programmation en Java.

Voyons quelque exemples de démarrage
```java
  public class MyClass {
      // Faites quelque chose
  }
  
  private class MyPrivateClass {
      // faites quelque chose
      private boolean myBool = true;
  }
  
  protected class MyProtectedClass {
  }

  public static class MyStaticClass {
      private boolean myBool = true; // ✅
              myBool = false; // ❌❌ il n'est pas possible d'accéder à la variable `myBool` directement !
  }
```

## License

Ce projet est sous licence [MIT](https://choosealicense.com/licenses/mit/).

## Happy coding <\🚀> 

Que le code soit avec vous! N'hésitez pas à explorer, apprendre et créer avec passion. Si vous avez des questions, des suggestions ou des idées, n'hésitez pas à les partager. Bonne programmation!

Alban 🐱‍👤



