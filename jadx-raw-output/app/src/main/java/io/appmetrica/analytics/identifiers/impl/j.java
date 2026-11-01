package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f54840a;

    @VisibleForTesting
    public j(f fVar) {
        this.f54840a = fVar;
    }

    @Override // io.appmetrica.analytics.identifiers.impl.b
    public final c a(Context context) {
        c cVar;
        f fVar;
        try {
            try {
                try {
                    m mVar = (m) ((o) this.f54840a.a(context));
                    cVar = new c(IdentifierStatus.OK, new a("huawei", mVar.a(), Boolean.valueOf(mVar.b())), null, 4);
                    fVar = this.f54840a;
                } catch (Throwable unused) {
                }
            } catch (g e10) {
                String message = e10.getMessage();
                if (message == null) {
                    message = "unknown exception during binding huawei services";
                }
                cVar = new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message);
                fVar = this.f54840a;
            } catch (Throwable th2) {
                cVar = new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, "exception while fetching hoaid: " + th2.getMessage());
                fVar = this.f54840a;
            }
            fVar.b(context);
            return cVar;
        } catch (Throwable th3) {
            try {
                this.f54840a.b(context);
            } catch (Throwable unused2) {
            }
            throw th3;
        }
    }

    public j() {
        this(new f(k.f54841a, i.f54839a, "huawei"));
    }
}
