CREATE DATABASE formAssets;

GRANT ALL ON formAssets.* TO formAssets@'%' IDENTIFIED BY 'formAssets';
GRANT ALL ON formAssets.* TO formAssets@localhost IDENTIFIED BY 'formAssets';

USE formAssets;

CREATE TABLE loans (
  id INTEGER PRIMARY KEY,
  totalLoan decimal(15,2),
  cancelFee decimal(15,2),
  studyFee decimal(15,2),
  openningFee decimal(15,2),
  modifyFee decimal(15,2)
);

