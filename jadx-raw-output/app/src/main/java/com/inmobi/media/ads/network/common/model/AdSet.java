package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import com.inmobi.media.Ue;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public final class AdSet {
    private String adSetId = "";

    @Ue
    private final LinkedList<Ad> ads = new LinkedList<>();
    private long expiry = -1;
    private final boolean isPod;
    private boolean isRewarded;
    private final boolean logEnabled;
    private int podSuccessCount;
    private final String transactionId;

    public final String getAdSetId() {
        return this.adSetId;
    }

    public final LinkedList<Ad> getAds() {
        return this.ads;
    }

    public final long getExpiry() {
        return this.expiry;
    }

    public final boolean getLogEnabled() {
        return this.logEnabled;
    }

    public final int getPodSuccessCount() {
        return this.podSuccessCount;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final boolean isPod() {
        return this.isPod;
    }

    public final boolean isRewarded() {
        return this.isRewarded;
    }

    public final void setExpiry(long j10) {
        this.expiry = j10;
    }
}
