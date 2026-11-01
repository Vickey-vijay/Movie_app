package yn;

import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: Base64Datatype.java */
/* JADX INFO: loaded from: classes8.dex */
public class a extends org.fourthline.cling.model.types.a<byte[]> {
    @Override // org.fourthline.cling.model.types.a
    public Class<byte[]> f() {
        return byte[].class;
    }

    @Override // org.fourthline.cling.model.types.a, org.fourthline.cling.model.types.Datatype
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String e(byte[] bArr) throws InvalidValueException {
        if (bArr == null) {
            return "";
        }
        try {
            return new String(to.a.h(bArr), "UTF-8");
        } catch (Exception e10) {
            throw new InvalidValueException(e10.getMessage(), e10);
        }
    }

    @Override // org.fourthline.cling.model.types.Datatype
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public byte[] c(String str) throws InvalidValueException {
        if (str.equals("")) {
            return null;
        }
        try {
            return to.a.d(str);
        } catch (Exception e10) {
            throw new InvalidValueException(e10.getMessage(), e10);
        }
    }
}
