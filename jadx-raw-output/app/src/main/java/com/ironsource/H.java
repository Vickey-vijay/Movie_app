package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.UUID;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC3757w0 f26682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NetworkSettings f26683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mj.g f26684c;

    public static final class a extends Lambda implements bk.a<BaseAdAdapter<?, ?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ W0 f26685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ H f26686b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(W0 w10, H h10) {
            super(0);
            this.f26685a = w10;
            this.f26686b = h10;
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseAdAdapter<?, ?> invoke() {
            return this.f26685a.a(this.f26686b.e(), this.f26686b.a(), this.f26686b.d());
        }
    }

    public H(W0 w10, AbstractC3757w0 abstractC3757w0, NetworkSettings networkSettings) {
        ck.p.j(w10, "adTools");
        ck.p.j(abstractC3757w0, "adUnitData");
        ck.p.j(networkSettings, "providerSettings");
        this.f26682a = abstractC3757w0;
        this.f26683b = networkSettings;
        this.f26684c = kotlin.b.a(new a(w10, this));
    }

    public final IronSource.a a() {
        return this.f26682a.b().a();
    }

    public final BaseAdAdapter<?, ?> b() {
        return (BaseAdAdapter) this.f26684c.getValue();
    }

    public final String c() {
        String providerName = this.f26683b.getProviderName();
        ck.p.i(providerName, "providerSettings.providerName");
        return providerName;
    }

    public final UUID d() {
        return this.f26682a.b().b();
    }

    public final NetworkSettings e() {
        return this.f26683b;
    }
}
