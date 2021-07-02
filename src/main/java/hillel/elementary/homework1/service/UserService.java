package hillel.elementary.homework1.service;

import hillel.elementary.homework1.entity.Entity;

public class UserService extends AbstractService implements Service {
    private static final String MESSAGE = "Current method is unavailable for UserService";

    @Override
    public void signUpUserData(Entity entity) {
        System.out.println(MESSAGE);
    }
}
