package mn;

import java.util.logging.Logger;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: VariableValue.java */
/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f64648c = Logger.getLogger(l.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Datatype f64649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f64650b;

    public void c(String str) {
        int iCharCount = 0;
        while (iCharCount < str.length()) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 13 && ((iCodePointAt < 32 || iCodePointAt > 55295) && ((iCodePointAt < 57344 || iCodePointAt > 65533) && (iCodePointAt < 65536 || iCodePointAt > 1114111)))) {
                f64648c.warning("Found invalid XML char code: " + iCodePointAt);
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    public Datatype a() {
        return this.f64649a;
    }

    public Object b() {
        return this.f64650b;
    }

    public l(Datatype datatype, Object obj) throws InvalidValueException {
        this.f64649a = datatype;
        this.f64650b = obj instanceof String ? datatype.c((String) obj) : obj;
        if (f.f64631a) {
            return;
        }
        if (a().isValid(b())) {
            c(toString());
            return;
        }
        throw new InvalidValueException("Invalid value for " + a() + ": " + b());
    }

    public String toString() {
        return a().e(b());
    }
}
