package com.vungle.ads;

import kotlin.Metadata;

/* JADX INFO: compiled from: BaseAd.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¨\u0006\t"}, d2 = {"Lcom/vungle/ads/Ad;", "", "", "canPlayAd", "()Ljava/lang/Boolean;", "", "adMarkup", "Lmj/r;", "load", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public interface Ad {

    /* JADX INFO: compiled from: BaseAd.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void load$default(Ad ad2, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
            }
            if ((i10 & 1) != 0) {
                str = null;
            }
            ad2.load(str);
        }
    }

    Boolean canPlayAd();

    void load(String str);
}
