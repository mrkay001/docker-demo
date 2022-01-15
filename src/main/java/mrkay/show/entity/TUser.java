package mrkay.show.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * (TUser)表实体类
 *
 * @author liukai
 * @since 2022-01-15 13:36:12
 */
@SuppressWarnings("serial")
@Data
@ToString
public class TUser extends Model<TUser> {
    //主键ID
    private Long id;
    //用户名
    private String username;
    //密码
    private String password;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;
}

