package com.sagar.spring_boot_blog_application.repositories;

import com.sagar.spring_boot_blog_application.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

}
