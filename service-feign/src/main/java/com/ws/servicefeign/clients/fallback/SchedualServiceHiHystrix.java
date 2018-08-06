package com.ws.servicefeign.clients.fallback;

import com.ws.servicefeign.clients.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry, you are fail, "+name;
    }
}
