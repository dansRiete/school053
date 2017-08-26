ALTER TABLE school_classes DROP CONSTRAINT fkkdf05jfova8l0gp7lp4b37cu4;

ALTER TABLE lesson_events DROP CONSTRAINT fkdoygbdejt45xct3w07m2ib39b;

ALTER TABLE relationship DROP CONSTRAINT fkbw1jbdwu89d1hp6wfh4p7rieo;

ALTER TABLE file_event DROP CONSTRAINT fk4tcv6a1daai17iciulcx89r1a;

ALTER TABLE lessons DROP CONSTRAINT fke94a0k21xpi7glv89af90lwjv;

ALTER TABLE child_marks DROP CONSTRAINT fkdgbjsvbb3q9n6yfymec7urmtc;

ALTER TABLE relationship DROP CONSTRAINT fke8i6145afk3qabl2c3jyerdf5;

ALTER TABLE lessons DROP CONSTRAINT fkbr76cuebuufbbltujpfq04tto;

ALTER TABLE childs DROP CONSTRAINT fk10d891of8oojk4ei9itusmpdf;

ALTER TABLE childs DROP CONSTRAINT fkcopxtxtfbh8od512oxxsw2tll;

ALTER TABLE teachers DROP CONSTRAINT fkpavufmal5lbtc60csriy8sx3;

ALTER TABLE child_marks DROP CONSTRAINT fkmavwmrdkccxc9dc4yo7ir7rhc;

ALTER TABLE sec_user_authority DROP CONSTRAINT fkhd8to35nfplci0dvltuxk79b2;

ALTER TABLE sec_user_authority DROP CONSTRAINT fkesm40vufwhgtfawxng2s4s1w8;

ALTER TABLE child_marks DROP CONSTRAINT fkghk2om1x2jxiu93ky49jfowpn;

ALTER TABLE parents DROP CONSTRAINT fkbunaue5n1kwq8j49jeqvgu0f3;

ALTER TABLE file_event DROP CONSTRAINT fk8snmi2dxf30wuwavhvfpusf76;

ALTER TABLE lessons DROP CONSTRAINT fk5ogghui2470katri71aovp3nv;

ALTER TABLE lessons DROP CONSTRAINT lessons_pkey;

ALTER TABLE school_classes DROP CONSTRAINT school_classes_pkey;

ALTER TABLE parents DROP CONSTRAINT parents_pkey;

ALTER TABLE subjects DROP CONSTRAINT subjects_pkey;

ALTER TABLE file_resources DROP CONSTRAINT file_resources_pkey;

ALTER TABLE childs DROP CONSTRAINT childs_pkey;

ALTER TABLE teachers DROP CONSTRAINT teachers_pkey;

ALTER TABLE users DROP CONSTRAINT users_pkey;

ALTER TABLE lesson_event_types DROP CONSTRAINT lesson_event_types_pkey;

ALTER TABLE lesson_events DROP CONSTRAINT lesson_events_pkey;

ALTER TABLE child_marks DROP CONSTRAINT child_marks_pkey;

ALTER TABLE authorities DROP CONSTRAINT authorities_pkey;

DROP TABLE IF EXISTS school_classes;

DROP TABLE IF EXISTS subjects;

DROP TABLE IF EXISTS lessons;

DROP TABLE IF EXISTS relationship;

DROP TABLE IF EXISTS parents;

DROP TABLE IF EXISTS lesson_events;

DROP TABLE IF EXISTS lesson_event_types;

DROP TABLE IF EXISTS child_marks;

DROP TABLE IF EXISTS childs;

DROP TABLE IF EXISTS authorities;

DROP TABLE IF EXISTS teachers;

DROP TABLE IF EXISTS users;

DROP TABLE IF EXISTS sec_user_authority;

DROP TABLE IF EXISTS file_event;

DROP TABLE IF EXISTS file_resources;

CREATE TABLE school_classes (
		id VARCHAR(36) NOT NULL,
		active BOOL NOT NULL,
		name VARCHAR(36) NOT NULL,
		studying_end TIMESTAMP,
		studying_start TIMESTAMP,
		curator_id VARCHAR(255)
	);

CREATE TABLE subjects (
		id VARCHAR(36) NOT NULL,
		alias VARCHAR(64) NOT NULL,
		name VARCHAR(64) NOT NULL
	);

CREATE TABLE lessons (
		id VARCHAR(36) NOT NULL,
		class_id VARCHAR(36),
		subject_id VARCHAR(36),
		teacher_id VARCHAR(255)
	);

CREATE TABLE relationship (
		parent_id VARCHAR(255) NOT NULL,
		child_id VARCHAR(255) NOT NULL
	);

CREATE TABLE parents (
		job VARCHAR(64),
		id VARCHAR(255) NOT NULL
	);

CREATE TABLE lesson_events (
		id VARCHAR(36) NOT NULL,
		comment VARCHAR(255),
		completed BOOL,
		completion_date DATE,
		event_date DATE,
		lesson_id VARCHAR(36)
	);

CREATE TABLE lesson_event_types (
		id VARCHAR(255) NOT NULL,
		name VARCHAR(255)
	);

CREATE TABLE child_marks (
		id VARCHAR(36) NOT NULL,
		absent BOOL,
		mark INT4,
		remark VARCHAR(255),
		child_id VARCHAR(255),
		lesson_event_id VARCHAR(36),
		lessoneventtype_id VARCHAR(255)
	);

CREATE TABLE childs (
		id VARCHAR(255) NOT NULL,
		school_class_id VARCHAR(36) NOT NULL
	);

CREATE TABLE authorities (
		name VARCHAR(36) NOT NULL
	);

CREATE TABLE teachers (
		description VARCHAR(255),
		id VARCHAR(255) NOT NULL
	);

CREATE TABLE users (
		id VARCHAR(255) NOT NULL,
		active BOOL NOT NULL,
		email VARCHAR(36),
		first_name VARCHAR(64) NOT NULL,
		last_name VARCHAR(64) NOT NULL,
		nickname VARCHAR(36) NOT NULL,
		password VARCHAR(255) NOT NULL,
		patronymic VARCHAR(64),
		phone_number VARCHAR(36)
	);

CREATE TABLE sec_user_authority (
		user_id VARCHAR(255) NOT NULL,
		authority_name VARCHAR(36) NOT NULL
	);

CREATE TABLE file_event (
		file_id VARCHAR(255) NOT NULL,
		event_id VARCHAR(36) NOT NULL
	);

CREATE TABLE file_resources (
		id VARCHAR(255) NOT NULL,
		name VARCHAR(255),
		relative_path VARCHAR(255)
	);

ALTER TABLE lessons ADD CONSTRAINT lessons_pkey PRIMARY KEY (id);

ALTER TABLE school_classes ADD CONSTRAINT school_classes_pkey PRIMARY KEY (id);

ALTER TABLE parents ADD CONSTRAINT parents_pkey PRIMARY KEY (id);

ALTER TABLE subjects ADD CONSTRAINT subjects_pkey PRIMARY KEY (id);

ALTER TABLE file_resources ADD CONSTRAINT file_resources_pkey PRIMARY KEY (id);

ALTER TABLE childs ADD CONSTRAINT childs_pkey PRIMARY KEY (id);

ALTER TABLE teachers ADD CONSTRAINT teachers_pkey PRIMARY KEY (id);

ALTER TABLE users ADD CONSTRAINT users_pkey PRIMARY KEY (id);

ALTER TABLE lesson_event_types ADD CONSTRAINT lesson_event_types_pkey PRIMARY KEY (id);

ALTER TABLE lesson_events ADD CONSTRAINT lesson_events_pkey PRIMARY KEY (id);

ALTER TABLE child_marks ADD CONSTRAINT child_marks_pkey PRIMARY KEY (id);

ALTER TABLE authorities ADD CONSTRAINT authorities_pkey PRIMARY KEY (name);

ALTER TABLE school_classes ADD CONSTRAINT fkkdf05jfova8l0gp7lp4b37cu4 FOREIGN KEY (curator_id)
	REFERENCES teachers (id);

ALTER TABLE lesson_events ADD CONSTRAINT fkdoygbdejt45xct3w07m2ib39b FOREIGN KEY (lesson_id)
	REFERENCES lessons (id);

ALTER TABLE relationship ADD CONSTRAINT fkbw1jbdwu89d1hp6wfh4p7rieo FOREIGN KEY (parent_id)
	REFERENCES parents (id);

ALTER TABLE file_event ADD CONSTRAINT fk4tcv6a1daai17iciulcx89r1a FOREIGN KEY (event_id)
	REFERENCES lesson_events (id);

ALTER TABLE lessons ADD CONSTRAINT fke94a0k21xpi7glv89af90lwjv FOREIGN KEY (subject_id)
	REFERENCES subjects (id);

ALTER TABLE child_marks ADD CONSTRAINT fkdgbjsvbb3q9n6yfymec7urmtc FOREIGN KEY (lessoneventtype_id)
	REFERENCES lesson_event_types (id);

ALTER TABLE relationship ADD CONSTRAINT fke8i6145afk3qabl2c3jyerdf5 FOREIGN KEY (child_id)
	REFERENCES childs (id);

ALTER TABLE lessons ADD CONSTRAINT fkbr76cuebuufbbltujpfq04tto FOREIGN KEY (teacher_id)
	REFERENCES teachers (id);

ALTER TABLE childs ADD CONSTRAINT fk10d891of8oojk4ei9itusmpdf FOREIGN KEY (id)
	REFERENCES users (id);

ALTER TABLE childs ADD CONSTRAINT fkcopxtxtfbh8od512oxxsw2tll FOREIGN KEY (school_class_id)
	REFERENCES school_classes (id);

ALTER TABLE teachers ADD CONSTRAINT fkpavufmal5lbtc60csriy8sx3 FOREIGN KEY (id)
	REFERENCES users (id);

ALTER TABLE child_marks ADD CONSTRAINT fkmavwmrdkccxc9dc4yo7ir7rhc FOREIGN KEY (lesson_event_id)
	REFERENCES lesson_events (id);

ALTER TABLE sec_user_authority ADD CONSTRAINT fkhd8to35nfplci0dvltuxk79b2 FOREIGN KEY (authority_name)
	REFERENCES authorities (name);

ALTER TABLE sec_user_authority ADD CONSTRAINT fkesm40vufwhgtfawxng2s4s1w8 FOREIGN KEY (user_id)
	REFERENCES users (id);

ALTER TABLE child_marks ADD CONSTRAINT fkghk2om1x2jxiu93ky49jfowpn FOREIGN KEY (child_id)
	REFERENCES childs (id);

ALTER TABLE parents ADD CONSTRAINT fkbunaue5n1kwq8j49jeqvgu0f3 FOREIGN KEY (id)
	REFERENCES users (id);

ALTER TABLE file_event ADD CONSTRAINT fk8snmi2dxf30wuwavhvfpusf76 FOREIGN KEY (file_id)
	REFERENCES file_resources (id);

ALTER TABLE lessons ADD CONSTRAINT fk5ogghui2470katri71aovp3nv FOREIGN KEY (class_id)
	REFERENCES school_classes (id);

INSERT INTO authorities (name)
VALUES ('TEACHER'),('ADMIN'),('PARENT'),('CHILD');

INSERT INTO users (id, nickname, password, active, first_name, last_name, patronymic, phone_number, email) VALUES
  ('200', 'lapid', '$2a$10$LNN9IAXzujgcy.NtpkFYie3Ay4u3Xtm9lnTn6Q8f7uc1iPYlh.T8G', TRUE, 'Megan', 'Jordan', 'Cornett',
   '+380994789623', 'email@gmail.com'),
  ('201', 'imche', '$2a$10$3RaZqHqE.U1Fd0v79xe6aOrg5vEtvvdxJKuuPYgh9OydmSEBNTM/u', TRUE, 'Paul', 'Ward', 'Campbell',
   '+380745691281', 'campward@gmail.com'),
  ('202', 'omstr', '$2a$10$8fpc82lh/Gay2R47bkGor.YzNSO5qUSpFOANRW5L6lpg.wlmCiJia', TRUE, 'Steve', 'Parker', 'Matthews',
   '+380696324281', 'mattp@gmail.com'),
  ('203', 'lapid1', '$2a$10$LNN9IAXzujgcy.NtpkFYie3Ay4u3Xtm9lnTn6Q8f7uc1iPYlh.T8G', TRUE, 'Albert', 'Smith', 'Dixon',
   '+380659459881', 'name@gmail.com'),
  ('204', 'lapid2', '$2a$10$LNN9IAXzujgcy.NtpkFYie3Ay4u3Xtm9lnTn6Q8f7uc1iPYlh.T8G', TRUE, 'John', 'Williams', 'Russell',
   '+380658954281', 'wilrust@gmail.com'),
  ('205', 'lapid3', '$2a$10$LNN9IAXzujgcy.NtpkFYie3Ay4u3Xtm9lnTn6Q8f7uc1iPYlh.T8G', TRUE, 'David', 'Evans', 'Fisher',
   '+380669874281', 'evfish@gmail.com'),
  ('206', 'lapid4', '$2a$10$LNN9IAXzujgcy.NtpkFYie3Ay4u3Xtm9lnTn6Q8f7uc1iPYlh.T8G', TRUE, 'Matt', 'Walker', 'Pearson',
   '+380612345681', 'walkpear@gmail.com'),
  ('207', 'lapid5', '$2a$10$LNN9IAXzujgcy.NtpkFYie3Ay4u3Xtm9lnTn6Q8f7uc1iPYlh.T8G', TRUE, 'Jack', 'Lewis', 'Palmer',
   '+380684365281', 'palmlew@gmail.com'),
  ('208', 'lapid6', '$2a$10$LNN9IAXzujgcy.NtpkFYie3Ay4u3Xtm9lnTn6Q8f7uc1iPYlh.T8G', TRUE, 'Mike', 'Clarke', 'Walsh',
   '+380823954281', 'clarkew@gmail.com');

INSERT INTO sec_user_authority (user_id, authority_name) VALUES
  ('200', 'TEACHER'),
  ('201', 'ADMIN'),
  ('201', 'TEACHER'),
  ('202', 'PARENT'),
  ('203', 'PARENT'),
  ('204', 'CHILD'),
  ('205', 'CHILD'),
  ('206', 'CHILD'),
  ('207', 'CHILD');

INSERT INTO teachers (id, description) VALUES
  ('200', 'kjfkjfsks'),
  ('201', 'desctiption1');

INSERT INTO school_classes (id, name, studying_end, studying_start, active, curator_id) VALUES
  ('1', '6a', '01-01-2017', '01-01-2020', TRUE, '200'),
  ('2', '7a', '01-01-2017', '01-01-2020', TRUE, '201');

INSERT INTO childs (id, school_class_id) VALUES
  ('207', '1'),
  ('204', '1'),
  ('205', '2'),
  ('206', '2');

INSERT INTO parents (id, job) VALUES
  ('202', 'job'),
  ('203', 'job');

INSERT INTO relationship (parent_id, child_id) VALUES
  ('202', '204'),
  ('202', '205'),
  ('203', '207'),
  ('203', '206');

INSERT INTO subjects (id, name, alias) VALUES
  ('1', 'math', 'math'),
  ('2', 'biology', 'biology'),
  ('3', 'art', 'art'),
  ('4', 'english', 'english');

INSERT INTO lessons (id, teacher_id, subject_id, class_id) VALUES
  ('1', '200', '1', '1'),
  ('2', '201', '2', '1'),
  ('3', '200', '4', '1'),
  ('4', '200', '3', '2'),
  ('5', '200', '1', '2'),
  ('6', '201', '2', '2');

INSERT INTO lesson_event_types (id, name) VALUES
  ('1', 'Common'),
  ('2', 'Test');

INSERT INTO lesson_events (id, comment, completed, event_date, completion_date, lesson_id) VALUES
  ('8', 'comment10', TRUE, '2017-06-28', '2017-06-28', '1'),
  ('9', 'comment11', TRUE, '2017-06-29', '2017-06-29', '1'),
  ('10', 'comment12', TRUE, '2017-06-30', '2017-06-30', '1'),
  ('1', 'comment1', TRUE, '2017-07-03', '2017-07-03', '1'),
  ('2', 'comment2', TRUE, '2017-07-04', '2017-07-04', '1'),
  ('3', 'comment3', TRUE, '2017-07-05', '2017-07-05', '1'),
  ('4', 'comment4', TRUE, '2017-07-06', '2017-07-06', '1'),
  ('5', 'comment5', TRUE, '2017-07-07', '2017-07-07', '1'),
  ('6', 'comment8', TRUE, '2017-07-10', '2017-07-10', '1'),
  ('7', 'comment9', TRUE, '2017-07-11', '2017-07-11', '1'),
  ('18', 'comment23', TRUE, '2017-06-28', '2017-06-28', '2'),
  ('19', 'comment24', TRUE, '2017-06-29', '2017-06-29', '2'),
  ('20', 'comment25', TRUE, '2017-06-30', '2017-06-30', '2'),
  ('11', 'comment14', TRUE, '2017-07-03', '2017-07-03', '2'),
  ('12', 'comment15', TRUE, '2017-07-04', '2017-07-04', '2'),
  ('13', 'comment16', TRUE, '2017-07-05', '2017-07-05', '2'),
  ('14', 'comment17', TRUE, '2017-07-06', '2017-07-06', '2'),
  ('15', 'comment18', TRUE, '2017-07-07', '2017-07-07', '2'),
  ('16', 'comment21', TRUE, '2017-07-10', '2017-07-10', '2'),
  ('17', 'comment22', TRUE, '2017-07-11', '2017-07-11', '2'),
  ('28', 'comment35', TRUE, '2017-06-28', '2017-06-28', '3'),
  ('29', 'comment36', TRUE, '2017-06-29', '2017-06-29', '3'),
  ('30', 'comment37', TRUE, '2017-06-30', '2017-06-30', '3'),
  ('21', 'comment26', TRUE, '2017-07-03', '2017-07-03', '3'),
  ('22', 'comment27', TRUE, '2017-07-04', '2017-07-04', '3'),
  ('23', 'comment28', TRUE, '2017-07-05', '2017-07-05', '3'),
  ('24', 'comment29', TRUE, '2017-07-06', '2017-07-06', '3'),
  ('25', 'comment30', TRUE, '2017-07-07', '2017-07-07', '3'),
  ('26', 'comment33', TRUE, '2017-07-10', '2017-07-10', '3'),
  ('27', 'comment34', TRUE, '2017-07-11', '2017-07-11', '3'),
  ('38', 'comment48', TRUE, '2017-06-28', '2017-06-28', '4'),
  ('39', 'comment49', TRUE, '2017-06-29', '2017-06-29', '4'),
  ('40', 'comment50', FALSE, '2017-06-30', '2017-06-30','4'),
  ('31', 'comment39', TRUE, '2017-07-03', '2017-07-03', '4'),
  ('32', 'comment40', TRUE, '2017-07-04', '2017-07-04', '4'),
  ('33', 'comment41', FALSE , '2017-07-05', '2017-07-05','4'),
  ('34', 'comment42', TRUE, '2017-07-06', '2017-07-06', '4'),
  ('35', 'comment43', FALSE, '2017-07-07', '2017-07-07', '4'),
  ('36', 'comment46', TRUE, '2017-07-10', '2017-07-10', '4'),
  ('37', 'comment47', FALSE, '2017-07-11', '2017-07-11', '4'),
  ('48', 'comment61', TRUE, '2017-06-28', '2017-06-28', '5'),
  ('49', 'comment62', FALSE, '2017-06-29', '2017-06-29', '5'),
  ('50', 'comment63', TRUE, '2017-06-30', '2017-06-30', '5'),
  ('41', 'comment52', FALSE, '2017-07-03', '2017-07-03', '5'),
  ('42', 'comment53', TRUE, '2017-07-04', '2017-07-04', '5'),
  ('43', 'comment54', TRUE, '2017-07-05', '2017-07-05', '5'),
  ('44', 'comment55', TRUE, '2017-07-06', '2017-07-06', '5'),
  ('45', 'comment56', TRUE, '2017-07-07', '2017-07-07','5'),
  ('46', 'comment59', TRUE, '2017-07-10', '2017-07-10', '5'),
  ('47', 'comment60', TRUE, '2017-07-11', '2017-07-11', '5'),
  ('58', 'comment74', TRUE, '2017-06-28', '2017-06-28', '6'),
  ('59', 'comment75', TRUE, '2017-06-29', '2017-06-29',  '6'),
  ('60', 'comment76', TRUE, '2017-06-30', '2017-06-30',  '6'),
  ('51', 'comment65', TRUE, '2017-07-03', '2017-07-03',  '6'),
  ('52', 'comment66', TRUE, '2017-07-04', '2017-07-04',  '6'),
  ('53', 'comment67', TRUE, '2017-07-05', '2017-07-05',  '6'),
  ('54', 'comment68', TRUE, '2017-07-06', '2017-07-06',  '6'),
  ('55', 'comment69', TRUE, '2017-07-07', '2017-07-07',  '6'),
  ('56', 'comment72', TRUE, '2017-07-10', '2017-07-10',  '6'),
  ('57', 'comment73', TRUE, '2017-07-11', '2017-07-11',  '6');


INSERT INTO child_marks (id, absent, mark, child_id, lesson_event_id,lessoneventtype_id,remark) VALUES
  ('1', TRUE,2, '207', '1',1,'Done'),
  ('2', FALSE,7, '204', '1',2,'Done'),
  ('3', TRUE,8, '207', '2',1,'Done'),
  ('4', FALSE,1, '204', '2',2,'Done'),
  ('5', TRUE,4, '207', '3',1,'Done'),
  ('6', TRUE,6, '204', '3',2,'Done'),
  ('7', TRUE,6, '207', '4',2,'Done'),
  ('8', FALSE,9, '204', '4',1,'Done'),
  ('9', FALSE,8, '207', '5',1,'Done'),
  ('10', FALSE,4, '204', '5',2,'Done'),
  ('11', TRUE,9, '207', '6',2,'Done'),
  ('12', TRUE,1, '204', '6',2,'Done'),
  ('13', FALSE,8, '207', '7',1,'Done'),
  ('14', FALSE,9, '204', '7',2,'Done'),
  ('15', TRUE,0, '207', '8',1,'Done'),
  ('16', TRUE,4, '204', '8',2,'Done'),
  ('17', FALSE,10, '207', '9',2,'Done'),
  ('18', FALSE,6, '204', '9',2,'Done'),
  ('19', FALSE,7, '207', '10',2,'Done'),
  ('20', FALSE,4, '204', '10',2,'Done'),
  ('21', FALSE,5, '207', '11',1,'Done'),
  ('22', FALSE,9, '204', '11',1,'Done'),
  ('23', TRUE,3, '207', '12',1,'Done'),
  ('24', FALSE,4, '204', '12',2,'Done'),
  ('25', FALSE,11, '207', '13',2,'Done'),
  ('26', FALSE,11, '204', '13',1,'Done'),
  ('27', FALSE,1, '207', '14',1,'Done'),
  ('28', FALSE,3, '204', '14',2,'Done'),
  ('29', FALSE,8, '207', '15',1,'Done'),
  ('30', TRUE,5, '204', '15',2,'Done'),
  ('31', TRUE,10, '207', '16',2,'Done'),
  ('32', FALSE,10, '204', '16',1,'Done'),
  ('33', TRUE,0, '207', '17',2,'Done'),
  ('34', FALSE,5, '204', '17',2,'Done'),
  ('35', FALSE,3, '207', '18',2,'Done'),
  ('36', TRUE,5, '204', '18',2,'Done'),
  ('37', FALSE,8, '207', '19',1,'Done'),
  ('38', FALSE,5, '204', '19',2,'Done'),
  ('39', FALSE,2, '207', '20',2,'Done'),
  ('40', FALSE,3, '204', '20',2,'Done'),
  ('41', FALSE,8, '207', '21',2,'Done'),
  ('42', FALSE,7, '204', '21',1,'Done'),
  ('43', TRUE,3, '207', '22',1,'Done'),
  ('44', TRUE,10, '204', '22',1,'Done'),
  ('45', FALSE,11, '207', '23',2,'Done'),
  ('46', FALSE,1, '204', '23',2,'Done'),
  ('47', TRUE,10, '207', '24',2,'Done'),
  ('48', FALSE,2, '204', '24',2,'Done'),
  ('49', FALSE,9, '207', '25',2,'Done'),
  ('50', FALSE,0, '204', '25',2,'Done'),
  ('51', TRUE,0, '207', '26',2,'Done'),
  ('52', FALSE,11, '204', '26',1,'Done'),
  ('53', FALSE,5, '207', '27',2,'Done'),
  ('54', TRUE,2, '204', '27',1,'Done'),
  ('55', FALSE,3, '207', '28',1,'Done'),
  ('56', FALSE,3, '204', '28',2,'Done'),
  ('57', TRUE,6, '207', '29',1,'Done'),
  ('58', FALSE,9, '204', '29',1,'Done'),
  ('59', FALSE,6, '205', '30',1,'Done'),
  ('60', FALSE,10, '206', '30',2,'Done'),
  ('61', TRUE,4, '205', '31',2,'Done'),
  ('62', TRUE,2, '206', '31',2,'Done'),
  ('63', FALSE,11, '205', '32',1,'Done'),
  ('64', FALSE,9, '206', '32',2,'Done'),
  ('65', FALSE,10, '205', '33',1,'Done'),
  ('66', TRUE,4, '206', '33',2,'Done'),
  ('67', FALSE,6, '205', '34',1,'Done'),
  ('68', TRUE,1, '206', '34',1,'Done'),
  ('69', FALSE,1, '205', '35',2,'Done'),
  ('70', FALSE,6, '206', '35',1,'Done'),
  ('71', FALSE,8, '205', '36',2,'Done'),
  ('72', TRUE,0, '206', '36',1,'Done'),
  ('73', FALSE,5, '205', '37',2,'Done'),
  ('74', FALSE,5, '206', '37',2,'Done'),
  ('75', TRUE,3, '205', '38',1,'Done'),
  ('76', FALSE,9, '206', '38',1,'Done'),
  ('77', FALSE,8, '205', '39',1,'Done'),
  ('78', TRUE,4, '206', '39',1,'Done'),
  ('79', TRUE,5, '205', '40',2,'Done'),
  ('80', FALSE,0, '206', '40',2,'Done'),
  ('81', FALSE,6, '205', '41',2,'Done'),
  ('82', FALSE,11, '206', '41',2,'Done'),
  ('83', TRUE,12, '205', '42',2,'Done'),
  ('84', FALSE,0, '206', '42',2,'Done'),
  ('85', FALSE,9, '205', '43',2,'Done'),
  ('86', FALSE,11, '206', '43',1,'Done'),
  ('87', FALSE,12, '205', '44',1,'Done'),
  ('88', FALSE,4, '206', '44',1,'Done'),
  ('89', FALSE,1, '205', '45',1,'Done'),
  ('90', TRUE,9, '206', '45',1,'Done'),
  ('91', TRUE,3, '205', '46',1,'Done'),
  ('92', TRUE,1, '206', '46',1,'Done'),
  ('93', FALSE,8, '205', '47',1,'Done'),
  ('94', TRUE,12, '206', '47',1,'Done'),
  ('95', FALSE,5, '205', '48',1,'Done'),
  ('96', TRUE,11, '206', '48',2,'Done'),
  ('97', TRUE,2, '205', '49',2,'Done'),
  ('98', FALSE,9, '206', '49',2,'Done'),
  ('99', TRUE,7, '205', '50',2,'Done'),
  ('100', FALSE,5, '206', '50',2,'Done'),
  ('101', FALSE,2, '205', '51',2,'Done'),
  ('102', FALSE,8, '206', '51',2,'Done'),
  ('103', TRUE,1, '205', '52',2,'Done'),
  ('104', FALSE,3, '206', '52',2,'Done'),
  ('105', TRUE,0, '205', '53',2,'Done'),
  ('106', TRUE,0, '206', '53',2,'Done'),
  ('107', FALSE,9, '205', '54',2,'Done'),
  ('108', FALSE,11, '206', '54',2,'Done'),
  ('109', FALSE,6, '205', '55',2,'Done'),
  ('110', FALSE,1, '206', '55',2,'Done'),
  ('111', FALSE,12, '205', '56',2,'Done'),
  ('112', FALSE,0, '206', '56',2,'Done'),
  ('113', FALSE,0, '205', '57',2,'Done'),
  ('114', TRUE,7, '206', '57',2,'Done'),
  ('115', FALSE,10, '205', '58',2,'Done'),
  ('116', TRUE,8, '206', '58',2,'Done'),
  ('117', FALSE,11, '205', '59',2,'Done'),
  ('118', TRUE,10, '206', '59',2,'Done'),
  ('119', FALSE,9, '205', '60',2,'Done'),
  ('120', FALSE,3, '206', '60',1,'Done');

INSERT INTO file_resources VALUES
  ('1', 'file1.txt', '/math/2017-06-20/alkghaigy1'),
  ('2', 'file2.ppt', '/math/2017-06-20/alkghaigy2'),
  ('3', 'file3.ppt', '/math/2017-06-20/alkghaigy3'),
  ('4', 'file4.ppt', '/math/2017-06-20/alkghaigy4'),
  ('5', 'file5.ppt', '/math/2017-06-20/alkghaigy5');

INSERT INTO file_event VALUES
  ('1', '1'),
  ('2', '2'),
  ('3', '7'),
  ('4', '7'),
  ('5', '17');