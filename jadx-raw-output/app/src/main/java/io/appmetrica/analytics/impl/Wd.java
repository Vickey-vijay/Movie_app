package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.network.UserAgent;
import io.appmetrica.analytics.networktasks.internal.AESRSARequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class Wd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Wd f56086a = new Wd();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f56087b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f56088c = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "7.14.0", "50145656");

    public final synchronized ExponentialBackoffDataHolder a(Ud ud2) {
        Object exponentialBackoffDataHolder;
        LinkedHashMap linkedHashMap = f56087b;
        exponentialBackoffDataHolder = linkedHashMap.get(ud2);
        if (exponentialBackoffDataHolder == null) {
            exponentialBackoffDataHolder = new ExponentialBackoffDataHolder(new C4642xa(C4418oa.I.y(), ud2), ud2.name());
            linkedHashMap.put(ud2, exponentialBackoffDataHolder);
        }
        return (ExponentialBackoffDataHolder) exponentialBackoffDataHolder;
    }

    public static final NetworkTask a(Y4 y10) {
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        C4066ah c4066ah = new C4066ah(aESRSARequestBodyEncrypter);
        C4693zb c4693zb = new C4693zb(y10);
        return new NetworkTask(new BlockingExecutor(), new C4463q5(y10.f56199a), new AllHostsExponentialBackoffPolicy(f56086a.a(Ud.REPORT)), new C4599vh(y10, c4066ah, c4693zb, new FullUrlFormer(c4066ah, c4693zb), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), y10.i(), y10.p(), y10.u(), aESRSARequestBodyEncrypter), nj.r.e(new lo()), f56088c);
    }
}
