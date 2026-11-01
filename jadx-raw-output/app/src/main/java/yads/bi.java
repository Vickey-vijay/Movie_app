package yads;

import android.app.ApplicationExitInfo;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class bi extends Lambda implements bk.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f75833b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(long j10) {
        super(1);
        this.f75833b = j10;
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((ApplicationExitInfo) obj).getTimestamp() > this.f75833b);
    }
}
