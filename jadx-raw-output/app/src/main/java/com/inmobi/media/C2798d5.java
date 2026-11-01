package com.inmobi.media;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2798d5 extends CustomTabsCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2823e5 f24219a;

    public C2798d5(C2823e5 c2823e5) {
        this.f24219a = c2823e5;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onActivityLayout(int i10, int i11, int i12, int i13, int i14, Bundle bundle) throws JSONException {
        ck.p.j(bundle, "extras");
        super.onActivityLayout(i10, i11, i12, i13, i14, bundle);
        ck.p.i("e5", "access$getLOG_TAG$cp(...)");
        R2 r10 = this.f24219a.f24294c;
        if (r10 != null) {
            r10.a(i10, i11, i12, i13, i14);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i10, Bundle bundle) {
        super.onNavigationEvent(i10, bundle);
        ck.p.i("e5", "access$getLOG_TAG$cp(...)");
        R2 r10 = this.f24219a.f24294c;
        if (r10 != null) {
            C2849f5 c2849f5 = r10.f23427g;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 6 && c2849f5.f24339c == null) {
                            if (c2849f5.f24340d == 4) {
                                c2849f5.f24339c = Boolean.TRUE;
                            } else {
                                c2849f5.f24339c = Boolean.FALSE;
                            }
                            if (ck.p.e(c2849f5.f24339c, Boolean.TRUE)) {
                                Rh rh2 = (Rh) c2849f5.f24341e.get();
                                if (rh2 != null) {
                                    Na na2 = Na.LPCompleteSuccess;
                                    Ya ya2 = c2849f5.f24337a;
                                    ck.p.j(na2, "landingPageFunnelState");
                                    rh2.f23466a.getLandingPageHandler().a(na2, ya2, (Integer) 8003);
                                }
                                Rh rh3 = (Rh) c2849f5.f24341e.get();
                                if (rh3 != null) {
                                    InterfaceC3028m9 interfaceC3028m9 = rh3.f23466a.f24162i;
                                    if (interfaceC3028m9 != null) {
                                        String str = GestureDetectorOnGestureListenerC2785ci.f24141g1;
                                        ck.p.i(str, "access$getTAG$cp(...)");
                                        ((C3053n9) interfaceC3028m9).a(str, "onCCTPageLoadedSuccessfully");
                                    }
                                    rh3.f23466a.D();
                                }
                            } else {
                                Rh rh4 = (Rh) c2849f5.f24341e.get();
                                if (rh4 != null) {
                                    Na na3 = Na.LPCompleteFailed;
                                    Ya ya3 = c2849f5.f24337a;
                                    ck.p.j(na3, "landingPageFunnelState");
                                    rh4.f23466a.getLandingPageHandler().a(na3, ya3, (Integer) 8005);
                                }
                            }
                        }
                    } else if (c2849f5.f24339c == null) {
                        c2849f5.f24339c = Boolean.FALSE;
                        Rh rh5 = (Rh) c2849f5.f24341e.get();
                        if (rh5 != null) {
                            Na na4 = Na.LPCompleteFailed;
                            Ya ya4 = c2849f5.f24337a;
                            ck.p.j(na4, "landingPageFunnelState");
                            rh5.f23466a.getLandingPageHandler().a(na4, ya4, (Integer) 8004);
                        }
                    }
                } else if (c2849f5.f24339c == null) {
                    c2849f5.f24339c = Boolean.TRUE;
                    Rh rh6 = (Rh) c2849f5.f24341e.get();
                    if (rh6 != null) {
                        J2.a(rh6, Na.LPCompleteSuccess, c2849f5.f24337a);
                    }
                    Rh rh7 = (Rh) c2849f5.f24341e.get();
                    if (rh7 != null) {
                        InterfaceC3028m9 interfaceC3028m10 = rh7.f23466a.f24162i;
                        if (interfaceC3028m10 != null) {
                            String str2 = GestureDetectorOnGestureListenerC2785ci.f24141g1;
                            ck.p.i(str2, "access$getTAG$cp(...)");
                            ((C3053n9) interfaceC3028m10).a(str2, "onCCTPageLoadedSuccessfully");
                        }
                        rh7.f23466a.D();
                    }
                }
            } else if (!c2849f5.f24338b) {
                c2849f5.f24338b = true;
                Rh rh8 = (Rh) c2849f5.f24341e.get();
                if (rh8 != null) {
                    J2.a(rh8, Na.LPPageStart, c2849f5.f24337a);
                }
            }
            c2849f5.f24340d = i10;
            if (i10 != 1) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        if (i10 == 6) {
                            Rh rh9 = (Rh) r10.f23429i.get();
                            if (rh9 != null) {
                                GestureDetectorOnGestureListenerC2785ci.f24139e1.getClass();
                                rh9.a(Mh.a("IN_NATIVE_BROWSER", "onHidden"));
                            }
                            Rh rh10 = (Rh) r10.f23429i.get();
                            if (rh10 != null) {
                                InterfaceC3028m9 interfaceC3028m11 = rh10.f23466a.f24162i;
                                if (interfaceC3028m11 != null) {
                                    String str3 = GestureDetectorOnGestureListenerC2785ci.f24141g1;
                                    ck.p.i(str3, "access$getTAG$cp(...)");
                                    ((C3053n9) interfaceC3028m11).a(str3, "onCCTScreenDismissed");
                                }
                                rh10.f23466a.W();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    Rh rh11 = (Rh) r10.f23429i.get();
                    if (rh11 != null) {
                        GestureDetectorOnGestureListenerC2785ci.f24139e1.getClass();
                        rh11.a(Mh.a("IN_NATIVE_BROWSER", "onVisible"));
                    }
                    Rh rh12 = (Rh) r10.f23429i.get();
                    if (rh12 != null) {
                        InterfaceC3028m9 interfaceC3028m12 = rh12.f23466a.f24162i;
                        if (interfaceC3028m12 != null) {
                            String str4 = GestureDetectorOnGestureListenerC2785ci.f24141g1;
                            ck.p.i(str4, "access$getTAG$cp(...)");
                            ((C3053n9) interfaceC3028m12).a(str4, "onCCTScreenDisplayed");
                        }
                        rh12.f23466a.getListener().f(rh12.f23466a);
                        rh12.f23466a.b((String) null, (String) null, (String) null);
                        return;
                    }
                    return;
                }
                Rh rh13 = (Rh) r10.f23429i.get();
                if (rh13 != null) {
                    GestureDetectorOnGestureListenerC2785ci.f24139e1.getClass();
                    rh13.a(Mh.a("IN_NATIVE_BROWSER", "onNavigatingAway"));
                    return;
                }
                return;
            }
            Rh rh14 = (Rh) r10.f23429i.get();
            if (rh14 != null) {
                GestureDetectorOnGestureListenerC2785ci.f24139e1.getClass();
                rh14.a(Mh.a("IN_NATIVE_BROWSER", "onPageStart"));
            }
        }
    }
}
