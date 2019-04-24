package Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    @GetMapping("/index")
    public String devolverVista(Model model){
        model.addAttribute("valorEntero",2);
        return "index.html";
    }
    
    @GetMapping("/index/show")
    public String mostra(){
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("asd");
       return "Web-Pages/vista.html";
    }
    
}
