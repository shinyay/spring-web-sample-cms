package io.pivotal.syanagihara.web.cms.domain.exceptions;

import lombok.Getter;

public class NewsNotFoundException extends RuntimeException{

    @Getter
    private final String id;

    public NewsNotFoundException(String id) {
        this.id = id;
    }

}
