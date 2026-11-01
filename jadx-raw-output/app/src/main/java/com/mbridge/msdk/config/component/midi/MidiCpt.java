package com.mbridge.msdk.config.component.midi;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.ironsource.C3426d4;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.component.midi.monitor.c;
import com.mbridge.msdk.config.dynamic.baseview.cusview.CusPlayerView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class MidiCpt extends com.mbridge.msdk.config.component.base.a implements com.mbridge.msdk.config.component.vc.inter.a, d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.midi.model.a f33432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CusPlayerView f33433i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.video.a f33434j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.config.component.midi.monitor.a f33435k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.mbridge.msdk.config.component.midi.monitor.b f33436l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f33437m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f33438n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f33439o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f33440p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f33441q;

    public class a implements com.mbridge.msdk.config.component.midi.monitor.a {
        @Override // com.mbridge.msdk.config.component.midi.monitor.a
        public void a(String str) {
            MidiCpt.this.c(str);
        }

        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(String str) {
            MidiCpt.this.f33441q = str;
            MidiCpt.this.j();
            MidiCpt.this.g();
        }

        @Override // com.mbridge.msdk.config.component.midi.monitor.a
        public void b(final String str) {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.midi.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33444b.c(str);
                }
            });
        }
    }

    public class b implements com.mbridge.msdk.config.dynamic.baseview.video.a {
        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void a(long j10) {
            if (MidiCpt.this.f33437m != null) {
                MidiCpt.this.f33437m.e();
            }
            MidiCpt midiCpt = MidiCpt.this;
            midiCpt.b("904002", (Map<String, Object>) midiCpt.i());
        }

        public b() {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onBufferingEnd() {
            q0.b("BufferState", "缓冲结束");
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onBufferingStart() {
            q0.b("BufferState", "开始缓冲");
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onBufferingTimeOut(String str) {
            q0.b("BufferState", "缓冲超时");
            MidiCpt.this.a("904010", str);
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onPlayCompleted() {
            MidiCpt midiCpt = MidiCpt.this;
            midiCpt.b("904007", (Map<String, Object>) midiCpt.i());
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onPlayError(String str) {
            MidiCpt.this.a("904008", str);
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void a(long j10, long j11) {
            MidiCpt.this.f33439o = Math.toIntExact(j10);
            MidiCpt.this.f33440p = Math.toIntExact(j11);
            MidiCpt midiCpt = MidiCpt.this;
            midiCpt.f33438n = midiCpt.a(midiCpt.f33439o, MidiCpt.this.f33440p);
            HashMap map = new HashMap();
            map.put("percent", Integer.valueOf(MidiCpt.this.f33438n));
            map.put("progress", Long.valueOf(j10));
            map.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, MidiCpt.this.f33433i.isSilent() ? "1" : "0");
            MidiCpt.this.b("904005", map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i10, int i11) {
        return (int) ((i10 / i11) * 100.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        CusPlayerView cusPlayerView = this.f33433i;
        if (cusPlayerView == null || this.f33432h == null) {
            q0.b("PlayerComponent", "check mute params is null");
            return;
        }
        if ((cusPlayerView.isSilent() ? "1" : "0").equals(this.f33432h.f())) {
            return;
        }
        if ("0".equals(this.f33432h.f())) {
            this.f33433i.openSound();
        } else {
            this.f33433i.closeSound();
        }
        b("904006", i());
    }

    private void h() {
        CusPlayerView cusPlayerView = this.f33433i;
        if (cusPlayerView != null) {
            cusPlayerView.stop();
        }
        b("904009", i());
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> i() {
        HashMap map = new HashMap();
        CusPlayerView cusPlayerView = this.f33433i;
        if (cusPlayerView == null) {
            q0.b("PlayerComponent", "mbPlayerView is null in createProgressEventData");
            return map;
        }
        int iCeil = this.f33439o;
        if (iCeil == 0) {
            iCeil = (int) Math.ceil(((double) cusPlayerView.getCurPosition()) / 1000.0d);
        }
        int duration = this.f33440p;
        if (duration == 0) {
            duration = this.f33433i.getDuration();
        }
        int iA = this.f33438n;
        if (iA == 0) {
            iA = a(iCeil, duration);
        }
        map.put("percent", Integer.valueOf(iA));
        map.put("progress", Integer.valueOf(iCeil));
        map.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, this.f33433i.isSilent() ? "1" : "0");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        com.mbridge.msdk.config.component.midi.model.a aVar = this.f33432h;
        if (aVar == null) {
            c("PlayerModel is null");
            return;
        }
        if (this.f33433i == null) {
            this.f33433i = aVar.d();
        }
        if (this.f33433i == null) {
            c("PlayerWidget is null");
            return;
        }
        String strB = this.f33432h.b();
        if (TextUtils.isEmpty(strB)) {
            c("Command is empty");
            return;
        }
        byte b10 = -1;
        try {
            int iHashCode = strB.hashCode();
            if (iHashCode != -934426579) {
                if (iHashCode != 3443508) {
                    if (iHashCode != 94756344) {
                        if (iHashCode == 106440182 && strB.equals(CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
                            b10 = 2;
                        }
                    } else if (strB.equals("close")) {
                        b10 = 1;
                    }
                } else if (strB.equals("play")) {
                    b10 = 0;
                }
            } else if (strB.equals(CampaignEx.JSON_NATIVE_VIDEO_RESUME)) {
                b10 = 3;
            }
            if (b10 == 0) {
                n();
                return;
            }
            if (b10 == 1) {
                h();
                return;
            }
            if (b10 == 2) {
                c cVar = this.f33437m;
                if (cVar != null) {
                    cVar.g();
                }
                m();
                return;
            }
            if (b10 == 3) {
                p();
                return;
            }
            q0.b("PlayerComponent", "Unknown command: " + strB);
        } catch (Exception e10) {
            q0.b("PlayerComponent", "Error executing player action: " + strB, e10);
            c("Error executing player action: " + e10.getMessage());
        }
    }

    private void k() {
        com.mbridge.msdk.config.component.midi.model.a aVar;
        com.mbridge.msdk.config.component.midi.model.a aVar2;
        if (this.f33436l == null && (aVar2 = this.f33432h) != null && aVar2.c() == 1) {
            this.f33436l = new com.mbridge.msdk.config.component.midi.monitor.b();
        }
        if (this.f33437m != null || (aVar = this.f33432h) == null) {
            return;
        }
        this.f33437m = new c(aVar.g(), this.f33432h.i());
    }

    private void l() {
        if (this.f33435k == null) {
            this.f33435k = new a();
        }
        if (this.f33434j == null) {
            this.f33434j = new b();
        }
    }

    private void m() {
        CusPlayerView cusPlayerView = this.f33433i;
        if (cusPlayerView != null) {
            cusPlayerView.pause();
        }
        b("904003", i());
    }

    private void n() {
        if (this.f33432h == null || this.f33433i == null) {
            c("play params is null");
            return;
        }
        if (TextUtils.isEmpty(this.f33441q)) {
            c("Video URL is empty");
            return;
        }
        if (!TextUtils.isEmpty(this.f33432h.e())) {
            try {
                this.f33433i.setMixWithOtherAudio(Integer.valueOf(this.f33432h.e()).intValue());
            } catch (NumberFormatException e10) {
                q0.b("PlayerComponent", "Invalid mixWithOtherAudio value: " + this.f33432h.e(), e10);
            }
        }
        if (this.f33433i.getCurPosition() > 1) {
            p();
            return;
        }
        int iA = this.f33432h.a();
        if (iA >= 0) {
            this.f33433i.initBufferIngParam(iA);
        }
        CusPlayerView cusPlayerView = this.f33433i;
        String str = this.f33441q;
        cusPlayerView.initVFPData(str, str, this.f33434j);
        this.f33433i.playVideo();
        b("904004", i());
    }

    private void p() {
        CusPlayerView cusPlayerView = this.f33433i;
        if (cusPlayerView != null) {
            cusPlayerView.resumeStart();
        }
        b("904004", i());
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        try {
            q0.b("PlayerComponent", "execute " + this);
            l();
            c cVar = this.f33437m;
            if (cVar != null) {
                cVar.a(this.f33435k);
                this.f33437m.f();
            } else {
                c("timeOutPlayerMonitor 为 null，无法启动监控");
            }
        } catch (Exception e10) {
            q0.b("PlayerComponent", "Error in execute", e10);
            c("Error in execute: " + e10.getMessage());
        }
    }

    public void o() {
        try {
            CusPlayerView cusPlayerView = this.f33433i;
            if (cusPlayerView != null) {
                cusPlayerView.stop();
                this.f33433i.release();
                this.f33433i = null;
            }
            c cVar = this.f33437m;
            if (cVar != null) {
                cVar.b();
                this.f33437m = null;
            }
            if (this.f33436l != null) {
                this.f33436l = null;
            }
            if (this.f33432h != null) {
                this.f33432h = null;
            }
            this.f33434j = null;
            this.f33435k = null;
        } catch (Exception e10) {
            q0.b("PlayerComponent", "Error in release", e10);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void c(Map<String, Object> map) {
        com.mbridge.msdk.config.component.midi.model.a aVar = this.f33432h;
        if (aVar == null) {
            q0.b("PlayerComponent", "playerModel is null, cannot parse event config");
        } else {
            aVar.b(map);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f32957f = "904001";
        this.f33432h = new com.mbridge.msdk.config.component.midi.model.a(map);
        try {
            ViewGroup viewGroupE = e();
            if (viewGroupE != null) {
                if (!TextUtils.isEmpty(this.f33432h.h())) {
                    this.f33433i = (CusPlayerView) e().findViewWithTag(this.f33432h.h());
                } else {
                    this.f33433i = (CusPlayerView) com.mbridge.msdk.config.dynamic.utils.d.a(viewGroupE, CusPlayerView.class);
                }
            }
            CusPlayerView cusPlayerView = this.f33433i;
            if (cusPlayerView != null) {
                this.f33432h.a(cusPlayerView);
            } else {
                q0.b("PlayerComponent", "Failed to get CusPlayerView from root view");
            }
        } catch (Exception e10) {
            q0.b("PlayerComponent", "Error getting CusPlayerView", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        b("904005", map);
        o();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void a() {
        super.a();
        k();
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        if (map != null && !map.isEmpty() && (map.get("componentConfig") instanceof Map)) {
            Object obj = map.get("url");
            if (obj instanceof String) {
                String strValueOf = String.valueOf(obj);
                if (!TextUtils.isEmpty(strValueOf)) {
                    return strValueOf.equals(this.f33432h.i());
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, Map<String, Object> map) {
        a(a(str, map));
        com.mbridge.msdk.config.component.midi.monitor.b bVar = this.f33436l;
        if (bVar != null) {
            bVar.a(str, this.f32955d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        Map<String, Object> mapI = i();
        mapI.put("reason", str2);
        mapI.put("code", "4001");
        b(str, mapI);
        o();
    }

    @Override // com.mbridge.msdk.config.component.vc.inter.a
    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            q0.b("PlayerComponent", "eventName is null");
            return;
        }
        str.hashCode();
        if (str.equals("onStop")) {
            m();
        } else if (str.equals(C3426d4.i.f28569u0)) {
            p();
        }
    }
}
