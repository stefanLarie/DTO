package rest.menu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name ="userMenu", propOrder = {"name","menuItems"})
public class RestUserMenu {
    private String name;
    private List<RestUserMenuItem> menuItems = new ArrayList<RestUserMenuItem>();

    public List<RestUserMenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<RestUserMenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
