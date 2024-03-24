CREATE TABLE user (
                      id BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
                      userName VARCHAR(255) UNIQUE NOT NULL,
                      profilePicture VARCHAR(255),
                      fullName VARCHAR(255) NOT NULL,
                      email VARCHAR(255) NOT NULL
);

CREATE TABLE message (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
                         content TEXT,
                         user_id BIGINT NOT NULL,
                         isPublic BOOLEAN NOT NULL DEFAULT FALSE,
                         createdDate TIMESTAMP NOT NULL,
                         lastModifiedDate TIMESTAMP,
                         FOREIGN KEY (user_id) REFERENCES user(id)
);
