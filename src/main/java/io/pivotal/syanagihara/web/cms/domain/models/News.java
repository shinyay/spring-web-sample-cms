package io.pivotal.syanagihara.web.cms.domain.models;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "news")
public class News {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    String id;
    String title;
    String content;
    User author;
    Set<User> mandatoryReviewers = new HashSet<>();
    Set<Review> reviewers = new HashSet<>();
    Set<Category> categories = new HashSet<>();
    Set<Tag> tags = new HashSet<>();

    public Review review(String userId,String status){
        final Review review = new Review(userId, status);
        this.reviewers.add(review);
        return review;
    }

    public Boolean revised() {
        return this.mandatoryReviewers.stream().allMatch(reviewer -> this.reviewers.stream()
                .anyMatch(review -> reviewer.id.equals(review.userId) && "approved".equals(review.status)));
    }
}
