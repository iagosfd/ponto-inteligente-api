package br.com.PontoInteligente.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {
	
	private static final Logger log = LoggerFactory.getLogger(PasswordUtils.class);
	
	public PasswordUtils() {
	}
	
	public static String gerarBCrypt(String senha) {
		if(senha ==null) {
			return senha;
		}
		log.info("Gerando Hash com BCrypt.");
		BCryptPasswordEncoder bCrypEncoder = new BCryptPasswordEncoder();
		return bCrypEncoder.encode(senha);
	}

}
