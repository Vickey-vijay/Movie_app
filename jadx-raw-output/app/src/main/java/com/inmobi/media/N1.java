package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class N1 extends C2717a2 {
    public final T1 K;

    @Override // com.inmobi.media.C2717a2, com.inmobi.media.AbstractC2836ei
    public final void a(V1 v10) {
        ck.p.j(v10, "audioStatusInternal");
        AbstractC2871g1 abstractC2871g1M = m();
        if (abstractC2871g1M != null) {
            abstractC2871g1M.a(v10);
        }
        T1 t10 = this.K;
        t10.getClass();
        ck.p.j(v10, "audioStatusInternal");
        if (!t10.f23547a && v10 == V1.f23666e) {
            t10.f23547a = true;
            T8 t11 = T8.f23553c;
            t11.f24331a = System.currentTimeMillis();
            t11.f24332b++;
        }
    }

    @Override // com.inmobi.media.C2717a2, com.inmobi.media.AbstractC2995l1
    public final String l() {
        return "audio";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1(Context context, C3243v0 c3243v0, W1 w10) {
        super(context, c3243v0, w10);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(c3243v0, "placement");
        this.K = new T1();
    }

    @Override // com.inmobi.media.C2717a2
    public final boolean V() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "<get-TAG>(...)");
            c3053n9.c("l1", "canProceedToLoad");
        }
        E();
        byte b10 = this.f24710b;
        if (1 == b10 || 2 == b10) {
            ck.p.i("l1", "<get-TAG>(...)");
            Kb.a((byte) 1, "l1", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                ck.p.i("l1", "<get-TAG>(...)");
                c3053n10.b("l1", "ad load in progress. ignore load");
            }
            b((short) 53);
            return false;
        }
        if (7 == b10) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 15);
            Kb.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.f24720l.f25505a);
            C3053n9 c3053n11 = this.f24717i;
            if (c3053n11 != null) {
                ck.p.i("l1", "<get-TAG>(...)");
                c3053n11.b("l1", "Ad is active. ignore load");
            }
            return false;
        }
        if (b10 == 4) {
            if (!z()) {
                C3053n9 c3053n12 = this.f24717i;
                if (c3053n12 != null) {
                    ck.p.i("l1", "<get-TAG>(...)");
                    c3053n12.c("l1", "signalCanShowForStateReady");
                }
                C3053n9 c3053n13 = this.f24717i;
                if (c3053n13 != null) {
                    ck.p.i("l1", "<get-TAG>(...)");
                    c3053n13.a("l1", "An ad is ready with the ad unit. Signaling ad load success ...");
                }
                AbstractC2871g1 abstractC2871g1M = m();
                if (abstractC2871g1M == null) {
                    Kb.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                    C3053n9 c3053n14 = this.f24717i;
                    if (c3053n14 != null) {
                        ck.p.i("l1", "<get-TAG>(...)");
                        c3053n14.b("l1", "listener is null. load show callback missed");
                    }
                } else {
                    C3053n9 c3053n15 = this.f24717i;
                    if (c3053n15 != null) {
                        ck.p.i("l1", "<get-TAG>(...)");
                        c3053n15.a("l1", "callback - onLoadSuccess");
                    }
                    d(abstractC2871g1M);
                }
                return false;
            }
            C3053n9 c3053n16 = this.f24717i;
            if (c3053n16 != null) {
                ck.p.i("l1", "<get-TAG>(...)");
                c3053n16.b("l1", "ad is expired, clearing");
            }
            d();
        }
        D();
        return true;
    }

    public final void c0() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "<get-TAG>(...)");
            c3053n9.d("l1", "AdUnit " + this + " state - CREATED");
        }
        c((byte) 0);
        e((short) 2153);
    }

    public final void e(short s10) {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "<get-TAG>(...)");
            c3053n9.c("l1", "onShowFailure");
        }
        AbstractC2871g1 abstractC2871g1M = m();
        if (abstractC2871g1M == null) {
            Kb.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                ck.p.i("l1", "<get-TAG>(...)");
                c3053n10.b("l1", "listener is null. show fail callback missed. ");
            }
        } else {
            C3053n9 c3053n11 = this.f24717i;
            if (c3053n11 != null) {
                ck.p.i("l1", "<get-TAG>(...)");
                c3053n11.b("l1", "callback - onAdShowFailed");
            }
            abstractC2871g1M.b();
        }
        if (s10 != 0) {
            C3053n9 c3053n12 = this.f24717i;
            if (c3053n12 != null) {
                ck.p.i("l1", "<get-TAG>(...)");
                c3053n12.b("l1", "show failed - " + ((int) s10));
            }
            d(s10);
        }
    }

    @Override // com.inmobi.media.C2717a2, com.inmobi.media.AbstractC2995l1, com.inmobi.media.AbstractC2836ei
    public final void j(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        AbstractC2871g1 abstractC2871g1M;
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            ck.p.i("l1", "<get-TAG>(...)");
            c3053n9.c("l1", "onRenderViewVisible");
        }
        if (this.f24710b == 4 && (abstractC2871g1M = m()) != null) {
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                ck.p.i("l1", "<get-TAG>(...)");
                c3053n10.a("l1", "callback - onAdDisplayed");
            }
            a(abstractC2871g1M);
        }
        super.j(gestureDetectorOnGestureListenerC2785ci);
    }

    @Override // com.inmobi.media.C2717a2, com.inmobi.media.AbstractC2836ei
    public final void a(boolean z10) {
        Context context = Ji.f22951a;
        if (context == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = Ea.f22576b;
        Ea eaA = Da.a(context, "audio_pref_file");
        ck.p.j("user_mute_count", C3426d4.i.W);
        int i10 = eaA.f22577a.getInt("user_mute_count", 0);
        eaA.a("user_mute_count", z10 ? Math.max(0, i10 - 1) : i10 + 1, false);
    }
}
