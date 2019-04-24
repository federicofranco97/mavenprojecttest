
package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VistaController {
    
    @GetMapping("/vista")
    public String mostrarVista(Model model){
        return "vista.html";
    }
}
