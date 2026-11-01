package com.bytedance.sdk.openadsdk.core.ryl;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class ra {
    private final AdSession fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final AdEvents f13025le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f13026lh;
    public VastProperties yu;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private boolean f13027ra = false;
    public boolean ouw = false;
    public int vt = 0;

    public final void lh() {
        ouw(4);
    }

    public void ouw(float f10, boolean z10) {
    }

    public final void ouw(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.fkw;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    public void ouw(boolean z10) {
    }

    public void ouw(boolean z10, float f10) {
    }

    public final void vt() {
        ouw(1);
    }

    public void vt(int i10) {
    }

    public final void yu() {
        ouw(3);
    }

    public ra(AdSession adSession, AdEvents adEvents, View view) {
        this.fkw = adSession;
        this.f13025le = adEvents;
        this.f13026lh = adSession.getAdSessionId();
        if (view != null && adSession != null) {
            adSession.registerAdView(view);
        }
    }

    public final boolean ouw() {
        return this.ouw;
    }

    public final void ouw(int i10) {
        int i11;
        int i12;
        if (this.fkw == null || this.f13025le == null) {
            return;
        }
        boolean z10 = false;
        if (fkw.lh()) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4 && (i12 = this.vt) != 0 && i12 != 4) {
                            this.fkw.finish();
                            this.ouw = false;
                            z10 = true;
                        }
                    } else if (!this.f13027ra && ((i11 = this.vt) == 1 || i11 == 2)) {
                        this.f13025le.impressionOccurred();
                        this.f13027ra = true;
                        z10 = true;
                    }
                } else if (this.vt == 0) {
                    this.fkw.start();
                    if (this.yu == null) {
                        this.yu = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                    }
                    this.f13025le.loaded(this.yu);
                    this.ouw = true;
                    this.yu = null;
                    z10 = true;
                }
            } else if (this.vt == 0) {
                this.fkw.start();
                this.f13025le.loaded();
                this.ouw = true;
                z10 = true;
            }
        }
        if (z10) {
            this.vt = i10;
        }
    }

    public final void ouw(Set<Pair<View, FriendlyObstructionPurpose>> set) {
        for (Pair<View, FriendlyObstructionPurpose> pair : set) {
            ouw((View) pair.first, (FriendlyObstructionPurpose) pair.second);
        }
    }
}
