package ua.nure.dehtiarov.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAO;
import ua.nure.dehtiarov.entity.Device;
import ua.nure.dehtiarov.entity.Outlet;

import java.util.List;

/**
 * Created by dehtiarov on 12/19/2015.
 */
public interface DeviceDAO extends GenericDAO<Device, Long> {

    List<Device> getAllDevicesByUserId(Long id);

}
