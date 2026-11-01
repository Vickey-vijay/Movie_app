package com.vungle.ads.internal.model;

import al.d;
import bl.a1;
import bl.d2;
import bl.o1;
import bl.y1;
import ck.i;
import ck.p;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.C3426d4;
import com.mbridge.msdk.MBridgeConstans;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.fpd.FirstPartyData$$serializer;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.a;
import xk.b;
import xk.f;

/* JADX INFO: compiled from: CommonRequestBody.kt */
/* JADX INFO: loaded from: classes4.dex */
@f
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 92\u00020\u0001:\n:;<=9>?@ABB?\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b3\u00104BM\b\u0017\u0012\u0006\u00105\u001a\u00020\u001b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b3\u00108J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b'\u0010(R$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u0006C"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "Lcom/vungle/ads/internal/model/DeviceNode;", "component1", "Lcom/vungle/ads/internal/model/AppNode;", "component2", "Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "component3", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "component4", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;", "component5", C3426d4.i.G, MBridgeConstans.DYNAMIC_VIEW_WX_APP, "user", "ext", AdActivity.REQUEST_KEY_EXTRA, "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/vungle/ads/internal/model/DeviceNode;", "getDevice", "()Lcom/vungle/ads/internal/model/DeviceNode;", "Lcom/vungle/ads/internal/model/AppNode;", "getApp", "()Lcom/vungle/ads/internal/model/AppNode;", "Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "getUser", "()Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "getExt", "()Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "setExt", "(Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;)V", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;", "getRequest", "()Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;", "setRequest", "(Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;)V", "<init>", "(Lcom/vungle/ads/internal/model/DeviceNode;Lcom/vungle/ads/internal/model/AppNode;Lcom/vungle/ads/internal/model/CommonRequestBody$User;Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/model/DeviceNode;Lcom/vungle/ads/internal/model/AppNode;Lcom/vungle/ads/internal/model/CommonRequestBody$User;Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "AdSizeParam", "CCPA", "COPPA", "GDPR", "IAB", "RequestExt", "RequestParam", "User", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class CommonRequestBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AppNode app;
    private final DeviceNode device;
    private RequestExt ext;
    private RequestParam request;
    private final User user;

    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dB/\b\u0017\u0012\u0006\u0010\u001e\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\t\u0012\b\b\u0001\u0010\r\u001a\u00020\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R \u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017¨\u0006$"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "component2", "width", "height", "copy", "", "toString", "hashCode", "other", "", "equals", "I", "getWidth", "()I", "getWidth$annotations", "()V", "getHeight", "getHeight$annotations", "<init>", "(II)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(IIILbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class AdSizeParam {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int height;
        private final int width;

        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final b<AdSizeParam> serializer() {
                return CommonRequestBody$AdSizeParam$$serializer.INSTANCE;
            }
        }

        public AdSizeParam(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }

        public static /* synthetic */ AdSizeParam copy$default(AdSizeParam adSizeParam, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = adSizeParam.width;
            }
            if ((i12 & 2) != 0) {
                i11 = adSizeParam.height;
            }
            return adSizeParam.copy(i10, i11);
        }

        public static /* synthetic */ void getHeight$annotations() {
        }

        public static /* synthetic */ void getWidth$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        public final AdSizeParam copy(int width, int height) {
            return new AdSizeParam(width, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdSizeParam)) {
                return false;
            }
            AdSizeParam adSizeParam = (AdSizeParam) other;
            return this.width == adSizeParam.width && this.height == adSizeParam.height;
        }

        public int hashCode() {
            return (Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height);
        }

        public String toString() {
            return "AdSizeParam(width=" + this.width + ", height=" + this.height + ')';
        }

        public static final void write$Self(AdSizeParam adSizeParam, d dVar, a aVar) {
            p.j(adSizeParam, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            dVar.n(aVar, 0, adSizeParam.width);
            dVar.n(aVar, 1, adSizeParam.height);
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public /* synthetic */ AdSizeParam(int i10, int i11, int i12, y1 y1Var) {
            if (3 != (i10 & 3)) {
                o1.a(i10, 3, CommonRequestBody$AdSizeParam$$serializer.INSTANCE.getDescriptor());
            }
            this.width = i11;
            this.height = i12;
        }
    }

    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017B%\b\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0016\u0010\u001bJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\t\u0010\r\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "status", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/String;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class CCPA {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String status;

        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final b<CCPA> serializer() {
                return CommonRequestBody$CCPA$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ CCPA(int i10, String str, y1 y1Var) {
            if (1 != (i10 & 1)) {
                o1.a(i10, 1, CommonRequestBody$CCPA$$serializer.INSTANCE.getDescriptor());
            }
            this.status = str;
        }

        public static /* synthetic */ CCPA copy$default(CCPA ccpa, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = ccpa.status;
            }
            return ccpa.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        public final CCPA copy(String status) {
            p.j(status, "status");
            return new CCPA(status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CCPA) && p.e(this.status, ((CCPA) other).status);
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        public String toString() {
            return "CCPA(status=" + this.status + ')';
        }

        public CCPA(String str) {
            p.j(str, "status");
            this.status = str;
        }

        public static final void write$Self(CCPA ccpa, d dVar, a aVar) {
            p.j(ccpa, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            dVar.p(aVar, 0, ccpa.status);
        }

        public final String getStatus() {
            return this.status;
        }
    }

    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u0011\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0018\u0010\u0019B'\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0011\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\f\u0010\u000b¨\u0006 "}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "()Ljava/lang/Boolean;", "isCoppa", "copy", "(Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;", "", "toString", "", "hashCode", "other", "equals", "Ljava/lang/Boolean;", "isCoppa$annotations", "()V", "<init>", "(Ljava/lang/Boolean;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class COPPA {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean isCoppa;

        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final b<COPPA> serializer() {
                return CommonRequestBody$COPPA$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ COPPA(int i10, Boolean bool, y1 y1Var) {
            if (1 != (i10 & 1)) {
                o1.a(i10, 1, CommonRequestBody$COPPA$$serializer.INSTANCE.getDescriptor());
            }
            this.isCoppa = bool;
        }

        public static /* synthetic */ COPPA copy$default(COPPA coppa, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = coppa.isCoppa;
            }
            return coppa.copy(bool);
        }

        public static /* synthetic */ void isCoppa$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsCoppa() {
            return this.isCoppa;
        }

        public final COPPA copy(Boolean isCoppa) {
            return new COPPA(isCoppa);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof COPPA) && p.e(this.isCoppa, ((COPPA) other).isCoppa);
        }

        public int hashCode() {
            Boolean bool = this.isCoppa;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return "COPPA(isCoppa=" + this.isCoppa + ')';
        }

        public COPPA(Boolean bool) {
            this.isCoppa = bool;
        }

        public static final void write$Self(COPPA coppa, d dVar, a aVar) {
            p.j(coppa, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            dVar.C(aVar, 0, bl.i.f5416a, coppa.isCoppa);
        }

        public final Boolean isCoppa() {
            return this.isCoppa;
        }
    }

    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/CommonRequestBody;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final b<CommonRequestBody> serializer() {
            return CommonRequestBody$$serializer.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B'\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b'\u0010(BI\b\u0017\u0012\u0006\u0010)\u001a\u00020\u0015\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\u0011\u001a\u00020\f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b'\u0010,J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\tHÆ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001a\u0012\u0004\b \u0010\u001e\u001a\u0004\b\u001f\u0010\u001cR \u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010!\u0012\u0004\b$\u0010\u001e\u001a\u0004\b\"\u0010#R \u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001a\u0012\u0004\b&\u0010\u001e\u001a\u0004\b%\u0010\u001c¨\u0006/"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "component2", "", "component3", "component4", "consentStatus", "consentSource", "consentTimestamp", "consentMessageVersion", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getConsentStatus", "()Ljava/lang/String;", "getConsentStatus$annotations", "()V", "getConsentSource", "getConsentSource$annotations", "J", "getConsentTimestamp", "()J", "getConsentTimestamp$annotations", "getConsentMessageVersion", "getConsentMessageVersion$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class GDPR {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String consentMessageVersion;
        private final String consentSource;
        private final String consentStatus;
        private final long consentTimestamp;

        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final b<GDPR> serializer() {
                return CommonRequestBody$GDPR$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ GDPR(int i10, String str, String str2, long j10, String str3, y1 y1Var) {
            if (15 != (i10 & 15)) {
                o1.a(i10, 15, CommonRequestBody$GDPR$$serializer.INSTANCE.getDescriptor());
            }
            this.consentStatus = str;
            this.consentSource = str2;
            this.consentTimestamp = j10;
            this.consentMessageVersion = str3;
        }

        public static /* synthetic */ GDPR copy$default(GDPR gdpr, String str, String str2, long j10, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = gdpr.consentStatus;
            }
            if ((i10 & 2) != 0) {
                str2 = gdpr.consentSource;
            }
            String str4 = str2;
            if ((i10 & 4) != 0) {
                j10 = gdpr.consentTimestamp;
            }
            long j11 = j10;
            if ((i10 & 8) != 0) {
                str3 = gdpr.consentMessageVersion;
            }
            return gdpr.copy(str, str4, j11, str3);
        }

        public static /* synthetic */ void getConsentMessageVersion$annotations() {
        }

        public static /* synthetic */ void getConsentSource$annotations() {
        }

        public static /* synthetic */ void getConsentStatus$annotations() {
        }

        public static /* synthetic */ void getConsentTimestamp$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConsentStatus() {
            return this.consentStatus;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConsentSource() {
            return this.consentSource;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getConsentTimestamp() {
            return this.consentTimestamp;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        public final GDPR copy(String consentStatus, String consentSource, long consentTimestamp, String consentMessageVersion) {
            p.j(consentStatus, "consentStatus");
            p.j(consentSource, "consentSource");
            p.j(consentMessageVersion, "consentMessageVersion");
            return new GDPR(consentStatus, consentSource, consentTimestamp, consentMessageVersion);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GDPR)) {
                return false;
            }
            GDPR gdpr = (GDPR) other;
            return p.e(this.consentStatus, gdpr.consentStatus) && p.e(this.consentSource, gdpr.consentSource) && this.consentTimestamp == gdpr.consentTimestamp && p.e(this.consentMessageVersion, gdpr.consentMessageVersion);
        }

        public int hashCode() {
            return (((((this.consentStatus.hashCode() * 31) + this.consentSource.hashCode()) * 31) + Long.hashCode(this.consentTimestamp)) * 31) + this.consentMessageVersion.hashCode();
        }

        public String toString() {
            return "GDPR(consentStatus=" + this.consentStatus + ", consentSource=" + this.consentSource + ", consentTimestamp=" + this.consentTimestamp + ", consentMessageVersion=" + this.consentMessageVersion + ')';
        }

        public GDPR(String str, String str2, long j10, String str3) {
            p.j(str, "consentStatus");
            p.j(str2, "consentSource");
            p.j(str3, "consentMessageVersion");
            this.consentStatus = str;
            this.consentSource = str2;
            this.consentTimestamp = j10;
            this.consentMessageVersion = str3;
        }

        public static final void write$Self(GDPR gdpr, d dVar, a aVar) {
            p.j(gdpr, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            dVar.p(aVar, 0, gdpr.consentStatus);
            dVar.p(aVar, 1, gdpr.consentSource);
            dVar.u(aVar, 2, gdpr.consentTimestamp);
            dVar.p(aVar, 3, gdpr.consentMessageVersion);
        }

        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        public final String getConsentSource() {
            return this.consentSource;
        }

        public final String getConsentStatus() {
            return this.consentStatus;
        }

        public final long getConsentTimestamp() {
            return this.consentTimestamp;
        }
    }

    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019B'\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\t\u0010\r\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$IAB;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "tcf", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getTcf", "()Ljava/lang/String;", "getTcf$annotations", "()V", "<init>", "(Ljava/lang/String;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/String;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class IAB {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String tcf;

        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$IAB$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/CommonRequestBody$IAB;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final b<IAB> serializer() {
                return CommonRequestBody$IAB$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ IAB(int i10, String str, y1 y1Var) {
            if (1 != (i10 & 1)) {
                o1.a(i10, 1, CommonRequestBody$IAB$$serializer.INSTANCE.getDescriptor());
            }
            this.tcf = str;
        }

        public static /* synthetic */ IAB copy$default(IAB iab, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = iab.tcf;
            }
            return iab.copy(str);
        }

        public static /* synthetic */ void getTcf$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTcf() {
            return this.tcf;
        }

        public final IAB copy(String tcf) {
            p.j(tcf, "tcf");
            return new IAB(tcf);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IAB) && p.e(this.tcf, ((IAB) other).tcf);
        }

        public int hashCode() {
            return this.tcf.hashCode();
        }

        public String toString() {
            return "IAB(tcf=" + this.tcf + ')';
        }

        public IAB(String str) {
            p.j(str, "tcf");
            this.tcf = str;
        }

        public static final void write$Self(IAB iab, d dVar, a aVar) {
            p.j(iab, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            dVar.p(aVar, 0, iab.tcf);
        }

        public final String getTcf() {
            return this.tcf;
        }
    }

    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B+\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b&\u0010'B?\b\u0017\u0012\u0006\u0010(\u001a\u00020\u0015\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\tHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR*\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010\u001a\u0012\u0004\b\"\u0010\u001e\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010!R\"\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010#\u0012\u0004\b%\u0010\u001e\u001a\u0004\b$\u0010\u000e¨\u0006."}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "component2", "", "component3", "()Ljava/lang/Long;", "configExtension", "signals", "configLastValidatedTimestamp", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getConfigExtension", "()Ljava/lang/String;", "getConfigExtension$annotations", "()V", "getSignals", "setSignals", "(Ljava/lang/String;)V", "getSignals$annotations", "Ljava/lang/Long;", "getConfigLastValidatedTimestamp", "getConfigLastValidatedTimestamp$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class RequestExt {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String configExtension;
        private final Long configLastValidatedTimestamp;
        private String signals;

        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final b<RequestExt> serializer() {
                return CommonRequestBody$RequestExt$$serializer.INSTANCE;
            }
        }

        public RequestExt() {
            this((String) null, (String) null, (Long) null, 7, (i) null);
        }

        public /* synthetic */ RequestExt(int i10, String str, String str2, Long l10, y1 y1Var) {
            if ((i10 & 0) != 0) {
                o1.a(i10, 0, CommonRequestBody$RequestExt$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.configExtension = null;
            } else {
                this.configExtension = str;
            }
            if ((i10 & 2) == 0) {
                this.signals = null;
            } else {
                this.signals = str2;
            }
            if ((i10 & 4) == 0) {
                this.configLastValidatedTimestamp = null;
            } else {
                this.configLastValidatedTimestamp = l10;
            }
        }

        public static /* synthetic */ RequestExt copy$default(RequestExt requestExt, String str, String str2, Long l10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = requestExt.configExtension;
            }
            if ((i10 & 2) != 0) {
                str2 = requestExt.signals;
            }
            if ((i10 & 4) != 0) {
                l10 = requestExt.configLastValidatedTimestamp;
            }
            return requestExt.copy(str, str2, l10);
        }

        public static /* synthetic */ void getConfigExtension$annotations() {
        }

        public static /* synthetic */ void getConfigLastValidatedTimestamp$annotations() {
        }

        public static /* synthetic */ void getSignals$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConfigExtension() {
            return this.configExtension;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSignals() {
            return this.signals;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getConfigLastValidatedTimestamp() {
            return this.configLastValidatedTimestamp;
        }

        public final RequestExt copy(String configExtension, String signals, Long configLastValidatedTimestamp) {
            return new RequestExt(configExtension, signals, configLastValidatedTimestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestExt)) {
                return false;
            }
            RequestExt requestExt = (RequestExt) other;
            return p.e(this.configExtension, requestExt.configExtension) && p.e(this.signals, requestExt.signals) && p.e(this.configLastValidatedTimestamp, requestExt.configLastValidatedTimestamp);
        }

        public int hashCode() {
            String str = this.configExtension;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.signals;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l10 = this.configLastValidatedTimestamp;
            return iHashCode2 + (l10 != null ? l10.hashCode() : 0);
        }

        public String toString() {
            return "RequestExt(configExtension=" + this.configExtension + ", signals=" + this.signals + ", configLastValidatedTimestamp=" + this.configLastValidatedTimestamp + ')';
        }

        public RequestExt(String str, String str2, Long l10) {
            this.configExtension = str;
            this.signals = str2;
            this.configLastValidatedTimestamp = l10;
        }

        public static final void write$Self(RequestExt requestExt, d dVar, a aVar) {
            p.j(requestExt, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            if (dVar.q(aVar, 0) || requestExt.configExtension != null) {
                dVar.C(aVar, 0, d2.f5397a, requestExt.configExtension);
            }
            if (dVar.q(aVar, 1) || requestExt.signals != null) {
                dVar.C(aVar, 1, d2.f5397a, requestExt.signals);
            }
            if (dVar.q(aVar, 2) || requestExt.configLastValidatedTimestamp != null) {
                dVar.C(aVar, 2, a1.f5375a, requestExt.configLastValidatedTimestamp);
            }
        }

        public final String getConfigExtension() {
            return this.configExtension;
        }

        public final Long getConfigLastValidatedTimestamp() {
            return this.configLastValidatedTimestamp;
        }

        public final String getSignals() {
            return this.signals;
        }

        public final void setSignals(String str) {
            this.signals = str;
        }

        public /* synthetic */ RequestExt(String str, String str2, Long l10, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : l10);
        }
    }

    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BU\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b6\u00107Be\b\u0017\u0012\u0006\u00108\u001a\u00020\u001d\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b6\u0010;J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\nHÆ\u0003J^\u0010\u001a\u001a\u00020\u00002\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u001c\u001a\u00020\nHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001dHÖ\u0001J\u0013\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b#\u0010$R*\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010%\u0012\u0004\b*\u0010+\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010,\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010\u0010R\"\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010/\u0012\u0004\b2\u0010+\u001a\u0004\b0\u00101R\"\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010/\u0012\u0004\b4\u0010+\u001a\u0004\b3\u00101R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010/\u001a\u0004\b5\u00101¨\u0006>"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "", "component1", "Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;", "component2", "", "component3", "()Ljava/lang/Long;", "component4", "component5", "component6", "placements", C3426d4.i.O, "adStartTime", "advAppId", "placementReferenceId", "user", "copy", "(Ljava/util/List;Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getPlacements", "()Ljava/util/List;", "Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;", "getAdSize", "()Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;", "setAdSize", "(Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;)V", "getAdSize$annotations", "()V", "Ljava/lang/Long;", "getAdStartTime", "getAdStartTime$annotations", "Ljava/lang/String;", "getAdvAppId", "()Ljava/lang/String;", "getAdvAppId$annotations", "getPlacementReferenceId", "getPlacementReferenceId$annotations", "getUser", "<init>", "(Ljava/util/List;Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class RequestParam {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private AdSizeParam adSize;
        private final Long adStartTime;
        private final String advAppId;
        private final String placementReferenceId;
        private final List<String> placements;
        private final String user;

        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final b<RequestParam> serializer() {
                return CommonRequestBody$RequestParam$$serializer.INSTANCE;
            }
        }

        public RequestParam() {
            this((List) null, (AdSizeParam) null, (Long) null, (String) null, (String) null, (String) null, 63, (i) null);
        }

        public /* synthetic */ RequestParam(int i10, List list, AdSizeParam adSizeParam, Long l10, String str, String str2, String str3, y1 y1Var) {
            if ((i10 & 0) != 0) {
                o1.a(i10, 0, CommonRequestBody$RequestParam$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.placements = null;
            } else {
                this.placements = list;
            }
            if ((i10 & 2) == 0) {
                this.adSize = null;
            } else {
                this.adSize = adSizeParam;
            }
            if ((i10 & 4) == 0) {
                this.adStartTime = null;
            } else {
                this.adStartTime = l10;
            }
            if ((i10 & 8) == 0) {
                this.advAppId = null;
            } else {
                this.advAppId = str;
            }
            if ((i10 & 16) == 0) {
                this.placementReferenceId = null;
            } else {
                this.placementReferenceId = str2;
            }
            if ((i10 & 32) == 0) {
                this.user = null;
            } else {
                this.user = str3;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RequestParam copy$default(RequestParam requestParam, List list, AdSizeParam adSizeParam, Long l10, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = requestParam.placements;
            }
            if ((i10 & 2) != 0) {
                adSizeParam = requestParam.adSize;
            }
            AdSizeParam adSizeParam2 = adSizeParam;
            if ((i10 & 4) != 0) {
                l10 = requestParam.adStartTime;
            }
            Long l11 = l10;
            if ((i10 & 8) != 0) {
                str = requestParam.advAppId;
            }
            String str4 = str;
            if ((i10 & 16) != 0) {
                str2 = requestParam.placementReferenceId;
            }
            String str5 = str2;
            if ((i10 & 32) != 0) {
                str3 = requestParam.user;
            }
            return requestParam.copy(list, adSizeParam2, l11, str4, str5, str3);
        }

        public static /* synthetic */ void getAdSize$annotations() {
        }

        public static /* synthetic */ void getAdStartTime$annotations() {
        }

        public static /* synthetic */ void getAdvAppId$annotations() {
        }

        public static /* synthetic */ void getPlacementReferenceId$annotations() {
        }

        public final List<String> component1() {
            return this.placements;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final AdSizeParam getAdSize() {
            return this.adSize;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getAdStartTime() {
            return this.adStartTime;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAdvAppId() {
            return this.advAppId;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getUser() {
            return this.user;
        }

        public final RequestParam copy(List<String> placements, AdSizeParam adSize, Long adStartTime, String advAppId, String placementReferenceId, String user) {
            return new RequestParam(placements, adSize, adStartTime, advAppId, placementReferenceId, user);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestParam)) {
                return false;
            }
            RequestParam requestParam = (RequestParam) other;
            return p.e(this.placements, requestParam.placements) && p.e(this.adSize, requestParam.adSize) && p.e(this.adStartTime, requestParam.adStartTime) && p.e(this.advAppId, requestParam.advAppId) && p.e(this.placementReferenceId, requestParam.placementReferenceId) && p.e(this.user, requestParam.user);
        }

        public int hashCode() {
            List<String> list = this.placements;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            AdSizeParam adSizeParam = this.adSize;
            int iHashCode2 = (iHashCode + (adSizeParam == null ? 0 : adSizeParam.hashCode())) * 31;
            Long l10 = this.adStartTime;
            int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
            String str = this.advAppId;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.placementReferenceId;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.user;
            return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "RequestParam(placements=" + this.placements + ", adSize=" + this.adSize + ", adStartTime=" + this.adStartTime + ", advAppId=" + this.advAppId + ", placementReferenceId=" + this.placementReferenceId + ", user=" + this.user + ')';
        }

        public RequestParam(List<String> list, AdSizeParam adSizeParam, Long l10, String str, String str2, String str3) {
            this.placements = list;
            this.adSize = adSizeParam;
            this.adStartTime = l10;
            this.advAppId = str;
            this.placementReferenceId = str2;
            this.user = str3;
        }

        public static final void write$Self(RequestParam requestParam, d dVar, a aVar) {
            p.j(requestParam, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            if (dVar.q(aVar, 0) || requestParam.placements != null) {
                dVar.C(aVar, 0, new bl.f(d2.f5397a), requestParam.placements);
            }
            if (dVar.q(aVar, 1) || requestParam.adSize != null) {
                dVar.C(aVar, 1, CommonRequestBody$AdSizeParam$$serializer.INSTANCE, requestParam.adSize);
            }
            if (dVar.q(aVar, 2) || requestParam.adStartTime != null) {
                dVar.C(aVar, 2, a1.f5375a, requestParam.adStartTime);
            }
            if (dVar.q(aVar, 3) || requestParam.advAppId != null) {
                dVar.C(aVar, 3, d2.f5397a, requestParam.advAppId);
            }
            if (dVar.q(aVar, 4) || requestParam.placementReferenceId != null) {
                dVar.C(aVar, 4, d2.f5397a, requestParam.placementReferenceId);
            }
            if (dVar.q(aVar, 5) || requestParam.user != null) {
                dVar.C(aVar, 5, d2.f5397a, requestParam.user);
            }
        }

        public final AdSizeParam getAdSize() {
            return this.adSize;
        }

        public final Long getAdStartTime() {
            return this.adStartTime;
        }

        public final String getAdvAppId() {
            return this.advAppId;
        }

        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        public final List<String> getPlacements() {
            return this.placements;
        }

        public final String getUser() {
            return this.user;
        }

        public final void setAdSize(AdSizeParam adSizeParam) {
            this.adSize = adSizeParam;
        }

        public /* synthetic */ RequestParam(List list, AdSizeParam adSizeParam, Long l10, String str, String str2, String str3, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : adSizeParam, (i10 & 4) != 0 ? null : l10, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3);
        }
    }

    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BC\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b9\u0010:BM\b\u0017\u0012\u0006\u0010;\u001a\u00020\u001b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b9\u0010>J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006A"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;", "component1", "Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;", "component2", "Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;", "component3", "Lcom/vungle/ads/fpd/FirstPartyData;", "component4", "Lcom/vungle/ads/internal/model/CommonRequestBody$IAB;", "component5", InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, "ccpa", "coppa", "fpd", "iab", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;", "getGdpr", "()Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;", "setGdpr", "(Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;)V", "Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;", "getCcpa", "()Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;", "setCcpa", "(Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;)V", "Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;", "getCoppa", "()Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;", "setCoppa", "(Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;)V", "Lcom/vungle/ads/fpd/FirstPartyData;", "getFpd", "()Lcom/vungle/ads/fpd/FirstPartyData;", "setFpd", "(Lcom/vungle/ads/fpd/FirstPartyData;)V", "Lcom/vungle/ads/internal/model/CommonRequestBody$IAB;", "getIab", "()Lcom/vungle/ads/internal/model/CommonRequestBody$IAB;", "setIab", "(Lcom/vungle/ads/internal/model/CommonRequestBody$IAB;)V", "<init>", "(Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;Lcom/vungle/ads/fpd/FirstPartyData;Lcom/vungle/ads/internal/model/CommonRequestBody$IAB;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/model/CommonRequestBody$GDPR;Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;Lcom/vungle/ads/fpd/FirstPartyData;Lcom/vungle/ads/internal/model/CommonRequestBody$IAB;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class User {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private CCPA ccpa;
        private COPPA coppa;
        private FirstPartyData fpd;
        private GDPR gdpr;
        private IAB iab;

        /* JADX INFO: compiled from: CommonRequestBody.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$User$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final b<User> serializer() {
                return CommonRequestBody$User$$serializer.INSTANCE;
            }
        }

        public User() {
            this((GDPR) null, (CCPA) null, (COPPA) null, (FirstPartyData) null, (IAB) null, 31, (i) null);
        }

        public /* synthetic */ User(int i10, GDPR gdpr, CCPA ccpa, COPPA coppa, FirstPartyData firstPartyData, IAB iab, y1 y1Var) {
            if ((i10 & 0) != 0) {
                o1.a(i10, 0, CommonRequestBody$User$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.gdpr = null;
            } else {
                this.gdpr = gdpr;
            }
            if ((i10 & 2) == 0) {
                this.ccpa = null;
            } else {
                this.ccpa = ccpa;
            }
            if ((i10 & 4) == 0) {
                this.coppa = null;
            } else {
                this.coppa = coppa;
            }
            if ((i10 & 8) == 0) {
                this.fpd = null;
            } else {
                this.fpd = firstPartyData;
            }
            if ((i10 & 16) == 0) {
                this.iab = null;
            } else {
                this.iab = iab;
            }
        }

        public static /* synthetic */ User copy$default(User user, GDPR gdpr, CCPA ccpa, COPPA coppa, FirstPartyData firstPartyData, IAB iab, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                gdpr = user.gdpr;
            }
            if ((i10 & 2) != 0) {
                ccpa = user.ccpa;
            }
            CCPA ccpa2 = ccpa;
            if ((i10 & 4) != 0) {
                coppa = user.coppa;
            }
            COPPA coppa2 = coppa;
            if ((i10 & 8) != 0) {
                firstPartyData = user.fpd;
            }
            FirstPartyData firstPartyData2 = firstPartyData;
            if ((i10 & 16) != 0) {
                iab = user.iab;
            }
            return user.copy(gdpr, ccpa2, coppa2, firstPartyData2, iab);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final GDPR getGdpr() {
            return this.gdpr;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CCPA getCcpa() {
            return this.ccpa;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final COPPA getCoppa() {
            return this.coppa;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final FirstPartyData getFpd() {
            return this.fpd;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final IAB getIab() {
            return this.iab;
        }

        public final User copy(GDPR gdpr, CCPA ccpa, COPPA coppa, FirstPartyData fpd, IAB iab) {
            return new User(gdpr, ccpa, coppa, fpd, iab);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof User)) {
                return false;
            }
            User user = (User) other;
            return p.e(this.gdpr, user.gdpr) && p.e(this.ccpa, user.ccpa) && p.e(this.coppa, user.coppa) && p.e(this.fpd, user.fpd) && p.e(this.iab, user.iab);
        }

        public int hashCode() {
            GDPR gdpr = this.gdpr;
            int iHashCode = (gdpr == null ? 0 : gdpr.hashCode()) * 31;
            CCPA ccpa = this.ccpa;
            int iHashCode2 = (iHashCode + (ccpa == null ? 0 : ccpa.hashCode())) * 31;
            COPPA coppa = this.coppa;
            int iHashCode3 = (iHashCode2 + (coppa == null ? 0 : coppa.hashCode())) * 31;
            FirstPartyData firstPartyData = this.fpd;
            int iHashCode4 = (iHashCode3 + (firstPartyData == null ? 0 : firstPartyData.hashCode())) * 31;
            IAB iab = this.iab;
            return iHashCode4 + (iab != null ? iab.hashCode() : 0);
        }

        public String toString() {
            return "User(gdpr=" + this.gdpr + ", ccpa=" + this.ccpa + ", coppa=" + this.coppa + ", fpd=" + this.fpd + ", iab=" + this.iab + ')';
        }

        public User(GDPR gdpr, CCPA ccpa, COPPA coppa, FirstPartyData firstPartyData, IAB iab) {
            this.gdpr = gdpr;
            this.ccpa = ccpa;
            this.coppa = coppa;
            this.fpd = firstPartyData;
            this.iab = iab;
        }

        public static final void write$Self(User user, d dVar, a aVar) {
            p.j(user, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            if (dVar.q(aVar, 0) || user.gdpr != null) {
                dVar.C(aVar, 0, CommonRequestBody$GDPR$$serializer.INSTANCE, user.gdpr);
            }
            if (dVar.q(aVar, 1) || user.ccpa != null) {
                dVar.C(aVar, 1, CommonRequestBody$CCPA$$serializer.INSTANCE, user.ccpa);
            }
            if (dVar.q(aVar, 2) || user.coppa != null) {
                dVar.C(aVar, 2, CommonRequestBody$COPPA$$serializer.INSTANCE, user.coppa);
            }
            if (dVar.q(aVar, 3) || user.fpd != null) {
                dVar.C(aVar, 3, FirstPartyData$$serializer.INSTANCE, user.fpd);
            }
            if (dVar.q(aVar, 4) || user.iab != null) {
                dVar.C(aVar, 4, CommonRequestBody$IAB$$serializer.INSTANCE, user.iab);
            }
        }

        public final CCPA getCcpa() {
            return this.ccpa;
        }

        public final COPPA getCoppa() {
            return this.coppa;
        }

        public final FirstPartyData getFpd() {
            return this.fpd;
        }

        public final GDPR getGdpr() {
            return this.gdpr;
        }

        public final IAB getIab() {
            return this.iab;
        }

        public final void setCcpa(CCPA ccpa) {
            this.ccpa = ccpa;
        }

        public final void setCoppa(COPPA coppa) {
            this.coppa = coppa;
        }

        public final void setFpd(FirstPartyData firstPartyData) {
            this.fpd = firstPartyData;
        }

        public final void setGdpr(GDPR gdpr) {
            this.gdpr = gdpr;
        }

        public final void setIab(IAB iab) {
            this.iab = iab;
        }

        public /* synthetic */ User(GDPR gdpr, CCPA ccpa, COPPA coppa, FirstPartyData firstPartyData, IAB iab, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : gdpr, (i10 & 2) != 0 ? null : ccpa, (i10 & 4) != 0 ? null : coppa, (i10 & 8) != 0 ? null : firstPartyData, (i10 & 16) != 0 ? null : iab);
        }
    }

    public /* synthetic */ CommonRequestBody(int i10, DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, y1 y1Var) {
        if (1 != (i10 & 1)) {
            o1.a(i10, 1, CommonRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.device = deviceNode;
        if ((i10 & 2) == 0) {
            this.app = null;
        } else {
            this.app = appNode;
        }
        if ((i10 & 4) == 0) {
            this.user = null;
        } else {
            this.user = user;
        }
        if ((i10 & 8) == 0) {
            this.ext = null;
        } else {
            this.ext = requestExt;
        }
        if ((i10 & 16) == 0) {
            this.request = null;
        } else {
            this.request = requestParam;
        }
    }

    public static /* synthetic */ CommonRequestBody copy$default(CommonRequestBody commonRequestBody, DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            deviceNode = commonRequestBody.device;
        }
        if ((i10 & 2) != 0) {
            appNode = commonRequestBody.app;
        }
        AppNode appNode2 = appNode;
        if ((i10 & 4) != 0) {
            user = commonRequestBody.user;
        }
        User user2 = user;
        if ((i10 & 8) != 0) {
            requestExt = commonRequestBody.ext;
        }
        RequestExt requestExt2 = requestExt;
        if ((i10 & 16) != 0) {
            requestParam = commonRequestBody.request;
        }
        return commonRequestBody.copy(deviceNode, appNode2, user2, requestExt2, requestParam);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeviceNode getDevice() {
        return this.device;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AppNode getApp() {
        return this.app;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RequestExt getExt() {
        return this.ext;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final RequestParam getRequest() {
        return this.request;
    }

    public final CommonRequestBody copy(DeviceNode device, AppNode app, User user, RequestExt ext, RequestParam request) {
        p.j(device, C3426d4.i.G);
        return new CommonRequestBody(device, app, user, ext, request);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonRequestBody)) {
            return false;
        }
        CommonRequestBody commonRequestBody = (CommonRequestBody) other;
        return p.e(this.device, commonRequestBody.device) && p.e(this.app, commonRequestBody.app) && p.e(this.user, commonRequestBody.user) && p.e(this.ext, commonRequestBody.ext) && p.e(this.request, commonRequestBody.request);
    }

    public int hashCode() {
        int iHashCode = this.device.hashCode() * 31;
        AppNode appNode = this.app;
        int iHashCode2 = (iHashCode + (appNode == null ? 0 : appNode.hashCode())) * 31;
        User user = this.user;
        int iHashCode3 = (iHashCode2 + (user == null ? 0 : user.hashCode())) * 31;
        RequestExt requestExt = this.ext;
        int iHashCode4 = (iHashCode3 + (requestExt == null ? 0 : requestExt.hashCode())) * 31;
        RequestParam requestParam = this.request;
        return iHashCode4 + (requestParam != null ? requestParam.hashCode() : 0);
    }

    public String toString() {
        return "CommonRequestBody(device=" + this.device + ", app=" + this.app + ", user=" + this.user + ", ext=" + this.ext + ", request=" + this.request + ')';
    }

    public CommonRequestBody(DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam) {
        p.j(deviceNode, C3426d4.i.G);
        this.device = deviceNode;
        this.app = appNode;
        this.user = user;
        this.ext = requestExt;
        this.request = requestParam;
    }

    public static final void write$Self(CommonRequestBody commonRequestBody, d dVar, a aVar) {
        p.j(commonRequestBody, "self");
        p.j(dVar, "output");
        p.j(aVar, "serialDesc");
        dVar.m(aVar, 0, DeviceNode$$serializer.INSTANCE, commonRequestBody.device);
        if (dVar.q(aVar, 1) || commonRequestBody.app != null) {
            dVar.C(aVar, 1, AppNode$$serializer.INSTANCE, commonRequestBody.app);
        }
        if (dVar.q(aVar, 2) || commonRequestBody.user != null) {
            dVar.C(aVar, 2, CommonRequestBody$User$$serializer.INSTANCE, commonRequestBody.user);
        }
        if (dVar.q(aVar, 3) || commonRequestBody.ext != null) {
            dVar.C(aVar, 3, CommonRequestBody$RequestExt$$serializer.INSTANCE, commonRequestBody.ext);
        }
        if (dVar.q(aVar, 4) || commonRequestBody.request != null) {
            dVar.C(aVar, 4, CommonRequestBody$RequestParam$$serializer.INSTANCE, commonRequestBody.request);
        }
    }

    public final AppNode getApp() {
        return this.app;
    }

    public final DeviceNode getDevice() {
        return this.device;
    }

    public final RequestExt getExt() {
        return this.ext;
    }

    public final RequestParam getRequest() {
        return this.request;
    }

    public final User getUser() {
        return this.user;
    }

    public final void setExt(RequestExt requestExt) {
        this.ext = requestExt;
    }

    public final void setRequest(RequestParam requestParam) {
        this.request = requestParam;
    }

    public /* synthetic */ CommonRequestBody(DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, int i10, i iVar) {
        this(deviceNode, (i10 & 2) != 0 ? null : appNode, (i10 & 4) != 0 ? null : user, (i10 & 8) != 0 ? null : requestExt, (i10 & 16) != 0 ? null : requestParam);
    }
}
