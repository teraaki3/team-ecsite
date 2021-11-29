INSERT INTO mst_user
(user_name,password,family_name,first_name,family_name_kana,first_name_kana,gender)
VALUES ("yamada@gmail.com","123","山田","太郎","やまだ","たろう",0);


INSERT INTO mst_category
(category_name,category_description)
VALUES('肉類','肉類のカテゴリーです');

INSERT INTO mst_category
(category_name,category_description)
VALUES('野菜','野菜ののカテゴリーです');

INSERT INTO mst_category
(category_name,category_description)
VALUES('魚類','魚類のカテゴリーです');

INSERT INTO mst_category
(category_name,category_description)
VALUES('果物','果物のカテゴリーです');



INSERT INTO mst_product
(product_name,product_name_kana,product_description,category_id,price,image_full_path,release_date,release_company)
VALUE('牛ステーキ肉300g','すてーき','steak',1,4000,"/img/steak.jpg",'2021/11','nova北海道');

INSERT INTO mst_product
(product_name,product_name_kana,product_description,category_id,price,image_full_path,release_date,release_company)
VALUE('しゃぶしゃぶ用豚肉300g','しゃぶしゃぶようぶたにく','syabsyab',1,2500,"/img/syabsyab.jpg",'2021/11','nova鹿児島');

INSERT INTO mst_product
(product_name,product_name_kana,product_description,category_id,price,image_full_path,release_date,release_company)
VALUE('蒸し鶏500g','むしどり','musidori',1,1500,"/img/musidori.jpg",'2021/11','nova宮崎');

INSERT INTO mst_product
(product_name,product_name_kana,product_description,category_id,price,image_full_path,release_date,release_company)
VALUE('トマト600g','とまと','tomato',2,2500,"/img/tomato.jpg",'2021/11','nova熊本');

INSERT INTO mst_product
(product_name,product_name_kana,product_description,category_id,price,image_full_path,release_date,release_company)
VALUE('ピーマン600g','ぴーまん','green pepper',2,1000,"/img/piman.jpg",'2021/11','nova茨城');

INSERT INTO mst_product
(product_name,product_name_kana,product_description,category_id,price,image_full_path,release_date,release_company)
VALUE('ナス600g','なす','eggplant',2,900,"/img/nas.jpg",'2021/11','nova高知');

INSERT INTO mst_product
(product_name,product_name_kana,product_description,category_id,price,image_full_path,release_date,release_company)
VALUE('マグロ中とろ500g','まぐろちゅうとろ','tuna',3,3000,"/img/maguro.jpg",'2021/11','nova静岡');

INSERT INTO mst_product
(product_name,product_name_kana,product_description,category_id,price,image_full_path,release_date,release_company)
VALUE('さんま500g','さんま','pacific saury',3,2500,"/img/sanma.jpg",'2021/11','nova北海道');

INSERT INTO mst_product
(product_name,product_name_kana,product_description,category_id,price,image_full_path,release_date,release_company)
VALUE('鮭切り身500g','さけのきりみ','salmon',3,2000,"/img/sake.jpg",'2021/11','nova北海道');

INSERT INTO mst_product
(product_name,product_name_kana,product_description,category_id,price,image_full_path,release_date,release_company)
VALUE('りんご500g','りんご','apple',4,1500,"/img/apple.jpg",'2021/11','nova青森');

INSERT INTO mst_product
(product_name,product_name_kana,product_description,category_id,price,image_full_path,release_date,release_company)
VALUE('オレンジ500g','おれんじ','orange',4,1500,"/img/orange.jpg",'2021/11','nova広島');

INSERT INTO mst_product
(product_name,product_name_kana,product_description,category_id,price,image_full_path,release_date,release_company)
VALUE('桃500g','もも','peach',4,2000,"/img/momo.jpg",'2021/11','nova山梨');