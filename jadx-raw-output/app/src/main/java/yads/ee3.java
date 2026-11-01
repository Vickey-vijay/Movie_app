package yads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ee3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f77043d = "yandex_tracking_events";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f77044e = nj.s.n(CreativeInfo.S, "social_ad_info", "AdTune", "yandex_ad_info", "bannerId", "VitrinaTVIsInteractive");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f77045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bz2 f77046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pp3 f77047c;

    public static pp3 a() {
        return new pp3(new y73(), VastTagName.EXTENSION, VastTagName.TRACKING);
    }

    public ee3() {
        rp3 rp3Var = new rp3();
        this.f77045a = rp3Var;
        this.f77046b = new bz2(rp3Var);
        this.f77047c = a();
    }
}
