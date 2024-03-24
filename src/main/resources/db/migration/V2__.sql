ALTER TABLE message
    MODIFY created_date datetime NULL;

ALTER TABLE user
    MODIFY full_name VARCHAR(255) NULL;

ALTER TABLE message
    MODIFY is_public BIT(1) NULL;

ALTER TABLE message
    MODIFY last_modified_date datetime NULL;

ALTER TABLE user
    MODIFY user_name VARCHAR(255) NULL;