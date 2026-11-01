package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import com.iab.omid.library.inmobi.adsession.media.Position;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;

/* JADX INFO: renamed from: com.inmobi.media.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3295x2 extends AbstractC2819e1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f25681h = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f25682g;

    @Override // com.inmobi.media.AbstractC2819e1
    public final void a(boolean z10) {
        if (this.f24281e == null) {
            ck.p.i(this.f25682g, "tag");
            return;
        }
        InterfaceC3028m9 interfaceC3028m9 = this.f24278b;
        if (interfaceC3028m9 != null) {
            String str = this.f25682g;
            ck.p.i(str, "tag");
            ((C3053n9) interfaceC3028m9).a(str, "nonSkippableVideoAdLoaded - isAutoPlay: " + z10);
        }
        try {
            P4.a(this.f24277a, new C3220u2(this, VastProperties.createVastPropertiesForNonSkippableMedia(z10, Position.STANDALONE), null));
        } catch (Exception e10) {
            ck.p.i(this.f25682g, "tag");
            e10.getStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3295x2(nk.l0 l0Var, InterfaceC3028m9 interfaceC3028m9) {
        super(l0Var, interfaceC3028m9);
        ck.p.j(l0Var, "coroutineScope");
        this.f25682g = AbstractC3295x2.class.getSimpleName();
    }

    public final void b(Rl rl2) {
        MediaEvents mediaEvents;
        InterfaceC3028m9 interfaceC3028m9 = this.f24278b;
        if (interfaceC3028m9 != null) {
            String str = this.f25682g;
            ck.p.i(str, "tag");
            ((C3053n9) interfaceC3028m9).a(str, "fireAdVideoEvent - received video event: " + rl2);
        }
        if (rl2 instanceof Ql) {
            AdSession adSession = this.f24279c;
            if (adSession != null) {
                ErrorType errorType = ErrorType.VIDEO;
                ((Ql) rl2).getClass();
                adSession.error(errorType, "UnKnown Media Error");
                return;
            }
            return;
        }
        if (rl2 instanceof Om) {
            MediaEvents mediaEvents2 = this.f24280d;
            if (mediaEvents2 != null) {
                mediaEvents2.pause();
                return;
            }
            return;
        }
        if (rl2 instanceof C2918hn) {
            MediaEvents mediaEvents3 = this.f24280d;
            if (mediaEvents3 != null) {
                mediaEvents3.resume();
                return;
            }
            return;
        }
        if (rl2 instanceof C3315xm) {
            MediaEvents mediaEvents4 = this.f24280d;
            if (mediaEvents4 != null) {
                mediaEvents4.firstQuartile();
                return;
            }
            return;
        }
        if (rl2 instanceof C2942in) {
            MediaEvents mediaEvents5 = this.f24280d;
            if (mediaEvents5 != null) {
                mediaEvents5.midpoint();
                return;
            }
            return;
        }
        if (rl2 instanceof C3166rn) {
            MediaEvents mediaEvents6 = this.f24280d;
            if (mediaEvents6 != null) {
                mediaEvents6.thirdQuartile();
                return;
            }
            return;
        }
        if (rl2 instanceof Pl) {
            MediaEvents mediaEvents7 = this.f24280d;
            if (mediaEvents7 != null) {
                mediaEvents7.complete();
                return;
            }
            return;
        }
        if (rl2 instanceof C2992kn) {
            MediaEvents mediaEvents8 = this.f24280d;
            if (mediaEvents8 != null) {
                mediaEvents8.start(((C2992kn) rl2).f24703a, 0.0f);
                return;
            }
            return;
        }
        if (rl2 instanceof S1) {
            MediaEvents mediaEvents9 = this.f24280d;
            if (mediaEvents9 != null) {
                mediaEvents9.volumeChange(((S1) rl2).f23477b);
                return;
            }
            return;
        }
        if (!(rl2 instanceof C2967jn) || (mediaEvents = this.f24280d) == null) {
            return;
        }
        mediaEvents.skipped();
    }

    public final void a(float f10, boolean z10) {
        if (this.f24281e == null) {
            InterfaceC3028m9 interfaceC3028m9 = this.f24278b;
            if (interfaceC3028m9 != null) {
                String str = this.f25682g;
                ck.p.i(str, "tag");
                ((C3053n9) interfaceC3028m9).a(str, "Failed to register videoAdLoaded. adEvent is null");
                return;
            }
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f24278b;
        if (interfaceC3028m10 != null) {
            String str2 = this.f25682g;
            ck.p.i(str2, "tag");
            ((C3053n9) interfaceC3028m10).a(str2, "skippableVideoAdLoaded - skipOffset: " + f10 + ", isAutoPlay: " + z10);
        }
        try {
            P4.a(this.f24277a, new C3245v2(this, VastProperties.createVastPropertiesForSkippableMedia(f10, z10, Position.STANDALONE), null));
        } catch (Exception e10) {
            ck.p.i(this.f25682g, "tag");
            e10.getStackTrace();
        }
    }

    @Override // com.inmobi.media.AbstractC2819e1, com.inmobi.media.Kl
    public final void a(Rl rl2) {
        ck.p.j(rl2, "videoEvent");
        if (rl2 instanceof Xm) {
            return;
        }
        InterfaceC3028m9 interfaceC3028m9 = this.f24278b;
        if (interfaceC3028m9 != null) {
            String str = this.f25682g;
            ck.p.i(str, "tag");
            ((C3053n9) interfaceC3028m9).a(str, "trackAdVideoEvent - videoEvent: " + rl2);
        }
        if (this.f24280d == null) {
            ck.p.i(this.f25682g, "tag");
        } else {
            P4.a(this.f24277a, new C3270w2(this, rl2, null));
        }
    }
}
