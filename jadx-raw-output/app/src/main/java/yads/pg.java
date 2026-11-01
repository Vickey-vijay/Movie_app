package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public final class pg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pg f81406a = new pg();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile fh f81407b;

    public static final fh a(Context context) {
        fh fhVar;
        fh fhVar2 = f81407b;
        if (fhVar2 != null) {
            return fhVar2;
        }
        synchronized (f81406a) {
            Context contextA = uz.a(context);
            fhVar = f81407b;
            if (fhVar == null) {
                fhVar = new fh(new zg(contextA));
                f81407b = fhVar;
            }
        }
        return fhVar;
    }
}
