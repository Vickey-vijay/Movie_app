package so;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: MimeType.java */
/* JADX INFO: loaded from: classes8.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f72016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f72017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, String> f72018c;

    /* JADX INFO: compiled from: MimeType.java */
    public class a implements Comparator<String> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    public c() {
        this("*", "*");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        Map<String, String> map = this.f72018c;
        if (map == null ? cVar.f72018c == null : map.equals(cVar.f72018c)) {
            return this.f72017b.equalsIgnoreCase(cVar.f72017b) && this.f72016a.equalsIgnoreCase(cVar.f72016a);
        }
        return false;
    }

    public c(String str, String str2, Map<String, String> map) {
        this.f72016a = str == null ? "*" : str;
        this.f72017b = str2 == null ? "*" : str2;
        if (map == null) {
            this.f72018c = Collections.EMPTY_MAP;
            return;
        }
        TreeMap treeMap = new TreeMap(new a());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            treeMap.put(entry.getKey(), entry.getValue());
        }
        this.f72018c = Collections.unmodifiableMap(treeMap);
    }

    public static int a(String str, int i10) {
        int iIndexOf = str.indexOf(61, i10);
        int iIndexOf2 = str.indexOf(59, i10);
        if (iIndexOf == -1 && iIndexOf2 == -1) {
            return str.length();
        }
        if (iIndexOf == -1) {
            return iIndexOf2;
        }
        return (iIndexOf2 != -1 && iIndexOf >= iIndexOf2) ? iIndexOf2 : iIndexOf;
    }

    public static c f(String str) throws IllegalArgumentException {
        String strTrim;
        String strTrim2;
        if (str == null) {
            throw new IllegalArgumentException("String value is null");
        }
        int iIndexOf = str.indexOf(";");
        String strTrim3 = null;
        if (iIndexOf > -1) {
            strTrim = str.substring(iIndexOf + 1).trim();
            str = str.substring(0, iIndexOf);
        } else {
            strTrim = null;
        }
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length < 2 && str.equals("*")) {
            strTrim2 = "*";
            strTrim3 = strTrim2;
        } else if (strArrSplit.length == 2) {
            strTrim3 = strArrSplit[0].trim();
            strTrim2 = strArrSplit[1].trim();
        } else {
            if (strArrSplit.length != 2) {
                throw new IllegalArgumentException("Error parsing string: " + str);
            }
            strTrim2 = null;
        }
        if (strTrim == null || strTrim.length() <= 0) {
            return new c(strTrim3, strTrim2);
        }
        HashMap map = new HashMap();
        for (int iD = 0; iD < strTrim.length(); iD = d(map, strTrim, iD)) {
        }
        return new c(strTrim3, strTrim2, map);
    }

    public Map<String, String> b() {
        return this.f72018c;
    }

    public String c() {
        return this.f72017b;
    }

    public String e() {
        return getType() + "/" + c();
    }

    public String getType() {
        return this.f72016a;
    }

    public int hashCode() {
        int iHashCode = ((this.f72016a.toLowerCase().hashCode() * 31) + this.f72017b.toLowerCase().hashCode()) * 31;
        Map<String, String> map = this.f72018c;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e());
        if (b() != null || b().size() > 0) {
            for (String str : b().keySet()) {
                sb2.append(";");
                sb2.append(str);
                sb2.append("=\"");
                sb2.append(b().get(str));
                sb2.append("\"");
            }
        }
        return sb2.toString();
    }

    public static int d(Map<String, String> map, String str, int i10) {
        int iA = a(str, i10);
        String strTrim = str.substring(i10, iA).trim();
        if (iA < str.length() && str.charAt(iA) == '=') {
            iA++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() - iA);
        boolean z10 = false;
        boolean z11 = false;
        while (iA < str.length()) {
            char cCharAt = str.charAt(iA);
            if (cCharAt != '\"') {
                if (cCharAt != ';') {
                    if (cCharAt != '\\') {
                        sb2.append(cCharAt);
                    } else if (z10) {
                        sb2.append(cCharAt);
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } else {
                    if (!z11) {
                        map.put(strTrim, sb2.toString().trim());
                        return iA + 1;
                    }
                    sb2.append(cCharAt);
                }
            } else if (z10) {
                sb2.append(cCharAt);
                z10 = false;
            } else {
                z11 = !z11;
            }
            iA++;
        }
        map.put(strTrim, sb2.toString().trim());
        return iA;
    }

    public c(String str, String str2) {
        this(str, str2, Collections.EMPTY_MAP);
    }
}
