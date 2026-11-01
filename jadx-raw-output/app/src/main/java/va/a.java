package va;

import android.content.Context;
import com.google.android.exoplayer2.upstream.e;
import q.b;

/* JADX INFO: compiled from: Data2Source.java */
/* JADX INFO: loaded from: classes11.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f73143a;

    @Override // q.b
    public com.google.android.exoplayer2.upstream.a.InterfaceC0188a a() {
        return new e(this.f73143a.getPackageName(), null, 8000, 8000, true);
    }

    public a(Context context) {
        this.f73143a = context;
    }
}
