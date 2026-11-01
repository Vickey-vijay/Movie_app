package vc;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import rc.d;
import rc.e;
import rc.f;

/* JADX INFO: compiled from: SignalsCollector.java */
/* JADX INFO: loaded from: classes7.dex */
public class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public tc.a f73157a;

    /* JADX INFO: compiled from: SignalsCollector.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73158a;

        static {
            int[] iArr = new int[UnityAdFormat.values().length];
            f73158a = iArr;
            try {
                iArr[UnityAdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73158a[UnityAdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f73158a[UnityAdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // rc.c
    public void e(Context context, String str, UnityAdFormat unityAdFormat, oc.a aVar, f fVar) {
        QueryInfo.generate(context, g(unityAdFormat), this.f73157a.a(), new vc.a(str, new d(aVar, fVar)));
    }

    public AdFormat g(UnityAdFormat unityAdFormat) {
        int i10 = a.f73158a[unityAdFormat.ordinal()];
        if (i10 == 1) {
            return AdFormat.BANNER;
        }
        if (i10 != 2) {
            return i10 != 3 ? AdFormat.UNKNOWN : AdFormat.REWARDED;
        }
        return AdFormat.INTERSTITIAL;
    }

    public b(tc.a aVar) {
        this.f73157a = aVar;
    }

    @Override // rc.c
    public void d(Context context, UnityAdFormat unityAdFormat, oc.a aVar, f fVar) {
        e(context, f(unityAdFormat), unityAdFormat, aVar, fVar);
    }
}
