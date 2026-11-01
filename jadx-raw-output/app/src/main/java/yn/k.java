package yn;

import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: DoubleDatatype.java */
/* JADX INFO: loaded from: classes8.dex */
public class k extends org.fourthline.cling.model.types.a<Double> {
    @Override // org.fourthline.cling.model.types.a, org.fourthline.cling.model.types.Datatype
    public boolean d(Class cls) {
        return cls == Double.TYPE || Double.class.isAssignableFrom(cls);
    }

    @Override // org.fourthline.cling.model.types.Datatype
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Double c(String str) throws InvalidValueException {
        if (str.equals("")) {
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException e10) {
            throw new InvalidValueException("Can't convert string to number: " + str, e10);
        }
    }
}
