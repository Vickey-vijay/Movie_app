package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import java.util.Map;
import rj.c;

/* JADX INFO: compiled from: HandleOpenUrl.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface HandleOpenUrl {

    /* JADX INFO: compiled from: HandleOpenUrl.kt */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object invoke$default(HandleOpenUrl handleOpenUrl, AdObject adObject, String str, String str2, String str3, Map map, boolean z10, c cVar, int i10, Object obj) {
            if (obj == null) {
                return handleOpenUrl.invoke(adObject, str, str2, (i10 & 8) != 0 ? "android.intent.action.VIEW" : str3, (i10 & 16) != 0 ? null : map, (i10 & 32) != 0 ? false : z10, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }

    Object invoke(AdObject adObject, String str, String str2, String str3, Map<String, ? extends Object> map, boolean z10, c<? super Boolean> cVar);
}
