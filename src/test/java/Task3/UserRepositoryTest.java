package Task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRepositoryTest {

    User user1;
    User user2;
    User user3;
    User user4;
    UserRepository repository;

    @BeforeEach
    public void init() {
        user1 = new User("User1", "password1", false);
        user2 = new User("User2", "password2", true);
        user3 = new User("User3", "password3", false);

        repository = new UserRepository();

        user1.authenticate("User1", "password1");
        user2.authenticate("User2", "password2");
        user3.authenticate("User3", "password3");

        repository.addUser(user1);
        repository.addUser(user2);
        repository.addUser(user3);
    }

    @Test
    public void doesUserFindingByName() {
        Assertions.assertTrue(repository.findByName("User2"));
    }

    @Test
    public void doesUserAuthenticate() {
        user4 = new User("User4", "password4", false);
        user4.authenticate("User4", "password4");
        Assertions.assertTrue(user4.isAuthenticate);
    }

    @Test
    public void doesUsersAddToRepoAfterAuthentication() {
        Assertions.assertEquals(3, repository.data.size());
    }

    @Test
    public void doesNotAdminUsersRemoveFromRepo() {
        repository.logOutAllNotAdminUsers();
        Assertions.assertEquals(1, repository.data.size());
    }

}
