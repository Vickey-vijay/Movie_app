package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4201fn extends Lambda implements bk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4227gn f56784a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4201fn(C4227gn c4227gn) {
        super(0);
        this.f56784a = c4227gn;
    }

    @Override // bk.a
    public final Object invoke() {
        HashMap map = new HashMap();
        C4227gn c4227gn = this.f56784a;
        String strA = c4227gn.f56857a.a();
        if (strA != null) {
        }
        String strA2 = c4227gn.f56858b.a();
        if (strA2 != null) {
            map.put(AdRevenueConstants.PLUGIN_SUPPORTED_SOURCES_KEY, strA2);
        }
        return map;
    }
}
