-- knowledge_packages table:
INSERT INTO `k-pac`.`knowledge_packages` (`title`, `description`) VALUES ('test1', 'test_description');
INSERT INTO `k-pac`.`knowledge_packages` (`title`, `description`) VALUES ('test2', 'test_description');
INSERT INTO `k-pac`.`knowledge_packages` (`title`, `description`) VALUES ('test3', 'test_description');
INSERT INTO `k-pac`.`knowledge_packages` (`title`, `description`) VALUES ('test4', 'test_description');
INSERT INTO `k-pac`.`knowledge_packages` (`title`, `description`) VALUES ('test5', 'test_description');
INSERT INTO `k-pac`.`knowledge_packages` (`title`, `description`) VALUES ('test6', 'test_description');
INSERT INTO `k-pac`.`knowledge_packages` (`title`, `description`) VALUES ('test7', 'test_description');
INSERT INTO `k-pac`.`knowledge_packages` (`title`, `description`) VALUES ('test8', 'test_description');
INSERT INTO `k-pac`.`knowledge_packages` (`title`, `description`) VALUES ('test9', 'test_description');
INSERT INTO `k-pac`.`knowledge_packages` (`title`, `description`) VALUES ('test10', 'test_description');

-- knowledge_package_sets table:
INSERT INTO `k-pac`.`knowledge_package_sets` (`title`) VALUES ('set1');
INSERT INTO `k-pac`.`knowledge_package_sets` (`title`) VALUES ('set2');
INSERT INTO `k-pac`.`knowledge_package_sets` (`title`) VALUES ('set3');
INSERT INTO `k-pac`.`knowledge_package_sets` (`title`) VALUES ('set4');
INSERT INTO `k-pac`.`knowledge_package_sets` (`title`) VALUES ('set5');
INSERT INTO `k-pac`.`knowledge_package_sets` (`title`) VALUES ('set6');

-- pac_sets table:
INSERT INTO `k-pac`.`pac_sets` (knowledge_package_id, knowledge_package_set_id) VALUES (1, 1);
INSERT INTO `k-pac`.`pac_sets` (knowledge_package_id, knowledge_package_set_id) VALUES (2, 1);
INSERT INTO `k-pac`.`pac_sets` (knowledge_package_id, knowledge_package_set_id) VALUES (3, 1);
INSERT INTO `k-pac`.`pac_sets` (knowledge_package_id, knowledge_package_set_id) VALUES (4, 1);
INSERT INTO `k-pac`.`pac_sets` (knowledge_package_id, knowledge_package_set_id) VALUES (5, 1);
INSERT INTO `k-pac`.`pac_sets` (knowledge_package_id, knowledge_package_set_id) VALUES (6, 1);
INSERT INTO `k-pac`.`pac_sets` (knowledge_package_id, knowledge_package_set_id) VALUES (1, 2);
INSERT INTO `k-pac`.`pac_sets` (knowledge_package_id, knowledge_package_set_id) VALUES (2, 2);
INSERT INTO `k-pac`.`pac_sets` (knowledge_package_id, knowledge_package_set_id) VALUES (3, 2);
INSERT INTO `k-pac`.`pac_sets` (knowledge_package_id, knowledge_package_set_id) VALUES (7, 3);
INSERT INTO `k-pac`.`pac_sets` (knowledge_package_id, knowledge_package_set_id) VALUES (8, 3);
INSERT INTO `k-pac`.`pac_sets` (knowledge_package_id, knowledge_package_set_id) VALUES (9, 3);
INSERT INTO `k-pac`.`pac_sets` (knowledge_package_id, knowledge_package_set_id) VALUES (10, 3);
INSERT INTO `k-pac`.`pac_sets` (knowledge_package_id, knowledge_package_set_id) VALUES (4, 4);
INSERT INTO `k-pac`.`pac_sets` (knowledge_package_id, knowledge_package_set_id) VALUES (5, 4);
INSERT INTO `k-pac`.`pac_sets` (knowledge_package_id, knowledge_package_set_id) VALUES (8, 5);
INSERT INTO `k-pac`.`pac_sets` (knowledge_package_id, knowledge_package_set_id) VALUES (9, 5);
INSERT INTO `k-pac`.`pac_sets` (knowledge_package_id, knowledge_package_set_id) VALUES (8, 5);
INSERT INTO `k-pac`.`pac_sets` (knowledge_package_id, knowledge_package_set_id) VALUES (9, 5);
INSERT INTO `k-pac`.`pac_sets` (knowledge_package_id, knowledge_package_set_id) VALUES (1, 6);
INSERT INTO `k-pac`.`pac_sets` (knowledge_package_id, knowledge_package_set_id) VALUES (8, 6);
