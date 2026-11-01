package com.fyber.inneractive.sdk.config.global.features;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends com.fyber.inneractive.sdk.config.global.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f15091c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f15092d = new HashMap();

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public final String a(String str, String str2) {
        String strB;
        Iterator it = this.f15092d.keySet().iterator();
        do {
            if (!it.hasNext()) {
                strB = null;
                break;
            }
            strB = ((com.fyber.inneractive.sdk.config.global.k) this.f15092d.get((String) it.next())).b(str);
        } while (strB == null);
        if (strB != null) {
            return strB;
        }
        com.fyber.inneractive.sdk.config.global.n nVar = this.f15105a;
        return nVar != null ? nVar.a(str, str2) : str2;
    }

    public abstract h b();

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public final String b(String str) {
        return a(str, null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public final Boolean c(String str) {
        Boolean boolC;
        Iterator it = this.f15092d.keySet().iterator();
        while (it.hasNext()) {
            boolC = ((com.fyber.inneractive.sdk.config.global.k) this.f15092d.get((String) it.next())).c(str);
            if (boolC != null) {
                if (boolC == null) {
                    return super.c(str);
                }
                return boolC;
            }
        }
        boolC = null;
        if (boolC == null) {
            return super.c(str);
        }
        return boolC;
    }

    public final String toString() {
        return String.format("id: %s, params: %s exp: %s", this.f15090b, this.f15105a, this.f15091c);
    }

    public h(String str) {
        this.f15090b = str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public final Integer a(String str) {
        Integer numA;
        Iterator it = this.f15092d.keySet().iterator();
        while (it.hasNext()) {
            numA = ((com.fyber.inneractive.sdk.config.global.k) this.f15092d.get((String) it.next())).a(str);
            if (numA != null) {
                if (numA == null) {
                    return super.a(str);
                }
                return numA;
            }
        }
        numA = null;
        if (numA == null) {
            return super.a(str);
        }
        return numA;
    }

    public final void a(h hVar) {
        hVar.f15090b = this.f15090b;
        hVar.f15105a = this.f15105a;
        hVar.f15091c = new HashMap(this.f15091c);
        hVar.f15092d = new HashMap(this.f15092d);
    }
}
