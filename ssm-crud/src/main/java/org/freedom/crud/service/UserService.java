package org.freedom.crud.service;

import java.util.List;

import org.freedom.crud.bean.User;
import org.freedom.crud.bean.UserExample;
import org.freedom.crud.bean.UserExample.Criteria;
import org.freedom.crud.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;

	/**
	 * 查询所有学生
	 * 
	 * @return
	 */
	public List<User> getAll() {
		return userMapper.selectByExampleWithClass(null);

	}

	/**
	 * 添加学生
	 * 
	 * @param user
	 */
	public void addUser(User user) {
		userMapper.insertSelective(user);
	}

	/**
	 * 根据主键获取学生
	 * 
	 * @param uid
	 * @return
	 */

	public User getUser(Integer uid) {
		User user = userMapper.selectByPrimaryKeyWithClass(uid);
		return user;
	}

	public boolean checkUser(String stuNo) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria(); // 创建条件
		criteria.andStuNoEqualTo(stuNo);
		long count = userMapper.countByExample(example);
		return count == 0;
	}

	@Transactional
	/**
	 * 根据主键有选择更新用户
	 * 
	 * @param user
	 */

	public void updateUser(User user) {
		userMapper.updateByPrimaryKeySelective(user);
	}

	public void deleteUserById(Integer id) {
		userMapper.deleteByPrimaryKey(id);
	}

	public void deleteBatch(List<Integer> ids) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUidIn(ids);
		userMapper.deleteByExample(example);
	}

}
