CREATE TABLE Content (
    id INTEGER AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    description text,
    status VARCHAR(20) NOT NULL,
    content_type VARCHAR(50) NOT NULL,
    date_created TIMESTAMP NOT NULL,
    date_updated TIMESTAMP,
    url VARCHAR(255),
    primary key(id)
     );

INSERT INTO Content(title,desc,status,content_type, date_created)
VALUES('Arch blog post', 'first blog post','IDEA', 'ARTICLE', CURRENT_TIMESTAMP)







)



