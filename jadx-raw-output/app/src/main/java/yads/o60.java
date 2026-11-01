package yads;

import android.content.Context;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
public final class o60 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f80952b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o60(Context context) {
        super(0);
        this.f80952b = context;
    }

    @Override // bk.a
    public final Object invoke() {
        return new z70(w82.f84125d.a(this.f80952b).f84127a, new ArrayList());
    }
}
