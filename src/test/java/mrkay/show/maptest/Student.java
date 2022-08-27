package mrkay.show.maptest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author liukai
 * @date 2022/4/15 11:06
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String username;
    private String password;
}
