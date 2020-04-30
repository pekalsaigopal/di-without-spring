package in.psg.diwithoutspring.controllers;

import in.psg.diwithoutspring.services.GreetingService;

public class PropertyInjectedController {
   public GreetingService greetingService;

   public String getGreeting(){
      return  greetingService.sayGreeting();
   }
}
