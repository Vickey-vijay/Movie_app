package com.inmobi.media;

import androidx.core.graphics.drawable.IconCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3153ra extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3253va f25253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pm f25254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONObject f25255c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3153ra(C3253va c3253va, Pm pm2, JSONObject jSONObject, rj.c cVar) {
        super(2, cVar);
        this.f25253a = c3253va;
        this.f25254b = pm2;
        this.f25255c = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3153ra(this.f25253a, this.f25254b, this.f25255c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C3153ra) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25253a.f25558a;
        Pm pm2 = this.f25254b;
        JSONObject jSONObject = this.f25255c;
        gestureDetectorOnGestureListenerC2785ci.getClass();
        ck.p.j(pm2, "action");
        C3251v8 c3251v8 = gestureDetectorOnGestureListenerC2785ci.Y0;
        if (c3251v8 != null) {
            ck.p.j(pm2, "action");
            switch (pm2.ordinal()) {
                case 0:
                    c3251v8.b(true);
                    break;
                case 1:
                    c3251v8.b(false);
                    break;
                case 2:
                    if (!c3251v8.f25545g.get()) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("action", "play");
                        EnumC3176s8 enumC3176s8 = EnumC3176s8.PLAYING;
                        EnumC3176s8[] enumC3176s8Arr = {EnumC3176s8.LOADED, EnumC3176s8.PAUSED, EnumC3176s8.COMPLETED, enumC3176s8};
                        EnumC2723a8[] enumC2723a8Arr = EnumC2723a8.f23967a;
                        if (c3251v8.a(enumC3176s8Arr, "executeVideoPlayerActions", jSONObject2.toString(), enumC3176s8)) {
                            c3251v8.f25549k.d();
                        }
                    }
                    break;
                case 3:
                    if (!c3251v8.f25545g.get()) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("action", CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
                        EnumC3176s8 enumC3176s9 = EnumC3176s8.PAUSED;
                        EnumC3176s8[] enumC3176s8Arr2 = {EnumC3176s8.LOADED, enumC3176s9, EnumC3176s8.COMPLETED, EnumC3176s8.PLAYING};
                        EnumC2723a8[] enumC2723a8Arr2 = EnumC2723a8.f23967a;
                        if (c3251v8.a(enumC3176s8Arr2, "executeVideoPlayerActions", jSONObject3.toString(), enumC3176s9)) {
                            c3251v8.f25549k.c();
                        }
                    }
                    break;
                case 4:
                    c3251v8.a(true);
                    break;
                case 5:
                    c3251v8.a(false);
                    break;
                case 6:
                    if (!c3251v8.f25545g.get()) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("action", CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
                        EnumC3176s8 enumC3176s10 = EnumC3176s8.PAUSED;
                        EnumC3176s8[] enumC3176s8Arr3 = {EnumC3176s8.LOADED, enumC3176s10, EnumC3176s8.COMPLETED, EnumC3176s8.PLAYING};
                        EnumC2723a8[] enumC2723a8Arr3 = EnumC2723a8.f23967a;
                        if (c3251v8.a(enumC3176s8Arr3, "executeVideoPlayerActions", jSONObject4.toString(), enumC3176s10)) {
                            c3251v8.f25549k.c();
                        }
                    }
                    C3333yf c3333yf = c3251v8.f25554p;
                    if (c3333yf != null) {
                        C2967jn c2967jn = new C2967jn((long) c3251v8.f25549k.a().getTime());
                        ck.p.j(c2967jn, "videoEvent");
                        Ae ae2 = c3333yf.f25795e;
                        if (ae2 != null) {
                            ae2.a(c2967jn);
                        }
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            gestureDetectorOnGestureListenerC2785ci.a(EnumC3102p8.VIDEO_PLAYER_ACTION_EXECUTED, jSONObject);
        } else {
            EnumC3102p8 enumC3102p8 = EnumC3102p8.VIDEO_COMMAND_ERROR;
            EnumC2723a8[] enumC2723a8Arr4 = EnumC2723a8.f23967a;
            X7 x10 = new X7(jSONObject);
            ck.p.j(x10, IconCompat.EXTRA_OBJ);
            gestureDetectorOnGestureListenerC2785ci.a(enumC3102p8, AbstractC3029ma.a(x10, X7.class));
        }
        return mj.r.f64562a;
    }
}
