CREATE TABLE PINCODE_DETAIL
(
  ID NUMBER GENERATED ALWAYS AS IDENTITY  
, PINCODE VARCHAR2(6) NOT NULL 
, CONSTRAINT PINCODE_DETAILS_PK PRIMARY KEY ( ID )
ENABLE 
);
