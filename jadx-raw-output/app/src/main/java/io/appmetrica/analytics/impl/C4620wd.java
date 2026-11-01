package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4620wd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f57881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final La f57882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4666y9 f57883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Be f57884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qo f57885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile IdentifiersResult f57886f;

    public C4620wd(Context context, La la2) {
        this(context, la2, AbstractC4645xd.a(context), new Be(context), new qo());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:10:0x0019, B:12:0x0029, B:14:0x002f, B:17:0x003d, B:19:0x0056, B:20:0x0064, B:22:0x006f), top: B:34:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0056 A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:10:0x0019, B:12:0x0029, B:14:0x002f, B:17:0x003d, B:19:0x0056, B:20:0x0064, B:22:0x006f), top: B:34:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x006f A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #1 {all -> 0x0079, blocks: (B:10:0x0019, B:12:0x0029, B:14:0x002f, B:17:0x003d, B:19:0x0056, B:20:0x0064, B:22:0x006f), top: B:34:0x0019 }] */
    public final IdentifiersResult a() {
        String strA;
        IdentifiersResult identifiersResult = this.f57886f;
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            qo qoVar = this.f57885e;
            String str = identifiersResult.f58084id;
            qoVar.getClass();
            if (qo.a(str)) {
                return identifiersResult;
            }
        }
        try {
            C4666y9 c4666y9 = this.f57883c;
            c4666y9.f58017a.lock();
            c4666y9.f58018b.a();
            identifiersResult = this.f57886f;
            if (identifiersResult == null || identifiersResult.status != IdentifierStatus.OK) {
                strA = Ka.a(FileUtils.getFileFromSdkStorage(this.f57884d.f55027a, "uuid.dat"));
                this.f57885e.getClass();
                if (!qo.a(strA)) {
                    strA = this.f57884d.a(this.f57882b.a(this.f57881a));
                }
                this.f57885e.getClass();
                if (qo.a(strA)) {
                    IdentifiersResult identifiersResult2 = new IdentifiersResult(strA, IdentifierStatus.OK, null);
                    try {
                        this.f57886f = identifiersResult2;
                    } catch (Throwable unused) {
                    }
                    identifiersResult = identifiersResult2;
                }
            } else {
                qo qoVar2 = this.f57885e;
                String str2 = identifiersResult.f58084id;
                qoVar2.getClass();
                if (!qo.a(str2)) {
                    strA = Ka.a(FileUtils.getFileFromSdkStorage(this.f57884d.f55027a, "uuid.dat"));
                    this.f57885e.getClass();
                    if (!qo.a(strA)) {
                        strA = this.f57884d.a(this.f57882b.a(this.f57881a));
                    }
                    this.f57885e.getClass();
                    if (qo.a(strA)) {
                        IdentifiersResult identifiersResult3 = new IdentifiersResult(strA, IdentifierStatus.OK, null);
                        this.f57886f = identifiersResult3;
                        identifiersResult = identifiersResult3;
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        C4666y9 c4666y10 = this.f57883c;
        c4666y10.f58018b.b();
        c4666y10.f58017a.unlock();
        return identifiersResult != null ? identifiersResult : new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "Uuid must be obtained via async API AppMetrica#requestStartupParams(Context, StartupParamsCallback, List<String>)");
    }

    public C4620wd(Context context, La la2, C4666y9 c4666y9, Be be2, qo qoVar) {
        this.f57881a = context;
        this.f57882b = la2;
        this.f57883c = c4666y9;
        this.f57884d = be2;
        this.f57885e = qoVar;
        try {
            c4666y9.a();
            be2.a();
            c4666y9.b();
        } catch (Throwable unused) {
            this.f57883c.b();
        }
    }
}
