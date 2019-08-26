alter table categoria add column created_at timestamp DEFAULT CURRENT_TIMESTAMP;
alter table categoria add column updated_at timestamp DEFAULT CURRENT_TIMESTAMP;
alter table articulo add column created_at timestamp DEFAULT CURRENT_TIMESTAMP;
alter table articulo add column updated_at timestamp DEFAULT CURRENT_TIMESTAMP;
alter table boleta add column created_at timestamp DEFAULT CURRENT_TIMESTAMP;
alter table boleta add column updated_at timestamp DEFAULT CURRENT_TIMESTAMP;
alter table gasto add column created_at timestamp DEFAULT CURRENT_TIMESTAMP;
alter table gasto add column updated_at timestamp DEFAULT CURRENT_TIMESTAMP;