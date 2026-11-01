package io.appmetrica.analytics.impl;

import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public final class Y8 extends Gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4525si f56237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f56238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4486r4 f56239c;

    public final HashMap a() {
        HashMap map = new HashMap();
        map.put(EnumC4112cb.EVENT_TYPE_ACTIVATION, new C4229h(this.f56237a));
        map.put(EnumC4112cb.EVENT_TYPE_START, new Fl(this.f56237a));
        map.put(EnumC4112cb.EVENT_TYPE_REGULAR, new Hg(this.f56237a));
        C4292jb c4292jb = new C4292jb(this.f56237a);
        map.put(EnumC4112cb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, c4292jb);
        map.put(EnumC4112cb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, c4292jb);
        map.put(EnumC4112cb.EVENT_TYPE_SEND_REFERRER, c4292jb);
        map.put(EnumC4112cb.EVENT_TYPE_CUSTOM_EVENT, c4292jb);
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_SET_SESSION_EXTRA;
        C4525si c4525si = this.f56237a;
        map.put(enumC4112cb, new Al(c4525si, c4525si.f57682t));
        map.put(EnumC4112cb.EVENT_TYPE_APP_OPEN, new Og(this.f56237a));
        map.put(EnumC4112cb.EVENT_TYPE_PURGE_BUFFER, new Sf(this.f56237a));
        map.put(EnumC4112cb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new C4538t6(this.f56237a));
        map.put(EnumC4112cb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, new C4622wf(this.f56237a));
        map.put(EnumC4112cb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new Wn(this.f56237a));
        map.put(EnumC4112cb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new C4647xf(this.f56237a));
        map.put(EnumC4112cb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, new Vn(this.f56237a));
        map.put(EnumC4112cb.EVENT_TYPE_ANR, c4292jb);
        EnumC4112cb enumC4112cb2 = EnumC4112cb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        C4525si c4525si2 = this.f56237a;
        map.put(enumC4112cb2, new Al(c4525si2, c4525si2.f57667e));
        EnumC4112cb enumC4112cb3 = EnumC4112cb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        C4525si c4525si3 = this.f56237a;
        map.put(enumC4112cb3, new Al(c4525si3, c4525si3.f57668f));
        map.put(EnumC4112cb.EVENT_TYPE_SEND_USER_PROFILE, c4292jb);
        EnumC4112cb enumC4112cb4 = EnumC4112cb.EVENT_TYPE_SET_USER_PROFILE_ID;
        C4525si c4525si4 = this.f56237a;
        map.put(enumC4112cb4, new Al(c4525si4, c4525si4.f57673k));
        map.put(EnumC4112cb.EVENT_TYPE_SEND_REVENUE_EVENT, c4292jb);
        map.put(EnumC4112cb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, c4292jb);
        map.put(EnumC4112cb.EVENT_TYPE_CLEANUP, c4292jb);
        map.put(EnumC4112cb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, c4292jb);
        map.put(EnumC4112cb.EVENT_TYPE_WEBVIEW_SYNC, c4292jb);
        map.put(EnumC4112cb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, new F9(this.f56237a));
        return map;
    }

    public final C4525si b() {
        return this.f56237a;
    }

    public Y8(Y4 y10) {
        C4525si c4525si = new C4525si(y10);
        this.f56237a = c4525si;
        this.f56239c = new C4486r4(c4525si);
        this.f56238b = a();
    }

    public final void a(EnumC4112cb enumC4112cb, AbstractC4443pa abstractC4443pa) {
        this.f56238b.put(enumC4112cb, abstractC4443pa);
    }

    @Override // io.appmetrica.analytics.impl.Gf
    public final X8 a(int i10) {
        LinkedList linkedList = new LinkedList();
        EnumC4112cb enumC4112cbA = EnumC4112cb.a(i10);
        C4486r4 c4486r4 = this.f56239c;
        if (c4486r4 != null) {
            c4486r4.a(enumC4112cbA, linkedList);
        }
        AbstractC4443pa abstractC4443pa = (AbstractC4443pa) this.f56238b.get(enumC4112cbA);
        if (abstractC4443pa != null) {
            abstractC4443pa.a(linkedList);
        }
        return new W8(linkedList);
    }

    @VisibleForTesting
    public final AbstractC4443pa a(EnumC4112cb enumC4112cb) {
        return (AbstractC4443pa) this.f56238b.get(enumC4112cb);
    }
}
