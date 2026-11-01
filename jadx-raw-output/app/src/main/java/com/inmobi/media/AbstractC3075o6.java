package com.inmobi.media;

import com.inmobi.media.AbstractC3075o6;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.inmobi.media.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3075o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mj.g f24956a = kotlin.b.a(new bk.a() { // from class: b7.r9
        @Override // bk.a
        public final Object invoke() {
            return AbstractC3075o6.a();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mj.g f24957b = kotlin.b.a(new bk.a() { // from class: b7.s9
        @Override // bk.a
        public final Object invoke() {
            return AbstractC3075o6.c();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mj.g f24958c = kotlin.b.a(new bk.a() { // from class: b7.t9
        @Override // bk.a
        public final Object invoke() {
            return AbstractC3075o6.e();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mj.g f24959d = kotlin.b.a(new bk.a() { // from class: b7.u9
        @Override // bk.a
        public final Object invoke() {
            return AbstractC3075o6.b();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mj.g f24960e = kotlin.b.a(new bk.a() { // from class: b7.v9
        @Override // bk.a
        public final Object invoke() {
            return AbstractC3075o6.d();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final mj.g f24961f = kotlin.b.a(new bk.a() { // from class: b7.w9
        @Override // bk.a
        public final Object invoke() {
            return AbstractC3075o6.f();
        }
    });

    public static final ExecutorService a() {
        ck.p.j("ExecutorProvider.IO", "name");
        return Executors.newCachedThreadPool(new B9("ExecutorProvider.IO", false));
    }

    public static final ExecutorService b() {
        ck.p.j("ExecutorProvider.high", "name");
        return Executors.newCachedThreadPool(new B9("ExecutorProvider.high", false));
    }

    public static final ExecutorService c() {
        ck.p.j("ExecutorProvider.highIO", "name");
        return Executors.newCachedThreadPool(new B9("ExecutorProvider.highIO", false));
    }

    public static final Wb d() {
        return new Wb();
    }

    public static final ExecutorService e() {
        ck.p.j("ExecutorProvider.normal", "name");
        return Executors.newCachedThreadPool(new B9("ExecutorProvider.normal", false));
    }

    public static final ExecutorService f() {
        ck.p.j("ExecutorProvider.single", "name");
        return Executors.newSingleThreadExecutor(new B9("ExecutorProvider.single", false));
    }
}
