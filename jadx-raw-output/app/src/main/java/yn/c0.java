package yn;

import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: UnsignedIntegerOneByteDatatype.java */
/* JADX INFO: loaded from: classes7.dex */
public class c0 extends org.fourthline.cling.model.types.a<org.fourthline.cling.model.types.c> {
    @Override // org.fourthline.cling.model.types.Datatype
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public org.fourthline.cling.model.types.c c(String str) throws InvalidValueException {
        if (str.equals("")) {
            return null;
        }
        try {
            return new org.fourthline.cling.model.types.c(str);
        } catch (NumberFormatException e10) {
            throw new InvalidValueException("Can't convert string to number or not in range: " + str, e10);
        }
    }
}
