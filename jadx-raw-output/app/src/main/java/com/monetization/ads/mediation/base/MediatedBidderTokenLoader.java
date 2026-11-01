package com.monetization.ads.mediation.base;

import android.content.Context;
import androidx.annotation.WorkerThread;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface MediatedBidderTokenLoader {
    @WorkerThread
    void loadBidderToken(Context context, Map<String, String> map, MediatedBidderTokenLoadListener mediatedBidderTokenLoadListener);
}
