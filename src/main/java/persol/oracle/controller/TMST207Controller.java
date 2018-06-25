package persol.oracle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import persol.oracle.domain.TMST207;
import persol.oracle.service.TMST207Service;

@RestController
@RequestMapping("/api")
public class TMST207Controller {

    private TMST207Service tmst207Service;

    @Autowired
    public void setTMST207Service(TMST207Service tmst207Service) {
        this.tmst207Service = tmst207Service;
    }

    @RequestMapping(value={"/findAll", "/findAll"}, produces = "application/json; charset=utf-8", method={RequestMethod.GET})
    public List<TMST207> redirToList(){
        return tmst207Service.listAll();
        // return "tmst207/list.html"; 
    }
}
