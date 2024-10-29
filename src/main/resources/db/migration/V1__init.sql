-- src/main/resources/db/migration/V1__create_person_table_and_insert_data.sql

-- Criação da tabela person
CREATE TABLE person (
                        person_id SERIAL PRIMARY KEY,
                        first_name VARCHAR(45) NOT NULL,
                        last_name VARCHAR(45) NOT NULL,
                        created_at TIMESTAMPTZ NOT NULL DEFAULT CURRENT_TIMESTAMP
);

-- Inserção de dados na tabela person
INSERT INTO person (first_name, last_name, created_at) VALUES
                                                           ('John', 'Doe', '2023-10-01 10:00:00+00'),
                                                           ('Jane', 'Doe', '2023-10-02 11:30:00+00'),
                                                           ('Alice', 'Smith', '2023-10-03 14:45:00+00'),
                                                           ('Bob', 'Brown', '2023-10-04 09:20:00+00');