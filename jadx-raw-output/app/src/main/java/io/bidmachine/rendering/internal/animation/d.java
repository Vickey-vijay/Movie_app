package io.bidmachine.rendering.internal.animation;

import ck.p;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.AdPhaseParams;
import io.bidmachine.util.Tag;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f60081a = new d();

    private d() {
    }

    public static final a a(AdElementParams adElementParams, boolean z10) {
        p.j(adElementParams, "params");
        return f60081a.a(new Tag("AdElementAnimator (" + adElementParams.getName() + ')'), adElementParams.getAnimationParams(), new j(adElementParams, z10));
    }

    public static final a a(AdPhaseParams adPhaseParams) {
        p.j(adPhaseParams, "params");
        return f60081a.a(new Tag("AdPhaseAnimator"), adPhaseParams.getAnimationParams(), new k(adPhaseParams));
    }

    private final a a(Tag tag, Map map, f fVar) {
        return new a(tag, new h(map), fVar);
    }
}
