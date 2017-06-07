DROP TABLE students;
DROP TABLE houses;

CREATE TABLE students (
  id SERIAL8 primary key,
  first_name VARCHAR(255),
  second_name VARCHAR(255),
  house VARCHAR(255),
  age INT4,
  pic VARCHAR(255)
);

CREATE TABLE houses (
  id SERIAL8 primary key,
  name VARCHAR(255)
);

-- ALTER TABLE students ADD house_id INT8 references houses(id);
-- ALTER TABLE students DROP COLUMN house;