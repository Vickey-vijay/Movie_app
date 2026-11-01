package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.InterfaceC3677r5;
import com.ironsource.Kb;

/* JADX INFO: loaded from: classes5.dex */
public interface o extends InterfaceC3677r5<String> {

    public static final class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29766a;

        public a(String str) {
            ck.p.j(str, "rowAdm");
            this.f29766a = str;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.o
        public <T> T a(Kb<String, T> kb2) {
            ck.p.j(kb2, "mapper");
            return kb2.a(this.f29766a);
        }

        @Override // com.ironsource.InterfaceC3677r5
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a() {
            return this.f29766a;
        }
    }

    <T> T a(Kb<String, T> kb2);
}
