package br.com.infowhere.config;

import br.com.infowhere.dao.MateriasDao;
import br.com.infowhere.dao.interfaces.ImateriasDao;
import br.com.infowhere.service.MateriaService;
import br.com.infowhere.service.interfaces.ImateriaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "br.com.infowhere")
public class ConfigBeans {

    @Bean
    public ImateriasDao materiasDao(){
        return new MateriasDao();
    }

    @Bean
    public ImateriaService materiaService(){
        return new MateriaService();
    }

}
