package y7;

import android.content.Context;
import c8.h;

/* JADX INFO: compiled from: PictureAppMaster.java */
/* JADX INFO: loaded from: classes2.dex */
public class b implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static b f75310b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f75311a;

    public static b c() {
        if (f75310b == null) {
            synchronized (b.class) {
                if (f75310b == null) {
                    f75310b = new b();
                }
            }
        }
        return f75310b;
    }

    @Override // y7.a
    public h a() {
        a aVar = this.f75311a;
        if (aVar == null) {
            return null;
        }
        return aVar.a();
    }

    @Override // y7.a
    public Context b() {
        a aVar = this.f75311a;
        if (aVar == null) {
            return null;
        }
        return aVar.b();
    }
}
