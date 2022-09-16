package mate.jdbc;

import mate.jdbc.dao.ManufacturerDao;
import mate.jdbc.dao.impl.ManufacturerDaoImpl;
import mate.jdbc.model.Manufacturer;

public class Main {
    public static void main(String[] args) {

        //Manufacturer manufacturer = Manufacturer.of("Toyota", "Japan");
        ManufacturerDao manufacturerDao = new ManufacturerDaoImpl();
        boolean isDeleted = manufacturerDao.delete(3l);
        System.out.println(isDeleted);

    }
}
