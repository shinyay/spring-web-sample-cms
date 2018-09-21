package io.pivotal.syanagihara.web.cms.domain.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "category")
public class Category {

    @Id
    String id;

    String name;
}
