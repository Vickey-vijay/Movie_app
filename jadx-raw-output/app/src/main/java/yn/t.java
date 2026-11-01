package yn;

import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: ShortDatatype.java */
/* JADX INFO: loaded from: classes8.dex */
public class t extends org.fourthline.cling.model.types.a<Short> {
    @Override // org.fourthline.cling.model.types.a, org.fourthline.cling.model.types.Datatype
    public boolean d(Class cls) {
        return cls == Short.TYPE || Short.class.isAssignableFrom(cls);
    }

    @Override // org.fourthline.cling.model.types.Datatype
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Short c(String str) throws InvalidValueException {
        if (str.equals("")) {
            return null;
        }
        try {
            Short shValueOf = Short.valueOf(Short.parseShort(str.trim()));
            if (isValid(shValueOf)) {
                return shValueOf;
            }
            throw new InvalidValueException("Not a valid short: " + str);
        } catch (NumberFormatException e10) {
            throw new InvalidValueException("Can't convert string to number: " + str, e10);
        }
    }
}
