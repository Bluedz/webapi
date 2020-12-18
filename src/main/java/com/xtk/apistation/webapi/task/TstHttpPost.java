package com.xtk.apistation.webapi.task;

import com.xtk.apistation.webapi.pojo.RequestBean;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;

@Component
public class TstHttpPost {
    @Scheduled(cron = "*/4 * * * * ?")
    public  void tstPost() {
        String url = "http://smp.setechchina.com:9000/index/MatInfor";
        RequestBean requestBean = new RequestBean();
//        requestBean.setSerialNumber(3);
//        requestBean.setSpecifiedNumber(2);
//        requestBean.setMaxCount(2);

        RestTemplate restTemplate = new RestTemplate();

        restTemplate.getMessageConverters().add(new StringHttpMessageConverter(StandardCharsets.UTF_8));
//        System.out.println(
//                restTemplate.postForObject(
//                        url,
//                        requestBean,
//                        String.class
//                )
//        );
    }

}
