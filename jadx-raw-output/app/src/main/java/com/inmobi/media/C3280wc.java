package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.ViewCompat;
import com.inmobi.media.C3280wc;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C3426d4;

/* JADX INFO: renamed from: com.inmobi.media.wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3280wc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC2785ci f25633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3028m9 f25634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2907hc f25635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2727ac f25636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2727ac f25637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2727ac f25638f;

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean b() {
        Context context = Ji.f22951a;
        if (context == null) {
            return false;
        }
        Object systemService = context.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        return audioManager != null && audioManager.isWiredHeadsetOn();
    }

    public final void a(String str, Activity activity) {
        ck.p.j(str, "url");
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        InterfaceC3028m9 interfaceC3028m9 = this.f25634b;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c("MraidMediaProcessor", "doPlayMedia");
        }
        C2907hc c2907hc = new C2907hc(activity, this.f25634b);
        this.f25635c = c2907hc;
        c2907hc.setPlaybackData(str);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        C2907hc c2907hc2 = this.f25635c;
        if (c2907hc2 != null) {
            c2907hc2.setLayoutParams(layoutParams);
        }
        C2932ic c2932ic = new C2932ic(activity);
        c2932ic.setOnTouchListener(new View.OnTouchListener() { // from class: b7.ub
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C3280wc.a(view, motionEvent);
            }
        });
        c2932ic.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        c2932ic.addView(this.f25635c);
        InterfaceC3028m9 interfaceC3028m10 = this.f25634b;
        if (interfaceC3028m10 != null) {
            ((C3053n9) interfaceC3028m10).a("MraidMediaProcessor", "adding media view on top");
        }
        viewGroup.addView(c2932ic, new ViewGroup.LayoutParams(-1, -1));
        C2907hc c2907hc3 = this.f25635c;
        if (c2907hc3 != null) {
            c2907hc3.setViewContainer(c2932ic);
        }
        C2907hc c2907hc4 = this.f25635c;
        if (c2907hc4 != null) {
            c2907hc4.requestFocus();
        }
        C2907hc c2907hc5 = this.f25635c;
        if (c2907hc5 != null) {
            c2907hc5.setOnKeyListener(new View.OnKeyListener() { // from class: b7.vb
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                    return C3280wc.a(this.f5219b, view, i10, keyEvent);
                }
            });
        }
        C2907hc c2907hc6 = this.f25635c;
        if (c2907hc6 != null) {
            c2907hc6.setListener(new C3255vc(this));
        }
        C2907hc c2907hc7 = this.f25635c;
        if (c2907hc7 != null) {
            c2907hc7.a();
        }
    }

    public C3280wc(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, InterfaceC3028m9 interfaceC3028m9) {
        this.f25633a = gestureDetectorOnGestureListenerC2785ci;
        this.f25634b = interfaceC3028m9;
    }

    public final void b(String str, boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25634b;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c("MraidMediaProcessor", "fireHeadphonePluggedEvent");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25633a;
        if (gestureDetectorOnGestureListenerC2785ci != null) {
            gestureDetectorOnGestureListenerC2785ci.a(str, "fireHeadphonePluggedEvent(" + z10 + ");");
        }
    }

    public static final boolean a(C3280wc c3280wc, View view, int i10, KeyEvent keyEvent) {
        if (4 != i10 || keyEvent.getAction() != 0) {
            return false;
        }
        C2907hc c2907hc = c3280wc.f25635c;
        if (c2907hc == null) {
            return true;
        }
        c2907hc.b();
        return true;
    }

    public final int a() {
        AdConfig.RenderingConfig renderingConfig;
        InterfaceC3028m9 interfaceC3028m9 = this.f25634b;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c("MraidMediaProcessor", C3426d4.j.P);
        }
        Context context = Ji.f22951a;
        if (context == null) {
            return -1;
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25633a;
        if (((gestureDetectorOnGestureListenerC2785ci == null || (renderingConfig = gestureDetectorOnGestureListenerC2785ci.getRenderingConfig()) == null) ? false : renderingConfig.getEnablePubMuteControl()) && Ji.f22956f) {
            return 0;
        }
        Object systemService = context.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return -1;
    }

    public final void a(String str, boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25634b;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c("MraidMediaProcessor", "fireDeviceMuteChangeEvent");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25633a;
        if (gestureDetectorOnGestureListenerC2785ci != null) {
            gestureDetectorOnGestureListenerC2785ci.a(str, "fireDeviceMuteChangeEvent(" + z10 + ");");
        }
    }

    public final void a(String str, int i10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25634b;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c("MraidMediaProcessor", "fireDeviceVolumeChangeEvent");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25633a;
        if (gestureDetectorOnGestureListenerC2785ci != null) {
            gestureDetectorOnGestureListenerC2785ci.a(str, "fireDeviceVolumeChangeEvent(" + i10 + ");");
        }
    }
}
