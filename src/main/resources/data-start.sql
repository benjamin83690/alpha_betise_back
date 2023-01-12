---------------------------------------------------------------------
------------------------------- ROLE --------------------------------
---------------------------------------------------------------------
INSERT INTO roles (role) VALUES	('USER'),
								('ADMIN');

---------------------------------------------------------------------
---------------------------- ETAT STOCK -----------------------------
---------------------------------------------------------------------
INSERT INTO etats_stocks (etat) VALUES ('en stock'),
									 ('en commande'),
									 ('épuisé');

---------------------------------------------------------------------
----------------------------- CATEGORIE -----------------------------
---------------------------------------------------------------------
INSERT INTO categories_livre (libelle) VALUES ('bébés 1-3 ans'),
											 ('enfants 3+'),
											 ('ados'),
											 ('adulte');

---------------------------------------------------------------------
------------------------------ LANGUE -------------------------------
---------------------------------------------------------------------
INSERT INTO langues (langue) VALUES	('Français'),
									('Anglais');

---------------------------------------------------------------------
------------------------------ ETAT COMMANDE ------------------------
---------------------------------------------------------------------
INSERT INTO etats_commandes (etat) VALUES	('en cours de préparation'),
										('en livraison'),
										('livré');

---------------------------------------------------------------------
------------------------------ EDITEUR ------------------------------
---------------------------------------------------------------------					
INSERT INTO editeurs (nom) VALUES	('Hachette'), ('Gallimard'), ('Flammarion'), ('Atlas'), ('Baudelaire');							
---------------------------------------------------------------------
------------------------------ COLLECTION ---------------------------
---------------------------------------------------------------------										
INSERT INTO collections (nom) VALUES	('Hachette'), ('Gallimard'), ('Flammarion'), ('Atlas');
						
---------------------------------------------------------------------
------------------------------ AUTEUR -------------------------------
---------------------------------------------------------------------
INSERT INTO auteurs (nom) VALUES 	('PEREZ'), ('LACOMBE'), ('LANG'), ('JOUANNIGOT LOIC'),
									('JALBERT PHILIPPE'), ('HIGGINS RYAN T.'), ('SECHAN'), 
									('JOURDY'), ('NOB'), ('DUNAND-PALLAZ'), ('JOLIBOIS'), 
									('HEINRICH'), ('CATHON'), ('BERTRAND'), ('BONNIOL'),
									('PEDROSA'), ('ROCHETTE'), ('BOCQUET'), ('REY'), ('SFAR JOANN'),
									('DEVENEY'), ('TAMARIT'), ('LAMBDA SOPHIE'), ('CY'),
									('GAIMAN'), ('NEYRET'), ('ROWLING J.K.'), ('WYNNE JONES DIANA');
										
---------------------------------------------------------------------
------------------------------ LIVRE --------------------------------
---------------------------------------------------------------------
INSERT INTO livres (isbn, titre, prix, resume, nb_pages, date_publication, poids, nb_exemplaires, longueur,
largeur, epaisseur, categorie_livre_id, collection_id, editeur_id, langue_id, etat_stock_id)
VALUES (9782226453587, "CORALINE", 19.90, 
"Coraline vient d'emménager dans une étrange maison et, comme ses parents n'ont pas le temps de s'occuper d'elle, elle décide de jouer les exploratrices. Ouvrant une porte condamnée, elle pénètre dans un appartement identique au sien. Identique, et pourtant... Dans la droite ligne d'Alice au pays des merveilles, ce roman à l'atmosphère inoubliable a déjà conquis des millions de lecteurs. A partir de 13 ans",
335, "2012-05-06", 87, 50, 20, 15, 6, 3, 1, 1, 1, 1);

---------------------------------------------------------------------
------------------------------ AuteursLivre -------------------------
---------------------------------------------------------------------
INSERT INTO auteurs_livres (auteur_id, livre_isbn) VALUES (1,9782226453587);

---------------------------------------------------------------------
------------------------------ PHOTO LVRE ---------------------------
---------------------------------------------------------------------
INSERT INTO photos_livre (path_url, livre_isbn) VALUES ('https://www.lalibrairie.com/cache/img/livres/112/9791037507112-xs.webp', 9782226453587);

---------------------------------------------------------------------
------------------------------ EVENEMENT ----------------------------
---------------------------------------------------------------------
INSERT INTO evenements (titre, max_participants, description, livre_isbn,
age_public, prix, rue, ville, code_postal, date_evenement, heure_evenement) 
VALUES ("Seance de dedicace", null, "L'alpha betise vous ouvre ses portes pour une belle seance de dedicace", 9782226453587,
		"Pour tous", null, "13 rue marchand", "Nice", "06200", "2023-06-04", "10:00:00"),
		("Atelier de Lecture", 10, "L'alpha betise vous ouvre ses portes pour un atelier de lecture", null,
		"Enfants", null, "13 rue marchand", "Nice", "06200", "2023-04-03", "10:00:00"),
		("Atelier de Lecture", 10, "L'alpha betise vous ouvre ses portes pour un atelier de lecture", null,
		"Adultes", null, "13 rue marchand", "Nice", "06200", "2023-04-15", "10:00:00"),
		("Rencontres Auteurs", 10, "L'alpha betise vous ouvre ses portes pour un atelier de lecture", null,
		"Pour tous", null, "13 rue marchand", "Nice", "06200", "2023-02-20", "14:00:00");

---------------------------------------------------------------------
------------------------------ Auteur Evenement ---------------------
---------------------------------------------------------------------
INSERT INTO auteurs_evenement (evenement_id, auteur_id) VALUES (1, 1), (4, 2);