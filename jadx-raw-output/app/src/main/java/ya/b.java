package ya;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;
import za.h;

/* JADX INFO: compiled from: CacheManager.java */
/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f75336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f75337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f75338c;

    public synchronized <D> List<D> b(String str, Class<D> cls) {
        return (List<D>) a().a(str, cls);
    }

    public synchronized <D> boolean d(String str, D d10) {
        h.e(d10, "cache data can't be null");
        return a().b(str, d10);
    }

    public final ab.d<Object> a() {
        ab.d<Object> dVarB = a.b(this.f75336a, this.f75337b);
        if (dVarB != null) {
            return dVarB;
        }
        throw new IllegalArgumentException("Unknown type obj . can't be save or nonsupport this type cache!");
    }

    public b c(String str) {
        this.f75336a = str;
        return this;
    }

    public b(Context context) {
        this.f75337b = context;
        this.f75338c = a.c(context);
        if (TextUtils.isEmpty(this.f75336a)) {
            this.f75336a = h.d(context);
        }
    }
}
