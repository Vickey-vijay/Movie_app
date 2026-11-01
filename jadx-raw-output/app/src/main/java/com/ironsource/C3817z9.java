package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.z9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C3817z9 implements InterfaceC3563kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Db f31706a;

    /* JADX INFO: renamed from: com.ironsource.z9$a */
    public static final class a extends Lambda implements bk.a<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31707a = new a();

        public a() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3813z5.f31697a.b("Load task config is null");
        }
    }

    @Override // com.ironsource.InterfaceC3563kg
    public void a() {
        a(this.f31706a != null, a.f31707a);
    }

    public C3817z9(Db db2) {
        this.f31706a = db2;
    }
}
