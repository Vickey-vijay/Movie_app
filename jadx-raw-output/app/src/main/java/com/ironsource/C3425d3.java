package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3425d3 implements InterfaceC3563kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Db f28379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSize f28380b;

    /* JADX INFO: renamed from: com.ironsource.d3$a */
    public static final class a extends Lambda implements bk.a<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28381a = new a();

        public a() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3813z5.f31697a.a("Load task config is null");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d3$b */
    public static final class b extends Lambda implements bk.a<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f28382a = new b();

        public b() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3813z5.f31697a.l();
        }
    }

    @Override // com.ironsource.InterfaceC3563kg
    public void a() {
        a(this.f28379a != null, a.f28381a);
        a(this.f28380b != null, b.f28382a);
    }

    public C3425d3(Db db2, AdSize adSize) {
        this.f28379a = db2;
        this.f28380b = adSize;
    }
}
