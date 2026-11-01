package com.inmobi.media;

import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.datasource.cache.SimpleCache;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.ironsource.C3605n2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.v8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3251v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HtmlVideoPlayerRequest f25539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3037mi f25540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3028m9 f25541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nk.l0 f25542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nk.l0 f25543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.g f25544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f25545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WeakReference f25546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HtmlVideoPlayerConfig f25548j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final N7 f25549k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f25550l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Uh f25551m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C2733ai f25552n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f25553o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C3333yf f25554p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicReference f25555q;

    public static /* synthetic */ boolean a(C3251v8 c3251v8, EnumC3176s8[] enumC3176s8Arr, String str, String str2, EnumC3176s8 enumC3176s8, int i10) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            enumC3176s8 = null;
        }
        return c3251v8.a(enumC3176s8Arr, str, str2, enumC3176s8);
    }

    public C3251v8(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, AdConfig.HybridNativeConfig hybridNativeConfig, HtmlVideoPlayerRequest htmlVideoPlayerRequest, C2733ai c2733ai, C3037mi c3037mi, InterfaceC3028m9 interfaceC3028m9) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        ck.p.j(hybridNativeConfig, "hybridNativeConfig");
        ck.p.j(htmlVideoPlayerRequest, "videoRequestConfig");
        this.f25539a = htmlVideoPlayerRequest;
        this.f25540b = c3037mi;
        this.f25541c = interfaceC3028m9;
        C3226u8 c3226u8 = new C3226u8(nk.i0.F8, this);
        nk.l0 l0VarA = kotlinx.coroutines.d.a(nk.w0.b().plus(c3226u8));
        this.f25542d = l0VarA;
        this.f25543e = P4.a(l0VarA, c3226u8);
        this.f25545g = new AtomicBoolean(false);
        this.f25546h = new WeakReference(gestureDetectorOnGestureListenerC2785ci.getContext());
        this.f25548j = htmlVideoPlayerRequest.getConfig();
        Context context = gestureDetectorOnGestureListenerC2785ci.getContext();
        ck.p.i(context, "getContext(...)");
        this.f25549k = new N7(context, hybridNativeConfig, l0VarA, htmlVideoPlayerRequest, interfaceC3028m9);
        this.f25552n = c2733ai;
        this.f25555q = new AtomicReference(EnumC3176s8.INIT);
    }

    public final boolean a(EnumC3176s8[] enumC3176s8Arr, String str, String str2, EnumC3176s8 enumC3176s8) {
        EnumC3176s8 enumC3176s9 = (EnumC3176s8) this.f25555q.get();
        boolean z10 = false;
        if (nj.n.D(enumC3176s8Arr, enumC3176s9)) {
            if (enumC3176s8 != null && !a(enumC3176s8, str, str2)) {
                z10 = true;
            }
            return !z10;
        }
        if (str != null) {
            String str3 = String.format("Invalid state (%s) for %s. Allowed: %s", Arrays.copyOf(new Object[]{enumC3176s9, str2, nj.n.a0(enumC3176s8Arr, null, null, null, 0, null, null, 63, null)}, 3));
            ck.p.i(str3, "format(...)");
            a(str, str3, str2);
        }
        return false;
    }

    public final void b(boolean z10) throws JSONException {
        if (this.f25545g.get()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", z10 ? C3605n2.f30216v : "hide");
        EnumC3176s8[] enumC3176s8Arr = {EnumC3176s8.LOADED, EnumC3176s8.PLAYING, EnumC3176s8.PAUSED, EnumC3176s8.COMPLETED, EnumC3176s8.ERROR};
        EnumC2723a8[] enumC2723a8Arr = EnumC2723a8.f23967a;
        if (a(this, enumC3176s8Arr, "executeVideoPlayerActions", jSONObject.toString(), null, 8)) {
            N7 n10 = this.f25549k;
            if (n10.f23203h.get()) {
                return;
            }
            if (z10) {
                n10.e();
            } else {
                n10.f();
            }
            if (ck.p.e(Looper.myLooper(), Looper.getMainLooper())) {
                n10.f23209n.setVisibility(z10 ? 0 : 8);
            } else {
                nk.j.d(n10.f23198c, null, null, new C3325y7(null, n10, z10), 3, null);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:75:0x00b7  */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r7 == com.inmobi.media.EnumC3176s8.f25309i) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r7 != com.inmobi.media.EnumC3176s8.f25308h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003a, code lost:
    
        if (r7 != com.inmobi.media.EnumC3176s8.f25308h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        if (r7 != com.inmobi.media.EnumC3176s8.f25309i) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0052, code lost:
    
        if (r7 == com.inmobi.media.EnumC3176s8.f25309i) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0063, code lost:
    
        if (r7 != com.inmobi.media.EnumC3176s8.f25308h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0074, code lost:
    
        if (r7 != com.inmobi.media.EnumC3176s8.f25309i) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x007d, code lost:
    
        if (r7 != com.inmobi.media.EnumC3176s8.f25309i) goto L61;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x00b7, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.inmobi.media.EnumC3176s8 r7, java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3251v8.a(com.inmobi.media.s8, java.lang.String, java.lang.String):boolean");
    }

    public final void a(String str, String str2, String str3) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25541c;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).b("HybridVideoPlayerHandler", "Manager error (" + str + "): " + str2);
        }
        if (this.f25545g.get()) {
            return;
        }
        EnumC2723a8[] enumC2723a8Arr = EnumC2723a8.f23967a;
        if (ck.p.e(str, "unknown")) {
            return;
        }
        X7 x10 = new X7(str3);
        C2733ai c2733ai = this.f25552n;
        if (c2733ai != null) {
            EnumC3102p8 enumC3102p8 = EnumC3102p8.VIDEO_COMMAND_ERROR;
            ck.p.j(x10, IconCompat.EXTRA_OBJ);
            JSONObject jSONObjectA = AbstractC3029ma.a(x10, X7.class);
            ck.p.j(enumC3102p8, "htmlVideoTemplateEvents");
            c2733ai.f24006a.a(enumC3102p8, jSONObjectA);
        }
    }

    public final void a(boolean z10) throws JSONException {
        if (this.f25545g.get()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", z10 ? CampaignEx.JSON_NATIVE_VIDEO_MUTE : CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
        EnumC3176s8[] enumC3176s8Arr = {EnumC3176s8.LOADED, EnumC3176s8.PLAYING, EnumC3176s8.PAUSED};
        EnumC2723a8[] enumC2723a8Arr = EnumC2723a8.f23967a;
        if (a(this, enumC3176s8Arr, "executeVideoPlayerActions", jSONObject.toString(), null, 8)) {
            N7 n10 = this.f25549k;
            if (n10.f23203h.get()) {
                return;
            }
            if (z10) {
                S7 s10 = n10.f23220y;
                s10.a();
                s10.f23492d.a();
            } else {
                S7 s11 = n10.f23220y;
                P4.a(s11.f23489a, new R7(s11, null));
            }
        }
    }

    public final void a() throws JSONException {
        ViewGroup viewGroup;
        SimpleCache simpleCache;
        if (this.f25545g.getAndSet(true)) {
            return;
        }
        EnumC3176s8 enumC3176s8 = EnumC3176s8.DESTROYED;
        EnumC2723a8[] enumC2723a8Arr = EnumC2723a8.f23967a;
        a(enumC3176s8, "executeVideoPlayerActions", (String) null);
        InterfaceC3028m9 interfaceC3028m9 = this.f25541c;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("HybridVideoPlayerHandler", "destroy video player");
        }
        N7 n10 = this.f25549k;
        if (!n10.f23203h.getAndSet(true)) {
            InterfaceC3028m9 interfaceC3028m10 = n10.f23197b;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).a("HtmlMediaPlayer", "destroy called");
            }
            kotlinx.coroutines.g gVar = n10.f23217v;
            if (gVar != null) {
                kotlinx.coroutines.g.a.a(gVar, null, 1, null);
            }
            n10.f23217v = null;
            n10.f23207l.set(EnumC3184sg.STATE_DESTROYED);
            n10.f23202g.set(false);
            P4.a(n10.f23206k);
            n10.f23219x.a();
            if (n10.f23201f.get()) {
                n10.f23201f.set(false);
                if (!ck.p.e(Looper.myLooper(), Looper.getMainLooper())) {
                    nk.j.d(n10.f23198c, null, null, new I7(null, n10), 3, null);
                } else {
                    n10.f23211p.removeListener(n10.B);
                }
            }
            if (!ck.p.e(Looper.myLooper(), Looper.getMainLooper())) {
                nk.j.d(n10.f23198c, null, null, new H7(null, n10), 3, null);
            } else {
                n10.f23211p.stop();
                n10.f23211p.clearMediaItems();
                n10.f23211p.release();
                n10.f23221z.a();
                n10.f23220y.f23492d.c();
            }
            K2 k10 = n10.f23218w;
            while (true) {
                int i10 = k10.f22984f.get();
                if (i10 <= 0) {
                    break;
                }
                int i11 = i10 - 1;
                if (k10.f22984f.compareAndSet(i10, i11)) {
                    if (i11 == 0) {
                        synchronized (k10.f22979a) {
                            if (k10.f22984f.get() == 0) {
                                simpleCache = k10.f22985g;
                                k10.f22985g = null;
                            } else {
                                simpleCache = null;
                            }
                            mj.r rVar = mj.r.f64562a;
                        }
                    } else {
                        simpleCache = null;
                    }
                    if (simpleCache == null) {
                        break;
                    }
                    simpleCache.release();
                    break;
                }
            }
            n10.f23209n.setOnPositionChangeListener(null);
            n10.f23209n.removeAllViews();
            WeakReference weakReference = n10.f23213r;
            if (weakReference != null && (viewGroup = (ViewGroup) weakReference.get()) != null) {
                viewGroup.removeView(n10.f23209n);
            }
            WeakReference weakReference2 = n10.f23213r;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            kotlinx.coroutines.d.d(n10.f23198c, null, 1, null);
            kotlinx.coroutines.d.d(n10.f23199d, null, 1, null);
        }
        N7 n11 = this.f25549k;
        n11.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("totalDuration", n11.f23211p.getDuration());
        jSONObject.put("playbackTime", n11.f23211p.getCurrentPosition());
        jSONObject.put("bufferTime", n11.f23211p.getBufferedPosition());
        String string = jSONObject.toString();
        ck.p.i(string, "toString(...)");
        C3037mi c3037mi = this.f25540b;
        if (c3037mi != null) {
            ck.p.j(string, "durationPayload");
            Map mapA = c3037mi.a();
            mapA.put("payload", string);
            Wj wj2 = Wj.f23753a;
            Wj.b("VideoDestroyed", mapA, EnumC2735ak.SDK);
        }
        C2733ai c2733ai = this.f25552n;
        if (c2733ai != null) {
            EnumC3102p8 enumC3102p8 = EnumC3102p8.VIDEO_PLAYER_DESTROYED;
            ck.p.j(enumC3102p8, "htmlVideoTemplateEvents");
            c2733ai.f24006a.a(enumC3102p8, (Object) null);
        }
        kotlinx.coroutines.g gVar2 = this.f25544f;
        if (gVar2 != null) {
            kotlinx.coroutines.g.a.a(gVar2, null, 1, null);
        }
        this.f25544f = null;
        this.f25551m = null;
        this.f25552n = null;
    }

    public final void a(Rl rl2) throws JSONException {
        C3037mi c3037mi;
        C2733ai c2733ai;
        C2733ai c2733ai2;
        Uh uh2;
        C2733ai c2733ai3;
        C3333yf c3333yf;
        InterfaceC3028m9 interfaceC3028m9 = this.f25541c;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).b("HybridVideoPlayerHandler", "handleMediaEvent: " + rl2);
        }
        boolean z10 = rl2 instanceof C3315xm;
        if (z10) {
            C2733ai c2733ai4 = this.f25552n;
            if (c2733ai4 != null) {
                EnumC3102p8 enumC3102p8 = EnumC3102p8.VIDEO_QUARTILES_EVENT;
                Z7[] z7Arr = Z7.f23895a;
                ck.p.j(enumC3102p8, "htmlVideoTemplateEvents");
                c2733ai4.f24006a.a(enumC3102p8, "q1");
            }
        } else if (rl2 instanceof C2942in) {
            C2733ai c2733ai5 = this.f25552n;
            if (c2733ai5 != null) {
                EnumC3102p8 enumC3102p9 = EnumC3102p8.VIDEO_QUARTILES_EVENT;
                Z7[] z7Arr2 = Z7.f23895a;
                ck.p.j(enumC3102p9, "htmlVideoTemplateEvents");
                c2733ai5.f24006a.a(enumC3102p9, "q2");
            }
        } else if (rl2 instanceof C3166rn) {
            C2733ai c2733ai6 = this.f25552n;
            if (c2733ai6 != null) {
                EnumC3102p8 enumC3102p10 = EnumC3102p8.VIDEO_QUARTILES_EVENT;
                Z7[] z7Arr3 = Z7.f23895a;
                ck.p.j(enumC3102p10, "htmlVideoTemplateEvents");
                c2733ai6.f24006a.a(enumC3102p10, "q3");
            }
        } else if (rl2 instanceof C3340ym) {
            C2733ai c2733ai7 = this.f25552n;
            if (c2733ai7 != null) {
                EnumC3102p8 enumC3102p11 = EnumC3102p8.VIDEO_QUARTILES_EVENT;
                Z7[] z7Arr4 = Z7.f23895a;
                ck.p.j(enumC3102p11, "htmlVideoTemplateEvents");
                c2733ai7.f24006a.a(enumC3102p11, "q4");
            }
        } else if (rl2 instanceof Pl) {
            if (a(EnumC3176s8.COMPLETED, (String) null, (String) null) && (c2733ai3 = this.f25552n) != null) {
                EnumC3102p8 enumC3102p12 = EnumC3102p8.VIDEO_COMPLETE;
                ck.p.j(enumC3102p12, "htmlVideoTemplateEvents");
                c2733ai3.f24006a.a(enumC3102p12, (Object) null);
            }
        } else if (rl2 instanceof C2878g8) {
            if (a(this, new EnumC3176s8[]{EnumC3176s8.LOADING}, null, null, EnumC3176s8.LOADED, 6)) {
                Uh uh3 = this.f25551m;
                if (uh3 != null) {
                    HtmlVideoPlaybackState htmlVideoPlaybackState = ((C2878g8) rl2).f24414a;
                    ck.p.j(htmlVideoPlaybackState, "videoInfo");
                    InterfaceC3028m9 interfaceC3028m10 = uh3.f23650a.f24162i;
                    if (interfaceC3028m10 != null) {
                        ((C3053n9) interfaceC3028m10).b("HtmlVideoPlayer", "onVideoLoadSuccess");
                    }
                    GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = uh3.f23650a;
                    EnumC3102p8 enumC3102p13 = EnumC3102p8.VIDEO_READY;
                    ck.p.j(htmlVideoPlaybackState, IconCompat.EXTRA_OBJ);
                    gestureDetectorOnGestureListenerC2785ci.a(enumC3102p13, AbstractC3029ma.a(htmlVideoPlaybackState, HtmlVideoPlaybackState.class));
                }
                if (this.f25553o) {
                    this.f25549k.e();
                }
            }
        } else if (rl2 instanceof C2749b8) {
            if (a(this, new EnumC3176s8[]{EnumC3176s8.LOADING}, null, null, EnumC3176s8.LOAD_FAILED, 6) && (uh2 = this.f25551m) != null) {
                uh2.a((C2749b8) rl2);
            }
        } else if (rl2 instanceof C2928i8) {
            a(EnumC3176s8.ERROR, (String) null, (String) null);
            C2733ai c2733ai8 = this.f25552n;
            if (c2733ai8 != null) {
                EnumC3102p8 enumC3102p14 = EnumC3102p8.VIDEO_PLAYBACK_ERROR;
                ck.p.j(rl2, IconCompat.EXTRA_OBJ);
                JSONObject jSONObjectA = AbstractC3029ma.a(rl2, rl2.getClass());
                ck.p.j(enumC3102p14, "htmlVideoTemplateEvents");
                c2733ai8.f24006a.a(enumC3102p14, jSONObjectA);
            }
        } else if (rl2 instanceof Om) {
            EnumC3176s8[] enumC3176s8Arr = {EnumC3176s8.PLAYING};
            EnumC3176s8 enumC3176s8 = EnumC3176s8.PAUSED;
            a(this, enumC3176s8Arr, null, null, enumC3176s8, 6);
            if (this.f25555q.get() == enumC3176s8 && (c2733ai2 = this.f25552n) != null) {
                EnumC3102p8 enumC3102p15 = EnumC3102p8.VIDEO_PLAYBACK_STATE;
                HtmlVideoPlaybackState htmlVideoPlaybackStateA = this.f25549k.a();
                ck.p.j(htmlVideoPlaybackStateA, IconCompat.EXTRA_OBJ);
                JSONObject jSONObjectA2 = AbstractC3029ma.a(htmlVideoPlaybackStateA, HtmlVideoPlaybackState.class);
                ck.p.j(enumC3102p15, "htmlVideoTemplateEvents");
                c2733ai2.f24006a.a(enumC3102p15, jSONObjectA2);
            }
        } else if (rl2 instanceof C2918hn) {
            EnumC3176s8[] enumC3176s8Arr2 = {EnumC3176s8.LOADED, EnumC3176s8.PAUSED, EnumC3176s8.COMPLETED};
            EnumC3176s8 enumC3176s9 = EnumC3176s8.PLAYING;
            a(this, enumC3176s8Arr2, null, null, enumC3176s9, 6);
            if (this.f25555q.get() == enumC3176s9 && (c2733ai = this.f25552n) != null) {
                EnumC3102p8 enumC3102p16 = EnumC3102p8.VIDEO_PLAYBACK_STATE;
                HtmlVideoPlaybackState htmlVideoPlaybackStateA2 = this.f25549k.a();
                ck.p.j(htmlVideoPlaybackStateA2, IconCompat.EXTRA_OBJ);
                JSONObject jSONObjectA3 = AbstractC3029ma.a(htmlVideoPlaybackStateA2, HtmlVideoPlaybackState.class);
                ck.p.j(enumC3102p16, "htmlVideoTemplateEvents");
                c2733ai.f24006a.a(enumC3102p16, jSONObjectA3);
            }
        } else if (rl2 instanceof C2992kn) {
            C2733ai c2733ai9 = this.f25552n;
            if (c2733ai9 != null) {
                EnumC3102p8 enumC3102p17 = EnumC3102p8.VIDEO_QUARTILES_EVENT;
                Z7[] z7Arr5 = Z7.f23895a;
                ck.p.j(enumC3102p17, "htmlVideoTemplateEvents");
                c2733ai9.f24006a.a(enumC3102p17, "q0");
            }
        } else if (rl2 instanceof C3002l8) {
            C3002l8 c3002l8 = (C3002l8) rl2;
            float f10 = c3002l8.f24753a / 1000.0f;
            float f11 = c3002l8.f24754b / 1000.0f;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time", Float.valueOf(f10));
            jSONObject.put("duration", Float.valueOf(f11));
            C2733ai c2733ai10 = this.f25552n;
            if (c2733ai10 != null) {
                EnumC3102p8 enumC3102p18 = EnumC3102p8.VIDEO_PLAYBACK_UPDATE;
                ck.p.j(enumC3102p18, "htmlVideoTemplateEvents");
                c2733ai10.f24006a.a(enumC3102p18, jSONObject);
            }
        } else if (rl2 instanceof C2977k8) {
            C2733ai c2733ai11 = this.f25552n;
            if (c2733ai11 != null) {
                EnumC3102p8 enumC3102p19 = EnumC3102p8.VIDEO_PLAYER_POSITION;
                VideoViewPosition videoViewPosition = ((C2977k8) rl2).f24660a;
                ck.p.j(videoViewPosition, IconCompat.EXTRA_OBJ);
                JSONObject jSONObjectA4 = AbstractC3029ma.a(videoViewPosition, VideoViewPosition.class);
                ck.p.j(enumC3102p19, "htmlVideoTemplateEvents");
                c2733ai11.f24006a.a(enumC3102p19, jSONObjectA4);
            }
        } else if (rl2 instanceof W7) {
            C2733ai c2733ai12 = this.f25552n;
            if (c2733ai12 != null) {
                EnumC3102p8 enumC3102p20 = EnumC3102p8.VIDEO_CAN_PLAY_THROUGH;
                ck.p.j(enumC3102p20, "htmlVideoTemplateEvents");
                c2733ai12.f24006a.a(enumC3102p20, (Object) null);
            }
        } else if (rl2 instanceof C2903h8) {
            C2733ai c2733ai13 = this.f25552n;
            if (c2733ai13 != null) {
                EnumC3102p8 enumC3102p21 = EnumC3102p8.VIDEO_LOADED_METADATA;
                ck.p.j(enumC3102p21, "htmlVideoTemplateEvents");
                c2733ai13.f24006a.a(enumC3102p21, (Object) null);
            }
        } else if (rl2 instanceof S1) {
            C2733ai c2733ai14 = this.f25552n;
            if (c2733ai14 != null) {
                EnumC3102p8 enumC3102p22 = EnumC3102p8.VIDEO_PLAYBACK_STATE;
                HtmlVideoPlaybackState htmlVideoPlaybackStateA3 = this.f25549k.a();
                ck.p.j(htmlVideoPlaybackStateA3, IconCompat.EXTRA_OBJ);
                JSONObject jSONObjectA5 = AbstractC3029ma.a(htmlVideoPlaybackStateA3, HtmlVideoPlaybackState.class);
                ck.p.j(enumC3102p22, "htmlVideoTemplateEvents");
                c2733ai14.f24006a.a(enumC3102p22, jSONObjectA5);
            }
        } else if ((rl2 instanceof C3127q8) && (c3037mi = this.f25540b) != null) {
            Map mapA = c3037mi.a();
            Wj wj2 = Wj.f23753a;
            Wj.b("ViewStateOnParentAttached", mapA, EnumC2735ak.SDK);
        }
        if ((z10 || (rl2 instanceof C2942in) || (rl2 instanceof C3166rn) || (rl2 instanceof Pl) || (rl2 instanceof C2992kn) || (rl2 instanceof Om) || (rl2 instanceof C2918hn) || (rl2 instanceof C2928i8) || (rl2 instanceof S1)) && (c3333yf = this.f25554p) != null) {
            ck.p.j(rl2, "videoEvent");
            Ae ae2 = c3333yf.f25795e;
            if (ae2 != null) {
                ae2.a(rl2);
            }
        }
    }
}
