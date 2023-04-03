package com.example.pi_ease.RestControllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins ="*" ,maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
    @GetMapping("/all")
    public String allAccess(){
        return "public Content.";
    }
    @GetMapping ("/Admin")
    @PreAuthorize("hasRole('ADMIN') or hasRole('CLIENT') or hasRole('INVESTOR') or hasRole('AGENT_SALES')")
    public String userAccess(){
        return "Admin Content.";
    }
    @GetMapping ("/client")
    @PreAuthorize("hasRole('CLIENT')")
    public String clientAccess(){
        return "Client Content.";
    }

    @GetMapping ("/INVESTOR")
    @PreAuthorize("hasRole('INVESTOR')")
    public String investorAccess(){
        return "Investor Content.";
    }

    @GetMapping ("/AGENT_SALES")
    @PreAuthorize("hasRole('AGENT_SALES')")
    public String AgentAccess(){
        return "AGENT SALES Content.";
    }


    @GetMapping ("/INVESTORNP")
    @PreAuthorize("hasRole('INVESTORNP')")
    public String investornpAcess(){
        return "INVESTOR_NP SALES Content.";
    }


    @GetMapping ("/INVOSTORP")
    @PreAuthorize("hasRole('INVESTORP')")
    public String InvestornpAcess(){
        return "INVESTORP SALES Content.";
    }



}

