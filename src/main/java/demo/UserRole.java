package demo;

/**
 * Created by raiko on 23/03/2017.
 */
public class UserRole {

    private final long id;
    private final String role;

    public UserRole(long id, String role) {
        this.id = id;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public String getRole() {
        return role;
    }
}
