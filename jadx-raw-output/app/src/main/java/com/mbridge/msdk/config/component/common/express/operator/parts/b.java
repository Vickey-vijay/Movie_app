package com.mbridge.msdk.config.component.common.express.operator.parts;

import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.express.e;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: HighLevelFutureCallable.java */
/* JADX INFO: loaded from: classes2.dex */
public class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f33061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f33062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.express.node.d f33063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a f33064d;

    public void a(Object obj) {
        this.f33064d.a("this", obj);
    }

    @Override // java.util.concurrent.Callable
    public Object call() throws Exception {
        return this.f33063c.a(this.f33061a, this.f33062b, this.f33064d);
    }

    public b(d dVar, e eVar, com.mbridge.msdk.config.component.common.express.node.d dVar2, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        this.f33063c = dVar2;
        this.f33061a = dVar;
        this.f33062b = eVar;
        this.f33064d = aVar;
    }
}
