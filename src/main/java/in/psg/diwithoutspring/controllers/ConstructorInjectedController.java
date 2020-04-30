package in.psg.diwithoutspring.controllers;


import in.psg.diwithoutspring.services.GreetingService;

public class ConstructorInjectedController {
   private final GreetingService greetingService;

   public ConstructorInjectedController(GreetingService greetingService) {
      this.greetingService = greetingService;
   }

   public String getGreeting(){
      return greetingService.sayGreeting();
   }
}
