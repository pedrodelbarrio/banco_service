package com.fpmislata.banco.presentation;

import com.fpmislata.banco.business.domain.EntidadBancaria;
import com.fpmislata.banco.business.service.EntidadBancariaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public class BancoMain {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        EntidadBancariaService entidadBancariaService = context.getBean(EntidadBancariaService.class);

        EntidadBancaria entidadBancaria = entidadBancariaService.get(1);
        System.out.println(entidadBancaria.getNombre());

    }

}
