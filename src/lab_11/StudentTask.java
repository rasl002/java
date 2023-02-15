package lab_11;

import java.util.Date;

public class StudentTask {
    public String name;
    public Date receiveTaskTime;
    public Date sendTaskTime;

    StudentTask(String name, Date receiveTaskTime, Date sendTaskTime) {
        this.name = name;
        this.receiveTaskTime = receiveTaskTime;
        this.sendTaskTime = sendTaskTime;
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.receiveTaskTime.toString());
        System.out.println(this.sendTaskTime.toString());
    }
}
