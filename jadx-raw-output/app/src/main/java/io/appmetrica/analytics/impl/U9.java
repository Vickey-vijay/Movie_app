package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class U9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ul f55974a = new Ul();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public W9 f55975b = new W9();

    public final synchronized void a(W9 w10) {
        this.f55975b = w10;
    }

    public final synchronized void a(List list, HashMap map) {
        Boolean bool;
        String str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (ck.p.e((String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.f55975b.f56080a) != null) {
                boolean zBooleanValue = bool.booleanValue();
                W9 w10 = this.f55975b;
                IdentifierStatus identifierStatus = w10.f56081b;
                String str2 = w10.f56082c;
                if (zBooleanValue) {
                    str = "true";
                } else {
                    if (zBooleanValue) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = com.ironsource.mediationsdk.metadata.a.f29886h;
                }
                map.put("appmetrica_lib_ssl_enabled", this.f55974a.a(new IdentifiersResult(str, identifierStatus, str2)));
            }
        }
    }
}
