package k3;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: ExoPlayerFactory.java */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public final class l {
    @Deprecated
    public static u0 b(Context context, s0 s0Var, c5.d dVar, g0 g0Var, @Nullable com.google.android.exoplayer2.drm.a<p3.j> aVar, Looper looper) {
        return d(context, s0Var, dVar, g0Var, aVar, new l3.a(g5.c.f53058a), looper);
    }

    @Deprecated
    public static u0 c(Context context, s0 s0Var, c5.d dVar, g0 g0Var, @Nullable com.google.android.exoplayer2.drm.a<p3.j> aVar, e5.c cVar, l3.a aVar2, Looper looper) {
        return new u0(context, s0Var, dVar, g0Var, aVar, cVar, aVar2, g5.c.f53058a, looper);
    }

    @Deprecated
    public static u0 a(Context context, s0 s0Var, c5.d dVar, g0 g0Var, @Nullable com.google.android.exoplayer2.drm.a<p3.j> aVar) {
        return b(context, s0Var, dVar, g0Var, aVar, g5.k0.N());
    }

    @Deprecated
    public static u0 d(Context context, s0 s0Var, c5.d dVar, g0 g0Var, @Nullable com.google.android.exoplayer2.drm.a<p3.j> aVar, l3.a aVar2, Looper looper) {
        return c(context, s0Var, dVar, g0Var, aVar, e5.k.k(context), aVar2, looper);
    }
}
