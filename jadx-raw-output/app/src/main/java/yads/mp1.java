package yads;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class mp1 implements lo1 {
    @Override // yads.lo1
    public final /* bridge */ /* synthetic */ void a(com.monetization.ads.mediation.base.a aVar) {
    }

    @Override // yads.lo1
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map map, Map map2) {
        ((MediatedNativeAdapter) aVar).loadAd(context, (MediatedNativeAdapterListener) obj, map, map2);
    }
}
