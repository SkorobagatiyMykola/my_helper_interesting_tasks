--Draw The Triangle 2
--https://www.hackerrank.com/challenges/draw-the-triangle-2/problem?isFullScreen=true
DELIMITER $$
CREATE PROCEDURE P(N INT)
BEGIN
    DECLARE x  INT;
    DECLARE y  INT;
    DECLARE str  VARCHAR(255);

    SET x = 0;
    SET str =  '';

    loop_label:  LOOP
        IF  x >= N THEN
            LEAVE  loop_label;
        END  IF;
        SET  x = x + 1;
        SET str =  '';
        SET  y =0;
        label1: WHILE y < x DO
            SET  y = y + 1;
            IF  y>1 THEN
               SET str = CONCAT(str, ' *');
            ELSE
               SET str =CONCAT(str, '*');
            END IF;
        END WHILE label1;
         SELECT str as ' ';
        -- select repeat('*',4);
        -- SELECT str;
    END LOOP loop_label;
    -- SELECT str as '';
END$$

DELIMITER ;

CALL P(20);