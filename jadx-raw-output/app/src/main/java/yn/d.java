package yn;

import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: BytesRange.java */
/* JADX INFO: loaded from: classes8.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f85802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f85803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f85804c;

    public static d c(String str) throws InvalidValueException {
        return d(str, null);
    }

    public String a() {
        return b(false, null);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    public static d d(String str, String str2) throws InvalidValueException {
        Long lValueOf;
        Long lValueOf2;
        if (str.startsWith(str2 != null ? str2 : "bytes=")) {
            if (str2 == null) {
                str2 = "bytes=";
            }
            String[] strArrSplit = str.substring(str2.length()).split("[-/]");
            int length = strArrSplit.length;
            if (length == 1) {
                lValueOf = null;
                lValueOf2 = null;
            } else if (length == 2) {
                lValueOf = null;
                if (strArrSplit[1].length() != 0) {
                    lValueOf2 = Long.valueOf(Long.parseLong(strArrSplit[1]));
                } else {
                    lValueOf2 = null;
                }
            } else if (length == 3) {
                if (strArrSplit[2].length() == 0 || strArrSplit[2].equals("*")) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(Long.parseLong(strArrSplit[2]));
                }
                if (strArrSplit[1].length() != 0) {
                    lValueOf2 = Long.valueOf(Long.parseLong(strArrSplit[1]));
                } else {
                    lValueOf2 = null;
                }
            }
            Long lValueOf3 = strArrSplit[0].length() != 0 ? Long.valueOf(Long.parseLong(strArrSplit[0])) : null;
            if (lValueOf3 != null || lValueOf2 != null) {
                return new d(lValueOf3, lValueOf2, lValueOf);
            }
        }
        throw new InvalidValueException("Can't parse Bytes Range: " + str);
    }

    public String b(boolean z10, String str) {
        if (str == null) {
            str = "bytes=";
        }
        if (this.f85802a != null) {
            str = str + this.f85802a.toString();
        }
        String str2 = str + "-";
        if (this.f85803b != null) {
            str2 = str2 + this.f85803b.toString();
        }
        if (!z10) {
            return str2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append("/");
        Long l10 = this.f85804c;
        sb2.append(l10 != null ? l10.toString() : "*");
        return sb2.toString();
    }

    public d(Long l10, Long l11, Long l12) {
        this.f85802a = l10;
        this.f85803b = l11;
        this.f85804c = l12;
    }
}
