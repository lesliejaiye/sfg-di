package guru.springframework.sfgDI.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "HelloWorld - Setter";  
    }
    
}
