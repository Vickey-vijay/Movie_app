package c;

import com.yk.e.pl.BaseAdPlayer;

/* JADX INFO: loaded from: classes10.dex */
public final class p0 implements BaseAdPlayer.IPreparedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f5586a;

    public p0(v vVar) {
        this.f5586a = vVar;
    }

    @Override // com.yk.e.pl.BaseAdPlayer.IPreparedCallback
    public final void onPrepared() {
        this.f5586a.A();
    }
}
