CREATE SCHEMA food;
USE food;

CREATE TABLE restaurant (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255)
);

CREATE TABLE menu_item (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(255),
    image_link VARCHAR(255),
    restaurant_id BIGINT,
    price DECIMAL(10,2)
);


INSERT INTO restaurant (name, email)
VALUES
    ('Cafe Delight', 'cafedelight@example.com'),
    ('Sushi Sensation', 'sushisensation@example.com'),
    ('Gourmet Grill', 'gourmetgrill@example.com'),
    ('Taco Ring', 'tacoring@example.com'),
    ('Bistro Bliss', 'bistrobliss@example.com');

-- Menu items for Restaurant 1
INSERT INTO menu_item (name, description, image_link, restaurant_id, price)
VALUES
    ('Burger', 'Delicious beef burger', 'https://example.com/burger.jpg', 1, 10.99),
    ('Pizza', 'Tasty pepperoni pizza', 'https://example.com/pizza.jpg', 1, 12.49),
    ('Pasta', 'Creamy Alfredo pasta', 'https://example.com/pasta.jpg', 1, 9.99),
    ('Salad', 'Fresh garden salad', 'https://example.com/salad.jpg', 1, 7.99),
    ('Soda', 'Refreshing cola', 'https://example.com/soda.jpg', 1, 2.49);

-- Menu items for Restaurant 2
INSERT INTO menu_item (name, description, image_link, restaurant_id, price)
VALUES
    ('Sushi', 'Assorted sushi platter', 'https://example.com/sushi.jpg', 2, 18.99),
    ('Tempura', 'Crispy tempura shrimp', 'https://example.com/tempura.jpg', 2, 14.99),
    ('Teriyaki Chicken', 'Grilled chicken with teriyaki sauce', 'https://example.com/teriyaki.jpg', 2, 15.99),
    ('Miso Soup', 'Traditional Japanese miso soup', 'https://example.com/miso.jpg', 2, 4.99),
    ('Green Tea Ice Cream', 'Matcha-flavored ice cream', 'https://example.com/greentea.jpg', 2, 6.99);

-- Menu items for Restaurant 3
INSERT INTO menu_item (name, description, image_link, restaurant_id, price)
VALUES
    ('Steak', 'Juicy ribeye steak', 'https://example.com/steak.jpg', 3, 22.99),
    ('Seafood Platter', 'Fresh seafood medley', 'https://example.com/seafood.jpg', 3, 26.99),
    ('Grilled Vegetables', 'Assorted grilled veggies', 'https://example.com/vegetables.jpg', 3, 9.99),
    ('Garlic Bread', 'Warm garlic breadsticks', 'https://example.com/garlicbread.jpg', 3, 5.49),
    ('Red Wine', 'Fine red wine', 'https://example.com/redwine.jpg', 3, 14.99);

-- Menu items for Restaurant 4
INSERT INTO menu_item (name, description, image_link, restaurant_id, price)
VALUES
    ('Taco', 'Spicy beef taco', 'https://example.com/taco.jpg', 4, 8.99),
    ('Enchiladas', 'Cheesy enchiladas', 'https://example.com/enchiladas.jpg', 4, 10.99),
    ('Burrito', 'Bean and cheese burrito', 'https://example.com/burrito.jpg', 4, 9.49),
    ('Guacamole', 'Freshly made guacamole', 'https://example.com/guacamole.jpg', 4, 4.99),
    ('Margarita', 'Classic margarita', 'https://example.com/margarita.jpg', 4, 7.99);

-- Menu items for Restaurant 5
INSERT INTO menu_item (name, description, image_link, restaurant_id, price)
VALUES
    ('Fried Chicken', 'Crispy fried chicken', 'https://example.com/friedchicken.jpg', 5, 11.99),
    ('Biscuits', 'Flaky biscuits with honey', 'https://example.com/biscuits.jpg', 5, 4.99),
    ('Macaroni and Cheese', 'Creamy mac and cheese', 'https://example.com/macandcheese.jpg', 5, 8.99),
    ('Coleslaw', 'Homemade coleslaw', 'https://example.com/coleslaw.jpg', 5, 3.99),
    ('Sweet Tea', 'Southern-style sweet tea', 'https://example.com/sweettea.jpg', 5, 2.99);

