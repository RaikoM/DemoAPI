/**
 * Created by raiko_000 on 22.03.2017.
 */
public class Password {
    private final long id;
    private final String password;

    public Password(long id, String password) {
        this.id = id;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
