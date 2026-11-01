package f5;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ContentMetadataMutations.java */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f52873a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f52874b = new ArrayList();

    public static j g(j jVar, long j10) {
        return jVar.e("exo_len", j10);
    }

    public static j h(j jVar, @Nullable Uri uri) {
        return uri == null ? jVar.d("exo_redir") : jVar.f("exo_redir", uri.toString());
    }

    public final j a(String str, Object obj) {
        this.f52873a.put((String) g5.a.e(str), g5.a.e(obj));
        this.f52874b.remove(str);
        return this;
    }

    public Map<String, Object> b() {
        HashMap map = new HashMap(this.f52873a);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public List<String> c() {
        return Collections.unmodifiableList(new ArrayList(this.f52874b));
    }

    public j d(String str) {
        this.f52874b.add(str);
        this.f52873a.remove(str);
        return this;
    }

    public j e(String str, long j10) {
        return a(str, Long.valueOf(j10));
    }

    public j f(String str, String str2) {
        return a(str, str2);
    }
}
