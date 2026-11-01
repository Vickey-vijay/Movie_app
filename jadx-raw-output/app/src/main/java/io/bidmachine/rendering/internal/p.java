package io.bidmachine.rendering.internal;

import io.bidmachine.rendering.model.MethodParams;

/* JADX INFO: loaded from: classes11.dex */
public class p extends y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MethodParams f60487c;

    public p(MethodParams methodParams, io.bidmachine.rendering.internal.event.b bVar) {
        super(bVar);
        this.f60487c = methodParams;
    }

    @Override // io.bidmachine.rendering.internal.y
    public String r() {
        return this.f60487c.getName();
    }

    public MethodParams s() {
        return this.f60487c;
    }
}
