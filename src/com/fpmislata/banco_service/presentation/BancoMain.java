package com.fpmislata.banco_service.presentation;

import com.fpmislata.banco_service.business.domain.EntidadBancaria;
import com.fpmislata.banco_service.business.service.EntidadBancariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public class BancoMain {

    @Autowired
    private EntidadBancariaService entidadBancariaService;

    public BancoMain() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        applicationContext.getAutowireCapableBeanFactory().autowireBean(this);
    }

    public EntidadBancariaService getEntidadBancariaService() {
        return entidadBancariaService;
    }

    public void setEntidadBancariaService(EntidadBancariaService entidadBancariaService) {
        this.entidadBancariaService = entidadBancariaService;
    }

    public static void main(String[] args) {
        BancoMain bancoMain = new BancoMain();
        EntidadBancaria entidadBancaria = bancoMain.getEntidadBancariaService().get(1);
        System.out.println(entidadBancaria.getNombre());
    }

}
