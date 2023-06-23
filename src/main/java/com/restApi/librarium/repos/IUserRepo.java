package com.restApi.librarium.repos;

import com.restApi.librarium.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<UserModel, Long> {
}
