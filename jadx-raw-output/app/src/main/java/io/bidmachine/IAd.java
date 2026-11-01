package io.bidmachine;

import androidx.annotation.Nullable;
import io.bidmachine.AdRequest;
import io.bidmachine.IAd;
import io.bidmachine.models.AuctionResult;

/* JADX INFO: loaded from: classes9.dex */
public interface IAd<SelfType extends IAd, AdRequestType extends AdRequest> {
    boolean canShow();

    void destroy();

    @Nullable
    AuctionResult getAuctionResult();

    boolean isDestroyed();

    boolean isExpired();

    boolean isLoaded();

    boolean isLoading();

    SelfType load(AdRequestType adrequesttype);
}
