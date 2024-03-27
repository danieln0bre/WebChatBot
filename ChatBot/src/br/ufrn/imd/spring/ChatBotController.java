package br.ufrn.imd.spring;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chatbot")
public class ChatBotController {

    @GetMapping()
    public String responseChatBotTest(){
        return "Hello";
    }
    @PostMapping()
    public String responseChatBot(@RequestBody String question){
    	System.out.println(question);
    	return ChatBot.chatBotResponse(question);
    }
}
