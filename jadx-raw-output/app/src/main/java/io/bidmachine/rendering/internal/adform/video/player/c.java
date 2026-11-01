package io.bidmachine.rendering.internal.adform.video.player;

import android.content.Context;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.internal.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f60052a = new c();

    private c() {
    }

    public static final b a(Context context, String str) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        if (p.e(str, "exo")) {
            o.b("PlayerFactory", "Create player (ExoPlayerImpl)", new Object[0]);
            return new io.bidmachine.rendering.internal.adform.video.player.exo.a(context);
        }
        o.b("PlayerFactory", "Create player (MediaPlayerImpl)", new Object[0]);
        return new io.bidmachine.rendering.internal.adform.video.player.media.a(context);
    }
}
