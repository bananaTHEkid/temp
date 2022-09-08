INSERT INTO exercise_day(exercise_day_id, exercise_date) VALUES (1, '2008-11-11');
INSERT INTO exercise_day(exercise_day_id, exercise_date) VALUES (2, '2008-10-02');

INSERT INTO exercise(exercise_id, exercise_name, repetitions, weight, exercise_plan_fk) VALUES (1, 'Liegestütze', 10, null, 1);
INSERT INTO exercise(exercise_id, exercise_name, repetitions, weight, exercise_plan_fk) VALUES (2, 'Kniebeugen', 20, null, 1);
INSERT INTO exercise(exercise_id, exercise_name, repetitions, weight, exercise_plan_fk) VALUES (3, 'Dips', 15, null, 2);
INSERT INTO exercise(exercise_id, exercise_name, repetitions, weight, exercise_plan_fk) VALUES (4, 'Bankdrücken', 10, 20, 2);

INSERT INTO exercise_plan(id, name, exercise_day_fk) VALUES (1, 'Morgentraining', 1);
INSERT INTO exercise_plan(id, name, exercise_day_fk) VALUES (2, 'Abendtraining' , 1);