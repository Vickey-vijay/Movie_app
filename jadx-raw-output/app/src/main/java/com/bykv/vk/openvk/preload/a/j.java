package com.bykv.vk.openvk.preload.a;

import java.util.List;

/* JADX INFO: compiled from: RetryBranchInterceptor.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class j<IN, OUT> extends l<IN, OUT> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f10521d;

    public abstract String a(IN in2);

    public abstract String a(IN in2, Throwable th2, String str);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in2) throws Throwable {
        new m(bVar);
        this.f10521d = a(in2);
        l.a aVar = a().get(this.f10521d);
        while (aVar != null) {
            List<h> list = aVar.f10524a;
            try {
                Object objA = c.a(list, bVar.f10517a, this).a(in2);
                return !l.a(list) ? objA : bVar.a(objA);
            } catch (i.a e10) {
                Throwable cause = e10.getCause();
                new m(bVar);
                this.f10521d = a(in2, cause, this.f10521d);
                aVar = a().get(this.f10521d);
            } catch (Throwable th2) {
                new m(bVar);
                this.f10521d = a(in2, th2, this.f10521d);
                aVar = a().get(this.f10521d);
            }
        }
        throw new IllegalArgumentException("can not found branch，branch name is：" + this.f10521d);
    }
}
