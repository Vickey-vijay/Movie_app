package com.vungle.ads.internal.model;

import al.d;
import bl.d2;
import bl.o1;
import bl.y1;
import ck.i;
import ck.p;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.a;
import xk.b;
import xk.f;

/* JADX INFO: compiled from: OmSdkData.kt */
/* JADX INFO: loaded from: classes6.dex */
@f
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B+\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001c\u0010\u001dB9\b\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0012\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006$"}, d2 = {"Lcom/vungle/ads/internal/model/OmSdkData;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "component2", "component3", "params", "vendorKey", "vendorURL", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getParams", "()Ljava/lang/String;", "getVendorKey", "getVendorURL", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class OmSdkData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String params;
    private final String vendorKey;
    private final String vendorURL;

    /* JADX INFO: compiled from: OmSdkData.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/OmSdkData$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/OmSdkData;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final b<OmSdkData> serializer() {
            return OmSdkData$$serializer.INSTANCE;
        }
    }

    public OmSdkData() {
        this((String) null, (String) null, (String) null, 7, (i) null);
    }

    public /* synthetic */ OmSdkData(int i10, String str, String str2, String str3, y1 y1Var) {
        if ((i10 & 0) != 0) {
            o1.a(i10, 0, OmSdkData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.params = null;
        } else {
            this.params = str;
        }
        if ((i10 & 2) == 0) {
            this.vendorKey = null;
        } else {
            this.vendorKey = str2;
        }
        if ((i10 & 4) == 0) {
            this.vendorURL = null;
        } else {
            this.vendorURL = str3;
        }
    }

    public static /* synthetic */ OmSdkData copy$default(OmSdkData omSdkData, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = omSdkData.params;
        }
        if ((i10 & 2) != 0) {
            str2 = omSdkData.vendorKey;
        }
        if ((i10 & 4) != 0) {
            str3 = omSdkData.vendorURL;
        }
        return omSdkData.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getParams() {
        return this.params;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVendorKey() {
        return this.vendorKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVendorURL() {
        return this.vendorURL;
    }

    public final OmSdkData copy(String params, String vendorKey, String vendorURL) {
        return new OmSdkData(params, vendorKey, vendorURL);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OmSdkData)) {
            return false;
        }
        OmSdkData omSdkData = (OmSdkData) other;
        return p.e(this.params, omSdkData.params) && p.e(this.vendorKey, omSdkData.vendorKey) && p.e(this.vendorURL, omSdkData.vendorURL);
    }

    public int hashCode() {
        String str = this.params;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.vendorKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.vendorURL;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "OmSdkData(params=" + this.params + ", vendorKey=" + this.vendorKey + ", vendorURL=" + this.vendorURL + ')';
    }

    public OmSdkData(String str, String str2, String str3) {
        this.params = str;
        this.vendorKey = str2;
        this.vendorURL = str3;
    }

    public static final void write$Self(OmSdkData omSdkData, d dVar, a aVar) {
        p.j(omSdkData, "self");
        p.j(dVar, "output");
        p.j(aVar, "serialDesc");
        if (dVar.q(aVar, 0) || omSdkData.params != null) {
            dVar.C(aVar, 0, d2.f5397a, omSdkData.params);
        }
        if (dVar.q(aVar, 1) || omSdkData.vendorKey != null) {
            dVar.C(aVar, 1, d2.f5397a, omSdkData.vendorKey);
        }
        if (dVar.q(aVar, 2) || omSdkData.vendorURL != null) {
            dVar.C(aVar, 2, d2.f5397a, omSdkData.vendorURL);
        }
    }

    public final String getParams() {
        return this.params;
    }

    public final String getVendorKey() {
        return this.vendorKey;
    }

    public final String getVendorURL() {
        return this.vendorURL;
    }

    public /* synthetic */ OmSdkData(String str, String str2, String str3, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
