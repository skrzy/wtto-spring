package com.kstrek.wtto.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kstrek.wtto.repositiories.SongRepository;

@Controller
public class SongController {

	private final SongRepository songRepository;

	public SongController(final SongRepository songRepository) {
		this.songRepository = songRepository;
	}

	@GetMapping("/songs")
	public String getSongs(Model model) {
		model.addAttribute("songs", songRepository.findAll());
		return "songs";
	}
}
