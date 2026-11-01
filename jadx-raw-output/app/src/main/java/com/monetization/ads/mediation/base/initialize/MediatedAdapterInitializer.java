package com.monetization.ads.mediation.base.initialize;

import android.content.Context;
import java.util.Map;
import rj.c;

/* JADX INFO: loaded from: classes10.dex */
public interface MediatedAdapterInitializer {
    Object initialize(Context context, Map<String, String> map, c<? super MediatedAdapterInitializationResult> cVar);
}
