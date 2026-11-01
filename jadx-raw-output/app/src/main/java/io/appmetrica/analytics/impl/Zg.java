package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes8.dex */
public final class Zg implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        TimePassedChecker timePassedChecker = new TimePassedChecker();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        C4064af c4064afY = C4418oa.I.y();
        if (timePassedChecker.didTimePassMillis(c4064afY.f(), TimeUnit.DAYS.toMillis(1L), "[ReportKotlinVersionTask]")) {
            KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(kotlinVersion.getMajor());
            sb2.append('.');
            sb2.append(kotlinVersion.getMinor());
            sb2.append('.');
            sb2.append(kotlinVersion.getPatch());
            Map mapM = kotlin.collections.a.m(mj.h.a("major", Integer.valueOf(kotlinVersion.getMajor())), mj.h.a("minor", Integer.valueOf(kotlinVersion.getMinor())), mj.h.a("patch", Integer.valueOf(kotlinVersion.getPatch())), mj.h.a("version", sb2.toString()));
            Rj rj2 = AbstractC4452pj.f57520a;
            rj2.getClass();
            rj2.a(new Qj("kotlin_version", mapM));
            c4064afY.c(systemTimeProvider.currentTimeMillis()).b();
        }
    }
}
