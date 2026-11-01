package io.appmetrica.analytics.identifiers.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.identifiers.impl.a;
import io.appmetrica.analytics.identifiers.impl.b;
import io.appmetrica.analytics.identifiers.impl.c;
import io.appmetrica.analytics.identifiers.impl.d;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class AdvIdentifiersProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f54848a = 0;
    private static final d retriever = new d();

    public static Bundle requestIdentifiers(@NonNull Context context, @NonNull Bundle bundle) {
        c cVarA;
        b bVar = (b) retriever.f54831a.get(bundle.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER"));
        if (bVar == null || (cVarA = bVar.a(context)) == null) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        a aVar = cVarA.f54829b;
        if (aVar != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("io.appmetrica.analytics.identifiers.extra.PROVIDER", aVar.f54825a);
            bundle3.putString("io.appmetrica.analytics.identifiers.extra.ID", aVar.f54826b);
            Boolean bool = aVar.f54827c;
            if (bool != null) {
                bundle3.putBoolean("io.appmetrica.analytics.identifiers.extra.LIMITED", bool.booleanValue());
            }
            bundle2.putBundle("io.appmetrica.analytics.identifiers.extra.TRACKING_INFO", bundle3);
        }
        bundle2.putString("io.appmetrica.analytics.identifiers.extra.STATUS", cVarA.f54828a.getValue());
        bundle2.putString("io.appmetrica.analytics.identifiers.extra.ERROR_MESSAGE", cVarA.f54830c);
        return bundle2;
    }
}
