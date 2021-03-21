CREATE TABLE products (
    id serial NOT NULL primary key,
    title varchar NOT NULL,
    price float8 NOT NULL,
    count int not null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp
);

INSERT INTO products (title, price, count) VALUES
    ('Milk',130.0,0),
    ('Orange',50.0,235),
    ('Lemon',90.0,456),
    ('Cucumber',110.0,4835),
    ('Bread',30.0,349),
    ('Boots',150.0,120),
    ('Tea',90.0,945),
    ('Jeans',500.0,237),
    ('Hat',870.0,128),
    ('Coffee',600.0,823),
    ('Pork',420.0,8455),
    ('Turkey',99.0,834),
    ('Salmon',199.0,813),
    ('Trout',175.0,183),
    ('Peach',450.0,843),
    ('Raspberry',399.0,183),
    ('Pineapple',999.0,734);