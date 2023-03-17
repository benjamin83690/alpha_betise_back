---------------------------------------------------------------------
---------------------------- ETAT STOCK -----------------------------
---------------------------------------------------------------------
INSERT INTO etats_stocks (id, etat) VALUES (1, 'en stock'),
									 (2, 'en commande'),
									 (3, 'épuisé');

---------------------------------------------------------------------
----------------------------- CATEGORIE -----------------------------
---------------------------------------------------------------------
INSERT INTO categories_livre (id, libelle) VALUES (1, 'bébés 1-3 ans'),
											 (2, 'enfants 3+'),
											 (3, 'ados'),
											 (4, 'adulte');

---------------------------------------------------------------------
------------------------------ LANGUE -------------------------------
---------------------------------------------------------------------
INSERT INTO langues (id, langue) VALUES	(1, 'Français'),
									(2, 'Anglais');

---------------------------------------------------------------------
------------------------------ ETAT COMMANDE ------------------------
---------------------------------------------------------------------
INSERT INTO etats_commandes (id, etat) VALUES	(1, 'en cours de préparation'),
										(2, 'en livraison'),
										(3, 'livré');

---------------------------------------------------------------------
------------------------------ EDITEUR ------------------------------
---------------------------------------------------------------------					
INSERT INTO editeurs (id, nom) VALUES	(1, 'Hachette'), (2, 'Gallimard'), (3, 'Flammarion'), (4, 'Atlas'), (5, 'Baudelaire');							
---------------------------------------------------------------------
------------------------------ COLLECTION ---------------------------
---------------------------------------------------------------------										
INSERT INTO collections (id, nom) VALUES	(1, 'Hachette'), (2, 'Gallimard'), (3, 'Flammarion'), (4, 'Atlas');
						
---------------------------------------------------------------------
------------------------------ AUTEUR -------------------------------
---------------------------------------------------------------------
INSERT INTO auteurs (auteur_id, nom) VALUES 	(1, 'PEREZ'), (2, 'LACOMBE'), (3, 'LANG'), (4, 'JOUANNIGOT LOIC'),
									(5, 'JALBERT PHILIPPE'), (6, 'HIGGINS RYAN T.'), (7, 'SECHAN'), 
									(8, 'JOURDY'), (9, 'NOB'), (10, 'DUNAND-PALLAZ'), (11, 'JOLIBOIS'), 
									(12, 'HEINRICH'), (13, 'CATHON'), (14, 'BERTRAND'), (15, 'BONNIOL'),
									(16, 'PEDROSA'), (17, 'ROCHETTE'), (18, 'BOCQUET'), (19, 'REY'), (20, 'SFAR JOANN'),
									(21, 'DEVENEY'), (22, 'TAMARIT'), (23, 'LAMBDA SOPHIE'), (24, 'CY');
										
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
INSERT INTO photos_livre (id, path_url, livre_isbn) VALUES (1, 'https://www.lalibrairie.com/cache/img/livres/112/9791037507112-xs.webp', 9782226453587);

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