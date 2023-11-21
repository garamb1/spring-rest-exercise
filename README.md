# spring-rest-example

A partire dalla tabella seguente, puoi implementare dei servizi REST:

|   URI            |   GET                                                |   PUT                                                    |   POST                                          |   DELETE                        |
|------------------|------------------------------------------------------|----------------------------------------------------------|-------------------------------------------------|---------------------------------|
|   contacts/      |   Ritorna la lista dei contatti                      |   Sostituisce la lista dei contatti                      |   Aggiunge un elemento alla lista dei contatti  |   Elimina l'intera lista        |
|   contacts/{id}  |   Ritorna l'elemento con l'identificatore richiesto  |   Sostituisce l'elemento con l'identificatore richiesto  |   -                                             |   Elimina l'elemento richiesto  |


- Definisci un Servizio che permetta l'accesso a dei contatti:
    - Il Servizio può usare storage in-memory (conservando ad esempio i contatti in una mappa) oppure una Repository JPA o JDBC
- Definisci un ContactRestController annotato con @RestController
- Implementa i metodi e i corretti mapping dei servizi REST.
- Testa il risultato dei diversi servizi usando curl o Postman 
