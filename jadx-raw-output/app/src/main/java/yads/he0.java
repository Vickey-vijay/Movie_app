package yads;

import android.content.Context;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class he0 implements s52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f78191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f78192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9 f78193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f78194d;

    @Override // yads.s52
    public final p52 a() {
        Context context = this.f78194d;
        d4 d4Var = this.f78191a;
        lu2 lu2Var = this.f78192b;
        v9 v9Var = this.f78193c;
        Context applicationContext = context.getApplicationContext();
        return new rp0(new ExoPlayer.Builder(applicationContext).setRenderersFactory(new DefaultRenderersFactory(applicationContext).setEnableDecoderFallback(true)).build(), new kn1(applicationContext, new jn1()), new qi3(applicationContext, d4Var, lu2Var, v9Var), new o52(), new ej3());
    }

    public he0(Context context, v9 v9Var, lu2 lu2Var, d4 d4Var) {
        this.f78191a = d4Var;
        this.f78192b = lu2Var;
        this.f78193c = v9Var;
        this.f78194d = context.getApplicationContext();
    }
}
