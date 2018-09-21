package io.pivotal.syanagihara.web.cms.domain.repository;

import io.pivotal.syanagihara.web.cms.domain.models.News;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NewsRepository extends MongoRepository<News, String> {

}
