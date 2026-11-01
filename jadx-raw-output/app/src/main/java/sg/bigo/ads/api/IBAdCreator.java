package sg.bigo.ads.api;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.k;
import sg.bigo.ads.ad.interstitial.o;
import sg.bigo.ads.api.core.f;

/* JADX INFO: loaded from: classes10.dex */
@Keep
public class IBAdCreator implements k.a<o> {
    @Override // sg.bigo.ads.ad.interstitial.k.a
    public o getAdInstance(@NonNull f fVar) {
        return fVar.f69376a.x() == 20 ? new sg.bigo.ads.ad.d.c(fVar) : new o(fVar);
    }
}
