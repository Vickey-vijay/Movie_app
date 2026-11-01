package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.enums.b f16230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f16231b;

    @Override // java.lang.Runnable
    public final void run() {
        q qVar;
        try {
            try {
                Iterator it = this.f16231b.f16234b.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).a(this.f16230a);
                }
                com.fyber.inneractive.sdk.player.enums.b bVar = this.f16230a;
                if (bVar == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar == com.fyber.inneractive.sdk.player.enums.b.Error) {
                    com.fyber.inneractive.sdk.util.v.a(this.f16231b.f16242j);
                    qVar = this.f16231b;
                    qVar.f16242j = null;
                    qVar.f16243k = null;
                }
            } catch (Exception e10) {
                if (IAlog.f18551a <= 3) {
                    q qVar2 = this.f16231b;
                    qVar2.getClass();
                    IAlog.a("%sonPlayerStateChanged callback threw an exception!", e10, IAlog.a(qVar2));
                }
                com.fyber.inneractive.sdk.player.enums.b bVar2 = this.f16230a;
                if (bVar2 != com.fyber.inneractive.sdk.player.enums.b.Idle && bVar2 != com.fyber.inneractive.sdk.player.enums.b.Error) {
                    return;
                }
                com.fyber.inneractive.sdk.util.v.a(this.f16231b.f16242j);
                qVar = this.f16231b;
                qVar.f16242j = null;
            }
        } catch (Throwable th2) {
            com.fyber.inneractive.sdk.player.enums.b bVar3 = this.f16230a;
            if (bVar3 == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar3 == com.fyber.inneractive.sdk.player.enums.b.Error) {
                com.fyber.inneractive.sdk.util.v.a(this.f16231b.f16242j);
                q qVar3 = this.f16231b;
                qVar3.f16242j = null;
                qVar3.f16243k = null;
            }
            throw th2;
        }
    }

    public m(q qVar, com.fyber.inneractive.sdk.player.enums.b bVar) {
        this.f16231b = qVar;
        this.f16230a = bVar;
    }
}
