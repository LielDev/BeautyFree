package it.personal.Controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http//localhost:4200")
@RequestMapping("/profilo")
public class ProfiloController extends AbstractController{
}
