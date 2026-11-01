package com.inmobi.media;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public final class S7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk.l0 f23489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExoPlayer f23490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qk.k f23491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q1 f23492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23493e;

    public S7(Context context, nk.l0 l0Var, ExoPlayer exoPlayer, boolean z10, qk.k kVar) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(exoPlayer, "exoPlayer");
        ck.p.j(kVar, "playerEventsFlow");
        this.f23489a = l0Var;
        this.f23490b = exoPlayer;
        this.f23491c = kVar;
        Q1 q10 = new Q1(context);
        this.f23492d = q10;
        this.f23493e = z10;
        Q7 q11 = new Q7(this);
        ck.p.j(q11, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        q10.f23361c = new WeakReference(q11);
    }

    public final void a() {
        this.f23490b.setVolume(0.0f);
        P4.a(this.f23491c, this.f23489a, new S1(0.0f, true));
        this.f23493e = true;
    }
}
