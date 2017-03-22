/**
 * Created by raiko_000 on 22.03.2017.
 */
public class Username {

    private final long id;
    private final String username;

    public Username(long id, String username) {
        this.id = id;
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
}
