package gl;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.ironsource.Z7;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends PreloadCallbackV2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f53575b;

    @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
    public final void onAdsExhausted(String str) {
    }

    @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
    public final void onAdFailedToPreload(String str, AdError adError) {
        AdLog.i("admob preload ad failed, msg = " + adError.getMessage() + Z7.f27998r + this.f53574a + Z7.f27998r + this.f53575b);
    }

    @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
    public final void onAdPreloaded(String str, ResponseInfo responseInfo) {
        AdLog.i("admob preload ad success, " + this.f53574a + Z7.f27998r + this.f53575b);
    }

    public p(String str, String str2) {
        this.f53574a = str;
        this.f53575b = str2;
    }
}
