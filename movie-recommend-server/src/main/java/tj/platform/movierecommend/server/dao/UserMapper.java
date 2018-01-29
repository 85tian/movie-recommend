package tj.platform.movierecommend.server.dao;

import org.apache.ibatis.annotations.*;
import tj.platform.movierecommend.model.entity.User;

/**
 * @author 85
 * @date 2018/1/29 2018-01-29 11:32
 * @description 用户的数据访问层
 */
@Mapper
public interface UserMapper {
    @Insert("insert into `user` (`id`, `username`, `password`, `salt`, `email`, `address`, `mobile`, `create_date`, `login_time`, `sex`, `qq`, `update_date`, `wechat`) VALUES (#{user.id},#{user.username}, #{user.password}, #{user.salt}, #{user.email}, #{user.address}, #{user.mobile}, #{user.createDate}, #{user.loginTime}, #{user.sex}, #{user.qq}, #{user.updateDate}, #{user.wechat});")
    public void addUser(@Param("user") User user);

    @Select("SELECT\n" +
            "`user`.id AS id,\n" +
            "`user`.username AS username,\n" +
            "`user`.`password` AS password,\n" +
            "`user`.salt AS salt,\n" +
            "`user`.`status` AS status,\n" +
            "`user`.email AS email,\n" +
            "`user`.address AS address,\n" +
            "`user`.mobile AS mobile,\n" +
            "`user`.create_date AS createDate,\n" +
            "`user`.login_time AS loginTime,\n" +
            "`user`.sex AS sex,\n" +
            "`user`.qq AS qq,\n" +
            "`user`.update_date AS updateDate,\n" +
            "`user`.wechat AS wechat\n" +
            "FROM\n" +
            "`user` where username=#{keyword} or email=#{keyword} or mobile=#{keyword};")
    public User getOneUser(@Param("keyword")String keyword);

    @Update("update user set login_time=#{user.loginTime},status=#{user.status},username=#{user.username},password=#{user.password},update_date=#{user.updateDate},sex=#{user.sex} where id=#{user.id};")
    public User updateUser(@Param("user")User user);
}
