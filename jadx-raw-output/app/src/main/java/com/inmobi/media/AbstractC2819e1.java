package com.inmobi.media;

import android.util.Log;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC2819e1 implements X2, Kl {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f24276f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk.l0 f24277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3028m9 f24278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AdSession f24279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediaEvents f24280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AdEvents f24281e;

    public void a() {
    }

    @Override // com.inmobi.media.Kl
    public void a(Rl rl2) {
        ck.p.j(rl2, "videoEvent");
    }

    public abstract void a(String str, List list, Map map, String str2, String str3, boolean z10);

    public void a(boolean z10) {
    }

    static {
        String simpleName = AbstractC2819e1.class.getSimpleName();
        ck.p.i(simpleName, "getSimpleName(...)");
        f24276f = simpleName;
    }

    public AbstractC2819e1(nk.l0 l0Var, InterfaceC3028m9 interfaceC3028m9) {
        ck.p.j(l0Var, "coroutineScope");
        this.f24277a = l0Var;
        this.f24278b = interfaceC3028m9;
    }

    public final void a(InteractionType interactionType) {
        ck.p.j(interactionType, "type");
        if (this.f24280d == null) {
            InterfaceC3028m9 interfaceC3028m9 = this.f24278b;
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).a(f24276f, "Failed to register adUserInteractionEvent with type: " + interactionType);
                return;
            }
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f24278b;
        if (interfaceC3028m10 != null) {
            ((C3053n9) interfaceC3028m10).a(f24276f, "trackAdUserInteractionEvent with type: " + interactionType);
        }
        P4.a(this.f24277a, new C2794d1(this, interactionType, null));
    }

    public final void b() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24278b;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a(f24276f, "initAdEvents");
        }
        try {
            this.f24281e = AdEvents.createAdEvents(this.f24279c);
        } catch (IllegalArgumentException e10) {
            InterfaceC3028m9 interfaceC3028m10 = this.f24278b;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).a(f24276f, "Failure initAdEvents: " + Log.getStackTraceString(e10));
            }
        }
    }

    public final void c() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24278b;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a(f24276f, "initMediaAdEvents");
        }
        try {
            this.f24280d = MediaEvents.createMediaEvents(this.f24279c);
        } catch (IllegalArgumentException e10) {
            InterfaceC3028m9 interfaceC3028m10 = this.f24278b;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).a(f24276f, "Failure initMediaAdEvents: " + Log.getStackTraceString(e10));
            }
        }
    }

    public final void a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        ck.p.j(adSessionConfiguration, "adSessionConfiguration");
        ck.p.j(adSessionContext, "adSessionContext");
        if (this.f24279c != null) {
            InterfaceC3028m9 interfaceC3028m9 = this.f24278b;
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).a(f24276f, "initAdSession: adSession is already created");
                return;
            }
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f24278b;
        if (interfaceC3028m10 != null) {
            ((C3053n9) interfaceC3028m10).a(f24276f, "initAdSession");
        }
        try {
            this.f24279c = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
        } catch (Exception e10) {
            InterfaceC3028m9 interfaceC3028m11 = this.f24278b;
            if (interfaceC3028m11 != null) {
                ((C3053n9) interfaceC3028m11).a(f24276f, "AdSession creation failed. " + e10);
            }
        }
    }
}
