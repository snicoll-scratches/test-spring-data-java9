package com.example.domain;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Stephane Nicoll
 */
public interface SpeakerRepository extends CrudRepository<Speaker, String> {

    Speaker findByTwitter(String twitter);

}
