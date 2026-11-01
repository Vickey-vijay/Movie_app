package yads;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class z31 implements d51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk.n f85187a;

    @Override // yads.d51
    public final void a(String str, Bitmap bitmap) {
        this.f85187a.n(new q31(str, bitmap));
    }

    public z31(pk.n nVar) {
        this.f85187a = nVar;
    }

    @Override // yads.d51
    public final void a(Map map) {
        pk.q.a.a(this.f85187a.h(), null, 1, null);
    }
}
