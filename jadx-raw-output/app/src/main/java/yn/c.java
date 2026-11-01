package yn;

import java.util.Locale;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: BooleanDatatype.java */
/* JADX INFO: loaded from: classes8.dex */
public class c extends org.fourthline.cling.model.types.a<Boolean> {
    @Override // org.fourthline.cling.model.types.a, org.fourthline.cling.model.types.Datatype
    public boolean d(Class cls) {
        return cls == Boolean.TYPE || Boolean.class.isAssignableFrom(cls);
    }

    @Override // org.fourthline.cling.model.types.a, org.fourthline.cling.model.types.Datatype
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String e(Boolean bool) throws InvalidValueException {
        if (bool == null) {
            return "";
        }
        return bool.booleanValue() ? "1" : "0";
    }

    @Override // org.fourthline.cling.model.types.Datatype
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean c(String str) throws InvalidValueException {
        if (str.equals("")) {
            return null;
        }
        if (!str.equals("1")) {
            Locale locale = Locale.ROOT;
            if (!str.toUpperCase(locale).equals("YES") && !str.toUpperCase(locale).equals("TRUE")) {
                if (str.equals("0") || str.toUpperCase(locale).equals("NO") || str.toUpperCase(locale).equals("FALSE")) {
                    return Boolean.FALSE;
                }
                throw new InvalidValueException("Invalid boolean value string: " + str);
            }
        }
        return Boolean.TRUE;
    }
}
