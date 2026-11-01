package yads;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class p60 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f81259b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p60(Context context) {
        super(0);
        this.f81259b = context;
    }

    @Override // bk.a
    public final Object invoke() {
        return new v61(this.f81259b);
    }
}
