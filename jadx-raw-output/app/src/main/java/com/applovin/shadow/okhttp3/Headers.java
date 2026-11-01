package com.applovin.shadow.okhttp3;

import ck.b;
import ck.i;
import ck.p;
import ck.w;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.http.DatesKt;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Pair;
import lk.a0;
import lk.x;
import mj.h;
import nj.s;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import vj.c;

/* JADX INFO: compiled from: Headers.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, dk.a {
    public static final Companion Companion = new Companion(null);
    private final String[] namesAndValues;

    /* JADX INFO: compiled from: Headers.kt */
    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String str) {
            p.j(str, "line");
            int iK0 = a0.k0(str, ':', 0, false, 6, null);
            if (!(iK0 != -1)) {
                throw new IllegalArgumentException(("Unexpected header: " + str).toString());
            }
            String strSubstring = str.substring(0, iK0);
            p.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = a0.k1(strSubstring).toString();
            String strSubstring2 = str.substring(iK0 + 1);
            p.i(strSubstring2, "this as java.lang.String).substring(startIndex)");
            add(string, strSubstring2);
            return this;
        }

        public final Builder addLenient$okhttp(String str) {
            p.j(str, "line");
            int iK0 = a0.k0(str, ':', 1, false, 4, null);
            if (iK0 != -1) {
                String strSubstring = str.substring(0, iK0);
                p.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = str.substring(iK0 + 1);
                p.i(strSubstring2, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(strSubstring, strSubstring2);
            } else if (str.charAt(0) == ':') {
                String strSubstring3 = str.substring(1);
                p.i(strSubstring3, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp("", strSubstring3);
            } else {
                addLenient$okhttp("", str);
            }
            return this;
        }

        public final Builder set(String str, Date date) {
            p.j(str, "name");
            p.j(date, "value");
            set(str, DatesKt.toHttpDateString(date));
            return this;
        }

        public final Builder addAll(Headers headers) {
            p.j(headers, "headers");
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                addLenient$okhttp(headers.name(i10), headers.value(i10));
            }
            return this;
        }

        public final Builder addUnsafeNonAscii(String str, String str2) {
            p.j(str, "name");
            p.j(str2, "value");
            Headers.Companion.checkName(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Headers build() {
            return new Headers((String[]) this.namesAndValues.toArray(new String[0]), null);
        }

        public final String get(String str) {
            p.j(str, "name");
            int size = this.namesAndValues.size() - 2;
            int iB = c.b(size, 0, -2);
            if (iB > size) {
                return null;
            }
            while (!x.E(str, this.namesAndValues.get(size), true)) {
                if (size == iB) {
                    return null;
                }
                size -= 2;
            }
            return this.namesAndValues.get(size + 1);
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String str) {
            p.j(str, "name");
            int i10 = 0;
            while (i10 < this.namesAndValues.size()) {
                if (x.E(str, this.namesAndValues.get(i10), true)) {
                    this.namesAndValues.remove(i10);
                    this.namesAndValues.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        @IgnoreJRERequirement
        public final Builder set(String str, Instant instant) {
            p.j(str, "name");
            p.j(instant, "value");
            return set(str, new Date(instant.toEpochMilli()));
        }

        public final Builder set(String str, String str2) {
            p.j(str, "name");
            p.j(str2, "value");
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            removeAll(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder add(String str, String str2) {
            p.j(str, "name");
            p.j(str2, "value");
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder addLenient$okhttp(String str, String str2) {
            p.j(str, "name");
            p.j(str2, "value");
            this.namesAndValues.add(str);
            this.namesAndValues.add(a0.k1(str2).toString());
            return this;
        }

        public final Builder add(String str, Date date) {
            p.j(str, "name");
            p.j(date, "value");
            add(str, DatesKt.toHttpDateString(date));
            return this;
        }

        @IgnoreJRERequirement
        public final Builder add(String str, Instant instant) {
            p.j(str, "name");
            p.j(instant, "value");
            add(str, new Date(instant.toEpochMilli()));
            return this;
        }
    }

    /* JADX INFO: compiled from: Headers.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iB = c.b(length, 0, -2);
            if (iB > length) {
                return null;
            }
            while (!x.E(str, strArr[length], true)) {
                if (length == iB) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m97deprecated_of(String... strArr) {
            p.j(strArr, "namesAndValues");
            return of((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final Headers of(String... strArr) {
            p.j(strArr, "namesAndValues");
            int i10 = 0;
            if (!(strArr.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            for (int i11 = 0; i11 < length; i11++) {
                String str = strArr2[i11];
                if (!(str != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                strArr2[i11] = a0.k1(str).toString();
            }
            int iB = c.b(0, strArr2.length - 1, 2);
            if (iB >= 0) {
                while (true) {
                    String str2 = strArr2[i10];
                    String str3 = strArr2[i10 + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                    if (i10 == iB) {
                        break;
                    }
                    i10 += 2;
                }
            }
            return new Headers(strArr2, null);
        }

        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m96deprecated_of(Map<String, String> map) {
            p.j(map, "headers");
            return of(map);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String str) {
            boolean z10;
            boolean z11;
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char cCharAt = str.charAt(i10);
                    if ('!' <= cCharAt && cCharAt < 127) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:15:0x0021  */
        public final void checkValue(String str, String str2) {
            boolean z10;
            String str3;
            boolean z11;
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\t') {
                    if (' ' <= cCharAt && cCharAt < 127) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } else {
                    z10 = true;
                }
                if (!z10) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2));
                    if (Util.isSensitiveHeader(str2)) {
                        str3 = "";
                    } else {
                        str3 = ": " + str;
                    }
                    sb2.append(str3);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        public final Headers of(Map<String, String> map) {
            p.j(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = a0.k1(key).toString();
                String string2 = a0.k1(value).toString();
                checkName(string);
                checkValue(string2, string);
                strArr[i10] = string;
                strArr[i10 + 1] = string2;
                i10 += 2;
            }
            return new Headers(strArr, null);
        }
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public /* synthetic */ Headers(String[] strArr, i iVar) {
        this(strArr);
    }

    public static final Headers of(Map<String, String> map) {
        return Companion.of(map);
    }

    public static final Headers of(String... strArr) {
        return Companion.of(strArr);
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i10 = 0; i10 < length2; i10++) {
            length += (long) this.namesAndValues[i10].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    public final String get(String str) {
        p.j(str, "name");
        return Companion.get(this.namesAndValues, str);
    }

    public final Date getDate(String str) {
        p.j(str, "name");
        String str2 = get(str);
        if (str2 != null) {
            return DatesKt.toHttpDateOrNull(str2);
        }
        return null;
    }

    @IgnoreJRERequirement
    public final Instant getInstant(String str) {
        p.j(str, "name");
        Date date = getDate(str);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    public final String name(int i10) {
        return this.namesAndValues[i10 * 2];
    }

    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(x.G(w.f6066a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(name(i10));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        p.i(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        nj.x.D(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(x.G(w.f6066a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strName = name(i10);
            Locale locale = Locale.US;
            p.i(locale, "US");
            String lowerCase = strName.toLowerCase(locale);
            p.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(value(i10));
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strName = name(i10);
            String strValue = value(i10);
            sb2.append(strName);
            sb2.append(": ");
            if (Util.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb2.append(strValue);
            sb2.append("\n");
        }
        String string = sb2.toString();
        p.i(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String value(int i10) {
        return this.namesAndValues[(i10 * 2) + 1];
    }

    public final List<String> values(String str) {
        p.j(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (x.E(str, name(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i10));
            }
        }
        if (arrayList == null) {
            return s.k();
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        p.i(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m95deprecated_size() {
        return size();
    }

    @Override // java.lang.Iterable
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i10 = 0; i10 < size; i10++) {
            pairArr[i10] = h.a(name(i10), value(i10));
        }
        return b.a(pairArr);
    }
}
