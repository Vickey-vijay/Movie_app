package com.inmobi.media;

import androidx.core.graphics.drawable.IconCompat;
import com.inmobi.media.videoPlayer.model.HtmlVideoFile;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.pa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3104pa extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3253va f25061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HtmlVideoPlayerRequest f25062b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3104pa(C3253va c3253va, HtmlVideoPlayerRequest htmlVideoPlayerRequest, rj.c cVar) {
        super(2, cVar);
        this.f25061a = c3253va;
        this.f25062b = htmlVideoPlayerRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3104pa(this.f25061a, this.f25062b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3104pa(this.f25061a, this.f25062b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0179  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC3028m9 interfaceC3028m9;
        sj.a.f();
        kotlin.c.b(obj);
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25061a.f25558a;
        HtmlVideoPlayerRequest htmlVideoPlayerRequest = this.f25062b;
        gestureDetectorOnGestureListenerC2785ci.getClass();
        ck.p.j(htmlVideoPlayerRequest, "requestConfig");
        InterfaceC3028m9 interfaceC3028m10 = gestureDetectorOnGestureListenerC2785ci.f24162i;
        if (interfaceC3028m10 != null) {
            ((C3053n9) interfaceC3028m10).b("HtmlVideoPlayer", "loadVideoPlayer");
        }
        if (gestureDetectorOnGestureListenerC2785ci.getAdConfig().getHybridNative().isEnabled()) {
            String maxSupportedPlayerVersion = gestureDetectorOnGestureListenerC2785ci.getAdConfig().getHybridNative().getMaxSupportedPlayerVersion();
            C3037mi c3037mi = gestureDetectorOnGestureListenerC2785ci.f24152d0;
            try {
                Sm.a(maxSupportedPlayerVersion);
                gestureDetectorOnGestureListenerC2785ci.Z0 = true;
                gestureDetectorOnGestureListenerC2785ci.Y0 = new C3251v8(gestureDetectorOnGestureListenerC2785ci, gestureDetectorOnGestureListenerC2785ci.getAdConfig().getHybridNative(), htmlVideoPlayerRequest, gestureDetectorOnGestureListenerC2785ci.f24144a1, gestureDetectorOnGestureListenerC2785ci.f24152d0, gestureDetectorOnGestureListenerC2785ci.f24162i);
                EnumC3102p8 enumC3102p8 = EnumC3102p8.VIDEO_PLAYER_CREATED;
                ck.p.j(htmlVideoPlayerRequest, IconCompat.EXTRA_OBJ);
                gestureDetectorOnGestureListenerC2785ci.a(enumC3102p8, AbstractC3029ma.a(htmlVideoPlayerRequest, HtmlVideoPlayerRequest.class));
                C3251v8 c3251v8 = gestureDetectorOnGestureListenerC2785ci.Y0;
                if (c3251v8 != null) {
                    Uh uh2 = new Uh(gestureDetectorOnGestureListenerC2785ci);
                    ck.p.j(uh2, "videoLoadListener");
                    if (!c3251v8.f25545g.get()) {
                        HtmlVideoPlayerRequest htmlVideoPlayerRequest2 = c3251v8.f25539a;
                        ck.p.j(htmlVideoPlayerRequest2, IconCompat.EXTRA_OBJ);
                        String strValueOf = String.valueOf(AbstractC3029ma.a(htmlVideoPlayerRequest2, HtmlVideoPlayerRequest.class));
                        EnumC3176s8[] enumC3176s8Arr = {EnumC3176s8.INIT};
                        EnumC2723a8[] enumC2723a8Arr = EnumC2723a8.f23967a;
                        if (c3251v8.a(enumC3176s8Arr, "createVideoPlayer", strValueOf, EnumC3176s8.LOADING)) {
                            InterfaceC3028m9 interfaceC3028m11 = c3251v8.f25541c;
                            if (interfaceC3028m11 != null) {
                                ((C3053n9) interfaceC3028m11).b("HybridVideoPlayerHandler", "load called with video files");
                            }
                            c3251v8.f25551m = uh2;
                            if (c3251v8.f25544f == null) {
                                c3251v8.f25544f = qk.e.x(qk.e.A(c3251v8.f25549k.C, new C3201t8(c3251v8, null)), c3251v8.f25543e);
                            }
                            N7 n10 = c3251v8.f25549k;
                            if (!n10.f23203h.get()) {
                                n10.a(new C2801d8(n10.f23196a));
                                if (n10.b() == EnumC3184sg.STATE_INITIALIZED) {
                                    n10.f23207l.set(EnumC3184sg.STATE_PREPARING);
                                    n10.f23214s.clear();
                                    n10.f23214s.addAll(n10.f23196a.getVideoFiles());
                                    List list = n10.f23214s;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((HtmlVideoFile) it.next()).getUrl());
                                    }
                                    if (arrayList.isEmpty()) {
                                        n10.a(new C2775c8(Am.NO_URL_FOUND));
                                    } else {
                                        n10.f23217v = nk.j.d(n10.f23198c, null, null, new C7(n10, arrayList, null), 3, null);
                                    }
                                } else {
                                    n10.a(new C2775c8(Am.INVALID_STATE));
                                }
                            }
                        }
                    }
                }
                gestureDetectorOnGestureListenerC2785ci.getViewableAd();
            } catch (C3159rg e10) {
                if (c3037mi != null) {
                    c3037mi.a(e10.f25267a);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorMessage", "Hybrid video is not supported on this device.");
                EnumC2723a8[] enumC2723a8Arr2 = EnumC2723a8.f23967a;
                jSONObject.put("jsCommand", "createVideoPlayer");
                gestureDetectorOnGestureListenerC2785ci.a(EnumC3102p8.VIDEO_COMMAND_ERROR, jSONObject);
                interfaceC3028m9 = gestureDetectorOnGestureListenerC2785ci.f24162i;
                if (interfaceC3028m9 != null) {
                    ((C3053n9) interfaceC3028m9).b("HtmlVideoPlayer", "Cannot play hybrid video");
                }
            }
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("errorMessage", "Hybrid video is not supported on this device.");
            EnumC2723a8[] enumC2723a8Arr3 = EnumC2723a8.f23967a;
            jSONObject2.put("jsCommand", "createVideoPlayer");
            gestureDetectorOnGestureListenerC2785ci.a(EnumC3102p8.VIDEO_COMMAND_ERROR, jSONObject2);
            interfaceC3028m9 = gestureDetectorOnGestureListenerC2785ci.f24162i;
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).b("HtmlVideoPlayer", "Cannot play hybrid video");
            }
        }
        return mj.r.f64562a;
    }
}
