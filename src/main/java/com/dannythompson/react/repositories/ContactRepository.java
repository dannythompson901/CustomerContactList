package com.dannythompson.react.repositories;

import com.dannythompson.react.models.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, String> {
	@Override
	void delete(Contact deleted);
}
