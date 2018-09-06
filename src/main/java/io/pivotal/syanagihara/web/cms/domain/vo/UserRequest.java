package io.pivotal.syanagihara.web.cms.domain.vo;

import io.pivotal.syanagihara.web.cms.domain.models.Role;
import lombok.Data;

@Data
public class UserRequest {

    String identity;

    String name;

    Role role;

}
