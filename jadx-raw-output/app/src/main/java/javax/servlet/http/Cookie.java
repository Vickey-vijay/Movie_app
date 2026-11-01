package javax.servlet.http;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/* JADX INFO: loaded from: classes4.dex */
public class Cookie implements Cloneable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f61731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ResourceBundle f61732c = ResourceBundle.getBundle("javax.servlet.http.LocalStrings");
    private static final long serialVersionUID = -6454587001725327448L;
    private String comment;
    private String domain;
    private String name;
    private String path;
    private boolean secure;
    private String value;
    private int maxAge = -1;
    private int version = 0;
    private boolean isHttpOnly = false;

    static {
        if (Boolean.valueOf(System.getProperty("org.glassfish.web.rfc2109_cookie_names_enforced", "true")).booleanValue()) {
            f61731b = "/()<>@,;:\\\"[]?={} \t";
        } else {
            f61731b = ",; ";
        }
    }

    public String getComment() {
        return this.comment;
    }

    public String getDomain() {
        return this.domain;
    }

    public int getMaxAge() {
        return this.maxAge;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public boolean getSecure() {
        return this.secure;
    }

    public String getValue() {
        return this.value;
    }

    public int getVersion() {
        return this.version;
    }

    public boolean isHttpOnly() {
        return this.isHttpOnly;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public void setDomain(String str) {
        this.domain = str.toLowerCase(Locale.ENGLISH);
    }

    public void setHttpOnly(boolean z10) {
        this.isHttpOnly = z10;
    }

    public void setMaxAge(int i10) {
        this.maxAge = i10;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setSecure(boolean z10) {
        this.secure = z10;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public void setVersion(int i10) {
        this.version = i10;
    }

    public Cookie(String str, String str2) {
        if (str != null && str.length() != 0) {
            if (a(str) && !str.equalsIgnoreCase("Comment") && !str.equalsIgnoreCase("Discard") && !str.equalsIgnoreCase("Domain") && !str.equalsIgnoreCase("Expires") && !str.equalsIgnoreCase("Max-Age") && !str.equalsIgnoreCase("Path") && !str.equalsIgnoreCase("Secure") && !str.equalsIgnoreCase("Version") && !str.startsWith("$")) {
                this.name = str;
                this.value = str2;
                return;
            }
            throw new IllegalArgumentException(MessageFormat.format(f61732c.getString("err.cookie_name_is_token"), str));
        }
        throw new IllegalArgumentException(f61732c.getString("err.cookie_name_blank"));
    }

    public final boolean a(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < ' ' || cCharAt >= 127 || f61731b.indexOf(cCharAt) != -1) {
                return false;
            }
        }
        return true;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }
}
