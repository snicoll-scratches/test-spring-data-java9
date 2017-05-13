package com.example.domain;

import reactor.core.publisher.Mono;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 *
 * @author Stephane Nicoll
 */
public interface SpeakerRepository extends ReactiveCrudRepository<Speaker, String> {

	Mono<Speaker> findByTwitter(String twitter);

}
