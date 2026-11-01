package yn;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: DLNACaps.java */
/* JADX INFO: loaded from: classes8.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f85806a;

    public static g b(String str) throws InvalidValueException {
        if (str == null || str.length() == 0) {
            return new g(new String[0]);
        }
        String[] strArrSplit = str.split(StringUtils.COMMA);
        String[] strArr = new String[strArrSplit.length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            strArr[i10] = strArrSplit[i10].trim();
        }
        return new g(strArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.equals(this.f85806a, ((g) obj).f85806a);
    }

    public String[] a() {
        return this.f85806a;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f85806a);
    }

    public g(String[] strArr) {
        this.f85806a = strArr;
    }

    public String toString() {
        return mn.f.g(a());
    }
}
