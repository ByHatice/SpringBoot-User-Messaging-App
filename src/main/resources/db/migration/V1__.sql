CREATE TABLE message
(
    id                 BIGINT AUTO_INCREMENT NOT NULL,
    content            LONGTEXT              NULL,
    user_id            BIGINT                NOT NULL,
    is_public          BIT(1)                NOT NULL,
    created_date       datetime              NOT NULL,
    last_modified_date datetime              NOT NULL,
    CONSTRAINT pk_message PRIMARY KEY (id)
);

CREATE TABLE user
(
    id              BIGINT AUTO_INCREMENT NOT NULL,
    user_name       VARCHAR(255)          NOT NULL,
    profile_picture VARCHAR(255)          NULL,
    full_name       VARCHAR(255)          NOT NULL,
    email           VARCHAR(255)          NOT NULL,
    CONSTRAINT pk_user PRIMARY KEY (id)
);

ALTER TABLE message
    ADD CONSTRAINT FK_MESSAGE_ON_USER FOREIGN KEY (user_id) REFERENCES user (id);