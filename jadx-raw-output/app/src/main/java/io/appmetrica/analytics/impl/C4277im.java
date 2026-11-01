package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.im, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4277im implements InterfaceC4355lm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile C4226gm f56978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f56979b = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC4355lm
    public final void a(C4226gm c4226gm) {
        this.f56978a = c4226gm;
        Iterator it = this.f56979b.iterator();
        while (it.hasNext()) {
            ((InterfaceC4355lm) it.next()).a(c4226gm);
        }
    }

    public final C4226gm b() {
        C4226gm c4226gm = this.f56978a;
        if (c4226gm != null) {
            return c4226gm;
        }
        ck.p.B("startupState");
        return null;
    }

    public final void b(InterfaceC4355lm interfaceC4355lm) {
        this.f56979b.remove(interfaceC4355lm);
    }

    public final void a(InterfaceC4355lm interfaceC4355lm) {
        this.f56979b.add(interfaceC4355lm);
        if (this.f56978a != null) {
            C4226gm c4226gm = this.f56978a;
            if (c4226gm == null) {
                ck.p.B("startupState");
                c4226gm = null;
            }
            interfaceC4355lm.a(c4226gm);
        }
    }

    public final void a(Context context) {
        String strOptStringOrNull;
        ProtobufStateStorage<Object> protobufStateStorageCreate = ((Sm) Qm.a(C4329km.class)).create(context);
        xo xoVarA = C4418oa.k().D().a();
        synchronized (xoVarA) {
            strOptStringOrNull = JsonUtils.optStringOrNull(xoVarA.f57978a.a(), "device_id");
        }
        a(new C4226gm(strOptStringOrNull, xoVarA.a(), (C4329km) protobufStateStorageCreate.read()));
    }
}
