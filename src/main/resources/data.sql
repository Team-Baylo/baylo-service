------- User Table -------
DROP TABLE IF EXISTS trader CASCADE;

CREATE TABLE trader (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
);

INSERT INTO trader (first_name, last_name, email) VALUES
    ('Ian Angelo', 'Tappa', 'itappa@baylo.com'),
    ('Nick', 'Faelnar', 'nfaelnar@baylo.com'),
    ('Alma', 'Santiago', 'asantiago@baylo.com'),
    ('Kayla', 'Suarez', 'ksuarez@baylo.com'),
    ('Miguel', 'Roque', 'mroque@baylo.com');


------- Category Table -------
DROP TABLE IF EXISTS category CASCADE;

CREATE TABLE category (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

INSERT INTO category (name) VALUES
    ('Table'),
    ('Chair'),
    ('Plate'),
    ('Mug'),
    ('Knife');

------- Item Table -------
DROP TABLE IF EXISTS item CASCADE;

CREATE TABLE item (
    id INT AUTO_INCREMENT PRIMARY KEY,
    owner_id INT,
    category_id INT,
    status INT NOT NULL,
    title VARCHAR(100) NOT NULL,
    description VARCHAR(250) NOT NULL,
    FOREIGN KEY (owner_id) REFERENCES trader(id),
    FOREIGN KEY (category_id) REFERENCES category(id)
);

INSERT INTO item (owner_id, category_id, status, title, description) VALUES
    (1, 1, 1, 'Round', 'Round Table'),
    (2, 1, 1, 'Square', 'Square Table'),
    (3, 2, 1, 'Computer', 'Computer Chair'),
    (4, 4, 1, 'Coffee', 'Coffee Mug'),
    (5, 5, 1, 'Bread', 'Bread Knife');

------- Item Image Table -------
DROP TABLE IF EXISTS item_image;

CREATE TABLE item_image (
    id INT AUTO_INCREMENT PRIMARY KEY,
    item_id INT,
    status INT NOT NULL,
    FOREIGN KEY (item_id) REFERENCES item(id)
);

------- Trade Request Table -------
DROP TABLE IF EXISTS trade_request;

CREATE TABLE trade_request (
    id INT AUTO_INCREMENT PRIMARY KEY,
    trade_item_id INT,
    want_item_id INT,
    status INT NOT NULL,
    FOREIGN KEY (trade_item_id) REFERENCES item(id),
    FOREIGN KEY (want_item_id) REFERENCES item(id)
);

