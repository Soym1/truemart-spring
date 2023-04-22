INSERT INTO roles VALUES (1,'User'),(2,'Shop');
INSERT INTO categories VALUES (1,'Computers & Laptops'), (2,'Phones & Tablets'), (3,'Accessories'), (4,'Sports'), (5,'Electronics'),(6,'Furniture'), (7,'TV'), (8,'Fashions'), (9,'Beauty');
INSERT INTO `truemart`.`users` (`date_of_birth`, `id`, `address`, `city`, `email`, `gender`, `name`, `password`, `phone_number`, `username`) VALUES ('1999-03-06', '1', 'Tổ 22, Mỹ Đa Đông 7, Mỹ An, Ngũ Hành Sơn, Đà Nẵng', 'Đà Nẵng', 'trungnguyen.itmo@gmail.com', 'Male', 'trung123', '123456', '123456789', 'trung');
INSERT INTO `truemart`.`shops` (`id`, `user_id`, `shop_address`, `shop_img`, `shop_name`, `shop_phone`) VALUES ('1', '1', 'Tổ 22, Mỹ Đa Đông 7, Mỹ An, Ngũ Hành Sơn, Đà Nẵng', 'avane', 'trung2', '123456789');

INSERT INTO products (id, name, shop_id, begin_price, discount_price, category_id, date, quantity, description) VALUES ('1', 'Apple 2020 MacBook Air Laptop M1 Chip, Backlit Keyboard', '1', '19000000', '18000000', '1', '2023-04-18', '10', 'Chất lượng');
INSERT INTO products (id, name, shop_id, begin_price, discount_price, category_id, date, quantity, description) VALUES ('2', 'Apple 2021 MacBook Pro - Space Gray - Z14X000HQ', '1', '19000000', '18000000', '1', '2023-04-19', '10', 'Chất lượng');
INSERT INTO products (id, name, shop_id, begin_price, discount_price, category_id, date, quantity, description) VALUES ('3', 'ASUS ROG Strix G15 (2022) Gaming Laptop G513RC-IS74', '1', '19000000', '18000000', '1', '2023-04-20', '10', 'Chất lượng');
INSERT INTO products (id, name, shop_id, begin_price, discount_price, category_id, date, quantity, description) VALUES ('4', 'ASUS ROG Strix G16 (2023) Gaming Laptop G614JI-AS94', '1', '19000000', '18000000', '1', '2023-04-21', '10', 'Chất lượng');
INSERT INTO products (id, name, shop_id, begin_price, discount_price, category_id, date, quantity, description) VALUES ('5', 'ASUS Vivobook Laptop L210 11.6 Ultra Thin Laptop L210MA-DS04', '1', '19000000', '18000000', '1', '2023-04-22', '10', 'Chất lượng');
INSERT INTO products (id, name, shop_id, begin_price, discount_price, category_id, date, quantity, description) VALUES ('6', 'Lenovo 2022 Newest Ideapad 3 Laptop', '1', '19000000', '18000000', '1', '2023-04-23', '10', 'Chất lượng');
INSERT INTO products (id, name, shop_id, begin_price, discount_price, category_id, date, quantity, description) VALUES ('7', 'Lenovo 2023 Newest IdeaPad 3i Laptop Bundle wit', '1', '19000000', '18000000', '1', '2023-04-24', '10', 'Chất lượng');
INSERT INTO products (id, name, shop_id, begin_price, discount_price, category_id, date, quantity, description) VALUES ('8', 'Lenovo IdeaPad 3i Laptop Grey', '1', '19000000', '18000000', '1', '2023-04-25', '10', 'Chất lượng');
INSERT INTO products (id, name, shop_id, begin_price, discount_price, category_id, date, quantity, description) VALUES ('9', 'SAMSUNG Galaxy S22 Ultra Cell Phone, US Version, Bur', '1', '19000000', '18000000', '1', '2023-04-26', '10', 'Chất lượng');
INSERT INTO products (id, name, shop_id, begin_price, discount_price, category_id, date, quantity, description) VALUES ('10', 'SAMSUNG Galaxy Z Flip 4 Cell Phone US Version, Bora Purpl', '1', '19000000', '18000000', '1', '2023-04-27', '10', 'Chất lượng');

INSERT INTO image_products (id, product_id, name, type, context) VALUES ('1', '1', '1', '.jpg', '/templates/public/img/total_category/1/1.jpg');
INSERT INTO image_products (id, product_id, name, type, context) VALUES ('2', '2', '1', '.jpg', '/templates/public/img/total_category/2/1.jpg');
INSERT INTO image_products (id, product_id, name, type, context) VALUES ('3', '3', '1', '.jpg', '/templates/public/img/total_category/3/1.jpg');
INSERT INTO image_products (id, product_id, name, type, context) VALUES ('4', '4', '1', '.jpg', '/templates/public/img/total_category/4/1.jpg');
INSERT INTO image_products (id, product_id, name, type, context) VALUES ('5', '5', '1', '.jpg', '/templates/public/img/total_category/5/1.jpg');
INSERT INTO image_products (id, product_id, name, type, context) VALUES ('6', '6', '1', '.jpg', '/templates/public/img/total_category/1/1.jpg');
INSERT INTO image_products (id, product_id, name, type, context) VALUES ('7', '7', '1', '.jpg', '/templates/public/img/total_category/1/1.jpg');
INSERT INTO image_products (id, product_id, name, type, context) VALUES ('8', '8', '1', '.jpg', '/templates/public/img/total_category/1/1.jpg');
INSERT INTO image_products (id, product_id, name, type, context) VALUES ('9', '9', '1', '.jpg', '/templates/public/img/total_category/1/1.jpg');
INSERT INTO image_products (id, product_id, name, type, context) VALUES ('10', '10', '1', '.jpg','/templates/public/img/total_category/1/1.jpg');