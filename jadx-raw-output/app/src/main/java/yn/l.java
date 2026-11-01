package yn;

import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: FloatDatatype.java */
/* JADX INFO: loaded from: classes8.dex */
public class l extends org.fourthline.cling.model.types.a<Float> {
    @Override // org.fourthline.cling.model.types.a, org.fourthline.cling.model.types.Datatype
    public boolean d(Class cls) {
        return cls == Float.TYPE || Float.class.isAssignableFrom(cls);
    }

    @Override // org.fourthline.cling.model.types.Datatype
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Float c(String str) throws InvalidValueException {
        if (str.equals("")) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(str.trim()));
        } catch (NumberFormatException e10) {
            throw new InvalidValueException("Can't convert string to number: " + str, e10);
        }
    }
}
