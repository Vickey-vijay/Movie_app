package k;

import com.yk.e.pl.BaseAdPlayer;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements BaseAdPlayer.IPlayerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f62022a;

    @Override // com.yk.e.pl.BaseAdPlayer.IPlayerCallback
    public final void onPlayComplete() {
    }

    @Override // com.yk.e.pl.BaseAdPlayer.IPlayerCallback
    public final void onStartPlay() {
    }

    public p(x xVar) {
        this.f62022a = xVar;
    }

    @Override // com.yk.e.pl.BaseAdPlayer.IPlayerCallback
    public final void onPlayFailed(String str) {
        this.f62022a.a(str);
    }
}
