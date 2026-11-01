package yads;

import android.app.ApplicationExitInfo;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class ai extends Lambda implements bk.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ai f75524b = new ai();

    public ai() {
        super(1);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((ApplicationExitInfo) obj).getReason() == 6);
    }
}
