package yads;

import android.app.Dialog;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class xc {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f84524e = TimeUnit.SECONDS.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dialog f84525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final um0 f84526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oa2 f84527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f84528d;

    public xc(Dialog dialog, kd kdVar, um0 um0Var, oa2 oa2Var, Handler handler) {
        this.f84525a = dialog;
        this.f84526b = um0Var;
        this.f84527c = oa2Var;
        this.f84528d = handler;
    }
}
