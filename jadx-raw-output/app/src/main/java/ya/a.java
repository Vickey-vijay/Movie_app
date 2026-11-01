package ya;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mgs.carparking.widgets.cache.model.Type;
import za.h;

/* JADX INFO: compiled from: Cache.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile a f75333c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ab.c f75334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f75335b = new Handler(Looper.getMainLooper());

    public static <D> ab.d<D> a(String str, Context context, Type type) {
        h.e(str, "path can't be null");
        return c(context).d().a(str, type);
    }

    public static <D> ab.d<D> b(String str, Context context) {
        return a(str, context, Type.NORMAL);
    }

    public static a c(Context context) {
        if (f75333c == null) {
            synchronized (a.class) {
                if (f75333c == null) {
                    f75333c = new a(context.getApplicationContext());
                }
            }
        }
        return f75333c;
    }

    public ab.c d() {
        return this.f75334a;
    }

    public a(Context context) {
        this.f75334a = new ab.c(context);
    }

    public static b e(Context context) {
        return d.d().b(context);
    }
}
