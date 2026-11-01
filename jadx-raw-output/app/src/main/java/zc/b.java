package zc;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import rc.d;
import rc.e;
import rc.f;

/* JADX INFO: compiled from: SignalsCollector.java */
/* JADX INFO: loaded from: classes8.dex */
public class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xc.a f86393a;

    /* JADX INFO: compiled from: SignalsCollector.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86394a;

        static {
            int[] iArr = new int[UnityAdFormat.values().length];
            f86394a = iArr;
            try {
                iArr[UnityAdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f86394a[UnityAdFormat.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // rc.c
    public void e(Context context, String str, UnityAdFormat unityAdFormat, oc.a aVar, f fVar) {
        QueryInfo.generate(context, g(unityAdFormat), this.f86393a.a(), new zc.a(str, new d(aVar, fVar)));
    }

    public AdFormat g(UnityAdFormat unityAdFormat) {
        int i10 = a.f86394a[unityAdFormat.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? AdFormat.INTERSTITIAL : AdFormat.REWARDED;
        }
        return AdFormat.BANNER;
    }

    public b(xc.a aVar) {
        this.f86393a = aVar;
    }

    @Override // rc.c
    public void d(Context context, UnityAdFormat unityAdFormat, oc.a aVar, f fVar) {
        e(context, f(unityAdFormat), unityAdFormat, aVar, fVar);
    }
}
