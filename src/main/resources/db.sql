DROP DATABASE IF EXISTS truemart;
CREATE DATABASE truemart;
USE truemart;

CREATE TABLE `users` (
	`id` BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(45) NOT NULL UNIQUE,
    `password` VARCHAR(45) NOT NULL,
    `name` VARCHAR(45) NOT NULL,
    `date_of_birth` DATE NOT NULL,
    `gender` INT NOT NULL,
    `email` VARCHAR(255) NOT NULL,
	`phone_number` VARCHAR(20) NOT NULL,
    `address` VARCHAR(255) NOT NULL,
    `city` VARCHAR(255) NOT NULL
);

CREATE TABLE `genders` (
	`id` INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	`gender` VARCHAR(45) NOT NULL UNIQUE
);

CREATE TABLE `roles` (
	`id` INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	`role` VARCHAR(45) NOT NULL UNIQUE
);

CREATE TABLE `products` (
	`id` BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `shop` BIGINT NOT NULL,
    `name` VARCHAR(45) NOT NULL,
    `category` INT NOT NULL,
    `description` TEXT NOT NULL,
    `begin_price` DOUBLE NOT NULL,
    `discount_price` DOUBLE
);

CREATE TABLE `images` (
	`id` BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(45) NOT NULL,
	`type` VARCHAR(45) NOT NULL,
	`product_id` BIGINT,
    `user_id` BIGINT
);

CREATE TABLE `product_details` (
	`id` BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `product_id` BIGINT NOT NULL,
    `tag` VARCHAR(255) NOT NULL,
    `context` TEXT NOT NULL
);

CREATE TABLE `shops` (
	`id` BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	`shop_name` VARCHAR(255) NOT NULL,
    `shop_address` VARCHAR(255) NOT NULL,
    `shop_phone` VARCHAR(20) NOT NULL,
    `user_id` BIGINT NOT NULL
);

CREATE TABLE `user_roles` (
	`id` BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `role_id` INT NOT NULL,
    `user_id` BIGINT NOT NULL
);


ALTER TABLE `users` ADD CONSTRAINT `gender_users_PK` FOREIGN KEY `users`(`gender`) REFERENCES `genders`(`id`);
ALTER TABLE `images`ADD CONSTRAINT `product_images_PK` FOREIGN KEY `images`(`product_id`) REFERENCES `products`(`id`);
ALTER TABLE `images`ADD CONSTRAINT `user_images_PK` FOREIGN KEY `images`(`user_id`) REFERENCES `users`(`id`);
ALTER TABLE `product_details` ADD FOREIGN KEY `product_details`(`product_id`) REFERENCES `products`(`id`);
ALTER TABLE `user_roles` ADD CONSTRAINT `role_user_roles_PK` FOREIGN KEY `user_roles`(`role_id`) REFERENCES `roles`(`id`);
ALTER TABLE `user_roles` ADD CONSTRAINT `user_user_roles_PK` FOREIGN KEY `user_roles`(`user_id`) REFERENCES `users`(`id`);
ALTER TABLE `shops` ADD CONSTRAINT `user_id_shops` FOREIGN KEY `shops`(`user_id`) REFERENCES `user_roles`(`id`);
ALTER TABLE `products` ADD CONSTRAINT `shop_products_PK` FOREIGN KEY `products`(`shop`) REFERENCES `shops`(`id`); 