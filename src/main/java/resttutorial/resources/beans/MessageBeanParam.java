package resttutorial.resources.beans;

import javax.ws.rs.QueryParam;

/**
 * Created by nitin on 21/8/16.
 */
public class MessageBeanParam {
    private
    @QueryParam("year")
    int year;
    private
    @QueryParam("start")
    int start;
    private
    @QueryParam("size")
    int size;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
