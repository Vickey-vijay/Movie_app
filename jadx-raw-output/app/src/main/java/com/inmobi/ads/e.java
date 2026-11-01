package com.inmobi.ads;

import android.content.Context;
import ck.p;
import com.inmobi.media.C2979ka;
import com.inmobi.media.C3004la;
import com.inmobi.media.Jg;
import com.inmobi.media.Kb;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements PreloadManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2979ka f22315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InMobiInterstitial f22316b;

    public e(InMobiInterstitial inMobiInterstitial) {
        this.f22316b = inMobiInterstitial;
        this.f22315a = new C2979ka(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void load() throws JSONException {
        try {
            this.f22316b.getMAdManager$media_release().i();
        } catch (IllegalStateException e10) {
            String strAccess$getTAG$cp = InMobiInterstitial.access$getTAG$cp();
            p.i(strAccess$getTAG$cp, "access$getTAG$cp(...)");
            Kb.a((byte) 1, strAccess$getTAG$cp, e10.getMessage());
            this.f22316b.getMPubListener$media_release().a(this.f22316b, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void preload() {
        this.f22316b.f22299b = true;
        Jg jg2 = this.f22316b.f22301d;
        jg2.getClass();
        p.j("Preload", "<set-?>");
        jg2.f22941g = "Preload";
        C3004la mAdManager$media_release = this.f22316b.getMAdManager$media_release();
        Jg jg3 = this.f22316b.f22301d;
        Context context = this.f22316b.f22298a;
        if (context == null) {
            p.B("mContext");
            context = null;
        }
        mAdManager$media_release.a(jg3, context, true, "intHtml");
        this.f22316b.getMAdManager$media_release().b(this.f22315a);
    }
}
