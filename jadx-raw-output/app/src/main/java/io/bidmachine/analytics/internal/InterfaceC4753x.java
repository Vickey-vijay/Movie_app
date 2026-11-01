package io.bidmachine.analytics.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.di.ServiceProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001:\u0001\u0006J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u0006\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0006\u0010\nJ)\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\nJ1\u0010\u0006\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lio/bidmachine/analytics/internal/x;", "Landroid/os/IInterface;", "", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, C3426d4.i.f28552m, "", "a", "(Ljava/lang/String;Ljava/lang/String;)I", "Landroid/os/Bundle;", "billingBundle", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;", "b", "productBundle", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)Landroid/os/Bundle;", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public interface InterfaceC4753x extends IInterface {

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.x$a */
    @Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u0002\u001a*B'\u0012\u0006\u0010 \u001a\u00020\u000f\u0012\u0006\u0010#\u001a\u00020!\u0012\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020$¢\u0006\u0004\b(\u0010)J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0002¢\u0006\u0004\b\t\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\t\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\t\u0010\u0016J)\u0010\t\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\t\u0010\u0019J)\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J1\u0010\t\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\t\u0010\u001cJ\u001d\u0010\t\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u001eR\u0014\u0010 \u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lio/bidmachine/analytics/internal/x$a;", "Lio/bidmachine/analytics/internal/x;", "Landroid/os/Parcel;", "o", "()Landroid/os/Parcel;", "data", "Landroid/os/Parcelable;", "parcelable", "Lmj/r;", "a", "(Landroid/os/Parcel;Landroid/os/Parcelable;)V", "reply", "Landroid/os/Parcelable$Creator;", "creator", "(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;", "Landroid/os/IBinder;", "asBinder", "()Landroid/os/IBinder;", "", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, C3426d4.i.f28552m, "", "(Ljava/lang/String;Ljava/lang/String;)I", "Landroid/os/Bundle;", "billingBundle", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;", "b", "productBundle", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)Landroid/os/Bundle;", "methodId", "(ILandroid/os/Parcel;)Landroid/os/Parcel;", "Landroid/os/IBinder;", ServiceProvider.NAMED_REMOTE, "Lio/bidmachine/analytics/internal/x$a$b;", "Lio/bidmachine/analytics/internal/x$a$b;", "methodsConfig", "Lkotlin/Function0;", "c", "Lbk/a;", "parcelFactory", "<init>", "(Landroid/os/IBinder;Lio/bidmachine/analytics/internal/x$a$b;Lbk/a;)V", "d", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class a implements InterfaceC4753x {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final mj.g<String> f59058e = kotlin.b.a(c.f59084a);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final b f59059f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final b f59060g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final b f59061h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final b f59062i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final b f59063j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final b f59064k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final b f59065l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final b f59066m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final b f59067n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final b f59068o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final b f59069p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final b f59070q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final b f59071r;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final IBinder remote;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private b methodsConfig;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final bk.a<Parcel> parcelFactory;

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.x$a$b */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J`\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u000e\u0010\u0011R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\u0011¨\u0006 "}, d2 = {"Lio/bidmachine/analytics/internal/x$a$b;", "", "", "toString", "()Ljava/lang/String;", "", "transactionIsProductTypeSupported", "operationIsProductTypeSupported", "transactionGetActivePurchases", "operationGetActivePurchases", "transactionGetPurchaseHistory", "operationGetPurchaseHistory", "transactionGetProductDetails", "operationGetProductDetails", "a", "(IIIIIIII)Lio/bidmachine/analytics/internal/x$a$b;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "h", "b", "d", "c", "e", "g", InneractiveMediationDefs.GENDER_FEMALE, "<init>", "(IIIIIIII)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final int transactionIsProductTypeSupported;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final int operationIsProductTypeSupported;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final int transactionGetActivePurchases;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final int operationGetActivePurchases;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final int transactionGetPurchaseHistory;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            private final int operationGetPurchaseHistory;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final int transactionGetProductDetails;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            private final int operationGetProductDetails;

            public final b a(int transactionIsProductTypeSupported, int operationIsProductTypeSupported, int transactionGetActivePurchases, int operationGetActivePurchases, int transactionGetPurchaseHistory, int operationGetPurchaseHistory, int transactionGetProductDetails, int operationGetProductDetails) {
                return new b(transactionIsProductTypeSupported, operationIsProductTypeSupported, transactionGetActivePurchases, operationGetActivePurchases, transactionGetPurchaseHistory, operationGetPurchaseHistory, transactionGetProductDetails, operationGetProductDetails);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof b)) {
                    return false;
                }
                b bVar = (b) other;
                return this.transactionIsProductTypeSupported == bVar.transactionIsProductTypeSupported && this.operationIsProductTypeSupported == bVar.operationIsProductTypeSupported && this.transactionGetActivePurchases == bVar.transactionGetActivePurchases && this.operationGetActivePurchases == bVar.operationGetActivePurchases && this.transactionGetPurchaseHistory == bVar.transactionGetPurchaseHistory && this.operationGetPurchaseHistory == bVar.operationGetPurchaseHistory && this.transactionGetProductDetails == bVar.transactionGetProductDetails && this.operationGetProductDetails == bVar.operationGetProductDetails;
            }

            public static /* synthetic */ b a(b bVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Object obj) {
                return bVar.a((i18 & 1) != 0 ? bVar.transactionIsProductTypeSupported : i10, (i18 & 2) != 0 ? bVar.operationIsProductTypeSupported : i11, (i18 & 4) != 0 ? bVar.transactionGetActivePurchases : i12, (i18 & 8) != 0 ? bVar.operationGetActivePurchases : i13, (i18 & 16) != 0 ? bVar.transactionGetPurchaseHistory : i14, (i18 & 32) != 0 ? bVar.operationGetPurchaseHistory : i15, (i18 & 64) != 0 ? bVar.transactionGetProductDetails : i16, (i18 & 128) != 0 ? bVar.operationGetProductDetails : i17);
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getOperationGetProductDetails() {
                return this.operationGetProductDetails;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final int getOperationGetPurchaseHistory() {
                return this.operationGetPurchaseHistory;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final int getOperationIsProductTypeSupported() {
                return this.operationIsProductTypeSupported;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final int getTransactionGetActivePurchases() {
                return this.transactionGetActivePurchases;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final int getTransactionGetProductDetails() {
                return this.transactionGetProductDetails;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final int getTransactionGetPurchaseHistory() {
                return this.transactionGetPurchaseHistory;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final int getTransactionIsProductTypeSupported() {
                return this.transactionIsProductTypeSupported;
            }

            public int hashCode() {
                return (((((((((((((Integer.hashCode(this.transactionIsProductTypeSupported) * 31) + Integer.hashCode(this.operationIsProductTypeSupported)) * 31) + Integer.hashCode(this.transactionGetActivePurchases)) * 31) + Integer.hashCode(this.operationGetActivePurchases)) * 31) + Integer.hashCode(this.transactionGetPurchaseHistory)) * 31) + Integer.hashCode(this.operationGetPurchaseHistory)) * 31) + Integer.hashCode(this.transactionGetProductDetails)) * 31) + Integer.hashCode(this.operationGetProductDetails);
            }

            public b(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                this.transactionIsProductTypeSupported = i10;
                this.operationIsProductTypeSupported = i11;
                this.transactionGetActivePurchases = i12;
                this.operationGetActivePurchases = i13;
                this.transactionGetPurchaseHistory = i14;
                this.operationGetPurchaseHistory = i15;
                this.transactionGetProductDetails = i16;
                this.operationGetProductDetails = i17;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getOperationGetActivePurchases() {
                return this.operationGetActivePurchases;
            }

            public String toString() {
                return super.toString();
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.x$a$c */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
        public static final class c extends Lambda implements bk.a<String> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f59084a = new c();

            public c() {
                super(0);
            }

            @Override // bk.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return s0.a("Y29tLmFuZHJvaWQudmVuZGluZy5iaWxsaW5nLklJbkFwcEJpbGxpbmdTZXJ2aWNl");
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.x$a$d, reason: from kotlin metadata */
        @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b#\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\u000b\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0005\u0010\nR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b!\u0010\u000fR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\r\u001a\u0004\b#\u0010\u000fR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\r\u001a\u0004\b%\u0010\u000fR\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\r\u001a\u0004\b'\u0010\u000f¨\u0006*"}, d2 = {"Lio/bidmachine/analytics/internal/x$a$d;", "", "Lio/bidmachine/analytics/internal/t0;", "version", "Lio/bidmachine/analytics/internal/x$a$b;", "a", "(Lio/bidmachine/analytics/internal/t0;)Lio/bidmachine/analytics/internal/x$a$b;", "", "descriptor$delegate", "Lmj/g;", "()Ljava/lang/String;", "descriptor", "vDefault", "Lio/bidmachine/analytics/internal/x$a$b;", "n", "()Lio/bidmachine/analytics/internal/x$a$b;", "v500", "b", "v510", "c", "v520", "d", "v521", "e", "v600", InneractiveMediationDefs.GENDER_FEMALE, "v601", "g", "v610", "h", "v620", "i", "v621", "j", "v700", CampaignEx.JSON_KEY_AD_K, "v710", "l", "v711", InneractiveMediationDefs.GENDER_MALE, "<init>", "()V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public final b a(t0 version) {
                if (version.compareTo(new t0(5, 1, 0)) < 0) {
                    return b();
                }
                if (version.compareTo(new t0(5, 2, 0)) < 0) {
                    return c();
                }
                if (version.compareTo(new t0(5, 2, 1)) < 0) {
                    return d();
                }
                if (version.compareTo(new t0(6, 0, 0)) < 0) {
                    return e();
                }
                if (version.compareTo(new t0(6, 0, 1)) < 0) {
                    return f();
                }
                if (version.compareTo(new t0(6, 1, 0)) < 0) {
                    return g();
                }
                if (version.compareTo(new t0(6, 2, 0)) < 0) {
                    return h();
                }
                if (version.compareTo(new t0(6, 2, 1)) < 0) {
                    return i();
                }
                if (version.compareTo(new t0(7, 0, 0)) < 0) {
                    return j();
                }
                if (version.compareTo(new t0(7, 1, 0)) < 0) {
                    return k();
                }
                if (version.compareTo(new t0(7, 1, 1)) < 0) {
                    return l();
                }
                return version.compareTo(new t0(7, 2, 0)) < 0 ? m() : n();
            }

            public final String a() {
                return (String) a.f59058e.getValue();
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final b b() {
                return a.f59060g;
            }

            public final b c() {
                return a.f59061h;
            }

            public final b d() {
                return a.f59062i;
            }

            public final b e() {
                return a.f59063j;
            }

            public final b f() {
                return a.f59064k;
            }

            public final b g() {
                return a.f59065l;
            }

            public final b h() {
                return a.f59066m;
            }

            public final b i() {
                return a.f59067n;
            }

            public final b j() {
                return a.f59068o;
            }

            public final b k() {
                return a.f59069p;
            }

            public final b l() {
                return a.f59070q;
            }

            public final b m() {
                return a.f59071r;
            }

            public final b n() {
                return a.f59059f;
            }
        }

        public a(IBinder iBinder, b bVar, bk.a<Parcel> aVar) {
            this.remote = iBinder;
            this.methodsConfig = bVar;
            this.parcelFactory = aVar;
        }

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.x$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/os/Parcel;", "a", "()Landroid/os/Parcel;"}, k = 3, mv = {1, 7, 1})
        public static final class C0496a extends Lambda implements bk.a<Parcel> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0496a f59075a = new C0496a();

            public C0496a() {
                super(0);
            }

            @Override // bk.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Parcel invoke() {
                return Parcel.obtain();
            }
        }

        static {
            b bVar = new b(1, 23, 11, 19, 9, 6, 901, 20);
            f59059f = bVar;
            b bVarA = b.a(bVar, 0, 17, 0, 9, 0, 0, 0, 17, 117, null);
            f59060g = bVarA;
            f59061h = bVarA;
            b bVarA2 = b.a(bVarA, 0, 19, 0, 19, 0, 0, 0, 0, 245, null);
            f59062i = bVarA2;
            f59063j = bVarA2;
            b bVarA3 = b.a(bVarA2, 0, 20, 0, 0, 0, 0, 0, 20, 125, null);
            f59064k = bVarA3;
            f59065l = bVarA3;
            b bVarA4 = b.a(bVarA3, 0, 21, 0, 0, 0, 0, 0, 0, 253, null);
            f59066m = bVarA4;
            b bVarA5 = b.a(bVarA4, 0, 22, 0, 0, 0, 0, 0, 0, 253, null);
            f59067n = bVarA5;
            f59068o = bVarA5;
            f59069p = bVarA5;
            b bVarA6 = b.a(bVarA5, 0, 23, 0, 0, 0, 0, 0, 0, 253, null);
            f59070q = bVarA6;
            f59071r = b.a(bVarA6, 0, 23, 0, 0, 0, 0, 0, 0, 253, null);
        }

        public /* synthetic */ a(IBinder iBinder, b bVar, bk.a aVar, int i10, ck.i iVar) {
            this(iBinder, bVar, (i10 & 4) != 0 ? C0496a.f59075a : aVar);
        }

        private final void a(Parcel data, Parcelable parcelable) {
            data.writeInt(1);
            parcelable.writeToParcel(data, 0);
        }

        private final Parcel o() {
            Parcel parcelInvoke = this.parcelFactory.invoke();
            parcelInvoke.writeInterfaceToken(INSTANCE.a());
            return parcelInvoke;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.remote;
        }

        @Override // io.bidmachine.analytics.internal.InterfaceC4753x
        public Bundle b(String packageName, String productType, Bundle billingBundle) {
            Parcel parcelO = o();
            parcelO.writeInt(this.methodsConfig.getOperationGetPurchaseHistory());
            parcelO.writeString(packageName);
            parcelO.writeString(productType);
            parcelO.writeString(null);
            a(parcelO, billingBundle);
            Parcel parcelA = a(this.methodsConfig.getTransactionGetPurchaseHistory(), parcelO);
            Bundle bundle = (Bundle) a(parcelA, Bundle.CREATOR);
            parcelA.recycle();
            return bundle;
        }

        @Override // io.bidmachine.analytics.internal.InterfaceC4753x
        public Bundle a(String packageName, String productType, Bundle billingBundle) {
            Parcel parcelO = o();
            parcelO.writeInt(this.methodsConfig.getOperationGetActivePurchases());
            parcelO.writeString(packageName);
            parcelO.writeString(productType);
            parcelO.writeString(null);
            a(parcelO, billingBundle);
            Parcel parcelA = a(this.methodsConfig.getTransactionGetActivePurchases(), parcelO);
            Bundle bundle = (Bundle) a(parcelA, Bundle.CREATOR);
            parcelA.recycle();
            return bundle;
        }

        @Override // io.bidmachine.analytics.internal.InterfaceC4753x
        public Bundle a(String packageName, String productType, Bundle productBundle, Bundle billingBundle) {
            Parcel parcelO = o();
            parcelO.writeInt(this.methodsConfig.getOperationGetProductDetails());
            parcelO.writeString(packageName);
            parcelO.writeString(productType);
            a(parcelO, productBundle);
            a(parcelO, billingBundle);
            Parcel parcelA = a(this.methodsConfig.getTransactionGetProductDetails(), parcelO);
            Bundle bundle = (Bundle) a(parcelA, Bundle.CREATOR);
            parcelA.recycle();
            return bundle;
        }

        @Override // io.bidmachine.analytics.internal.InterfaceC4753x
        public int a(String packageName, String productType) {
            Parcel parcelO = o();
            parcelO.writeInt(this.methodsConfig.getOperationIsProductTypeSupported());
            parcelO.writeString(packageName);
            parcelO.writeString(productType);
            Parcel parcelA = a(this.methodsConfig.getTransactionIsProductTypeSupported(), parcelO);
            int i10 = parcelA.readInt();
            parcelA.recycle();
            return i10;
        }

        private final Parcelable a(Parcel reply, Parcelable.Creator<?> creator) {
            if (reply.readInt() == 0) {
                return null;
            }
            Object objCreateFromParcel = creator.createFromParcel(reply);
            ck.p.h(objCreateFromParcel, "null cannot be cast to non-null type android.os.Parcelable");
            return (Parcelable) objCreateFromParcel;
        }

        public final Parcel a(int methodId, Parcel data) {
            Parcel parcelInvoke = this.parcelFactory.invoke();
            try {
                try {
                    this.remote.transact(methodId, data, parcelInvoke, 0);
                    parcelInvoke.readException();
                    data.recycle();
                    return parcelInvoke;
                } catch (RuntimeException e10) {
                    parcelInvoke.recycle();
                    throw e10;
                }
            } catch (Throwable th2) {
                data.recycle();
                throw th2;
            }
        }
    }

    int a(String packageName, String productType);

    Bundle a(String packageName, String productType, Bundle billingBundle);

    Bundle a(String packageName, String productType, Bundle productBundle, Bundle billingBundle);

    Bundle b(String packageName, String productType, Bundle billingBundle);
}
