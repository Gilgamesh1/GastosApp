-- -----------------------------------------------------
-- Table categoria
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS categoria (
  id_categoria INT NOT NULL AUTO_INCREMENT,
  descripcion VARCHAR(45) NULL,
  PRIMARY KEY (id_categoria))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table articulo
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS articulo (
  id_articulo INT NOT NULL AUTO_INCREMENT,
  idcategoria_fk INT NOT NULL,
  descripcion VARCHAR(100) NULL,
  PRIMARY KEY (id_articulo),
  INDEX fk_articulo_categoria1_idx (idcategoria_fk ASC),
  CONSTRAINT fk_articulo_categoria1
    FOREIGN KEY (idcategoria_fk)
    REFERENCES categoria (id_categoria)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table boleta
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS boleta (
  id_boleta INT NOT NULL AUTO_INCREMENT,
  serie VARCHAR(5) NULL,
  numero VARCHAR(10) NULL,
  archivo BLOB NULL,
  PRIMARY KEY (id_boleta))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table gasto
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS gasto (
  id_gasto INT NOT NULL AUTO_INCREMENT,
  idarticulo_fk INT NOT NULL,
  idboleta_fk INT NULL,
  fecha DATETIME NULL,
  gasto DOUBLE NULL,
  PRIMARY KEY (id_gasto),
  INDEX fk_gasto_articulo1_idx (idarticulo_fk ASC),
  INDEX fk_gasto_boleta1_idx (idboleta_fk ASC),
  CONSTRAINT fk_gasto_articulo1
    FOREIGN KEY (idarticulo_fk)
    REFERENCES articulo (id_articulo)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_gasto_boleta1
    FOREIGN KEY (idboleta_fk)
    REFERENCES boleta (id_boleta)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;