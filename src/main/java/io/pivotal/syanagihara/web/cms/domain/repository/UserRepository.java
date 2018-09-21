package io.pivotal.syanagihara.web.cms.domain.repository;

import io.pivotal.syanagihara.web.cms.domain.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
