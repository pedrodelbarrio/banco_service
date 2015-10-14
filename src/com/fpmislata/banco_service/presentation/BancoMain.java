package com.fpmislata.banco_service.presentation;

import com.fpmislata.banco_service.business.domain.EntidadBancaria;
import com.fpmislata.banco_service.business.service.EntidadBancariaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public class BancoMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        EntidadBancariaService entidadBancariaService = applicationContext.getBean(EntidadBancariaService.class);

        EntidadBancaria entidadBancaria = entidadBancariaService.get(1);
        System.out.println(entidadBancaria.getNombre());
    }

}
