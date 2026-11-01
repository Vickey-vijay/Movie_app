package com.unity3d.ads.core.domain.billing;

import ck.i;
import ck.p;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;

/* JADX INFO: compiled from: ProductDetailsResult.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class ProductDetailsResult {

    /* JADX INFO: compiled from: ProductDetailsResult.kt */
    public static final class Failure extends ProductDetailsResult {
        private final BillingResultBridge billingResult;

        public static /* synthetic */ Failure copy$default(Failure failure, BillingResultBridge billingResultBridge, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                billingResultBridge = failure.billingResult;
            }
            return failure.copy(billingResultBridge);
        }

        public final BillingResultBridge component1() {
            return this.billingResult;
        }

        public final Failure copy(BillingResultBridge billingResultBridge) {
            p.j(billingResultBridge, "billingResult");
            return new Failure(billingResultBridge);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && p.e(this.billingResult, ((Failure) obj).billingResult);
        }

        public int hashCode() {
            return this.billingResult.hashCode();
        }

        public String toString() {
            return "Failure(billingResult=" + this.billingResult + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(BillingResultBridge billingResultBridge) {
            super(null);
            p.j(billingResultBridge, "billingResult");
            this.billingResult = billingResultBridge;
        }

        public final BillingResultBridge getBillingResult() {
            return this.billingResult;
        }
    }

    /* JADX INFO: compiled from: ProductDetailsResult.kt */
    public static final class NotFound extends ProductDetailsResult {
        public static final NotFound INSTANCE = new NotFound();

        private NotFound() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: ProductDetailsResult.kt */
    public static final class Success extends ProductDetailsResult {
        private final String productDetailsJson;

        public static /* synthetic */ Success copy$default(Success success, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = success.productDetailsJson;
            }
            return success.copy(str);
        }

        public final String component1() {
            return this.productDetailsJson;
        }

        public final Success copy(String str) {
            p.j(str, "productDetailsJson");
            return new Success(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && p.e(this.productDetailsJson, ((Success) obj).productDetailsJson);
        }

        public int hashCode() {
            return this.productDetailsJson.hashCode();
        }

        public String toString() {
            return "Success(productDetailsJson=" + this.productDetailsJson + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String str) {
            super(null);
            p.j(str, "productDetailsJson");
            this.productDetailsJson = str;
        }

        public final String getProductDetailsJson() {
            return this.productDetailsJson;
        }
    }

    private ProductDetailsResult() {
    }

    public /* synthetic */ ProductDetailsResult(i iVar) {
        this();
    }
}
