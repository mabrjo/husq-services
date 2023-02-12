--Husq data here:
INSERT INTO husq (id, user_id, date, message, parent_id) VALUES(1, 1, TO_DATE('2021-02-01 03:15:00', 'YYYY-MM-DD HH:MI:SS'), 'This is a test', null)
INSERT INTO husq (id, user_id, date, message, parent_id) VALUES(2, 2, TO_DATE('2021-02-02 03:15:00', 'YYYY-MM-DD HH:MI:SS'), 'I am also doing a test', 1)
INSERT INTO husq (id, user_id, date, message, parent_id) VALUES(300, 3, TO_DATE('2021-02-03 03:15:00', 'YYYY-MM-DD HH:MI:SS'), 'This is a third test', 2)
INSERT INTO husq (id, user_id, date, message, parent_id) VALUES(3, 8, TO_DATE('2019-12-15 20:15:00', 'YYYY-MM-DD HH:MI:SS'), 'This is my first tweet', null)
INSERT INTO husq (id, user_id, date, message, parent_id) VALUES(4, 7, TO_DATE('2020-07-4 12:00:00', 'YYYY-MM-DD HH:MI:SS'), 'Happy quarantine firework day!', null)
INSERT INTO husq (id, user_id, date, message, parent_id) VALUES(5, 3, TO_DATE('2020-08-4 13:12:00', 'YYYY-MM-DD HH:MI:SS'), 'I like eggs', null)
INSERT INTO husq (id, user_id, date, message, parent_id) VALUES(6, 4, TO_DATE('2020-08-13 12:00:00', 'YYYY-MM-DD HH:MI:SS'), 'Whats the deal with airline food?', null)
INSERT INTO husq (id, user_id, date, message, parent_id) VALUES(7, 5, TO_DATE('2020-08-13 12:00:00', 'YYYY-MM-DD HH:MI:SS'), 'My computer broke again', null)
INSERT INTO husq (id, user_id, date, message, parent_id) VALUES(8, 6, TO_DATE('2020-08-13 12:00:00', 'YYYY-MM-DD HH:MI:SS'), 'why am I green help how do I stop it', null)


