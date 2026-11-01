package sg.bigo.ads.ad.b.a;

import android.os.SystemClock;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import com.ironsource.mediationsdk.logger.IronSourceError;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends sg.bigo.ads.ad.b.c {
    public g(@NonNull sg.bigo.ads.api.core.f fVar) {
        super(fVar);
    }

    @Override // sg.bigo.ads.ad.b.c, sg.bigo.ads.ad.b.b
    public final void a(@NonNull sg.bigo.ads.api.b.d.a<NativeAd> aVar, int i10) {
        if (this.f67540e || this.f67541f) {
            return;
        }
        super.a(aVar, i10);
    }

    @Override // sg.bigo.ads.ad.b.c
    public final void a(@NonNull sg.bigo.ads.api.b.d.a<NativeAd> aVar, @NonNull sg.bigo.ads.api.core.b bVar, int i10, boolean z10) {
        String strA = this.f67537b.f69376a.N().a();
        if (!URLUtil.isNetworkUrl(strA)) {
            strA = null;
        }
        if (strA != null) {
            aVar.a(this);
        } else {
            aVar.a(this, 1005, IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, "Illegal Land Url");
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.ad.b.c, sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        if (this.f67552q) {
            return;
        }
        this.f67552q = true;
        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) f(), SystemClock.elapsedRealtime() - this.f67546k);
    }
}
