Sammen med Java-koden skal du levere en kort README-fil der du forteller om ditt
arbeid med problemet og hvilke definisjoner du har gjort. Vi forventer rundt en halv
A4-side.

Jeg startet denne oppgaven med å lese oppgave siden nøye, og se på alt av output fra eksempelet. Deretter tok jeg utgangspunkt i UML diagrammet gitt i oppgaven. Jeg bestemte meg for å bruke fire klasser, der en bar skulle kun ha en main metode.
*Dvdarkiv - som bare har en main metode og kjører meny mentoden i DVDadmin
*DVDadministrasjon - som holder orden på "alt"
*Person - som er person objekter som eier og låner DVDer
*Dvd - som er film/dvd objekter som inneholder tittel, eier, leier osv

I ettertid ser jeg at det hadde vært mulig å kanskje like greit å puttet main metoden i DVDadministrasjon, siden jeg ikke kommer til å bruke flere objekter av DVDadmin uansett.

Jeg startet med å lage menyen i DVDadmin, og bestemte meg for å prøve å gjennomføre denne med en switch statement, siden jeg ikke hadde brukt det før og ville lære det. Det syntes jeg fungerte som jeg ønsket. Så bestemte jeg meg for at i hver statement i switchen(hvis det heter det?), så skulle det kalles en egen metode for å utføre oppgaven, hvis ikke ble det fort veldig rotete med innrykk midt i switchen. Jeg delte de opp videre der det var logisk(sånn som "Vis"), noen av metodene er ganske lange og store fortsatt. Jeg følte uansett det gikk greit og fant ikke noe mer logisk inndeling.

Jeg la inn all oppgavetekst med syso og tilbakmeldinger helt likt som i oppgaveteksten. Videre opprettet jeg Dvd og Person klassene ganske rett frem, med logiske private variabler for tittel, navn etc.

De første menymetodene jeg lagde var "Ny person" og så "Kjøp". Når de to fungerte gikk jeg videre på "Oversikt" og "Vis". Siden jeg lagde DVDadmin som et objekt som blir opprettet i main, fant jeg ut at det var greit å lese arkiv.txt i konstruktøren til dvdadmin klassen. Jeg programerte først les inn fil, også skriv til fil. Alt uten å ta med lån av DVD.

Jeg brukte spesielt mye tid på å lese av fil, fordi det tok meg lang tid å finne ut hvordan "NextLine" fungerte i praksis. Jeg trodde ikke den faktisk leste linjen hvis den sto i en if-statement sjekk, kun sjekket. Etter mye feilsøking og litt mindre hår på hodet, bestemte jeg meg for å mellomlagre den i en String og sjekke den Stringen istedenfor. Deretter knotet jeg en del med å skrive til fil. Jeg prøvde mye rart og endte opp med å lage en "Object[] dvdArray()" som gjorde "return dvdSamling.keySet().toArray();"  i Person, som returnerte DVDsamling hashmapet som object, eller noe sånt... Det fungerte fint, men ble knotete senere når jeg prøvde å kjøre metodekall med det returnerte Objectet for å hente leier etc.

Men før jeg kom dit gjorde jeg ferdig "Laan" etterfulgt av "Retur" på menyen. Her innså jeg at jeg burde planlagt litt bedre før jeg begynte, og det ble mye knoting uten og ha en veldig klar tanke bak "Retur" metoden. Jeg prøvde å legge til to nye HashMaps for å holde styr på leiere og utleire, men slettet det igjen da jeg ikke hadde noen klar plan. Det endte opp med at DvdSamling-HashMapet i Person ikke står som private. 

Jeg fikk det til, men sånn som det er nå spør programmet mitt også etter "eier" i "Retur", mens det i oppgaveneksempelet kun spørres etter "leier" og "dvd tittel". 

Så skulle jeg oppdatere "Oversikt" og "Vis" for å vise lånere. "Oversikt" gikk veldig greit med to int tellere i Person. "Vis" måtte jeg skrive om helt, fordi jeg fikk returnert noe som var Object istedenfor Dvd/Person objecter, som jeg ikke fikk til å gjøre metodekall på. Hadde brukt samme gamle metode som i les/skriv til fil. Fant til slutt en løsning på 8-10 linjer fra StackOverflow som jeg har brukt som utgangspunt for å loope igjennom HashMap. 

Denne loop metoden brukte jeg også på lese fra til og lagre. Forresten har jeg valgt å lagre til fil når "Avslutt" velges, og ikke underveis, har derfor brukt mye tid på feilmeldinger for at det skal være vanskelig å kræsje programmet.

Jeg er klar over følgende problemer/avvik:
* "Retur" spør også etter eier, det gjør ikke oppgaveteksten. Henrik sa det var greit
* DvdSamling i Person er ikke private

Noen siste tanker er at jeg burde planlagt hva slags ulike grensesnitt jeg trengte bedre. Jeg endte opp med å miste oversikten og opprettet de litt på måfå, ettersom jeg trengte de. Det er sikkert metoder som kunne vært slått sammen eller som jeg endte opp med å ikke bruke. Ellers så synes jeg ikke obligen var spesielt vanskelig. Gjort ferdig på ca 2 dager. Jeg har prøvd å bruke JavaDoc kommntering for å lære det i denne oppgaven.