package br.com.estudo.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class ApplicationConfig extends Application{
    
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> recursos = new HashSet<Class<?>>();
        recursos.add(br.com.estudo.service.NoticiaService.class);
        return recursos;
    }
}
