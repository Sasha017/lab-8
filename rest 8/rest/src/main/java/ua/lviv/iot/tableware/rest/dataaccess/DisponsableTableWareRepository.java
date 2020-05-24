package ua.lviv.iot.tableware.rest.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import ua.lviv.iot.tableware.rest.model.Fork;;

@Repository
public interface DisponsableTableWareRepository extends JpaRepository<Fork, Integer> {
}
