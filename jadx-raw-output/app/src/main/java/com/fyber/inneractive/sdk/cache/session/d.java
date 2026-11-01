package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.util.o;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.session.enums.a f14945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.session.enums.c f14946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f14947c;

    public d(e eVar, com.fyber.inneractive.sdk.cache.session.enums.a aVar, com.fyber.inneractive.sdk.cache.session.enums.c cVar) {
        this.f14947c = eVar;
        this.f14945a = aVar;
        this.f14946b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f14947c.f14950c) {
            com.fyber.inneractive.sdk.cache.session.enums.a aVar = this.f14945a;
            if (aVar != com.fyber.inneractive.sdk.cache.session.enums.a.NEW_SESSION) {
                g gVar = (g) this.f14947c.f14948a.f14958a.get(this.f14946b);
                if (gVar != null) {
                    int i10 = f.f14953a[aVar.ordinal()];
                    if (i10 == 1) {
                        gVar.f14955b++;
                    } else if (i10 == 2) {
                        gVar.f14956c++;
                    } else if (i10 == 3) {
                        gVar.f14954a++;
                    }
                }
            } else {
                this.f14947c.f14948a = new i();
            }
            try {
                o.a(o.f18599a, e.a(this.f14947c).toString().getBytes("UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
            this.f14947c.getClass();
        }
    }
}
