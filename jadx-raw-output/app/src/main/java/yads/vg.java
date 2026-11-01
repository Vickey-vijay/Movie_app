package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes11.dex */
public final class vg extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wg f83902b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg(wg wgVar) {
        super(0);
        this.f83902b = wgVar;
    }

    @Override // bk.a
    public final Object invoke() {
        this.f83902b.c();
        this.f83902b.f84195d.getClass();
        rg.a("Connection timeout");
        this.f83902b.a();
        return mj.r.f64562a;
    }
}
