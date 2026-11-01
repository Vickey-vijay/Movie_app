package io.appmetrica.analytics.impl;

import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4286j5 implements ModuleAdRevenueProcessor, ModuleAdRevenueProcessorsHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f56994a = new ArrayList();

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final String getDescription() {
        return nj.b0.p0(this.f56994a, null, "Composite processor with " + this.f56994a.size() + " children: [", C3426d4.j.f28588e, 0, null, C4261i5.f56944a, 25, null);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder
    public final void register(ModuleAdRevenueProcessor moduleAdRevenueProcessor) {
        this.f56994a.add(moduleAdRevenueProcessor);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        Object next;
        boolean z10;
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Processing Ad Revenue for " + Arrays.toString(objArr), new Object[0]);
        Iterator it = this.f56994a.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                ModuleAdRevenueProcessor moduleAdRevenueProcessor = (ModuleAdRevenueProcessor) next;
                try {
                    boolean zProcess = moduleAdRevenueProcessor.process(Arrays.copyOf(objArr, objArr.length));
                    if (!zProcess) {
                        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue was not processed by " + moduleAdRevenueProcessor.getDescription(), new Object[0]);
                    }
                    if (zProcess) {
                        break;
                    }
                } catch (Throwable th2) {
                    LoggerStorage.getMainPublicOrAnonymousLogger().error(th2, "Got exception from processor " + moduleAdRevenueProcessor.getDescription(), new Object[0]);
                }
            } else {
                next = null;
                break;
            }
        }
        if (((ModuleAdRevenueProcessor) next) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue was not processed by " + getDescription() + " since processor for " + Arrays.toString(objArr) + " was not found", new Object[0]);
        }
        return z10;
    }
}
