package com.pillProject.demo.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private final EntityManager em;

    public void save(User user){
        em.persist(user);
    }

    public User find(String id){
        return em.find(User.class,id);
    }

    public List<User> findAll(){
        return em.createQuery("select u from users u",User.class)
                .getResultList();
    }


}
