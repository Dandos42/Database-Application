

-- -----------------------------------------------------
-- Data for table `Cinema_Village`.`cinema`
-- -----------------------------------------------------
START TRANSACTION;
USE `Cinema_Village`;
INSERT INTO `Cinema_Village`.`cinema` (`id_cinema`, `cinemas_name`, `email`, `free_parking`, `wheelchair_access`) VALUES (1, 'OC Olimpya Brno', 'olimpyabr@cinemavillage.com', 'YES', 'NO');
INSERT INTO `Cinema_Village`.`cinema` (`id_cinema`, `cinemas_name`, `email`, `free_parking`, `wheelchair_access`) VALUES (2, 'Farum Liberec', 'farumlib@cinemavillage.com', 'YES', 'YES');
INSERT INTO `Cinema_Village`.`cinema` (`id_cinema`, `cinemas_name`, `email`, `free_parking`, `wheelchair_access`) VALUES (3, 'Nova Klara', 'klaraos@cinemavillage.com', 'YES', 'NO');
INSERT INTO `Cinema_Village`.`cinema` (`id_cinema`, `cinemas_name`, `email`, `free_parking`, `wheelchair_access`) VALUES (4, 'Otryum Palac Pardubice', 'otrumpar@cinemavillage.com', 'YES', 'YES');
INSERT INTO `Cinema_Village`.`cinema` (`id_cinema`, `cinemas_name`, `email`, `free_parking`, `wheelchair_access`) VALUES (5, 'Plzen Plasa', 'plasapl@cinemavillage.com', 'YES', 'YES');
INSERT INTO `Cinema_Village`.`cinema` (`id_cinema`, `cinemas_name`, `email`, `free_parking`, `wheelchair_access`) VALUES (6, 'Otryum Flora', 'otryumpr@cinemavillage.com', 'YES', 'YES');
INSERT INTO `Cinema_Village`.`cinema` (`id_cinema`, `cinemas_name`, `email`, `free_parking`, `wheelchair_access`) VALUES (7, 'Eastfield Chodov', 'chodovpr@cinemavillage.com', 'NO', 'YES');
INSERT INTO `Cinema_Village`.`cinema` (`id_cinema`, `cinemas_name`, `email`, `free_parking`, `wheelchair_access`) VALUES (8, 'OC Letnoni', 'letnonipr@cinemavillage.com', 'NO', 'NO');
INSERT INTO `Cinema_Village`.`cinema` (`id_cinema`, `cinemas_name`, `email`, `free_parking`, `wheelchair_access`) VALUES (9, 'OC Novy Zmychov', 'zmychovpr@cinemavillage.com', 'NO', 'YES');
INSERT INTO `Cinema_Village`.`cinema` (`id_cinema`, `cinemas_name`, `email`, `free_parking`, `wheelchair_access`) VALUES (10, 'Praha Slovansky barak', 'barakpr@cinemavillage.com', 'NO', 'YES');
INSERT INTO `Cinema_Village`.`cinema` (`id_cinema`, `cinemas_name`, `email`, `free_parking`, `wheelchair_access`) VALUES (11, 'Metropole Slisin', 'slisinpr@cinemavillage.com', 'NO', 'YES');
INSERT INTO `Cinema_Village`.`cinema` (`id_cinema`, `cinemas_name`, `email`, `free_parking`, `wheelchair_access`) VALUES (12, 'Faram Usti nad Labem', 'faramunl@cinemavillage.com', 'YES', 'NO');
INSERT INTO `Cinema_Village`.`cinema` (`id_cinema`, `cinemas_name`, `email`, `free_parking`, `wheelchair_access`) VALUES (13, 'OC Maly Spalicek', 'spalicekbr@cinemavillage.com', 'YES', 'YES');

COMMIT;


-- -----------------------------------------------------
-- Data for table `Cinema_Village`.`address`
-- -----------------------------------------------------
START TRANSACTION;
USE `Cinema_Village`;
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (1, 'Praha', 'Revnicka', '121/1', '15521');
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (2, 'Praha', 'Vinohradska', '2828/151', '13000');
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (3, 'Praha', 'Na prikope', '859/22', NULL);
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (4, 'Praha', 'Plzenska', '233/8', '15000');
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (5, 'Praha', 'Veselska', '663', '19900');
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (6, 'Brno', 'U dalnice', '777', NULL);
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (7, 'Brno', 'Mecova', '695/2', '60200');
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (8, 'Plzen', 'Radcicka', '2861/2', '30100');
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (9, 'Pardubice', 'Masarykovo namesti', '2799', '53002');
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (10, 'Liberec', 'nam. Soukenne', '669/2a', '46001');
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (11, 'Ustni nad Labem', 'Bilinska', '3490/6', '40001');
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (12, 'Ostrava', 'Jantarova', '3344/4', '70200');
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (13, 'Praha', 'Roztylska', '2321/19', '14800');
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (14, 'Praha', 'Prazska', '895', NULL);
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (15, 'Praha', 'Karlova', '3548/6', NULL);
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (16, 'Brno', 'Vesnicka', '352', NULL);
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (17, 'Brno', 'Kralovopolska', '752', NULL);
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (18, 'Ostrava', 'Ostravska', '793/2', NULL);
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (19, 'Ostrava', 'Pod pokli', '717', NULL);
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (20, 'Brno', 'Ceska', '1751/a', NULL);
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (21, 'Praha', 'Draha', '716', NULL);
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (22, 'Plzen', 'Plzenska', '898', NULL);
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (23, 'Usti nad Labem', 'Labnovska', '538', NULL);
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (24, 'Liberec', 'Liberecova', '668', NULL);
INSERT INTO `Cinema_Village`.`address` (`id_address`, `city`, `street`, `house_number`, `zip_code`) VALUES (25, 'Frydek-Mistek', 'Revolucni', '112', NULL);

COMMIT;


-- -----------------------------------------------------
-- Data for table `Cinema_Village`.`opening_hours`
-- -----------------------------------------------------
START TRANSACTION;
USE `Cinema_Village`;
INSERT INTO `Cinema_Village`.`opening_hours` (`id_opening_hours`, `opening`, `closing`) VALUES (1, '8:00', '23:00');
INSERT INTO `Cinema_Village`.`opening_hours` (`id_opening_hours`, `opening`, `closing`) VALUES (2, '14:00', '22:30');
INSERT INTO `Cinema_Village`.`opening_hours` (`id_opening_hours`, `opening`, `closing`) VALUES (3, '10:30', '23:59');
INSERT INTO `Cinema_Village`.`opening_hours` (`id_opening_hours`, `opening`, `closing`) VALUES (4, '9:15', '22:00');
INSERT INTO `Cinema_Village`.`opening_hours` (`id_opening_hours`, `opening`, `closing`) VALUES (5, '9:30', '22:30');

COMMIT;


-- -----------------------------------------------------
-- Data for table `Cinema_Village`.`opens_closes`
-- -----------------------------------------------------
START TRANSACTION;
USE `Cinema_Village`;
INSERT INTO `Cinema_Village`.`opens_closes` (`id_cinema`, `id_opening_hours`) VALUES (1, 1);
INSERT INTO `Cinema_Village`.`opens_closes` (`id_cinema`, `id_opening_hours`) VALUES (2, 2);
INSERT INTO `Cinema_Village`.`opens_closes` (`id_cinema`, `id_opening_hours`) VALUES (3, 2);
INSERT INTO `Cinema_Village`.`opens_closes` (`id_cinema`, `id_opening_hours`) VALUES (4, 3);
INSERT INTO `Cinema_Village`.`opens_closes` (`id_cinema`, `id_opening_hours`) VALUES (5, 1);
INSERT INTO `Cinema_Village`.`opens_closes` (`id_cinema`, `id_opening_hours`) VALUES (6, 3);
INSERT INTO `Cinema_Village`.`opens_closes` (`id_cinema`, `id_opening_hours`) VALUES (7, 5);
INSERT INTO `Cinema_Village`.`opens_closes` (`id_cinema`, `id_opening_hours`) VALUES (8, 3);
INSERT INTO `Cinema_Village`.`opens_closes` (`id_cinema`, `id_opening_hours`) VALUES (9, 3);
INSERT INTO `Cinema_Village`.`opens_closes` (`id_cinema`, `id_opening_hours`) VALUES (10, 2);
INSERT INTO `Cinema_Village`.`opens_closes` (`id_cinema`, `id_opening_hours`) VALUES (11, 2);
INSERT INTO `Cinema_Village`.`opens_closes` (`id_cinema`, `id_opening_hours`) VALUES (12, 1);
INSERT INTO `Cinema_Village`.`opens_closes` (`id_cinema`, `id_opening_hours`) VALUES (13, 4);

COMMIT;


-- -----------------------------------------------------
-- Data for table `Cinema_Village`.`has_address`
-- -----------------------------------------------------
START TRANSACTION;
USE `Cinema_Village`;
INSERT INTO `Cinema_Village`.`has_address` (`id_cinema`, `id_address`) VALUES (11, 1);
INSERT INTO `Cinema_Village`.`has_address` (`id_cinema`, `id_address`) VALUES (6, 2);
INSERT INTO `Cinema_Village`.`has_address` (`id_cinema`, `id_address`) VALUES (10, 3);
INSERT INTO `Cinema_Village`.`has_address` (`id_cinema`, `id_address`) VALUES (9, 4);
INSERT INTO `Cinema_Village`.`has_address` (`id_cinema`, `id_address`) VALUES (8, 5);
INSERT INTO `Cinema_Village`.`has_address` (`id_cinema`, `id_address`) VALUES (1, 6);
INSERT INTO `Cinema_Village`.`has_address` (`id_cinema`, `id_address`) VALUES (13, 7);
INSERT INTO `Cinema_Village`.`has_address` (`id_cinema`, `id_address`) VALUES (5, 8);
INSERT INTO `Cinema_Village`.`has_address` (`id_cinema`, `id_address`) VALUES (4, 9);
INSERT INTO `Cinema_Village`.`has_address` (`id_cinema`, `id_address`) VALUES (2, 10);
INSERT INTO `Cinema_Village`.`has_address` (`id_cinema`, `id_address`) VALUES (12, 11);
INSERT INTO `Cinema_Village`.`has_address` (`id_cinema`, `id_address`) VALUES (3, 12);
INSERT INTO `Cinema_Village`.`has_address` (`id_cinema`, `id_address`) VALUES (7, 13);

COMMIT;


-- -----------------------------------------------------
-- Data for table `Cinema_Village`.`films`
-- -----------------------------------------------------
START TRANSACTION;
USE `Cinema_Village`;
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (1, 'The Shawshank Redemption', '16', 142, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (2, 'The Godfather', '16', 175, '1972-03-24');
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (3, 'The Dark Knight', '12', 152, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (4, 'The Godfather Part II', '16', 202, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (5, '12 Angry Men', '12', 96, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (6, 'Schindler\'s List', '16', 195, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (7, 'The Lord of the Rings: The Return of the King', '12', 201, '2002-01-10');
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (8, 'Pulp Fiction', '16', 154, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (9, 'The Lord of the Rings: The Fellowship of the Ring', '12', 178, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (10, 'The Good, the Bad and the Ugly', '16', 178, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (11, 'Forrest Gump', '12', 142, '1994-10-20');
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (12, 'Fight Club', '16', 139, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (13, 'Inception', '12', 148, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (14, 'The Lord of the Rings: The Two Towers', '12', 179, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (15, 'Star Wars: Episode V - The Empire Strikes Back', '7', 124, '1997-04-10');
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (16, 'The Matrix', '16', 136, '1999-10-05');
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (17, 'Goodfellas', '16', 145, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (18, 'One Flew Over the Cuckoo\'s Nest', '16', 133, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (19, 'Se7en', '16', 127, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (20, 'It\'s a Wonderful Life', '7', 130, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (21, 'The Silence of the Lambs', '16', 118, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (22, 'City of God', '16', 130, '2003-07-10');
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (23, 'Saving Private Ryan', '16', 169, '1998-10-08');
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (24, 'Life Is Beautiful', '12', 116, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (25, 'Interstellar', '12', 169, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (26, 'The Green Mile', '16', 189, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (27, 'Star Wars: Episode IV - A New Hope', '12', 121, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (28, 'Terminator 2: Judgment Day', '16', 137, '1991-07-03');
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (29, 'Back to the Future', '12', 116, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (30, 'Spirited Away', '12', 125, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (31, 'Psycho', '16', 109, '2009-01-15');
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (32, 'The Pianist', '16', 150, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (33, 'Parasite', '16', 132, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (34, 'Léon: The Professional', '16', 110, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (35, 'The Lion King', '3', 88, '1994-12-15');
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (36, 'Gladiator', '16', 155, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (37, 'American History X', '16', 119, '1999-03-25');
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (38, 'The Departed', '16', 151, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (39, 'The Usual Suspects', '16', 106, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (40, 'The Prestige', '12', 130, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (41, 'Whiplash', '16', 106, '2014-10-10');
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (42, 'Casablanca', '12', 102, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (43, 'The Intouchables', '16', 118, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (44, 'Modern Times', '12', 87, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (45, 'Once Upon a Time in the West', '12', 165, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (46, 'Rear Window', '12', 112, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (47, 'City Lights', '12', 87, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (48, 'Alien', '16', 117, '1979-05-25');
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (49, 'Cinema Paradiso', '12', 155, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (50, 'Apocalypse Now', '16', 147, NULL);
INSERT INTO `Cinema_Village`.`films` (`id_film`, `films_name`, `age_limit`, `footage_minutes`, `premiere`) VALUES (51, 'The Wolf of Wall Street', '16', 180, '2014-01-16');

COMMIT;


-- -----------------------------------------------------
-- Data for table `Cinema_Village`.`has_film`
-- -----------------------------------------------------
START TRANSACTION;
USE `Cinema_Village`;
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (1, 1);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (1, 4);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (1, 7);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (1, 2);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (1, 5);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (2, 8);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (2, 3);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (2, 6);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (2, 9);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (2, 11);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (3, 14);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (3, 17);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (3, 12);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (3, 15);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (3, 18);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (4, 13);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (4, 16);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (4, 19);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (4, 21);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (4, 22);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (5, 23);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (5, 24);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (5, 27);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (5, 25);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (5, 28);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (6, 26);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (6, 29);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (6, 31);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (6, 34);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (6, 37);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (7, 32);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (7, 35);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (7, 38);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (7, 39);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (7, 36);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (8, 41);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (8, 44);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (8, 47);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (8, 42);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (8, 45);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (9, 48);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (9, 43);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (9, 46);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (9, 49);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (9, 51);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (10, 50);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (10, 10);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (10, 20);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (10, 30);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (10, 40);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (11, 10);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (11, 35);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (11, 20);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (11, 27);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (11, 13);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (12, 37);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (12, 18);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (12, 20);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (12, 29);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (12, 36);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (13, 26);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (13, 42);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (13, 5);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (13, 35);
INSERT INTO `Cinema_Village`.`has_film` (`id_cinema`, `id_film`) VALUES (13, 38);

COMMIT;


-- -----------------------------------------------------
-- Data for table `Cinema_Village`.`genres`
-- -----------------------------------------------------
START TRANSACTION;
USE `Cinema_Village`;
INSERT INTO `Cinema_Village`.`genres` (`id_genre`, `genre`) VALUES (1, 'Drama');
INSERT INTO `Cinema_Village`.`genres` (`id_genre`, `genre`) VALUES (2, 'Crime');
INSERT INTO `Cinema_Village`.`genres` (`id_genre`, `genre`) VALUES (3, 'Action');
INSERT INTO `Cinema_Village`.`genres` (`id_genre`, `genre`) VALUES (4, 'Biography');
INSERT INTO `Cinema_Village`.`genres` (`id_genre`, `genre`) VALUES (5, 'Adventure');
INSERT INTO `Cinema_Village`.`genres` (`id_genre`, `genre`) VALUES (6, 'Comedy');
INSERT INTO `Cinema_Village`.`genres` (`id_genre`, `genre`) VALUES (7, 'Animation');
INSERT INTO `Cinema_Village`.`genres` (`id_genre`, `genre`) VALUES (8, 'Horror');
INSERT INTO `Cinema_Village`.`genres` (`id_genre`, `genre`) VALUES (9, 'Western');
INSERT INTO `Cinema_Village`.`genres` (`id_genre`, `genre`) VALUES (10, 'Mystery');

COMMIT;


-- -----------------------------------------------------
-- Data for table `Cinema_Village`.`has_genre`
-- -----------------------------------------------------
START TRANSACTION;
USE `Cinema_Village`;
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (1, 1);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (2, 2);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (3, 3);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (4, 2);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (5, 2);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (6, 4);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (7, 3);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (8, 2);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (9, 3);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (10, 5);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (11, 1);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (12, 1);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (13, 3);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (14, 3);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (15, 3);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (16, 3);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (17, 4);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (18, 1);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (19, 2);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (20, 1);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (21, 2);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (22, 2);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (23, 1);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (24, 6);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (25, 5);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (26, 2);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (27, 3);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (28, 3);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (29, 5);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (30, 7);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (31, 8);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (32, 4);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (33, 1);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (34, 3);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (35, 7);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (36, 3);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (37, 2);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (38, 2);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (39, 2);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (40, 1);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (41, 1);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (42, 1);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (43, 4);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (44, 6);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (45, 9);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (46, 10);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (47, 6);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (48, 8);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (49, 1);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (50, 1);
INSERT INTO `Cinema_Village`.`has_genre` (`id_film`, `id_genre`) VALUES (51, 4);

COMMIT;


-- -----------------------------------------------------
-- Data for table `Cinema_Village`.`employees`
-- -----------------------------------------------------
START TRANSACTION;
USE `Cinema_Village`;
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (1, 'radad', 'kokos', 'Dalibor', 'Rada');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (2, 'prachard', 'kokos42', 'Daniel', 'Prachar');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (3, 'oszeldam', 'orel', 'Matej', 'Oszelda');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (4, 'vomackaj', 'fajkus', 'Jan', 'Vomacka');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (5, 'prdelkap', 'ova', 'Pepa', 'Prdelka');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (6, 'voprsalekm', 'inflace', 'Michal', 'Voprsalek');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (7, 'novakj', 'klasika', 'Jan', 'Novak');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (8, 'struziakoval', 'pritel', 'Lada', 'Struziakova');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (9, 'sumbalj', 'kdevlasy', 'Jiri', 'Sumbal');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (10, 'murinovam', 'macecek', 'Marta', 'Murinova');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (11, 'macecekp', 'acojastim', 'Pavel', 'Macecek');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (12, 'brenekr', 'kozagone', 'Richard', 'Brenek');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (13, 'chvajovae', 'lanik', 'Eva', 'Chvajova');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (14, 'kotaskovav', 'clovece', 'Vratislava', 'Kotaskova');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (15, 'benovaj', 'prosimvas', 'Jirina', 'Benova');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (16, 'pospechz', 'linux', 'Zbynek', 'Pospech');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (17, 'kmental', 'logaritmus', 'Libor', 'Kmenta');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (18, 'gunkovaj', 'ekonomika', 'Jarmila', 'Gunkova');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (19, 'polivcakovad', 'nulaze100', 'Dasa', 'Polivcakova');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (20, 'fajkusovai', 'excelbest', 'Iva', 'Fajkusova');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (21, 'goreckad', '100mza10s', 'Danuse', 'Gorecka');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (22, 'balonr', 'pspad', 'Robin', 'Balon');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (23, 'safnerr', 'stingray', 'Roman', 'Safner');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (24, 'vranikovab', 'krmasnoha', 'Barbora', 'Vranikova');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (25, 'snytovab', 'paniprofesorka', 'Bronislava', 'Snytova');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (26, 'zavodnyj', 'trol', 'Jiri', 'Zavodny');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (27, 'tobiasm', 'nizozemsko', 'Martin', 'Tobias');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (28, 'volnikp', 'vlasymam', 'Petr', 'Volnik');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (29, 'bretovaj', 'plevin', 'Jana', 'Bretova');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (30, 'holeckovam', 'jedinanormalni', 'Martina', 'Holeckova');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (31, 'janalovaj', 'nikdomenemarad', 'Jana', 'Janalova');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (32, 'jenistovar', 'aplusb', 'Radka', 'Jenistova');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (33, 'korbasovaz', 'chudakadam', 'Zuzana', 'Korbasova');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (34, 'lukovskam', 'maturita', 'Marcela', 'Lukovska');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (35, 'ondrekovah', 'zasadnenepiju', 'Hana', 'Ondrekova');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (36, 'paprokovav', 'obchodkadaleko', 'Vladimira', 'Paprokova');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (37, 'sladkovad', 'sladkovado314ci', 'Dagmar', 'Sladkova');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (38, 'stankovag', 'vsudebyla', 'Gabriela', 'Stankova');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (39, 'uherkovat', 'spatnyspin', 'Tana', 'Uherkova');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (40, 'vasicekj', 'skillpoints', 'Jiri', 'Vasicek');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (41, 'vyparinoval', 'cobudenaobed', 'Lucie', 'Vyparinova');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (42, 'kolosz', 'lyzak', 'Zdenek', 'Kolos');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (43, 'brezinao', 'pisutest', 'Ondrej', 'Brezina');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (44, 'rodl', 'ontozrusil', 'Lukas', 'Rod');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (45, 'michalh', 'jagerbomba', 'Michal', 'Heczko');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (46, 'marsinovab', 'odlozsi', 'Barbora', 'Marsinova');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (47, 'janesikovat', 'jojoprijdu', 'Tereza', 'Janesikova');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (48, 'gluchs', 'studenkanpc', 'Samuel', 'Gluch');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (49, 'lanikf', 'nedaljsemno', 'Filip', 'Lanik');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (50, 'hrtona', 'javidimdobre', 'Adam', 'Hrton');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (51, 'cernikj', 'netrepuse', 'Jan', 'Cernik');
INSERT INTO `Cinema_Village`.`employees` (`id_employee`, `username`, `password`, `first_name`, `last_name`) VALUES (52, 'kohotoval', 'stalose', 'Lucie', 'Kohotova');

COMMIT;


-- -----------------------------------------------------
-- Data for table `Cinema_Village`.`works`
-- -----------------------------------------------------
START TRANSACTION;
USE `Cinema_Village`;
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (7, 1);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (4, 2);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (10, 3);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (9, 4);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (11, 5);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (11, 6);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (12, 7);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (8, 8);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (6, 9);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (4, 10);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (10, 11);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (3, 12);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (2, 13);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (5, 14);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (12, 15);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (5, 16);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (6, 17);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (11, 18);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (12, 19);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (8, 20);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (8, 21);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (1, 22);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (3, 23);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (13, 24);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (11, 25);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (2, 26);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (12, 27);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (3, 28);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (8, 29);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (2, 30);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (5, 31);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (12, 32);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (9, 33);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (2, 34);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (7, 35);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (10, 36);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (13, 37);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (1, 38);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (2, 39);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (13, 40);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (3, 41);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (7, 42);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (1, 43);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (6, 44);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (3, 45);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (13, 46);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (1, 47);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (6, 48);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (4, 49);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (9, 50);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (11, 51);
INSERT INTO `Cinema_Village`.`works` (`id_cinema`, `id_employee`) VALUES (11, 52);

COMMIT;


-- -----------------------------------------------------
-- Data for table `Cinema_Village`.`positions`
-- -----------------------------------------------------
START TRANSACTION;
USE `Cinema_Village`;
INSERT INTO `Cinema_Village`.`positions` (`id_position`, `name`, `salary`) VALUES (1, 'Supervisor', 840000.00);
INSERT INTO `Cinema_Village`.`positions` (`id_position`, `name`, `salary`) VALUES (2, 'HR', 420000.80);
INSERT INTO `Cinema_Village`.`positions` (`id_position`, `name`, `salary`) VALUES (3, 'Accountant', 396000.69);
INSERT INTO `Cinema_Village`.`positions` (`id_position`, `name`, `salary`) VALUES (4, 'Cashier', 284000.24);
INSERT INTO `Cinema_Village`.`positions` (`id_position`, `name`, `salary`) VALUES (5, 'Attendant', 284000.11);

COMMIT;


-- -----------------------------------------------------
-- Data for table `Cinema_Village`.`has_position`
-- -----------------------------------------------------
START TRANSACTION;
USE `Cinema_Village`;
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (1, 3);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (2, 3);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (3, 3);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (4, 5);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (5, 5);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (6, 4);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (7, 2);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (8, 4);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (9, 5);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (10, 1);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (11, 1);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (12, 4);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (13, 3);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (14, 1);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (15, 3);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (16, 1);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (17, 5);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (18, 1);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (19, 2);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (20, 2);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (21, 2);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (22, 3);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (23, 4);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (24, 3);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (25, 5);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (26, 5);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (27, 4);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (28, 3);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (29, 2);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (30, 3);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (31, 4);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (32, 4);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (33, 1);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (34, 5);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (35, 4);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (36, 4);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (37, 1);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (38, 3);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (39, 4);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (40, 5);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (41, 5);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (42, 4);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (43, 4);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (44, 3);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (45, 2);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (46, 3);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (47, 2);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (48, 2);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (49, 1);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (50, 2);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (51, 3);
INSERT INTO `Cinema_Village`.`has_position` (`id_employee`, `id_postion`) VALUES (52, 5);

COMMIT;


-- -----------------------------------------------------
-- Data for table `Cinema_Village`.`employee_has_address`
-- -----------------------------------------------------
START TRANSACTION;
USE `Cinema_Village`;
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (1, 18);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (2, 22);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (3, 21);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (4, 20);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (5, 17);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (6, 18);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (7, 14);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (8, 17);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (9, 19);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (10, 16);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (11, 24);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (12, 15);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (13, 17);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (14, 18);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (15, 19);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (16, 14);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (17, 15);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (18, 24);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (19, 23);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (20, 20);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (21, 18);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (22, 22);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (23, 18);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (24, 24);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (25, 20);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (26, 23);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (27, 14);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (28, 18);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (29, 24);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (30, 17);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (31, 23);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (32, 20);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (33, 15);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (34, 21);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (35, 14);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (36, 23);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (37, 17);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (38, 19);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (39, 19);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (40, 22);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (41, 25);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (42, 23);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (43, 17);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (44, 23);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (45, 15);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (46, 17);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (47, 25);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (48, 20);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (49, 17);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (50, 16);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (51, 25);
INSERT INTO `Cinema_Village`.`employee_has_address` (`id_enployee`, `id_address`) VALUES (52, 18);

COMMIT;

