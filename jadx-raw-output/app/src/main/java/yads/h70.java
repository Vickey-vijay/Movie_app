package yads;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
public final class h70 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f78082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m70 f78083c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h70(Context context, m70 m70Var) {
        super(0);
        this.f78082b = context;
        this.f78083c = m70Var;
    }

    @Override // bk.a
    public final Object invoke() {
        return new cv2(this.f78082b, (au1) this.f78083c.f80105k.getValue());
    }
}
