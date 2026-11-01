package yn;

import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: UnsignedIntegerTwoBytesDatatype.java */
/* JADX INFO: loaded from: classes7.dex */
public class d0 extends org.fourthline.cling.model.types.a<org.fourthline.cling.model.types.d> {
    @Override // org.fourthline.cling.model.types.Datatype
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public org.fourthline.cling.model.types.d c(String str) throws InvalidValueException {
        if (str.equals("")) {
            return null;
        }
        try {
            return new org.fourthline.cling.model.types.d(str);
        } catch (NumberFormatException e10) {
            throw new InvalidValueException("Can't convert string to number or not in range: " + str, e10);
        }
    }
}
