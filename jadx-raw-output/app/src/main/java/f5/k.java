package f5;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: DefaultContentMetadata.java */
/* JADX INFO: loaded from: classes.dex */
public final class k implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f52875c = new k(Collections.emptyMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f52876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, byte[]> f52877b;

    public k() {
        this(Collections.emptyMap());
    }

    public static void i(HashMap<String, byte[]> map, List<String> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.remove(list.get(i10));
        }
    }

    @Override // f5.i
    @Nullable
    public final String get(String str, @Nullable String str2) {
        return this.f52877b.containsKey(str) ? new String(this.f52877b.get(str), Charset.forName("UTF-8")) : str2;
    }

    public k(Map<String, byte[]> map) {
        this.f52877b = Collections.unmodifiableMap(map);
    }

    public static Map<String, byte[]> d(Map<String, byte[]> map, j jVar) {
        HashMap map2 = new HashMap(map);
        i(map2, jVar.c());
        c(map2, jVar.b());
        return map2;
    }

    public static byte[] g(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(Charset.forName("UTF-8"));
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    public k e(j jVar) {
        Map<String, byte[]> mapD = d(this.f52877b, jVar);
        return h(this.f52877b, mapD) ? this : new k(mapD);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        return h(this.f52877b, ((k) obj).f52877b);
    }

    public Set<Map.Entry<String, byte[]>> f() {
        return this.f52877b.entrySet();
    }

    public int hashCode() {
        if (this.f52876a == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.f52877b.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f52876a = iHashCode;
        }
        return this.f52876a;
    }

    public static void c(HashMap<String, byte[]> map, Map<String, Object> map2) {
        for (String str : map2.keySet()) {
            map.put(str, g(map2.get(str)));
        }
    }

    public static boolean h(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // f5.i
    public final long get(String str, long j10) {
        return this.f52877b.containsKey(str) ? ByteBuffer.wrap(this.f52877b.get(str)).getLong() : j10;
    }
}
