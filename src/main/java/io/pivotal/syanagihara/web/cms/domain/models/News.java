package io.pivotal.syanagihara.web.cms.domain.models;

import java.util.Set;

public class News {

    String id;
    String title;
    String content;
    User author;
    Set<User> mandatoryReviewers;
    Set<Review> reviewers;
    Set<Category> categories;
    Set<Tag> tags;

}
