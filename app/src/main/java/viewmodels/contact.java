package viewmodels;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.text.SimpleDateFormat;
import java.util.Date;
@Entity
public class contact {
    @PrimaryKey(autoGenerate = true)
    private int ida;
    private String id;
    private String name;
    private String server;
    private String last;
    private String lastDate;

    public contact(String id, String name, String server, String last, Date lastDate) {
        String pattern = " HH:mm";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        this.id = id;
        this.name = name;
        this.server = server;
        this.last = last;
        this.lastDate = simpleDateFormat.format(lastDate);
    }

    public contact(int ida, String id, String name, String server, String last, String lastDate) {
        this.ida = ida;

        this.id = id;
        this.name = name;
        this.server = server;
        this.last = last;
        this.lastDate = lastDate;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getServer() {
        return server;
    }

    public String getLast() {
        return last;
    }

    public String getLastDate() {
        return lastDate;
    }

    public int getIda() {
        return ida;
    }

    public void setIda(int ida) {
        this.ida = ida;
    }
}
