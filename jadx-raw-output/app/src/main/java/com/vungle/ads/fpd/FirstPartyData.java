package com.vungle.ads.fpd;

import bk.l;
import bl.d2;
import bl.o1;
import bl.u0;
import bl.y1;
import ck.i;
import ck.p;
import ck.s;
import cl.a;
import cl.d;
import cl.m;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import mj.r;
import xk.b;
import xk.f;
import xk.h;

/* JADX INFO: compiled from: FirstPartyData.kt */
/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 92\u00020\u0001:\u0002:9B\u0007¢\u0006\u0004\b3\u0010\u000fBo\b\u0017\u0012\u0006\u00105\u001a\u000204\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0016\b\u0001\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010 \u0012\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b3\u00108J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\u0007R\u001a\u0010\f\u001a\u00020\t8\u0002X\u0083D¢\u0006\f\n\u0004\b\f\u0010\r\u0012\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u000fR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0017\u0010\u000fR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001b\u0010\u000fR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010\u000fR*\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010 8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010\u000fR\u0011\u0010&\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010)\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010,\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010/\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001d\u00102\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0 8F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006;"}, d2 = {"Lcom/vungle/ads/fpd/FirstPartyData;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "debug", "clearAll", "modelVersion", "Ljava/lang/String;", "getModelVersion$annotations", "()V", "Lcom/vungle/ads/fpd/SessionContext;", "_sessionContext", "Lcom/vungle/ads/fpd/SessionContext;", "get_sessionContext$annotations", "Lcom/vungle/ads/fpd/Demographic;", "_demographic", "Lcom/vungle/ads/fpd/Demographic;", "get_demographic$annotations", "Lcom/vungle/ads/fpd/Location;", "_location", "Lcom/vungle/ads/fpd/Location;", "get_location$annotations", "Lcom/vungle/ads/fpd/Revenue;", "_revenue", "Lcom/vungle/ads/fpd/Revenue;", "get_revenue$annotations", "", "_customData", "Ljava/util/Map;", "get_customData$annotations", "getSessionContext", "()Lcom/vungle/ads/fpd/SessionContext;", "sessionContext", "getDemographic", "()Lcom/vungle/ads/fpd/Demographic;", "demographic", "getLocation", "()Lcom/vungle/ads/fpd/Location;", "location", "getRevenue", "()Lcom/vungle/ads/fpd/Revenue;", "revenue", "getCustomData", "()Ljava/util/Map;", "customData", "<init>", "", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/vungle/ads/fpd/SessionContext;Lcom/vungle/ads/fpd/Demographic;Lcom/vungle/ads/fpd/Location;Lcom/vungle/ads/fpd/Revenue;Ljava/util/Map;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class FirstPartyData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final a JSON = m.b(null, new l<d, r>() { // from class: com.vungle.ads.fpd.FirstPartyData$Companion$JSON$1
        @Override // bk.l
        public /* bridge */ /* synthetic */ r invoke(d dVar) {
            invoke2(dVar);
            return r.f64562a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(d dVar) {
            p.j(dVar, "$this$Json");
            dVar.g(true);
            dVar.e(false);
            dVar.d(false);
        }
    }, 1, null);
    private static final String MODEL_VERSION = "2.0";
    private Map<String, String> _customData;
    private volatile Demographic _demographic;
    private volatile Location _location;
    private volatile Revenue _revenue;
    private volatile SessionContext _sessionContext;
    private final String modelVersion;

    /* JADX INFO: compiled from: FirstPartyData.kt */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/vungle/ads/fpd/FirstPartyData$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/fpd/FirstPartyData;", "serializer", "Lcl/a;", "JSON", "Lcl/a;", "", "MODEL_VERSION", "Ljava/lang/String;", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final b<FirstPartyData> serializer() {
            return FirstPartyData$$serializer.INSTANCE;
        }
    }

    public FirstPartyData() {
        this.modelVersion = "2.0";
    }

    private static /* synthetic */ void getModelVersion$annotations() {
    }

    private static /* synthetic */ void get_customData$annotations() {
    }

    private static /* synthetic */ void get_demographic$annotations() {
    }

    private static /* synthetic */ void get_location$annotations() {
    }

    private static /* synthetic */ void get_revenue$annotations() {
    }

    private static /* synthetic */ void get_sessionContext$annotations() {
    }

    public final synchronized void clearAll() {
        this._sessionContext = null;
        this._demographic = null;
        this._revenue = null;
        this._location = null;
        Map<String, String> map = this._customData;
        if (map != null) {
            map.clear();
        }
        this._customData = null;
    }

    public final synchronized Map<String, String> getCustomData() {
        Map<String, String> concurrentHashMap;
        concurrentHashMap = this._customData;
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
            this._customData = concurrentHashMap;
        }
        return concurrentHashMap;
    }

    public final synchronized Demographic getDemographic() {
        Demographic demographic;
        demographic = this._demographic;
        if (demographic == null) {
            demographic = new Demographic();
            this._demographic = demographic;
        }
        return demographic;
    }

    public final synchronized Location getLocation() {
        Location location;
        location = this._location;
        if (location == null) {
            location = new Location();
            this._location = location;
        }
        return location;
    }

    public final synchronized Revenue getRevenue() {
        Revenue revenue;
        revenue = this._revenue;
        if (revenue == null) {
            revenue = new Revenue();
            this._revenue = revenue;
        }
        return revenue;
    }

    public final synchronized SessionContext getSessionContext() {
        SessionContext sessionContext;
        sessionContext = this._sessionContext;
        if (sessionContext == null) {
            sessionContext = new SessionContext();
            this._sessionContext = sessionContext;
        }
        return sessionContext;
    }

    public static final void write$Self(FirstPartyData firstPartyData, al.d dVar, kotlinx.serialization.descriptors.a aVar) {
        p.j(firstPartyData, "self");
        p.j(dVar, "output");
        p.j(aVar, "serialDesc");
        if (dVar.q(aVar, 0) || !p.e(firstPartyData.modelVersion, "2.0")) {
            dVar.p(aVar, 0, firstPartyData.modelVersion);
        }
        if (dVar.q(aVar, 1) || firstPartyData._sessionContext != null) {
            dVar.C(aVar, 1, SessionContext$$serializer.INSTANCE, firstPartyData._sessionContext);
        }
        if (dVar.q(aVar, 2) || firstPartyData._demographic != null) {
            dVar.C(aVar, 2, Demographic$$serializer.INSTANCE, firstPartyData._demographic);
        }
        if (dVar.q(aVar, 3) || firstPartyData._location != null) {
            dVar.C(aVar, 3, Location$$serializer.INSTANCE, firstPartyData._location);
        }
        if (dVar.q(aVar, 4) || firstPartyData._revenue != null) {
            dVar.C(aVar, 4, Revenue$$serializer.INSTANCE, firstPartyData._revenue);
        }
        if (dVar.q(aVar, 5) || firstPartyData._customData != null) {
            d2 d2Var = d2.f5397a;
            dVar.C(aVar, 5, new u0(d2Var, d2Var), firstPartyData._customData);
        }
    }

    public final String debug() {
        a aVar = JSON;
        b<Object> bVarB = h.b(aVar.a(), s.l(FirstPartyData.class));
        p.h(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return aVar.c(bVarB, this);
    }

    public /* synthetic */ FirstPartyData(int i10, String str, SessionContext sessionContext, Demographic demographic, Location location, Revenue revenue, Map map, y1 y1Var) {
        if ((i10 & 0) != 0) {
            o1.a(i10, 0, FirstPartyData$$serializer.INSTANCE.getDescriptor());
        }
        this.modelVersion = (i10 & 1) == 0 ? "2.0" : str;
        if ((i10 & 2) == 0) {
            this._sessionContext = null;
        } else {
            this._sessionContext = sessionContext;
        }
        if ((i10 & 4) == 0) {
            this._demographic = null;
        } else {
            this._demographic = demographic;
        }
        if ((i10 & 8) == 0) {
            this._location = null;
        } else {
            this._location = location;
        }
        if ((i10 & 16) == 0) {
            this._revenue = null;
        } else {
            this._revenue = revenue;
        }
        if ((i10 & 32) == 0) {
            this._customData = null;
        } else {
            this._customData = map;
        }
    }
}
