package com.inmobi.media;

import android.view.ViewTreeObserver;
import com.inmobi.ads.InMobiAudio;

/* JADX INFO: loaded from: classes7.dex */
public final class S8 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InMobiAudio f23494a;

    public S8(InMobiAudio inMobiAudio) {
        this.f23494a = inMobiAudio;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            InMobiAudio inMobiAudio = this.f23494a;
            inMobiAudio.f22281f = F3.b(inMobiAudio.getMeasuredWidth() / J5.b());
            InMobiAudio inMobiAudio2 = this.f23494a;
            inMobiAudio2.f22282g = F3.b(inMobiAudio2.getMeasuredHeight() / J5.b());
            if (InMobiAudio.access$hasValidSize(this.f23494a)) {
                this.f23494a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        } catch (Exception e10) {
            Kb.a((byte) 1, "InMobiAudio", "InMobiAudio$1.onGlobalLayout() handler threw unexpected error");
            e10.getMessage();
        }
    }
}
