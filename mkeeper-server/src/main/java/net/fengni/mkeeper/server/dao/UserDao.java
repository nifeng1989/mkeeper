package net.fengni.mkeeper.server.dao;

import net.fengni.jdbc.BaseDao;
import net.fengni.jdbc.query.Condition;
import net.fengni.jdbc.query.Limit;
import net.fengni.mkeeper.server.model.User;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by fengni on 2016/5/9.
 */
@Repository
public class UserDao extends BaseDao<User> {

    public User getUser(String username,String password){
        List<User> list = list(null,new Limit(0,1),new Condition("username",username, Condition.MatchType.EQ),new Condition("password",password, Condition.MatchType.EQ));
        if(CollectionUtils.isEmpty(list)){
            return list.get(0);
        }
        return null;
    }

}
