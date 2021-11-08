package use_cases;
import entities.Customer;
import entities.User;

import java.util.HashMap;
import java.util.Map;

public class CustomerManager extends UserManager{

    final String REF_PATH = "Customer";

    public CustomerManager(String userType) {
        super(userType);
        ref = database.getReference(REF_PATH);
    }

    @Override
    protected boolean discrepancyCheck(User currUser) {
        return false;
    }

    /**
     * Returns the user if existing in database
     *
     * @param uname    Username of suer
     * @param password Password of user
     * @return The user if authenticated else null
     */
    @Override
    User authenticate(String uname, String password) {
        return null;
    }

    /**
     * All Manager classes in use_cases have some transactions to save.
     *
     * @param obj The username with which the database can be queried
     * @param val The corresponding Customer
     */
    @Override
    public void save(String obj, User val) {
        Map<String, Customer> toSave = new HashMap<>();
        toSave.put(obj, (Customer) val);

        ref.setValueAsync(toSave);
    }

    /**
     * All Manager classes query the database for a specific object type that it is managing.
     *
     * @param obj The username with which the database can be queried.
     * @return The corresponding customer
     */
    @Override
    public User get(String obj) {
        return null;
    }

}
