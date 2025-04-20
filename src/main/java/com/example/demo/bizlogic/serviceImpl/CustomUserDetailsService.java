package com.example.demo.bizlogic.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.bizlogic.mapper.user.UserMapper;
import com.example.demo.bizlogic.model.user.User;
import com.example.demo.framework.security.CustomUserDetails;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String memberId) throws UsernameNotFoundException {
    	User user = new User();
        try {
        	user.setMemberId(memberId);
			user = userMapper.selMember(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        if (user == null) {
            throw new UsernameNotFoundException("사용자를 찾을 수 없습니다: " + memberId);
        }

        return new CustomUserDetails(user); // ← 여기!
    }
}