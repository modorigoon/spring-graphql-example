DROP TABLE IF EXISTS newsfeed;
CREATE TABLE newsfeed
(
    id         VARCHAR(32)   NOT NULL PRIMARY KEY,
    author     VARCHAR(128)  NOT NULL,
    content    VARCHAR(1024) NOT NULL,
    created_at DATETIME
);
