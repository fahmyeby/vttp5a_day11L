package sg.edu.nus.iss.vttp5a_day11l.controllers;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @ResponseBody
    @GetMapping("/log")
    public String home(){
        logger.info("This is an INFO message");
        logger.warn("This is a WARN message");
        logger.error("This is an ERROR message");
        logger.debug("This is an DEBUG message");
        logger.trace("This is an TRACE message");
        
        return "Log in Home Controller called...";
    }
}
