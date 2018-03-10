package pl.narodzinyprogramisty;

import org.junit.Before;
import org.junit.Test;
import pl.narodzinyprogramisty.Singleton.Session;
import pl.narodzinyprogramisty.Singleton.User;

import static org.assertj.core.api.Assertions.assertThat;

public class SessionTest {
    private User user;
    private User user2;

    @Before
    public void setUp() {
        user = new User("Paweł", "Kukiz");
        user2 = new User("Andrzej", "Duda");
    }

    @Test
    public void sessionTest(){
        Session session = Session.getInstance();

        session.loginUser(user);
        assertThat(session.getLoggedUser()).isEqualTo(user);

        session.logoutUser();
        assertThat(session.getLoggedUser()).isNull();

        session.loginUser(user2);
        Session newSession = Session.getInstance();

        assertThat(newSession.getLoggedUser()).isEqualTo(user2);


    }

}
