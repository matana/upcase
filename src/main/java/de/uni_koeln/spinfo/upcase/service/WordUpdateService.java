package de.uni_koeln.spinfo.upcase.service;

import org.springframework.stereotype.Service;

import de.uni_koeln.spinfo.upcase.model.WordUpdate;
import de.uni_koeln.spinfo.upcase.mongodb.data.document.future.Word;

@Service
public interface WordUpdateService {
	
	public Word update(WordUpdate update);

}