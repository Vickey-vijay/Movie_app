package k;

import com.yk.e.pl.BaseAdPlayer;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 implements BaseAdPlayer.IPreparedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f62042a;

    public x0(x xVar) {
        this.f62042a = xVar;
    }

    @Override // com.yk.e.pl.BaseAdPlayer.IPreparedCallback
    public final void onPrepared() {
        x xVar = this.f62042a;
        xVar.O = true;
        xVar.A();
    }
}
