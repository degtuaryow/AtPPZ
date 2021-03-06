package ua.nure.dehtiarov.repository;

import com.googlecode.genericdao.dao.hibernate.GenericDAO;
import ua.nure.dehtiarov.entity.Device;
import ua.nure.dehtiarov.entity.OutletDevice;

import java.util.List;

/**
 * Created by dehtiarov on 12/19/2015.
 */
public interface OutletDeviceDAO extends GenericDAO<OutletDevice, Long> {

    List<OutletDevice> getAllOutletsByOutletId(Long id);

}
