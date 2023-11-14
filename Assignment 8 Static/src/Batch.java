import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class Batch {
    private int batchCode,studentCount;
    private String courseName,days;
    private LocalDateTime startDate,time;
    private static int totalBatches;

    public void setBatchCode(int batchCode) {
        this.batchCode = batchCode;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public static void setTotalBatches(int totalBatches) {
        Batch.totalBatches = totalBatches;
    }

    public int getBatchCode() {
        return batchCode;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDays() {
        return days;
    }

    public static int getTotalBatches() {
        return totalBatches;
    }
}