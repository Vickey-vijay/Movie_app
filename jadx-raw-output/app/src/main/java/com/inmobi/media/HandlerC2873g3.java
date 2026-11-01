package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class HandlerC2873g3 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f24402a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2873g3(Looper looper) {
        super(looper);
        ck.p.j(looper, "looper");
    }

    public final void a(S2 s10) throws InterruptedException {
        C3271w3 c3271w3 = C3271w3.f25610a;
        ck.p.i("w3", "access$getTAG$p(...)");
        String str = s10.f23479b;
        b(s10);
        C3271w3.a(s10, "RETRY_EXHAUSTED");
        nk.i.b(null, new C2821e3(s10, null), 1, null);
        C3271w3.f25615f.remove(s10);
        if (C3271w3.f25615f.isEmpty()) {
            nk.i.b(null, new C2847f3(this, null), 1, null);
        }
    }

    public final void b(S2 s10) {
        int iK0 = nj.b0.k0(C3271w3.f25615f, s10);
        if (-1 != iK0) {
            S2 s11 = (S2) C3271w3.f25615f.get(iK0 == C3271w3.f25615f.size() + (-1) ? 0 : iK0 + 1);
            Message messageObtain = Message.obtain();
            messageObtain.what = s11.f23482e ? 3 : 2;
            messageObtain.obj = s11;
            long pingInterval = C3271w3.c().getPingInterval() * 1000;
            if (System.currentTimeMillis() - s11.f23484g < pingInterval) {
                sendMessageDelayed(messageObtain, pingInterval);
            } else {
                sendMessage(messageObtain);
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ck.p.j(message, NotificationCompat.CATEGORY_MESSAGE);
        if (C3271w3.f25617h.get()) {
            try {
                int i10 = message.what;
                int i11 = 3;
                if (i10 == 1) {
                    if (C3271w3.e()) {
                        AdConfig.ImaiConfig imaiConfigC = C3271w3.c();
                        W2 w10 = (W2) C3271w3.f25611b.getValue();
                        List list = (List) nk.i.b(null, new Z2(w10, imaiConfigC, null), 1, null);
                        C3271w3.f25615f = list;
                        if (list.isEmpty()) {
                            nk.i.b(null, new C2718a3(w10, this, imaiConfigC, null), 1, null);
                            return;
                        }
                        ck.p.i("w3", "access$getTAG$p(...)");
                        for (S2 s10 : C3271w3.f25615f) {
                            C3271w3 c3271w3 = C3271w3.f25610a;
                            ck.p.i("w3", "access$getTAG$p(...)");
                            String str = s10.f23479b;
                        }
                        S2 s11 = (S2) C3271w3.f25615f.get(0);
                        Message messageObtain = Message.obtain();
                        if (!s11.f23482e) {
                            i11 = 2;
                        }
                        messageObtain.what = i11;
                        messageObtain.obj = s11;
                        long jCurrentTimeMillis = System.currentTimeMillis() - s11.f23484g;
                        if (jCurrentTimeMillis < imaiConfigC.getPingInterval() * 1000) {
                            sendMessageDelayed(messageObtain, ((long) (imaiConfigC.getPingInterval() * 1000)) - jCurrentTimeMillis);
                            return;
                        } else {
                            sendMessage(messageObtain);
                            return;
                        }
                    }
                    return;
                }
                if (i10 == 2) {
                    if (Re.a() != null) {
                        C3271w3.f25616g.set(false);
                        C3271w3.g();
                        return;
                    }
                    Object obj = message.obj;
                    AdConfig.ImaiConfig imaiConfigC2 = C3271w3.c();
                    if (!(obj instanceof S2)) {
                        ck.p.i("w3", "access$getTAG$p(...)");
                        return;
                    }
                    if (((S2) obj).f23483f != 0) {
                        S2 s12 = (S2) obj;
                        long pingCacheExpiry = imaiConfigC2.getPingCacheExpiry();
                        s12.getClass();
                        if (!(System.currentTimeMillis() - s12.f23485h > pingCacheExpiry * ((long) 1000))) {
                            if ((imaiConfigC2.getMaxRetries() - ((S2) obj).f23483f) + 1 == 0) {
                                ck.p.i("w3", "access$getTAG$p(...)");
                                String str2 = ((S2) obj).f23479b;
                            } else {
                                ck.p.i("w3", "access$getTAG$p(...)");
                                String str3 = ((S2) obj).f23479b;
                            }
                            nk.i.b(null, new C2744b3((S2) obj, this, null), 1, null);
                            return;
                        }
                    }
                    a((S2) obj);
                    return;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        ck.p.i("w3", "access$getTAG$p(...)");
                        mj.r rVar = mj.r.f64562a;
                        return;
                    }
                    Object obj2 = message.obj;
                    ck.p.h(obj2, "null cannot be cast to non-null type com.inmobi.ads.core.Click");
                    S2 s13 = (S2) obj2;
                    ck.p.i("w3", "access$getTAG$p(...)");
                    String str4 = s13.f23479b;
                    LinkedHashMap linkedHashMap = C3271w3.f25619j;
                    C2715a0 c2715a0 = (C2715a0) linkedHashMap.get(Integer.valueOf(s13.f23478a));
                    if (c2715a0 != null) {
                        ck.p.j(s13, "click");
                        c2715a0.f23932a.a(c2715a0.f23933b);
                    }
                    linkedHashMap.remove(Integer.valueOf(s13.f23478a));
                    nk.i.b(null, new C2796d3(s13, this, null), 1, null);
                    return;
                }
                if (Re.a() != null) {
                    C3271w3.f25616g.set(false);
                    C3271w3.g();
                    return;
                }
                Object obj3 = message.obj;
                AdConfig.ImaiConfig imaiConfigC3 = C3271w3.c();
                if (!(obj3 instanceof S2)) {
                    ck.p.i("w3", "access$getTAG$p(...)");
                    return;
                }
                if (((S2) obj3).f23483f != 0) {
                    S2 s14 = (S2) obj3;
                    long pingCacheExpiry2 = imaiConfigC3.getPingCacheExpiry();
                    s14.getClass();
                    if (!(System.currentTimeMillis() - s14.f23485h > pingCacheExpiry2 * ((long) 1000))) {
                        if ((imaiConfigC3.getMaxRetries() - ((S2) obj3).f23483f) + 1 == 0) {
                            ck.p.i("w3", "access$getTAG$p(...)");
                            String str5 = ((S2) obj3).f23479b;
                        } else {
                            ck.p.i("w3", "access$getTAG$p(...)");
                            String str6 = ((S2) obj3).f23479b;
                        }
                        new C2923i3(new C2770c3(this)).a((S2) obj3);
                        mj.r rVar2 = mj.r.f64562a;
                        return;
                    }
                }
                a((S2) obj3);
            } catch (Exception e10) {
                C3271w3 c3271w4 = C3271w3.f25610a;
                ck.p.i("w3", "access$getTAG$p(...)");
                e10.getMessage();
            }
        }
    }
}
