package s2;

import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.NativeAdUnitController;
import com.fyber.inneractive.sdk.external.NativeAdVideoContentController;

/* JADX INFO: compiled from: FyberFactory.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f66998a = new f();

    public static final InneractiveFullscreenUnitController a() {
        return new InneractiveFullscreenUnitController();
    }

    public static final NativeAdUnitController b() {
        return new NativeAdUnitController();
    }

    public static final NativeAdVideoContentController c() {
        return new NativeAdVideoContentController();
    }

    public static final InneractiveAdSpot d() {
        InneractiveAdSpot inneractiveAdSpotCreateSpot = InneractiveAdSpotManager.get().createSpot();
        p.i(inneractiveAdSpotCreateSpot, "createSpot(...)");
        return inneractiveAdSpotCreateSpot;
    }
}
