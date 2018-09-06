package io.pivotal.syanagihara.web.cms.domain.vo;

import io.pivotal.syanagihara.web.cms.domain.models.Category;
import io.pivotal.syanagihara.web.cms.domain.models.Tag;
import lombok.Data;

import java.util.Set;

@Data
public class NewsRequest {

    String title;

    String content;

    Set<Category> categories;

    Set<Tag> tags;

}
