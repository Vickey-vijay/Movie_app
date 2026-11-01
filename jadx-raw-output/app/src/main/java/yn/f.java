package yn;

import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: CustomDatatype.java */
/* JADX INFO: loaded from: classes8.dex */
public class f extends org.fourthline.cling.model.types.a<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f85805b;

    public String h() {
        return this.f85805b;
    }

    @Override // org.fourthline.cling.model.types.Datatype
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public String c(String str) throws InvalidValueException {
        if (str.equals("")) {
            return null;
        }
        return str;
    }

    @Override // org.fourthline.cling.model.types.a
    public String toString() {
        return "(" + getClass().getSimpleName() + ") '" + h() + "'";
    }

    public f(String str) {
        this.f85805b = str;
    }
}
