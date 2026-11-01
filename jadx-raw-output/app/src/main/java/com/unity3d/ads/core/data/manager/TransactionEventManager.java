package com.unity3d.ads.core.data.manager;

import bk.p;
import ck.i;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.exception.TransactionException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.billing.IsBillingClientAvailable;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcher;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.j;
import nk.l0;
import qk.l;
import qk.v;
import rj.c;
import tj.d;
import tj.f;

/* JADX INFO: compiled from: TransactionEventManager.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class TransactionEventManager {
    public static final String BILLING_SERVICE_UNAVAILABLE = "Billing client is not available";
    public static final Companion Companion = new Companion(null);
    private static final String INAPP = "inapp";
    private static final String SUBS = "subs";
    private final BillingClientAdapter billingClientAdapter;
    private final GetTransactionData getTransactionData;
    private final GetTransactionRequest getTransactionRequest;
    private final ByteStringDataSource iapTransactionStore;
    private final IsBillingClientAvailable isBillingClientAvailable;
    private final Logger logger;
    private final ProductDetailsFetcher productDetailsFetcher;
    private final l0 scope;
    private final SessionRepository sessionRepository;
    private final TransactionEventRepository transactionEventRepository;

    /* JADX INFO: compiled from: TransactionEventManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: TransactionEventManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1", f = "TransactionEventManager.kt", l = {163}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public Object L$0;
        public int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return TransactionEventManager.this.new AnonymousClass1(cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
            transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
            transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        kotlin.c.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.c.b(obj);
                    if (!TransactionEventManager.this.billingClientAdapter.isInitialized()) {
                        final TransactionEventManager transactionEventManager = TransactionEventManager.this;
                        this.L$0 = transactionEventManager;
                        this.label = 1;
                        final kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(this), 1);
                        cVar.J();
                        transactionEventManager.billingClientAdapter.initialize(new BillingInitializationListener() { // from class: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1$1$1
                            private final l<Boolean> hasBeenResumed = v.a(Boolean.FALSE);

                            private final void tryResume() {
                                Boolean value;
                                Boolean bool;
                                if (cVar.isActive()) {
                                    l<Boolean> lVar = this.hasBeenResumed;
                                    do {
                                        value = lVar.getValue();
                                        bool = value;
                                        bool.booleanValue();
                                    } while (!lVar.a(value, Boolean.TRUE));
                                    if (bool.booleanValue()) {
                                        return;
                                    }
                                    nk.l<r> lVar2 = cVar;
                                    Result.a aVar = Result.Companion;
                                    lVar2.resumeWith(Result.m3458constructorimpl(r.f64562a));
                                }
                            }

                            private final void tryResumeWithException(Exception exc) {
                                Boolean value;
                                Boolean bool;
                                if (cVar.isActive()) {
                                    l<Boolean> lVar = this.hasBeenResumed;
                                    do {
                                        value = lVar.getValue();
                                        bool = value;
                                        bool.booleanValue();
                                    } while (!lVar.a(value, Boolean.TRUE));
                                    if (bool.booleanValue()) {
                                        return;
                                    }
                                    nk.l<r> lVar2 = cVar;
                                    Result.a aVar = Result.Companion;
                                    lVar2.resumeWith(Result.m3458constructorimpl(kotlin.c.a(exc)));
                                }
                            }

                            public final l<Boolean> getHasBeenResumed() {
                                return this.hasBeenResumed;
                            }

                            @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                            public void onBillingServiceDisconnected() {
                                tryResumeWithException(new TransactionException("Billing service disconnected"));
                            }

                            @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                            public void onBillingSetupFinished(BillingResultBridge billingResultBridge) {
                                ck.p.j(billingResultBridge, "billingResult");
                                if (billingResultBridge.getResponseCode() != BillingResultResponseCode.OK) {
                                    tryResumeWithException(new TransactionException("Billing setup failed"));
                                } else {
                                    tryResume();
                                }
                            }

                            @Override // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
                            public void onPurchaseUpdated(BillingResultBridge billingResultBridge, List<? extends PurchaseBridge> list) {
                                ck.p.j(billingResultBridge, "billingResult");
                                transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_LIVE_UPDATE);
                            }

                            @Override // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
                            public void onIsAlreadyInitialized() {
                                tryResume();
                            }
                        });
                        Object objB = cVar.B();
                        if (objB == sj.a.f()) {
                            f.c(this);
                        }
                        if (objB == objF) {
                            return objF;
                        }
                    }
                    return r.f64562a;
                }
                if (TransactionEventManager.this.sessionRepository.getNativeConfiguration().getFeatureFlags().getShouldSendIapHistory()) {
                    BillingClientAdapter billingClientAdapter = TransactionEventManager.this.billingClientAdapter;
                    final TransactionEventManager transactionEventManager2 = TransactionEventManager.this;
                    billingClientAdapter.queryPurchasesAsync(TransactionEventManager.INAPP, new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.a
                        @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                        public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                            TransactionEventManager.AnonymousClass1.invokeSuspend$lambda$1(transactionEventManager2, billingResultBridge, list);
                        }
                    });
                    BillingClientAdapter billingClientAdapter2 = TransactionEventManager.this.billingClientAdapter;
                    final TransactionEventManager transactionEventManager3 = TransactionEventManager.this;
                    billingClientAdapter2.queryPurchasesAsync(TransactionEventManager.SUBS, new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.b
                        @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                        public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                            TransactionEventManager.AnonymousClass1.invokeSuspend$lambda$2(transactionEventManager3, billingResultBridge, list);
                        }
                    });
                }
            } catch (Exception e10) {
                TransactionEventManager.this.logger.trace(TransactionEventManager.BILLING_SERVICE_UNAVAILABLE, e10);
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TransactionEventManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1", f = "TransactionEventManager.kt", l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 135, 148, 151}, m = "invokeSuspend")
    public static final class C38681 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ List<PurchaseBridge> $purchases;
        public final /* synthetic */ TransactionEventRequestOuterClass.TransactionOrigin $transactionOrigin;
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public final /* synthetic */ TransactionEventManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C38681(List<? extends PurchaseBridge> list, TransactionEventManager transactionEventManager, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, c<? super C38681> cVar) {
            super(2, cVar);
            this.$purchases = list;
            this.this$0 = transactionEventManager;
            this.$transactionOrigin = transactionOrigin;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return new C38681(this.$purchases, this.this$0, this.$transactionOrigin, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((C38681) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX WARN: Code duplicated, block: B:112:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:28:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:30:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:37:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:38:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:46:0x0111  */
        /* JADX WARN: Code duplicated, block: B:51:0x0129  */
        /* JADX WARN: Code duplicated, block: B:53:0x012c  */
        /* JADX WARN: Code duplicated, block: B:54:0x012e A[Catch: Exception -> 0x010c, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x010c, blocks: (B:43:0x00fb, B:54:0x012e), top: B:112:0x00fb }] */
        /* JADX WARN: Code duplicated, block: B:58:0x0137  */
        /* JADX WARN: Code duplicated, block: B:61:0x013c A[Catch: Exception -> 0x01de, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x01de, blocks: (B:34:0x00e0, B:47:0x0112, B:61:0x013c), top: B:106:0x00e0 }] */
        /* JADX WARN: Code duplicated, block: B:63:0x015a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:64:0x015b  */
        /* JADX WARN: Code duplicated, block: B:67:0x0180 A[Catch: Exception -> 0x01cc, TRY_LEAVE, TryCatch #3 {Exception -> 0x01cc, blocks: (B:65:0x0166, B:67:0x0180), top: B:110:0x0166 }] */
        /* JADX WARN: Code duplicated, block: B:71:0x019f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:72:0x01a0  */
        /* JADX WARN: Code duplicated, block: B:75:0x01aa A[Catch: Exception -> 0x01e3, TryCatch #6 {Exception -> 0x01e3, blocks: (B:73:0x01a4, B:75:0x01aa, B:77:0x01c0), top: B:116:0x01a4 }] */
        /* JADX WARN: Code duplicated, block: B:76:0x01bc  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01a0 -> B:116:0x01a4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01bc -> B:77:0x01c0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x01d2 -> B:89:0x01ef). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x01e3 -> B:88:0x01ee). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 591
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.TransactionEventManager.C38681.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public TransactionEventManager(l0 l0Var, BillingClientAdapter billingClientAdapter, GetTransactionData getTransactionData, GetTransactionRequest getTransactionRequest, TransactionEventRepository transactionEventRepository, ByteStringDataSource byteStringDataSource, IsBillingClientAvailable isBillingClientAvailable, SessionRepository sessionRepository, ProductDetailsFetcher productDetailsFetcher, Logger logger) {
        ck.p.j(l0Var, "scope");
        ck.p.j(getTransactionData, "getTransactionData");
        ck.p.j(getTransactionRequest, "getTransactionRequest");
        ck.p.j(transactionEventRepository, "transactionEventRepository");
        ck.p.j(byteStringDataSource, "iapTransactionStore");
        ck.p.j(isBillingClientAvailable, "isBillingClientAvailable");
        ck.p.j(sessionRepository, "sessionRepository");
        ck.p.j(productDetailsFetcher, "productDetailsFetcher");
        ck.p.j(logger, "logger");
        this.scope = l0Var;
        this.billingClientAdapter = billingClientAdapter;
        this.getTransactionData = getTransactionData;
        this.getTransactionRequest = getTransactionRequest;
        this.transactionEventRepository = transactionEventRepository;
        this.iapTransactionStore = byteStringDataSource;
        this.isBillingClientAvailable = isBillingClientAvailable;
        this.sessionRepository = sessionRepository;
        this.productDetailsFetcher = productDetailsFetcher;
        this.logger = logger;
    }

    public final void invoke() {
        if (!this.isBillingClientAvailable.invoke() || this.billingClientAdapter == null) {
            Logger.DefaultImpls.trace$default(this.logger, BILLING_SERVICE_UNAVAILABLE, null, 2, null);
        } else {
            j.d(this.scope, null, null, new AnonymousClass1(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPurchasesReceived(BillingResultBridge billingResultBridge, List<? extends PurchaseBridge> list, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin) {
        boolean z10;
        if (billingResultBridge.getResponseCode() == BillingResultResponseCode.OK) {
            if (list != null && !list.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10 && this.billingClientAdapter != null) {
                j.d(this.scope, null, null, new C38681(list, this, transactionOrigin, null), 3, null);
            }
        }
    }
}
