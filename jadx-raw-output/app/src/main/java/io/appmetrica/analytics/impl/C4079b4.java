package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4079b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f56401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4157e5 f56402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f56403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4468qa f56404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f56405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4285j4 f56406f;

    public C4079b4(Context context, C4157e5 c4157e5) {
        this(context, c4157e5, new C4285j4());
    }

    public final InterfaceC4208g4 a(Q3 q10, C4462q4 c4462q4) {
        InterfaceC4208g4 interfaceC4208g4A;
        synchronized (this.f56401a) {
            interfaceC4208g4A = (InterfaceC4208g4) this.f56403c.get(q10);
            if (interfaceC4208g4A == null) {
                this.f56406f.getClass();
                interfaceC4208g4A = C4285j4.a(q10).a(this.f56405e, this.f56402b, q10, c4462q4);
                this.f56403c.put(q10, interfaceC4208g4A);
                this.f56404d.a(new C4053a4(q10.f55769b, q10.f55770c, q10.f55771d), q10);
            }
        }
        return interfaceC4208g4A;
    }

    public C4079b4(Context context, C4157e5 c4157e5, C4285j4 c4285j4) {
        this.f56401a = new Object();
        this.f56403c = new HashMap();
        this.f56404d = new C4468qa();
        this.f56405e = context.getApplicationContext();
        this.f56402b = c4157e5;
        this.f56406f = c4285j4;
    }

    public final void a(String str, Integer num, String str2) {
        synchronized (this.f56401a) {
            C4468qa c4468qa = this.f56404d;
            Collection collection = (Collection) c4468qa.f57557a.remove(new C4053a4(str, num, str2));
            if (!mo.a(collection)) {
                collection.size();
                ArrayList arrayList = new ArrayList(collection.size());
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add((InterfaceC4208g4) this.f56403c.remove((Q3) it.next()));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC4208g4) it2.next()).a();
                }
            }
        }
    }
}
