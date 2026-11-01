package yads;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import kotlin.Pair;

/* JADX INFO: loaded from: classes10.dex */
public final class pp0 implements Player.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f81524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f81525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f81526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp0 f81527d;

    @Override // androidx.media3.common.Player.Listener
    public final void onIsPlayingChanged(boolean z10) {
        if (!z10) {
            if (this.f81525b) {
                return;
            }
            this.f81526c = true;
            rp0 rp0Var = this.f81527d;
            kf3 kf3Var = rp0Var.f82384k;
            cf3 cf3Var = rp0Var.f82383j;
            if (kf3Var == null || cf3Var == null) {
                return;
            }
            kf3Var.i();
            return;
        }
        if (!this.f81524a) {
            rp0 rp0Var2 = this.f81527d;
            kf3 kf3Var2 = rp0Var2.f82384k;
            cf3 cf3Var2 = rp0Var2.f82383j;
            if (kf3Var2 == null || cf3Var2 == null) {
                return;
            }
            this.f81524a = true;
            kf3Var2.c();
            return;
        }
        if (this.f81526c) {
            this.f81526c = false;
            rp0 rp0Var3 = this.f81527d;
            kf3 kf3Var3 = rp0Var3.f82384k;
            cf3 cf3Var3 = rp0Var3.f82383j;
            if (kf3Var3 == null || cf3Var3 == null) {
                return;
            }
            kf3Var3.f();
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i10) {
        if (i10 == 2) {
            this.f81525b = true;
            rp0 rp0Var = this.f81527d;
            kf3 kf3Var = rp0Var.f82384k;
            cf3 cf3Var = rp0Var.f82383j;
            if (kf3Var == null || cf3Var == null) {
                return;
            }
            kf3Var.b();
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                return;
            }
            this.f81524a = false;
            rp0 rp0Var2 = this.f81527d;
            kf3 kf3Var2 = rp0Var2.f82384k;
            cf3 cf3Var2 = rp0Var2.f82383j;
            if (kf3Var2 == null || cf3Var2 == null) {
                return;
            }
            kf3Var2.d();
            return;
        }
        ((zb2) this.f81527d.f82380g.f81115b).a();
        rp0 rp0Var3 = this.f81527d;
        kf3 kf3Var3 = rp0Var3.f82384k;
        cf3 cf3Var3 = rp0Var3.f82383j;
        if (kf3Var3 != null && cf3Var3 != null) {
            kf3Var3.h();
        }
        if (this.f81525b) {
            this.f81525b = false;
            rp0 rp0Var4 = this.f81527d;
            kf3 kf3Var4 = rp0Var4.f82384k;
            cf3 cf3Var4 = rp0Var4.f82383j;
            if (kf3Var4 == null || cf3Var4 == null) {
                return;
            }
            kf3Var4.a();
        }
    }

    public pp0(rp0 rp0Var) {
        this.f81527d = rp0Var;
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException playbackException) {
        rp0 rp0Var = this.f81527d;
        n62 n62Var = rp0Var.f82381h;
        n62 n62Var2 = rp0Var.f82382i;
        Pair pairA = (n62Var == null || n62Var2 == null) ? null : mj.h.a(n62Var, n62Var2);
        if (pairA != null && !this.f81527d.f82385l.contains(pairA)) {
            this.f81527d.f82385l.add(pairA);
            this.f81527d.a((cf3) pairA.getSecond());
            return;
        }
        this.f81524a = false;
        ((zb2) this.f81527d.f82380g.f81115b).a();
        this.f81527d.f82374a.stop();
        String message = playbackException.getMessage();
        qi3 qi3Var = this.f81527d.f82376c;
        fo2 fo2VarA = qi3Var.f81863b.a();
        fo2VarA.b(message, "error_message");
        qi3Var.f81862a.a(new eo2(co2.f76361l.a(), kotlin.collections.a.B(fo2VarA.f77471a), fo2VarA.f77472b));
        rp0 rp0Var2 = this.f81527d;
        kf3 kf3Var = rp0Var2.f82384k;
        cf3 cf3Var = rp0Var2.f82383j;
        if (kf3Var == null || cf3Var == null) {
            return;
        }
        rp0Var2.f82377d.getClass();
        kf3Var.a(new jf3(o52.a(playbackException), playbackException));
    }
}
