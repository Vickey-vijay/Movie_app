package com.unity3d.ads.core.domain.billing;

import ck.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: ProductDetailsFetcherWithFallback.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ProductDetailsFetcherWithFallback implements ProductDetailsFetcher {
    private final ProductDetailsFetcher primaryFetcher;
    private final ProductDetailsFetcher secondaryFetcher;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1, reason: invalid class name */
    /* JADX INFO: compiled from: ProductDetailsFetcherWithFallback.kt */
    @d(c = "com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback", f = "ProductDetailsFetcherWithFallback.kt", l = {16, 20, 24}, m = "fetchProductDetails")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProductDetailsFetcherWithFallback.this.fetchProductDetails(null, this);
        }
    }

    public ProductDetailsFetcherWithFallback(ProductDetailsFetcher productDetailsFetcher, ProductDetailsFetcher productDetailsFetcher2) {
        p.j(productDetailsFetcher, "primaryFetcher");
        p.j(productDetailsFetcher2, "secondaryFetcher");
        this.primaryFetcher = productDetailsFetcher;
        this.secondaryFetcher = productDetailsFetcher2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    public Object fetchProductDetails(String str, c<? super ProductDetailsResult> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        ProductDetailsFetcherWithFallback productDetailsFetcherWithFallback;
        ProductDetailsResult productDetailsResult;
        ProductDetailsResult productDetailsResult2;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object objFetchProductDetails = anonymousClass1.result;
        Object objF = a.f();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            kotlin.c.b(objFetchProductDetails);
            ProductDetailsFetcher productDetailsFetcher = this.primaryFetcher;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = str;
            anonymousClass1.label = 1;
            objFetchProductDetails = productDetailsFetcher.fetchProductDetails(str, anonymousClass1);
            if (objFetchProductDetails == objF) {
                return objF;
            }
            productDetailsFetcherWithFallback = this;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.c.b(objFetchProductDetails);
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                productDetailsResult = (ProductDetailsResult) anonymousClass1.L$0;
                kotlin.c.b(objFetchProductDetails);
                productDetailsResult2 = (ProductDetailsResult) objFetchProductDetails;
                if (productDetailsResult2 instanceof ProductDetailsResult.Success) {
                    return productDetailsResult2;
                }
                return productDetailsResult;
            }
            str = (String) anonymousClass1.L$1;
            productDetailsFetcherWithFallback = (ProductDetailsFetcherWithFallback) anonymousClass1.L$0;
            kotlin.c.b(objFetchProductDetails);
        }
        ProductDetailsResult productDetailsResult3 = (ProductDetailsResult) objFetchProductDetails;
        if (productDetailsResult3 instanceof ProductDetailsResult.Success) {
            return productDetailsResult3;
        }
        if (productDetailsResult3 instanceof ProductDetailsResult.NotFound) {
            ProductDetailsFetcher productDetailsFetcher2 = productDetailsFetcherWithFallback.secondaryFetcher;
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 2;
            objFetchProductDetails = productDetailsFetcher2.fetchProductDetails(str, anonymousClass1);
            return objFetchProductDetails == objF ? objF : objFetchProductDetails;
        }
        if (!(productDetailsResult3 instanceof ProductDetailsResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        ProductDetailsFetcher productDetailsFetcher3 = productDetailsFetcherWithFallback.secondaryFetcher;
        anonymousClass1.L$0 = productDetailsResult3;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 3;
        Object objFetchProductDetails2 = productDetailsFetcher3.fetchProductDetails(str, anonymousClass1);
        if (objFetchProductDetails2 == objF) {
            return objF;
        }
        objFetchProductDetails = objFetchProductDetails2;
        productDetailsResult = productDetailsResult3;
        productDetailsResult2 = (ProductDetailsResult) objFetchProductDetails;
        if (productDetailsResult2 instanceof ProductDetailsResult.Success) {
            return productDetailsResult2;
        }
        return productDetailsResult;
    }
}
