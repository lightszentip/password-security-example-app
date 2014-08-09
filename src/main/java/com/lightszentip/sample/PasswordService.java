package com.lightszentip.sample;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Service;

import com.lightszentip.module.security.password.PasswordModule;
import com.lightszentip.module.security.password.PasswordModuleImpl;
import com.lightszentip.module.security.password.util.AlgorithmType;
import com.lightszentip.module.security.password.util.EncryptionType;

@Service
public class PasswordService {
	
	private final String secretId = "Id122131825435SecretXbzT";
	private final String secretSaltPw = "exampleAppForPasswordDelta";
	private final String secureSaltKey = "exampleAppForPasswordKey";
	private final int randomPasswordLength = 46;
	
	private PasswordModule passwordModule;
	private String[] passwords;
	
	public PasswordService() {
		this.passwordModule = new PasswordModuleImpl(secretId, secretSaltPw, secureSaltKey, EncryptionType.BLOWFISH, AlgorithmType.SHA_512, randomPasswordLength);
	}

	public PasswordModule getPasswordModule() {
		return this.passwordModule;
	}
	
	public String getRandomPassword(final int length) {
		return this.passwordModule.generateRandomPassword(length);
	}
	
	public String[] createAndSaveHoneyPasswordList(final String password, final int number) {
		try {
			passwords = this.passwordModule.getHoneyPasswordList(password, number);
		 return passwords;
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			throw new PasswordSecurityException(e);
		}
	}
	
	public boolean checkPassword(final String password) {
        try {
			return passwordModule.checkPassword(passwords, passwordModule.getCodePassword(password));
		} catch (UnsupportedEncodingException | GeneralSecurityException e) {
			throw new PasswordSecurityException(e);
		}
	}
	
	
}
