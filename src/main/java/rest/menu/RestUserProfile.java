package rest.menu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name ="userProfile" ,propOrder = {"avatarUrl","firstName","lastName","userMenu"})
public class RestUserProfile {
    private String avatarUrl;
    private String firstName;
    private String lastName;
    private List<RestUserMenu> userMenu = new ArrayList<RestUserMenu>();

    public String getAvatarUrl() {
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<RestUserMenu> getUserMenu() {
        return userMenu;
    }

    public void setUserMenu(List<RestUserMenu> userMenu) {
        this.userMenu = userMenu;
    }
}
