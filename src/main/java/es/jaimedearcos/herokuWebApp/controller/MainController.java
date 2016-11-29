package es.jaimedearcos.herokuWebApp.controller;
  
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	String mensaje = "Bienvenido a Spring MVC!";

	/*
	 * Controlador para la ruta /hello
	 *  - devuelve pagina helloworld.jsp 
	 *  - espera un parametro ?name=xxx
	 *  - inyecta en la vista las variables name y message
	 */
	@RequestMapping("/bienvenido")
	public ModelAndView showMessage( @RequestParam(value = "nombre", required = false, defaultValue = "Mundo") String name) {
		 
		ModelAndView mv = new ModelAndView("holaMundo");
		mv.addObject("mensaje", mensaje);
		mv.addObject("nombre", name);
		return mv;
	}
}
