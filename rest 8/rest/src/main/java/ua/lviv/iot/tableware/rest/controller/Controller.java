package ua.lviv.iot.tableware.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ua.lviv.iot.tableware.rest.business.DisponsableTableWareService;
import ua.lviv.iot.tableware.rest.model.Fork;

import java.util.List;

@RequestMapping("/glasses")
@RestController
public class Controller {

    @Autowired
    private DisponsableTableWareService  disponsableTableWareService;

    @GetMapping
    public final List<Fork> getAllGlasses() {
        return disponsableTableWareService.getAllGlasses();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Fork> getGlass(final @PathVariable("id") Integer id) {
        Fork glassModel;
        return (glassModel = disponsableTableWareService.getGlass(id)) == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(glassModel, HttpStatus.OK);
        
    }

    @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
    public final Fork createGlass(final @RequestBody Fork glass) {
        return disponsableTableWareService.createGlass(glass);
    }

    @DeleteMapping(path = "/{id}")
    public final ResponseEntity<Fork> deleteGlass(final @PathVariable("id") Integer id) {
       HttpStatus status = disponsableTableWareService.deleteGlass(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(status);
    
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Fork> updateMansion(final @PathVariable("id") Integer id,
            final @RequestBody Fork glass) {
         Fork previonsGlass = disponsableTableWareService.updateglass(id, glass);
        return previonsGlass  == null
                ? new ResponseEntity <Fork> (HttpStatus.NOT_FOUND)
                : new ResponseEntity <Fork> (previonsGlass, HttpStatus.OK);
        
    }
        
}