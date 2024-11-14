CREATE DATABASE gym_manager_v1;

USE gym_manager_v1;

create user 'user_gymmanager'@'localhost' identified by 'PasswdI123I';

GRANT ALL privileges ON gym_manager_v1.* TO 'user_gymmanager'@'localhost';

FLUSH privileges;