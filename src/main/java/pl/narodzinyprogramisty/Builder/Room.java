package pl.narodzinyprogramisty.Builder;

public class Room {
    private int roomNumber;
    private int bedNumber;
    private boolean isAvailable;
    private boolean isClean;
    private boolean isBathroom;
    private int roomArea;

    public static class Builder{
        private int roomNumber;
        private int bedNumber;
        private boolean isAvailable;
        private boolean isClean;
        private boolean isBathroom;
        private int roomArea;

        public Builder(int roomNumber, boolean isAvailable) {
            this.roomNumber = roomNumber;
            this.isAvailable = isAvailable;
        }



        public Builder bedNumber(int bedNumber){
            this.bedNumber = bedNumber;
            return this;
        }


        public Builder isClean(boolean isClean) {
            this.isClean = isClean;
            return this;
        }

        public Builder isBathroom(boolean isBathroom) {
            this.isBathroom = isBathroom;
            return this;
        }

        public Builder roomArea(int roomArea) {
            this.roomArea = roomArea;
            return this;
        }

        public Room build(){
            return new Room(this);
        }
    }

    private Room(Builder builder) {
        roomNumber = builder.roomNumber;
        bedNumber = builder.bedNumber;
        isAvailable = builder.isAvailable;
        isClean = builder.isClean;
        isBathroom = builder.isBathroom;
        roomArea = builder.roomArea;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getBedNumber() {
        return bedNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean isClean() {
        return isClean;
    }

    public boolean isBathroom() {
        return isBathroom;
    }

    public int getRoomArea() {
        return roomArea;
    }

    @Override
    public String toString(){
        return String.format("Room : roomNumber:%d, have %d beds, available: %s, clean: %s, have bathroom: %s, room area: %d",
                roomNumber, bedNumber, isAvailable, isClean, isBathroom, roomArea);
    }
}
