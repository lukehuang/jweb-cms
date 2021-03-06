package app.jweb.user.api.user;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author chi
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class LoginRequest {
    @NotNull
    @XmlElement(name = "username")
    public String username;
    @NotNull
    @XmlElement(name = "password")
    public String password;
    @NotNull
    @XmlElement(name = "autoLogin")
    public Boolean autoLogin;
    @NotNull
    @Size(max = 63)
    @XmlElement(name = "requestBy")
    public String requestBy;
}
