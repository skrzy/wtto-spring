package com.kstrek.wtto.repositiories;

import com.kstrek.wtto.model.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
}
