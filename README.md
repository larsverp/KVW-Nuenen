# KVW Nuenen project

Deze repo vertegenwoordigd het IP S3 (Individual Project Semester 3) van Lars van Erp. In deze repo is o.a. de code, het kanban bord en de documentatie te vinden.

# Inhoud

- [Introductie](#introductie)
- [Situaties](#situaties)
    - [Huidige situatie](#huidige-situatie)
        - [Het probleem](#het-probleem)
    - [Gewenste situatie](#gewenste-situatie)
- [MoSCoW model](#moscow-model)
    - [Must](#must)
    - [Should](#should)
    - [Could](#could)
    - [Won't have this time](#wont-have-this-time)
- [C4 Model](#c4-model)
    - [C4 Level 1](#level-1)
    - [C4 Level 2](#level-2)
    - [C4 Level 3](#level-3)

<br>

# Introductie
[KVW Nuenen](https://kvwnuenen.nl/) (Kinder Vakantie Week Nuenen) is een onafhankelijke stichting, die al sinds 1983 ieder jaar in de laatste week van de zomervakantie een leuke week neerzet voor kinderen die vanwege financiële omstandigheden niet op vakantie kunnen. Met deze filosofie is de KVW opgezet en door de jaren zijn wij een begrip geworden in Nuenen. Niet meer alleen meer voor kinderen die niet op vakantie kunnen, maar voor alle kinderen. Echter krijgen kinderen die vanuit [Stichting Leergeld](https://www.leergeld.nl/) worden aangemeld wel voorang.

Sinds 2015 is de KVW onder een nieuwe organisatie + bestuur gekomen. Deze Organisatie bestaat op het moment uit 11 leden in de leeftijdsgroep 20 tot 28. Doordat de organisatie uit jonge leden bestaat, is de KVW de afgelopen jaren erg gemoderniseerd. Zo zijn de inschrijvingen sinds 2018 voledig via een online formulier (voorheen werd dit via mail gedaan.) en wordt sinds 2019 ook de aanwezigheid van de kinderen digitaal bijgehouden.

<br>

# Situaties
In dit hoofdstuk worden de huidige en gewenste situatie beschreven. De gewenste situatie is een situatie waarin alles perfect is, deze kan dus afwijken van de uiteindelijke situatie.

## Huidige situatie
Op het moment wordt er gebruik gemaakt van een website die ik in 2018 ontwikkeld heb. Via deze website kunnen ouders hun kinderen inschrijven en beheren (info aanpassen). Op een andere site kunnen vrijwilligers zich aanmelden en hier hun groepjes bekijken. Ook kunnen vrijwilligers hier kinderen van hun groepjes aan- of afwezig melden.

### Het probleem
Het probleem van de huidige oplossing is de schaalbaarheid en de aanpasbaarheid. Dit systeem heb ik gebouwd met minimale PHP web kennis. Met mijn huidige kennis hoop ik dit systeem te herbouwen in Java met verbeterde en nieuwe functionaliteiten.


## Gewenste situatie
Het nieuwe gewenste systeem bevat veel meer mogelijkheden dan het huidige systeem (Zie [MoSCoW model](#moscow-model)). Ook is het nieuwe systeem veel schaalbaarder. Het maximale aantal kinderen is bijvoorbeeld zelf in te stellen. Ook is het beheren van de gegevens van kinderen en vrijwilligers makkelijk en is hier geen technische kennis voor nodig.

In het oude systeem moesten kinderen via de DB in een groepje geplaatst worden. Dit gaat in de gewenste situatie gewoon via een menu in het nieuwe systeem. Ook zijn problemen zoals het onhandige melden van gevonden spullen of het opzoeken van verloren vrijwilligers shirts verleden tijd.

<br>

# MoSCoW model
In dit hoofdstuk staan de huidige requirements opgesteld in een MoSCoW model. Deze requirements kunnen gedurende het project aangepast worden.

## Must
-	M01 - Eén site van maken. (Bij login kiezen voor ouder of vrijwilliger)
-	M02 - Kinderen afwezig en aanwezig melden als vrijwilliger.
-	M03 - Verjaardagen zien van kinderen.
-	M04 - Vrijwilligers aan groepjes koppelen.
-	M05 - Organisatie leden toevoegen/verwijderen.


## Should
-	S01 - T-shirts bij persoon koppelen.
-	S02 - Centraal emails kunnen sturen.
-	S03 - Per groepje email kunnen sturen.
-	S04 - Standaard email template maken.
-	S05 - Foto’s meteen delen via de site.
-	S06 - Vrijwilligers programma inzien.
-	S07 - Groepslijsten uitprinten voor noodgevallen.
-	S08 - Bijzonderheden lijst online maken.
-	S09 - Betalingen beheren.
-	S10 - Kinderen uitschrijven.
-	S11 - Gevonden voorwerpen + email verzenden.
-	S12 - Mobiel vriendelijke website.


## Could
-	C01 - Naar kinderen van bepaalde leeftijd emails sturen.
-	C02 - App maken in flutter.
-	C03 - Programma maken via de site.
-	C04 - Bijzonderheden lijst uit kunnen printen.
-	C05 - Spelopbouw lijsten digitaal en kunnen uitprinten.
-	C06 - Contact met organisatieleden hebben.
-	C07 - Kosten declareren aan de penningmeester.
-	C08 - Email over shirts sturen.


## Won't have this time
-	W01 - Automatisch een draaiboek bouwen.
-	W02 - Automatiche mail voor kosten verloren T-shirt sturen.

<br>

# C4 Model
In dit hoofdstuk staan level 1-3 van het C4 model. Het C4 model is een "abstraction-first" manier voor het maken van software architecture diagrammen. Voor het maken van deze 3 diagrammen heb ik [deze video](https://www.youtube.com/watch?v=x2-rSnhpw0g) bekeken. Meer informatie over het C4 model is te vinden op [c4model.com](https://c4model.com/).

## Level 1

![Level 1 van het C4 model](https://i.ibb.co/kqfF6f7/KVW-Nuenen-2.png)

## Level 2
{COMING-SOON}

## Level 3
{COMING-SOON}

<br>

# Mockups
{COMING-SOON}
