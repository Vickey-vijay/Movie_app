package rc;

import android.content.Context;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: SignalsCollectorBase.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e implements c {

    /* JADX INFO: compiled from: SignalsCollectorBase.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public rc.b f66748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f f66749c;

        public b(rc.b bVar, f fVar) {
            this.f66748b = bVar;
            this.f66749c = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, String> mapC = this.f66749c.c();
            if (mapC.size() > 0) {
                this.f66748b.onSignalsCollected(new JSONObject(mapC).toString());
            } else if (this.f66749c.b() == null) {
                this.f66748b.onSignalsCollected("");
            } else {
                this.f66748b.onSignalsCollectionFailed(this.f66749c.b());
            }
        }
    }

    /* JADX INFO: compiled from: SignalsCollectorBase.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66747a;

        static {
            int[] iArr = new int[UnityAdFormat.values().length];
            f66747a = iArr;
            try {
                iArr[UnityAdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66747a[UnityAdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66747a[UnityAdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // rc.c
    public void a(Context context, String str, UnityAdFormat unityAdFormat, rc.b bVar) {
        oc.a aVar = new oc.a();
        f fVar = new f();
        aVar.a();
        e(context, str, unityAdFormat, aVar, fVar);
        aVar.c(new b(bVar, fVar));
    }

    @Override // rc.c
    public void b(Context context, boolean z10, rc.b bVar) {
        oc.a aVar = new oc.a();
        f fVar = new f();
        aVar.a();
        d(context, UnityAdFormat.INTERSTITIAL, aVar, fVar);
        aVar.a();
        d(context, UnityAdFormat.REWARDED, aVar, fVar);
        if (z10) {
            aVar.a();
            d(context, UnityAdFormat.BANNER, aVar, fVar);
        }
        aVar.c(new b(bVar, fVar));
    }

    @Override // rc.c
    public void c(Context context, List<UnityAdFormat> list, rc.b bVar) {
        oc.a aVar = new oc.a();
        f fVar = new f();
        for (UnityAdFormat unityAdFormat : list) {
            aVar.a();
            d(context, unityAdFormat, aVar, fVar);
        }
        aVar.c(new b(bVar, fVar));
    }

    public String f(UnityAdFormat unityAdFormat) {
        int i10 = a.f66747a[unityAdFormat.ordinal()];
        if (i10 == 1) {
            return "gmaScarBiddingBannerSignal";
        }
        if (i10 != 2) {
            return i10 != 3 ? "" : "gmaScarBiddingRewardedSignal";
        }
        return "gmaScarBiddingInterstitialSignal";
    }
}
