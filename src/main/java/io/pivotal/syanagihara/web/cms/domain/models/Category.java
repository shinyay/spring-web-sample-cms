package io.pivotal.syanagihara.web.cms.domain.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;


@Data
@Document(collection = "category")
public class Category {

    @Id
    String id;

    String name;

    @Builder
    public static Category newCategory(String name){
        final Category category = new Category();
        category.setId(UUID.randomUUID().toString());
        category.setName(name);
        return category;
    }
}
