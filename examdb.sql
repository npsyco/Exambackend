DROP SCHEMA IF EXISTS examdb;
CREATE SCHEMA `examdb`;
USE examdb;


CREATE TABLE IF NOT EXISTS `supervisor` (
  `supervisor_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NULL,
  PRIMARY KEY (`supervisor_id`))
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `student` (
  `student_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(60) NULL,
  `email` VARCHAR(60) NULL,
  `supervisor_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_supervisor_id`
    FOREIGN KEY (`supervisor_id`)
    REFERENCES `supervisor` (`id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB;


CREATE INDEX `fk_supervisor_id_idx` ON `student` (`supervisor_id` ASC) VISIBLE;


INSERT INTO supervisor VALUES
(1, 'Christian'),
(2, 'Juste'),
(3, 'Asthor');