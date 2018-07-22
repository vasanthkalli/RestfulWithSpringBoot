package com.configuration;


import com.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@Configuration
public class ConfigurationJavaBased {

    @Bean
    public Countries getCountries(){
        Countries countries=new Countries();
        countries.setName("INDIA");
        NaturalResources naturalResources=new NaturalResources();
        Forests forests=new Forests();
        forests.setArea(123);
        forests.setName("NallaMala");
        naturalResources.setForests(forests);

        OilReserves oilreservers=new OilReserves();
        oilreservers.setName("Avuna");
        naturalResources.setOilReserves(oilreservers);
        Rivers rivers=new Rivers();
        rivers.setStartsAt("Himalayas");
        rivers.setEndsAt("BayofBengal");
        rivers.setName("Ganga");
        naturalResources.setRivers(rivers);
        countries.setNaturalResources(naturalResources);
        countries.setNumberOfStates(29);
        return countries;

    }
}
