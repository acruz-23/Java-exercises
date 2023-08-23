package Test;

import com.pluralsight.mod2.Room;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void cleanRoom() {
        //arrange
        Room testRoom = new Room(2, 100.00f );
        boolean cleanEmptyRoom, cleanFilledRoom, isClean;

        //act
        cleanEmptyRoom = testRoom.cleanRoom();
        isClean = !testRoom.isDirty();
        testRoom.checkIn();
        cleanFilledRoom = testRoom.cleanRoom();

        //assert
         assertTrue(cleanEmptyRoom);
         assertTrue(isClean);
         assertFalse(cleanFilledRoom);
    }

    @Test
    void checkIn() {
        //arrange
        Room testRoom = new Room(2, 100.0f);
        boolean isClean, isOccupied, checkIntoFilledRoom = false, checkIntoEmptyRoom = true, checkIntoDirtyRoom = false;

        //act
        isClean = !testRoom.isDirty();
        checkIntoEmptyRoom = testRoom.checkIn();

        //assert
        assertTrue(isClean);
        assertTrue(checkIntoEmptyRoom);
        assertTrue(testRoom.isDirty());
        assertFalse(testRoom.isAvailable());
        assertFalse(testRoom.checkIn());

    }

    @Test
    void checkOut() {
        //arrange
        Room roomTest = new Room(2, 100f);
        boolean checkoutEmptyRoom, checkoutFilledRoom;
        //act
        checkoutEmptyRoom = roomTest.checkOut();
        roomTest.checkIn();
        checkoutFilledRoom = roomTest.checkOut();

        //assert
        assertFalse(checkoutEmptyRoom);
        assertTrue(checkoutFilledRoom);
    }
}