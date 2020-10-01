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

<br>

# Introductie
[KVW Nuenen](https://kvwnuenen.nl/) (Kinder Vakantie Week Nuenen) is een onafhankelijke stichting die al sinds 1983 ieder jaar in de laatste week van de zomervakantie een leuke week neerzet voor kinderen die vanwege financiële omstandigheden niet op vakantie kunnen. Met deze filosofie is de KVW opgezet. Over de jaren zijn wij een begrip geworden in Nuenen. Niet alleen meer voor kinderen die niet op vakantie kunnen, echter krijgen kinderen die vanuit [Stichting Leergeld](https://www.leergeld.nl/) komen krijgen nog steeds voorang.

Sinds {YEAR} is de KVW onder een nieuwe organisatie + bestuur gekomen. Deze Organisatie bestaat op het moment uit 11 organisatie leden in de leeftijdsgroep 20 tot 28. Doordat de organisatie uit jonge leden bestaat, is de KVW de afgelopen jaren erg gemoderniseerd. Zo zijn de inschrijvingen sinds 2018 voledig via een online formulier (voorheen werdt dit via mail gedaan.) en wordt sinds 2019 ook de aanwezigheid van de kinderen digitaal bijgehouden.

<br>

# Situaties
In dit hoofdstuk worden de huidige en gewenste situatie beschreven. De geweste situatie is een situatie waar alles perfect is, deze kan dus afwijken van de uiteindelijke situatie.

## Huidige situatie
Op het moment wordt er gebruik gemaakt van een website die ik in 2018 ontwikkeld heb. Via deze website kunnen ouders kinderen inschrijven en beheren (info aanpassen). Op een andere site kunnen vrijwilligers zich aanmelden en hier hun groepjes bekijken. Ook kunnen vrijwilligers hier kinderen van hun groepjes aan of afwezig melden.

### Het probleem
Het probleem van de huidige oplossing is de schaalbaarheid en de aanpasbaarheid. Dit systeem heb ik gebouwd met minimale PHP web kennis. Met mijn huidige kennis hoop ik dit systeem te herbouwen met verbeterde en nieuwe functionaliteiten.


## Gewenste situatie
Het nieuwe gewenste systeem bevat veel meer mogelijkheden dan het huidige systeem (Zie [MoSCoW model](#moscow-model)). Ook is het nieuwe systeem veel schaalbaarder. Het maximale aantal kinderen is bijvoorbeeld schaalbaar i.p.v. de vaste 220 kinderen. Ook is het beheren van kinderen en vrijwilligers makkelijk en is hier geen technische kennis voor nodig.

In het oude systeem moesten kinderen via de DB in een groepje geplaatst worden. Dit gaat gewoon via een menu in het nieuwe systeem. Ook zijn problemen zoals het onhandige melden van gevonden spullen of het opzoeken van verloren vrijwilligers shirts verleden tijd.

<br>

# MoSCoW model
In dit hoofdstuk staan de huidige requirements opgesteld in een MoSCoW model. Deze requirements kunnen gedurende het project aangepast worden.

## Must
-	1 site van maken (Bij login kiezen voor ouder of vrijwilliger)
-	Kinderen afwezig en aanwezig melden als vrijwilliger
-	Verjaardagen zien van kinderen
-	Vrijwilligers aan groepjes koppelen.
-	Organisatie leden toevoegen/verwijderen


## Should
-	T-shirts bij persoon koppelen
-	Centraal emails kunnen sturen.
-	Per groepje email kunnen sturen.
-	Standaard email template maken.
-	Foto’s meteen delen via de site.
-	Vrijwilligers programma inzien.
-	Groepslijsten uitprinten voor noodgevallen
-	Bijzonderheden lijst online maken.
-	Betalingen beheren
-	Kinderen uitschrijven
-	Gevonden voorwerpen + email verzenden


## Could
-	Naar kinderen van bepaalde leeftijd emails sturen.
-	Mobile friendly website
-	App maken in flutter
-	Programma maken via de site.
-	Bijzonderheden lijst uit kunnen printen.
-	Spelopbouw lijsten digitaal en kunnen uitprinten.
-	Contact met organisatieleden hebben
-	Kosten declareren aan de penningmeester
-	Kinderen “retouren”
-	Email over shirts sturen.


## Won't have this time
-	Automatisch een draaiboek bouwen.
-	Kosten voor een T-shirt rekenen
