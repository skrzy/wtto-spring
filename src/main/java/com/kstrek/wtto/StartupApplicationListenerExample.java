package com.kstrek.wtto;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.google.common.collect.Sets;
import com.kstrek.wtto.model.Artist;
import com.kstrek.wtto.model.Song;
import com.kstrek.wtto.repositiories.ArtistRepository;
import com.kstrek.wtto.repositiories.SongRepository;

@Component
public class StartupApplicationListenerExample implements ApplicationListener<ContextRefreshedEvent> {

	private final ArtistRepository artistRepository;

	private final SongRepository songRepository;

	public StartupApplicationListenerExample(final ArtistRepository artistRepository, final SongRepository songRepository) {
		this.artistRepository = artistRepository;
		this.songRepository = songRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		final Artist johnLennon = new Artist("John", "Lennon", "John");
		final Song imagine = new Song("Imagine", "soft rock", "1971", "Apple", Sets.newHashSet(johnLennon));
		johnLennon.setSongs(Sets.newHashSet(imagine));
		artistRepository.save(johnLennon);
		songRepository.save(imagine);

		final Artist stevieWonder = new Artist("Stevland", "Morris", "Stevie Wonder");
		final Song superstition = new Song("Superstition", "funk", "1972", "Tamla", Sets.newHashSet(stevieWonder));
		stevieWonder.setSongs(Sets.newHashSet(superstition));
		artistRepository.save(stevieWonder);
		songRepository.save(superstition);

		final Artist jimMorrison = new Artist("James", "Morrison", "Jim");
		final Song ridersOfTheStorm = new Song("Riders on the Storm", "rock", "1971", "Elektra", Sets.newHashSet(jimMorrison));
		jimMorrison.setSongs(Sets.newHashSet(ridersOfTheStorm));
		artistRepository.save(jimMorrison);
		songRepository.save(ridersOfTheStorm);
	}
}

