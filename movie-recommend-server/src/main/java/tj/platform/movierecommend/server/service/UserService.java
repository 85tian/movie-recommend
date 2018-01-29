package tj.platform.movierecommend.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tj.platform.movierecommend.model.entity.User;
import tj.platform.movierecommend.server.dao.UserMapper;
import tj.platform.movierecommend.server.utils.PasswordUtil;

import java.util.Date;
import java.util.UUID;

/**
 * @author 85
 * @date 2018/1/29 2018-01-29 11:35
 * @description 用户的业务逻辑
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    /**
     * 添加用户
     * @param user
     */
    @Transactional
    public void addUser(User user){
        //判断用户名|邮箱|手机号是否存在
        /*if(userMapper.getOneUser(user.getEmail()) != null){
            throw new RuntimeException("此邮箱已注册,请登录");
        }
        if(userMapper.getOneUser(user.getMobile()) != null){
            throw new RuntimeException("此手机号已经注册,请登录");
        }
        if(userMapper.getOneUser(user.getUsername()) != null){
            throw new RuntimeException("此用户名已存在，请登录或者更换用户名");
        }*/
        UUID uuid = UUID.randomUUID();
        user.setId(uuid.toString());
        user.setCreateDate(new Date());
        user.setSalt(PasswordUtil.generateSalt());
        user.setPassword(PasswordUtil.generate(user.getPassword()));
        userMapper.addUser(user);
    }

    public User findUser(String keyword,String password){
        User user = userMapper.getOneUser(keyword);
        return user;
    }
}
