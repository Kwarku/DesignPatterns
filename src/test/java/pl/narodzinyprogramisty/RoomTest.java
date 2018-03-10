package pl.narodzinyprogramisty;

import org.junit.Test;
import pl.narodzinyprogramisty.Builder.Room;

import static org.assertj.core.api.Assertions.assertThat;

public class RoomTest {
    private Room room;

    @Test
    public void createRoomTest() {
        room = new Room.Builder(1, true).build();
        assertThat(room.isAvailable()).isTrue();
        assertThat(room.getRoomNumber()).isEqualTo(1);
    }
}
