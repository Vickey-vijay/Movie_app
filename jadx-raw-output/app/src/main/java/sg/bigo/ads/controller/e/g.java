package sg.bigo.ads.controller.e;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g f70862b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, a> f70863a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f70864c = false;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f70865a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f70866b = new AtomicInteger(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicInteger f70867c = new AtomicInteger(0);

        public a() {
        }
    }

    public static g a() {
        return f70862b;
    }

    @NonNull
    public final a a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "null";
        }
        a aVar = this.f70863a.get(str);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.f70863a.put(str, aVar2);
        return aVar2;
    }

    public final void a(boolean z10) {
        this.f70864c = z10;
        if (z10) {
            Iterator<Map.Entry<String, a>> it = this.f70863a.entrySet().iterator();
            while (it.hasNext()) {
                a value = it.next().getValue();
                if (value != null) {
                    value.f70867c.set(0);
                }
            }
        }
    }
}
