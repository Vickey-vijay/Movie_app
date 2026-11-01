package yads;

import android.content.Context;
import io.bidmachine.iab.vast.tags.VastTagName;

/* JADX INFO: loaded from: classes2.dex */
public final class f20 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f77269e = "yandex_tracking_events";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f77270f = "yandex_linear_creative_info";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f77271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ef1 f77272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d20 f77273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pp3 f77274d;

    public /* synthetic */ f20(Context context, io2 io2Var) {
        this(new rp3(), new ef1(context, io2Var, new lj(context, io2Var, null, 12)));
    }

    public static d20 a() {
        return new d20(new jr0(new rp3()), new rp3());
    }

    public static pp3 b() {
        return new pp3(new y73(), "CreativeExtension", VastTagName.TRACKING);
    }

    public f20(rp3 rp3Var, ef1 ef1Var) {
        this.f77271a = rp3Var;
        this.f77272b = ef1Var;
        this.f77273c = a();
        this.f77274d = b();
    }
}
