package com.inmobi.media;

import android.view.OrientationEventListener;
import androidx.appcompat.widget.ActivityChooserModel;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.ironsource.C3426d4;
import java.util.HashSet;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: loaded from: classes6.dex */
public final class O8 extends OrientationEventListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f23276d = {ck.s.f(new MutablePropertyReference1Impl(O8.class, "currentOrientation", "getCurrentOrientation()Lcom/inmobi/ads/rendering/orientation/Orientation;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiAdActivity f23277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f23278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N8 f23279c;

    public final void a(Ff ff2) {
        ck.p.j(ff2, "orientationProperties");
        try {
            if (ff2.f22644a) {
                this.f23277a.setRequestedOrientation(13);
                return;
            }
            String str = ff2.f22645b;
            if (ck.p.e(str, C3426d4.i.C)) {
                this.f23277a.setRequestedOrientation(6);
            } else if (ck.p.e(str, C3426d4.i.D)) {
                this.f23277a.setRequestedOrientation(7);
            } else {
                this.f23277a.setRequestedOrientation(13);
            }
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O8(InMobiAdActivity inMobiAdActivity) {
        super(inMobiAdActivity);
        ck.p.j(inMobiAdActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f23277a = inMobiAdActivity;
        this.f23278b = new HashSet();
        fk.a aVar = fk.a.f52963a;
        this.f23279c = new N8(Ef.a(J5.g()), this);
    }

    public final void b() {
        int i10 = this.f23277a.getResources().getConfiguration().orientation;
        byte bG = J5.g();
        int i11 = 2;
        if (bG == 1 || bG == 2 || (bG != 3 && bG != 4)) {
            i11 = 1;
        }
        if (i10 == i11) {
            this.f23279c.setValue(this, f23276d[0], Ef.a(J5.g()));
        }
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        b();
    }

    public final void a() {
        if (this.f23278b.isEmpty()) {
            disable();
        } else {
            enable();
        }
    }
}
