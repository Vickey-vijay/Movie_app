package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.k;
import com.applovin.impl.u4;
import com.applovin.impl.x4;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class e extends com.applovin.impl.sdk.network.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f9521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f9522t;

    public static class a extends com.applovin.impl.sdk.network.a.C0048a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private String f9523r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f9524s;

        @Override // com.applovin.impl.sdk.network.a.C0048a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(String str) {
            this.f9465c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0048a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(int i10) {
            this.f9472j = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0048a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(String str) {
            this.f9464b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0048a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(String str) {
            this.f9463a = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0048a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Map map) {
            this.f9466d = map;
            return this;
        }

        public a e(String str) {
            this.f9523r = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0048a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(int i10) {
            this.f9471i = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0048a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(boolean z10) {
            this.f9476n = z10;
            return this;
        }

        public a h(boolean z10) {
            this.f9524s = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0048a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(boolean z10) {
            this.f9478p = z10;
            return this;
        }

        public a(k kVar) {
            super(kVar);
            this.f9470h = ((Integer) kVar.a(x4.H2)).intValue();
            this.f9471i = ((Integer) kVar.a(x4.G2)).intValue();
            this.f9472j = ((Integer) kVar.a(x4.S2)).intValue();
        }

        @Override // com.applovin.impl.sdk.network.a.C0048a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Map map) {
            this.f9467e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0048a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(int i10) {
            this.f9470h = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0048a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(JSONObject jSONObject) {
            this.f9468f = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0048a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            this.f9469g = obj;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0048a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(u4.a aVar) {
            this.f9479q = aVar;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0048a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a() {
            return new e(this);
        }
    }

    public static a b(k kVar) {
        return new a(kVar);
    }

    public String s() {
        return this.f9521s;
    }

    public boolean t() {
        return this.f9521s != null;
    }

    public boolean u() {
        return this.f9522t;
    }

    public e(a aVar) {
        super(aVar);
        this.f9521s = aVar.f9523r;
        this.f9522t = aVar.f9524s;
    }
}
