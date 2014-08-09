package com.lightszentip.sample;

import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiParam;
import org.jsondoc.core.annotation.ApiResponseObject;
import org.jsondoc.core.pojo.ApiParamType;
import org.jsondoc.core.pojo.ApiVerb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(name = "Password controller", description = "Methods for password securit module functions")
@RestController
public class PasswordController {

	@Autowired
	private PasswordService passwordService;

	/**
	 * Generate a random password
	 * 
	 * @param length
	 * @return
	 */
	@ApiMethod(
	        path="/randomPassword",
	        verb=ApiVerb.GET,
	        description="Generate a random password"
	)
	@RequestMapping("/randomPassword")
	public @ApiResponseObject String randomPassword(
			@ApiParam(name="length",paramType=ApiParamType.QUERY,required=false,description="Length of random password")
			@RequestParam(value = "length", required = false, defaultValue = "4") int length) {
		return passwordService.getRandomPassword(length);
	}

	/**
	 * Generate a list with fake passwords and the user password. The list is
	 * stored temporarily in the service.
	 * 
	 * @param length
	 * @param password
	 * @return
	 */
	@ApiMethod(
	        path="/createHoneyPasswordList",
	        verb=ApiVerb.GET,
	        description="Generate a list with fake passwords and the user password. The list is stored temporarily in the service."
	)
	@RequestMapping("/createHoneyPasswordList")
	public @ApiResponseObject String[] createHoneyPasswordList(
			@RequestParam(value = "number", required = false, defaultValue = "4") int number,
			@RequestParam(value = "password", required = true) String password) {
		return passwordService.createAndSaveHoneyPasswordList(password, number);
	}

	/**
	 * Check the password with list from {@link createHoneyPasswordList}
	 * 
	 * @param password
	 * @return
	 */
	@ApiMethod(
	        path="/checkPassword",
	        verb=ApiVerb.GET,
	        description="Check the password with list from {@link createHoneyPasswordList}"
	)
	@RequestMapping("/checkPassword")
	public @ApiResponseObject boolean checkPassword(
			@ApiParam(name="password",paramType=ApiParamType.QUERY,description="User password")
			@RequestParam(value = "password", required = true) String password) {
		return passwordService.checkPassword(password);
	}
}
