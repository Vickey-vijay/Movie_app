package yn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: DLNADoc.java */
/* JADX INFO: loaded from: classes8.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f85807c = Pattern.compile("(.+?)[ -]([0-9].[0-9]{2})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85809b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f85808a.equals(hVar.f85808a) && this.f85809b.equals(hVar.f85809b);
    }

    public static h c(String str) throws InvalidValueException {
        Matcher matcher = f85807c.matcher(str);
        if (matcher.matches()) {
            return new h(matcher.group(1), matcher.group(2));
        }
        throw new InvalidValueException("Can't parse DLNADoc: " + str);
    }

    public String a() {
        return this.f85808a;
    }

    public String b() {
        return this.f85809b;
    }

    public int hashCode() {
        return (this.f85808a.hashCode() * 31) + this.f85809b.hashCode();
    }

    public String toString() {
        return a() + "-" + b();
    }

    public h(String str, String str2) {
        this.f85808a = str;
        this.f85809b = str2;
    }
}
