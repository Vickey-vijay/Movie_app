package com.unity3d.ads.core.extensions;

import ck.p;
import kotlin.time.DurationUnit;
import mk.b;
import mk.i;

/* JADX INFO: compiled from: TimeExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TimeExtensionsKt {
    public static final double elapsedMillis(i iVar) {
        p.j(iVar, "<this>");
        return b.G(iVar.a(), DurationUnit.MILLISECONDS);
    }
}
