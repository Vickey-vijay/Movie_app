package yads;

import android.app.ApplicationExitInfo;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class ci extends Lambda implements bk.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f76284b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(long j10) {
        super(1);
        this.f76284b = j10;
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((ApplicationExitInfo) obj).getTimestamp() > this.f76284b);
    }
}
