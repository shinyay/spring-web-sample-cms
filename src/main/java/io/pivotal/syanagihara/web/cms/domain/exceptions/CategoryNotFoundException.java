package io.pivotal.syanagihara.web.cms.domain.exceptions;

import lombok.Getter;

public class CategoryNotFoundException extends RuntimeException {

    @Getter
    private final String id;

    public CategoryNotFoundException(String id) {

        this.id = id;
    }
}
