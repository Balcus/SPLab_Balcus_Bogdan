package ro.uvt.info.sp_lab_2025.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.uvt.info.sp_lab_2025.components.ClientComponent;

@RestController
public record HelloController(ClientComponent clientComponent) {

    @GetMapping("/")
    public String hello() {
        return String.format("Hello from ClientComponent =  %s", clientComponent.toString());
    }
}
