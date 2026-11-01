package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class Qd implements InterfaceC3563kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Db f27513a;

    public static final class a extends Lambda implements bk.a<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27514a = new a();

        public a() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3813z5.f31697a.d("Load task config is null");
        }
    }

    @Override // com.ironsource.InterfaceC3563kg
    public void a() {
        a(this.f27513a != null, a.f27514a);
    }

    public Qd(Db db2) {
        this.f27513a = db2;
    }
}
