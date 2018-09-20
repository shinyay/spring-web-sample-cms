package io.pivotal.syanagihara.web.cms.domain.repository;

import io.pivotal.syanagihara.web.cms.domain.models.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, String> {

}
