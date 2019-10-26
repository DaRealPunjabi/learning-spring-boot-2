package com.darealpunjabi.chap01.repository;

import com.darealpunjabi.chap01.model.Chapter;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ChapterRepository
        extends ReactiveCrudRepository<Chapter, String> {

}
