package rest.menu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "menuItem", propOrder = {"type", "name", "relLink"})
public class RestUserMenuItem {
    private String type;
    private String name;
    private String relLink;

    private RestUserMenuItem() {
//hide default public one
    }

    public RestUserMenuItem(String type, String name, String relLink) {
        this.type = type;
        this.name = name;
        this.relLink = relLink;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getRelLink() {
        return relLink;
    }
}
