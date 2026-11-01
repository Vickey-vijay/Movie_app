package com.ironsource.mediationsdk.demandOnly;

/* JADX INFO: loaded from: classes5.dex */
public interface p {

    public static class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29767a;

        public a(String str) {
            ck.p.j(str, "plumbus");
            this.f29767a = str;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.p
        public String value() {
            return this.f29767a;
        }
    }

    public static final class b extends a {
        public b() {
            super("");
        }
    }

    String value();
}
