package sg.bigo.ads.common.form;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.j;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f69549c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<Integer, Map<String, Object>> f69550d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f69551a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f69552b;

    public interface a {
        void a(int i10);

        void a(Map<String, Object> map);
    }

    private b() {
    }

    @Nullable
    public static Map<String, Object> a(int i10) {
        Map<Integer, Map<String, Object>> map = f69550d;
        if (map.containsKey(Integer.valueOf(i10))) {
            return map.get(Integer.valueOf(i10));
        }
        return null;
    }

    public static b a() {
        return f69549c;
    }

    public static void a(int i10, @NonNull Map<String, Object> map) {
        f69550d.put(Integer.valueOf(i10), map);
    }

    public static void b(int i10) {
        f69550d.remove(Integer.valueOf(i10));
    }

    public final void a(final Map<String, Object> map, final a aVar, final int i10) {
        if (this.f69552b == null || map == null) {
            return;
        }
        sg.bigo.ads.core.d.b.b(1, i10, "");
        this.f69552b.a(map, new j.a() { // from class: sg.bigo.ads.common.form.b.1
            @Override // sg.bigo.ads.common.j.a
            public final void a() {
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(i10);
                }
                sg.bigo.ads.core.d.b.b(2, i10, "");
            }

            @Override // sg.bigo.ads.common.j.a
            public final void a(int i11, int i12, String str) {
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(map);
                }
                sg.bigo.ads.core.d.b.b(3, i10, String.format(Locale.ENGLISH, "code: %d, subcode: %d, error msg: %s", Integer.valueOf(i11), Integer.valueOf(i12), str));
            }
        });
    }
}
