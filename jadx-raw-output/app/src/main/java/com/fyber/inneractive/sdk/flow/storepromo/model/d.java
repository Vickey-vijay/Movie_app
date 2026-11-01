package com.fyber.inneractive.sdk.flow.storepromo.model;

import com.fyber.inneractive.sdk.util.h;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15679c;

    public d(String str, String str2, String str3) {
        String str4;
        this.f15679c = "";
        this.f15677a = str;
        this.f15678b = str2;
        h hVar = new h(str3);
        Long l10 = hVar.f18582a;
        if (l10 == null) {
            str4 = "N/A";
        } else {
            double dLongValue = l10.longValue() / 1024.0d;
            double d10 = dLongValue / 1024.0d;
            double d11 = d10 / 1024.0d;
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String str5 = decimalFormat.format(hVar.f18582a) + " bytes";
            if (d10 > 850.0d) {
                str4 = decimalFormat.format(d11) + " GB";
            } else if (dLongValue > 850.0d) {
                str4 = decimalFormat.format(d10) + " MB";
            } else if (hVar.f18582a.longValue() > 850) {
                str4 = decimalFormat.format(dLongValue) + " kB";
            } else {
                str4 = str5;
            }
        }
        this.f15679c = str4;
    }
}
