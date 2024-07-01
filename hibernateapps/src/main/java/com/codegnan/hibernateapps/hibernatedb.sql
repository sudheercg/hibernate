create schema hibernatedb;

use hibernatedb;

CREATE TABLE `employee` (
  `eid` int NOT NULL,
  `ename` varchar(255) DEFAULT NULL,
  `esal` float DEFAULT NULL,
  `eaddr` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`eid`)
) ;
