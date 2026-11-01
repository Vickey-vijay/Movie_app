package yn;

import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: PragmaType.java */
/* JADX INFO: loaded from: classes8.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f85824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f85825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f85826c;

    public String a() {
        String str;
        String str2 = "";
        if (this.f85824a != null) {
            str2 = "" + this.f85824a + "=";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        if (this.f85825b) {
            str = "\"" + this.f85826c + "\"";
        } else {
            str = this.f85826c;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public q(String str, String str2, boolean z10) {
        this.f85824a = str;
        this.f85826c = str2;
        this.f85825b = z10;
    }

    public static q b(String str) throws InvalidValueException {
        if (str.length() != 0) {
            String str2 = null;
            String[] strArrSplit = str.split("=");
            boolean z10 = false;
            if (strArrSplit.length > 1) {
                str2 = strArrSplit[0];
                str = strArrSplit[1];
                if (str.startsWith("\"") && str.endsWith("\"")) {
                    str = str.substring(1, str.length() - 1);
                    z10 = true;
                }
            }
            return new q(str2, str, z10);
        }
        throw new InvalidValueException("Can't parse Bytes Range: " + str);
    }
}
