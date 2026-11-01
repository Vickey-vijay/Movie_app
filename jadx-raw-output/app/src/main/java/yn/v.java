package yn;

import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: StringDatatype.java */
/* JADX INFO: loaded from: classes8.dex */
public class v extends org.fourthline.cling.model.types.a<String> {
    @Override // org.fourthline.cling.model.types.Datatype
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String c(String str) throws InvalidValueException {
        if (str.equals("")) {
            return null;
        }
        return str;
    }
}
