package mrkay.show.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import mrkay.show.dao.TUserDao;
import mrkay.show.entity.TUser;
import mrkay.show.service.TUserService;
import org.springframework.stereotype.Service;

/**
 * (TUser)表服务实现类
 *
 * @author liukai
 * @since 2022-01-15 13:36:13
 */
@Service("tUserService")
public class TUserServiceImpl extends ServiceImpl<TUserDao, TUser> implements TUserService {

}

