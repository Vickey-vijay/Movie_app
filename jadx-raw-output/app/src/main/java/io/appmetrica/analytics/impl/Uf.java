package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.impl.Uf;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class Uf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f55983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function f55984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Consumer f55985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Consumer f55986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4059aa f55987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC4096bl f55988f;

    public static final void a(File file) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f55983a.exists()) {
            C4666y9 c4666y9B = this.f55987e.b(this.f55983a.getName());
            Consumer consumer = this.f55985c;
            try {
                c4666y9B.f58017a.lock();
                c4666y9B.f58018b.a();
                if (!this.f55983a.exists()) {
                    consumer.consume(this.f55983a);
                    c4666y9B.c();
                    C4059aa c4059aa = this.f55987e;
                    String name = this.f55983a.getName();
                    synchronized (c4059aa) {
                        c4059aa.f56346b.remove(name);
                    }
                    return;
                }
                Object objApply = this.f55984b.apply(this.f55983a);
                if (objApply != null) {
                    if (this.f55988f.a(objApply)) {
                        this.f55986d.consume(objApply);
                    } else {
                        consumer = new Consumer() { // from class: af.t
                            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
                            public final void consume(Object obj) {
                                Uf.a((File) obj);
                            }
                        };
                    }
                }
            } catch (Throwable unused) {
            }
            consumer.consume(this.f55983a);
            c4666y9B.c();
            this.f55987e.a(this.f55983a.getName());
        }
    }

    public Uf(File file, Function function, Consumer consumer, Consumer consumer2, C4059aa c4059aa, InterfaceC4096bl interfaceC4096bl) {
        this.f55983a = file;
        this.f55984b = function;
        this.f55985c = consumer;
        this.f55986d = consumer2;
        this.f55987e = c4059aa;
        this.f55988f = interfaceC4096bl;
    }
}
