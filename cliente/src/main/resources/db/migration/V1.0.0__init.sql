create table cliente (
    id serial primary key,
    name varchar(50) not null,
    last_Name varchar(50) not null,
    email varchar(100) not null,
    phone varchar(20) not null
);


INSERT INTO cliente (name, last_Name, email, phone) VALUES
('John', 'Doe', 'john.doe@example.com', '123456789'),
('Jane', 'Smith', 'jane.smith@example.com', '987654321'),
('Alice', 'Johnson', 'alice.johnson@example.com', '555555555'),
('Bob', 'Brown', 'bob.brown@example.com', '111111111'),
('Charlie', 'Davis', 'charlie.davis@example.com', '123456789');