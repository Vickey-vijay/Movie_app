package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class Rn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hn f55830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f55831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f55832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f55834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f55835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f55836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f55837h;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Hn hn2 = this.f55830a;
        if (hn2 != null) {
            for (El el2 : hn2.f55327c) {
                sb2.append("at " + el2.f55201a + "." + el2.f55205e + "(" + el2.f55202b + StringUtils.PROCESS_POSTFIX_DELIMITER + el2.f55203c + StringUtils.PROCESS_POSTFIX_DELIMITER + el2.f55204d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f55830a + "\n" + sb2.toString() + '}';
    }

    public Rn(Hn hn2, V v10, ArrayList arrayList, String str, String str2, Map map, String str3, Boolean bool) {
        this.f55830a = hn2;
        this.f55831b = v10;
        this.f55832c = arrayList;
        this.f55833d = str;
        this.f55834e = str2;
        this.f55835f = map;
        this.f55836g = str3;
        this.f55837h = bool;
    }
}
