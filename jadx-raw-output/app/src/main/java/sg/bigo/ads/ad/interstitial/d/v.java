package sg.bigo.ads.ad.interstitial.d;

import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes11.dex */
public final class v extends t {
    public v(@NonNull sg.bigo.ads.ad.b.b bVar) {
        super(bVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.t
    public final boolean B() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.t
    public final int[] z() {
        boolean z10 = x() == 1;
        int[] iArr = {2105636, ViewCompat.MEASURED_STATE_MASK};
        if (!z10) {
            return iArr;
        }
        // fill-array-data instruction
        iArr[0] = 16777215;
        iArr[1] = -1;
        return iArr;
    }
}
