package com.speakwell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.speakwell.model.ContactMessage;
import com.speakwell.service.ContactMessageService;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactMessageController {

    @Autowired
    private ContactMessageService contactMessageService;

    @PostMapping("/send")
    public ResponseEntity<ContactMessage> sendMessage(@RequestBody ContactMessage contactMessage) {
        ContactMessage savedMessage = contactMessageService.saveContactMessage(contactMessage);
        return ResponseEntity.ok(savedMessage);
    }
}
