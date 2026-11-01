package xe;

import com.yk.e.pl.BaseAdPlayer;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 implements BaseAdPlayer.IPreparedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f74442a;

    public e0(u uVar) {
        this.f74442a = uVar;
    }

    @Override // com.yk.e.pl.BaseAdPlayer.IPreparedCallback
    public final void onPrepared() {
        this.f74442a.A();
    }
}
