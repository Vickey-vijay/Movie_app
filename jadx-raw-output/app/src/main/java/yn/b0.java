package yn;

import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: UnsignedIntegerFourBytesDatatype.java */
/* JADX INFO: loaded from: classes7.dex */
public class b0 extends org.fourthline.cling.model.types.a<org.fourthline.cling.model.types.b> {
    @Override // org.fourthline.cling.model.types.Datatype
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public org.fourthline.cling.model.types.b c(String str) throws InvalidValueException {
        if (str.equals("")) {
            return null;
        }
        try {
            return new org.fourthline.cling.model.types.b(str);
        } catch (NumberFormatException e10) {
            throw new InvalidValueException("Can't convert string to number or not in range: " + str, e10);
        }
    }
}
