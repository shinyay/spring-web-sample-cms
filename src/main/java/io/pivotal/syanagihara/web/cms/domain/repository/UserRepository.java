package io.pivotal.syanagihara.web.cms.domain.repository;

import io.pivotal.syanagihara.web.cms.domain.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
