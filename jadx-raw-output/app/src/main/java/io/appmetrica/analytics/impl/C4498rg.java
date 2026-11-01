package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4498rg implements InterfaceC4349lg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f57607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f57608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4424og f57609c;

    public C4498rg() {
        this(C4418oa.k().u());
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b A[Catch: all -> 0x003e, LOOP:0: B:7:0x0025->B:9:0x002b, LOOP_END, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x001b, B:7:0x0025, B:9:0x002b, B:10:0x0037), top: B:16:0x0004 }] */
    @Override // io.appmetrica.analytics.impl.InterfaceC4349lg
    public final synchronized void a(@Nullable C4424og c4424og) {
        Iterator it;
        if (c4424og != null) {
            LoggerStorage.getMainPublicOrAnonymousLogger().info("Received referrer from source %s: %s", c4424og.f57448d.f57353a, c4424og.f57445a);
            this.f57609c = c4424og;
            this.f57608b = true;
            it = this.f57607a.iterator();
            while (it.hasNext()) {
                ((InterfaceC4220gg) it.next()).a(this.f57609c);
            }
            this.f57607a.clear();
        } else {
            this.f57609c = c4424og;
            this.f57608b = true;
            it = this.f57607a.iterator();
            while (it.hasNext()) {
                ((InterfaceC4220gg) it.next()).a(this.f57609c);
            }
            this.f57607a.clear();
        }
        throw th;
    }

    public C4498rg(C4374mg c4374mg) {
        this.f57607a = new HashSet();
        c4374mg.a(new C4678yl(this));
        c4374mg.a();
    }

    public final synchronized void a(@NonNull InterfaceC4220gg interfaceC4220gg) {
        this.f57607a.add(interfaceC4220gg);
        if (this.f57608b) {
            interfaceC4220gg.a(this.f57609c);
            this.f57607a.remove(interfaceC4220gg);
        }
    }
}
