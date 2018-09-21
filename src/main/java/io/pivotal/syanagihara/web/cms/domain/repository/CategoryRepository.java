package io.pivotal.syanagihara.web.cms.domain.repository;

import io.pivotal.syanagihara.web.cms.domain.models.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> { }
