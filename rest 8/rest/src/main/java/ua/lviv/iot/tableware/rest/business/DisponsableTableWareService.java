package ua.lviv.iot.tableware.rest.business;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import ua.lviv.iot.tableware.rest.dataaccess.DisponsableTableWareRepository;
import ua.lviv.iot.tableware.rest.model.Fork;

import java.util.List;

@Service
public class DisponsableTableWareService {

    
    @Autowired
    private DisponsableTableWareRepository  disponsableTableWareRepository;

    public List<Fork> getAllGlasses() {
        return disponsableTableWareRepository.findAll();
    }

    public Fork getGlass(Integer id) {
        if (disponsableTableWareRepository.existsById(id)) {
            return disponsableTableWareRepository.findById(id).get();
        } else {
            return null;
        }
       
    }

    public Fork createGlass(Fork Glass) {
        return disponsableTableWareRepository.save(Glass);
    }

    public boolean deleteGlass(Integer id) {
        if (disponsableTableWareRepository.existsById(id)) {
        	disponsableTableWareRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public Fork updateglass(Integer id, Fork glass) {
        if (disponsableTableWareRepository.existsById(id)) {
            glass.setId(id);
            Fork tempGlass = disponsableTableWareRepository.findById(id).get();
            Fork initialGlass = new Fork(tempGlass.getManufacturer(), tempGlass.getPrice(), tempGlass.getFireResistance(),
                    tempGlass.getDateOfManufacture(),  tempGlass.getStrenght(),  tempGlass.getWeightCapacityKg());
            initialGlass.setId(id);
            disponsableTableWareRepository.save(glass);
            return initialGlass;
        } else {
            return null;
        }
    }
        

}