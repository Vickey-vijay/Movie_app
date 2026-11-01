package yads;

import android.app.ApplicationExitInfo;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class di extends Lambda implements bk.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ei f76676b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(ei eiVar) {
        super(1);
        this.f76676b = eiVar;
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return ei.a(this.f76676b, (ApplicationExitInfo) obj);
    }
}
