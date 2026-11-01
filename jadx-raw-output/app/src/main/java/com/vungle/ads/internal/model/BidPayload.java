package com.vungle.ads.internal.model;

import android.util.Base64;
import bk.l;
import bl.d2;
import bl.o1;
import bl.p0;
import bl.y1;
import ck.i;
import ck.p;
import ck.s;
import cl.a;
import cl.d;
import cl.m;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;
import mj.r;
import xk.b;
import xk.f;
import xk.h;

/* JADX INFO: compiled from: BidPayload.kt */
/* JADX INFO: loaded from: classes6.dex */
@f
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B1\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017¢\u0006\u0004\b2\u00103BI\b\u0017\u0012\u0006\u00104\u001a\u00020\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017\u0012\b\u00100\u001a\u0004\u0018\u00010\u0010\u0012\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b2\u00107J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tHÇ\u0001J\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004J\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017HÆ\u0003J:\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b$\u0010\u0015R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u001b\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b,\u0010-\u0012\u0004\b.\u0010/R\u0016\u00100\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u0006:"}, d2 = {"Lcom/vungle/ads/internal/model/BidPayload;", "", "", "compressed", "", "gzipDecode", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "getPlacementId", "getEventId", "getCreativeId", "Lcom/vungle/ads/internal/model/AdPayload;", "getAdPayload", "getDecodedAdsResponse", "", "component1", "()Ljava/lang/Integer;", "component2", "", "component3", "version", "adunit", "impression", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/vungle/ads/internal/model/BidPayload;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Integer;", "getVersion", "Ljava/lang/String;", "getAdunit", "()Ljava/lang/String;", "Ljava/util/List;", "getImpression", "()Ljava/util/List;", "Lcl/a;", "json", "Lcl/a;", "getJson$annotations", "()V", "ad", "Lcom/vungle/ads/internal/model/AdPayload;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/vungle/ads/internal/model/AdPayload;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class BidPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AdPayload ad;
    private final String adunit;
    private final List<String> impression;
    private final a json;
    private final Integer version;

    /* JADX INFO: compiled from: BidPayload.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/BidPayload$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/BidPayload;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final b<BidPayload> serializer() {
            return BidPayload$$serializer.INSTANCE;
        }
    }

    public BidPayload() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ BidPayload(int i10, Integer num, String str, List list, AdPayload adPayload, y1 y1Var) {
        String decodedAdsResponse;
        if ((i10 & 0) != 0) {
            o1.a(i10, 0, BidPayload$$serializer.INSTANCE.getDescriptor());
        }
        AdPayload adPayload2 = null;
        if ((i10 & 1) == 0) {
            this.version = null;
        } else {
            this.version = num;
        }
        if ((i10 & 2) == 0) {
            this.adunit = null;
        } else {
            this.adunit = str;
        }
        if ((i10 & 4) == 0) {
            this.impression = null;
        } else {
            this.impression = list;
        }
        a aVarB = m.b(null, new l<d, r>() { // from class: com.vungle.ads.internal.model.BidPayload.1
            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(d dVar) {
                invoke2(dVar);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(d dVar) {
                p.j(dVar, "$this$Json");
                dVar.f(true);
                dVar.d(true);
                dVar.e(false);
            }
        }, 1, null);
        this.json = aVarB;
        if ((i10 & 8) != 0) {
            this.ad = adPayload;
            return;
        }
        if (this.adunit != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            b<Object> bVarB = h.b(aVarB.a(), s.l(AdPayload.class));
            p.h(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            adPayload2 = (AdPayload) aVarB.b(bVarB, decodedAdsResponse);
        }
        this.ad = adPayload2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BidPayload copy$default(BidPayload bidPayload, Integer num, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = bidPayload.version;
        }
        if ((i10 & 2) != 0) {
            str = bidPayload.adunit;
        }
        if ((i10 & 4) != 0) {
            list = bidPayload.impression;
        }
        return bidPayload.copy(num, str, list);
    }

    private static /* synthetic */ void getJson$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAdunit() {
        return this.adunit;
    }

    public final List<String> component3() {
        return this.impression;
    }

    public final BidPayload copy(Integer version, String adunit, List<String> impression) {
        return new BidPayload(version, adunit, impression);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BidPayload)) {
            return false;
        }
        BidPayload bidPayload = (BidPayload) other;
        return p.e(this.version, bidPayload.version) && p.e(this.adunit, bidPayload.adunit) && p.e(this.impression, bidPayload.impression);
    }

    public int hashCode() {
        Integer num = this.version;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.adunit;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.impression;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "BidPayload(version=" + this.version + ", adunit=" + this.adunit + ", impression=" + this.impression + ')';
    }

    private final String gzipDecode(byte[] compressed) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(compressed);
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 1024);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = gZIPInputStream.read(bArr);
                    if (i10 == -1) {
                        r rVar = r.f64562a;
                        yj.b.a(gZIPInputStream, null);
                        yj.b.a(byteArrayInputStream, null);
                        String string = byteArrayOutputStream.toString();
                        p.i(string, "result.toString()");
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        yj.b.a(byteArrayInputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    yj.b.a(gZIPInputStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    public static final void write$Self(BidPayload bidPayload, al.d dVar, kotlinx.serialization.descriptors.a aVar) {
        String decodedAdsResponse;
        boolean z10;
        p.j(bidPayload, "self");
        p.j(dVar, "output");
        p.j(aVar, "serialDesc");
        if (dVar.q(aVar, 0) || bidPayload.version != null) {
            dVar.C(aVar, 0, p0.f5452a, bidPayload.version);
        }
        if (dVar.q(aVar, 1) || bidPayload.adunit != null) {
            dVar.C(aVar, 1, d2.f5397a, bidPayload.adunit);
        }
        if (dVar.q(aVar, 2) || bidPayload.impression != null) {
            dVar.C(aVar, 2, new bl.f(d2.f5397a), bidPayload.impression);
        }
        if (!dVar.q(aVar, 3)) {
            AdPayload adPayload = bidPayload.ad;
            AdPayload adPayload2 = null;
            if (bidPayload.adunit != null && (decodedAdsResponse = bidPayload.getDecodedAdsResponse()) != null) {
                a aVar2 = bidPayload.json;
                b<Object> bVarB = h.b(aVar2.a(), s.l(AdPayload.class));
                p.h(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                adPayload2 = (AdPayload) aVar2.b(bVarB, decodedAdsResponse);
            }
            z10 = p.e(adPayload, adPayload2) ? false : true;
        }
        if (z10) {
            dVar.C(aVar, 3, AdPayload$$serializer.INSTANCE, bidPayload.ad);
        }
    }

    /* JADX INFO: renamed from: getAdPayload, reason: from getter */
    public final AdPayload getAd() {
        return this.ad;
    }

    public final String getAdunit() {
        return this.adunit;
    }

    public final String getCreativeId() {
        AdPayload adPayload = this.ad;
        if (adPayload != null) {
            return adPayload.getCreativeId();
        }
        return null;
    }

    public final String getDecodedAdsResponse() throws Throwable {
        byte[] bArrDecode = Base64.decode(this.adunit, 0);
        if (bArrDecode != null) {
            return gzipDecode(bArrDecode);
        }
        return null;
    }

    public final String getEventId() {
        AdPayload adPayload = this.ad;
        if (adPayload != null) {
            return adPayload.eventId();
        }
        return null;
    }

    public final List<String> getImpression() {
        return this.impression;
    }

    public final String getPlacementId() {
        AdPayload adPayload = this.ad;
        if (adPayload != null) {
            return adPayload.placementId();
        }
        return null;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public BidPayload(Integer num, String str, List<String> list) {
        String decodedAdsResponse;
        this.version = num;
        this.adunit = str;
        this.impression = list;
        AdPayload adPayload = null;
        a aVarB = m.b(null, new l<d, r>() { // from class: com.vungle.ads.internal.model.BidPayload$json$1
            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(d dVar) {
                invoke2(dVar);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(d dVar) {
                p.j(dVar, "$this$Json");
                dVar.f(true);
                dVar.d(true);
                dVar.e(false);
            }
        }, 1, null);
        this.json = aVarB;
        if (str != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            b<Object> bVarB = h.b(aVarB.a(), s.l(AdPayload.class));
            p.h(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            adPayload = (AdPayload) aVarB.b(bVarB, decodedAdsResponse);
        }
        this.ad = adPayload;
    }

    public /* synthetic */ BidPayload(Integer num, String str, List list, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : list);
    }
}
