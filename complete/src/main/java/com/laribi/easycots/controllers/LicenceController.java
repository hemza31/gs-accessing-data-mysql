package com.laribi.easycots.controllers;

import com.laribi.easycots.models.Licence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.laribi.easycots.repositories.LicenceRepository;


@Controller	// This means that this class is a Controller
@RequestMapping(path="/easycots") // This means URL's start with /demo (after Application path)
public class LicenceController {
	@Autowired // This means to get the bean called licenceRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private LicenceRepository licenceRepository;

	@PostMapping(path="/Licence") // Map ONLY POST Requests
	public @ResponseBody String addNewLicence (@RequestParam String licenceName
			, @RequestParam String licenceDocumentUrl) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Licence n = new Licence();
		n.setLicenceName(n.getLicenceName());
		n.setLicenceDocumentUrl(n.getLicenceDocumentUrl());


		licenceRepository.save(n);
		return "Saved";
	}

	@GetMapping(path="/Licence")
	public @ResponseBody Iterable<Licence> getAllLicences() {
		// This returns a JSON or XML with the licences
		return licenceRepository.findAll();
	}

	@PutMapping(path="/Licence/{Licence_id}")
	public @ResponseBody
	String updatedLicence(@PathVariable(value = "Licence_id") Integer licenceId,
							   @RequestBody Licence licence) {
		licenceRepository.save(licence);
		return "Updated";
	}


}
