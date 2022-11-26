package HOSTEL_DETAILS;

import java.io.Serializable;

public class hostel implements Serializable {
    private String hostel_name;
    private long student_count;
    private long room_count;

    public long getRoom_count() {
        return room_count;
    }

    public void setRoom_count(long room_count) {
        this.room_count = room_count;
    }

    public String getHostel_name() {
        return hostel_name;
    }

    public void setHostel_name(String hostel_name) {
        this.hostel_name = hostel_name;
    }

    public long getStudent_count() {
        return student_count;
    }

    public void setStudent_count(long student_count) {
        this.student_count = student_count;
    }

}