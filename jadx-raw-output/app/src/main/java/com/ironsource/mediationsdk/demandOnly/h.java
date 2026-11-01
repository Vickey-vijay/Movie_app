package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import com.ironsource.InterfaceC3528j;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes5.dex */
public interface h extends q {

    public static abstract class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f29712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f29713c;

        @Override // com.ironsource.mediationsdk.demandOnly.q
        public abstract IronSourceError a();

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public String b() {
            return this.f29712b;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public boolean c() {
            return this.f29713c;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public String e() {
            return this.f29711a;
        }

        public a(String str, String str2, boolean z10) {
            this.f29711a = str;
            this.f29712b = str2;
            this.f29713c = z10;
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f29714d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Activity f29715e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ISDemandOnlyBannerLayout f29716f;

        public /* synthetic */ b(String str, Activity activity, String str2, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str3, boolean z10, int i10, ck.i iVar) {
            this(str, activity, str2, iSDemandOnlyBannerLayout, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? false : z10);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Activity activity, String str2, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str3, boolean z10) {
            super(str2, str3, z10);
            ck.p.j(str, "adFormat");
            this.f29714d = str;
            this.f29715e = activity;
            this.f29716f = iSDemandOnlyBannerLayout;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.q
        public IronSourceError a() {
            IronSourceError ironSourceErrorA = new q.a(this.f29714d).a(this);
            if (ironSourceErrorA != null) {
                return ironSourceErrorA;
            }
            return null;
        }

        public final Activity f() {
            return this.f29715e;
        }

        public final ISDemandOnlyBannerLayout g() {
            return this.f29716f;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f29717a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Activity f29718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f29719c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f29720d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f29721e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ISDemandOnlyBannerLayout f29722f;

        public final c a(IronSource.a aVar) {
            ck.p.j(aVar, "adFormat");
            String string = aVar.toString();
            ck.p.i(string, "adFormat.toString()");
            this.f29717a = string;
            return this;
        }

        public final c b(String str) {
            this.f29719c = str;
            return this;
        }

        public final c a(Activity activity) {
            this.f29718b = activity;
            return this;
        }

        public final d b() {
            return new d(this.f29717a, this.f29718b, this.f29719c, this.f29721e, this.f29720d);
        }

        public final c a(Activity activity, Activity activity2) {
            if (activity == null) {
                activity = activity2;
            }
            this.f29718b = activity;
            return this;
        }

        public final c a(boolean z10) {
            this.f29720d = z10;
            return this;
        }

        public final c a(String str) {
            this.f29721e = str;
            return this;
        }

        public final c a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
            this.f29722f = iSDemandOnlyBannerLayout;
            return this;
        }

        public final b a() {
            return new b(this.f29717a, this.f29718b, this.f29719c, this.f29722f, this.f29721e, this.f29720d);
        }
    }

    public static final class d extends a implements InterfaceC3528j {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f29723d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Activity f29724e;

        public /* synthetic */ d(String str, Activity activity, String str2, String str3, boolean z10, int i10, ck.i iVar) {
            this(str, activity, str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? false : z10);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Activity activity, String str2, String str3, boolean z10) {
            super(str2, str3, z10);
            ck.p.j(str, "adFormat");
            this.f29723d = str;
            this.f29724e = activity;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.q
        public IronSourceError a() {
            IronSourceError ironSourceErrorA = new q.b(this.f29723d).a(this);
            if (ironSourceErrorA != null) {
                return ironSourceErrorA;
            }
            return null;
        }

        @Override // com.ironsource.InterfaceC3528j
        public Activity d() {
            return this.f29724e;
        }
    }

    String b();

    boolean c();

    String e();
}
