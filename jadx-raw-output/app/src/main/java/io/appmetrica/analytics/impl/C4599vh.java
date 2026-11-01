package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.DefaultNetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.SendingDataTaskHelper;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4599vh implements UnderlyingNetworkTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f57821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f57822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4365m7 f57823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4316k9 f57824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M6 f57825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f57826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f57827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f57828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f57829i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C4574uh f57830j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C4052a3 f57831k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PublicLogger f57832l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final yo f57833m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Sa f57834n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C4066ah f57835o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FullUrlFormer f57836p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C4693zb f57837q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RequestDataHolder f57838r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ResponseDataHolder f57839s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SendingDataTaskHelper f57840t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f57841u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f57842v;

    public C4599vh(@NonNull Y4 y10, @NonNull C4066ah c4066ah, @NonNull C4693zb c4693zb, @NonNull FullUrlFormer<C4350lh> fullUrlFormer, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this(y10, c4066ah, c4693zb, fullUrlFormer, requestDataHolder, responseDataHolder, y10.i(), y10.p(), y10.u(), requestBodyEncrypter);
    }

    public final C4316k9 a(C4574uh c4574uh, List list, C4350lh c4350lh) {
        C4316k9 c4316k9 = new C4316k9();
        C4110c9 c4110c9 = new C4110c9();
        c4110c9.f56470a = WrapUtils.getOrDefaultIfEmpty(this.f57823c.f57252b, c4350lh.getUuid());
        c4110c9.f56471b = WrapUtils.getOrDefaultIfEmpty(this.f57823c.f57251a, c4350lh.getDeviceId());
        this.f57827g = CodedOutputByteBufferNano.computeMessageSize(4, c4110c9) + this.f57827g;
        c4316k9.f57089b = c4110c9;
        C4456pn c4456pnC = C4418oa.I.C();
        C4524sh c4524sh = new C4524sh(this, c4316k9);
        synchronized (c4456pnC) {
            c4456pnC.f57527a.a(c4524sh);
        }
        c4316k9.f57088a = (C4239h9[]) c4574uh.f57771a.toArray(new C4239h9[0]);
        c4316k9.f57090c = a(c4574uh.f57773c);
        c4316k9.f57092e = (String[]) list.toArray(new String[0]);
        Set set = c4350lh.f57220x;
        String[] strArr = (String[]) set.toArray(new String[0]);
        c4316k9.f57093f = new byte[strArr.length][];
        for (int i10 = 0; i10 < set.size(); i10++) {
            c4316k9.f57093f[i10] = StringUtils.getUTF8Bytes(strArr[i10]);
        }
        return c4316k9;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z10) {
        String strA;
        if (z10) {
            a(false);
        } else if (this.f57839s.getResponseCode() == 400) {
            a(true);
        }
        if (z10) {
            for (int i10 = 0; i10 < this.f57830j.f57771a.size(); i10++) {
                for (C4187f9 c4187f9 : ((C4239h9) this.f57830j.f57771a.get(i10)).f56899c) {
                    if (c4187f9 != null && (strA = Rf.a(c4187f9)) != null) {
                        this.f57832l.info(strA, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(@Nullable Throwable th2) {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f57842v = true;
        this.f57821a.f56203e.a();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        this.f57842v = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final String description() {
        return "ReportTask_" + ApiKeyUtils.createPartialApiKey(this.f57821a.f56200b.f55817b);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f57836p;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final RequestDataHolder getRequestDataHolder() {
        return this.f57838r;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f57839s;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @Nullable
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C4350lh) this.f57821a.f56209k.a()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        ((Bl) C4418oa.I.z()).getClass();
        return null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onCreateTask() {
        Cursor cursorRawQuery;
        int iOptInt;
        M6 m10 = this.f57821a.f56203e;
        m10.getClass();
        ArrayList arrayList = new ArrayList();
        m10.f55549a.lock();
        try {
            SQLiteDatabase readableDatabase = m10.f55551c.getReadableDatabase();
            if (readableDatabase != null) {
                cursorRawQuery = readableDatabase.rawQuery(AbstractC4587v5.f57793b, null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues);
                        arrayList.add(contentValues);
                    } catch (Throwable unused) {
                        try {
                            arrayList = new ArrayList();
                            mo.a(cursorRawQuery);
                            m10.f55549a.unlock();
                        } catch (Throwable th2) {
                            mo.a(cursorRawQuery);
                            m10.f55549a.unlock();
                            throw th2;
                        }
                    }
                }
            } else {
                cursorRawQuery = null;
            }
            mo.a(cursorRawQuery);
            m10.f55549a.unlock();
        } catch (Throwable unused2) {
            cursorRawQuery = null;
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        ContentValues contentValues2 = (ContentValues) arrayList.get(0);
        this.f57822b.clear();
        for (Map.Entry<String, Object> entry : contentValues2.valueSet()) {
            this.f57822b.put(entry.getKey(), entry.getValue().toString());
        }
        String asString = contentValues2.getAsString("report_request_parameters");
        if (TextUtils.isEmpty(asString)) {
            C4365m7 c4365m7 = new C4365m7();
            this.f57823c = c4365m7;
            this.f57835o.f56375c = c4365m7;
        } else {
            try {
                C4365m7 c4365m8 = new C4365m7(new C4215gb(asString));
                this.f57823c = c4365m8;
                this.f57835o.f56375c = c4365m8;
            } catch (Throwable unused3) {
                C4365m7 c4365m9 = new C4365m7();
                this.f57823c = c4365m9;
                this.f57835o.f56375c = c4365m9;
            }
        }
        C4350lh config = this.f57837q.getConfig();
        List list = config.f57219w;
        if (mo.a((Collection) list)) {
            return false;
        }
        this.f57836p.setHosts(config.f57213q);
        if (!config.u() || mo.a((Collection) this.f57836p.getAllHosts())) {
            this.f57842v = true;
            return false;
        }
        this.f57826f = null;
        C4574uh c4574uhA = a(config);
        this.f57830j = c4574uhA;
        if (c4574uhA.f57771a.isEmpty()) {
            return false;
        }
        yo yoVar = this.f57833m;
        synchronized (yoVar) {
            iOptInt = yoVar.f58037a.a().optInt("report_request_id", -1);
        }
        int i10 = iOptInt + 1;
        this.f57841u = i10;
        this.f57835o.f56377e = i10;
        C4316k9 c4316k9A = a(this.f57830j, list, config);
        this.f57824d = c4316k9A;
        this.f57826f = this.f57830j.f57772b;
        this.f57840t.prepareAndSetPostData(MessageNano.toByteArray(c4316k9A));
        return true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.f57840t.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        return this.f57840t.isResponseValid();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
        ((C4338l5) this.f57821a.f56214p).f57174d.set(false);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
        this.f57821a.f56203e.a();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
        ((C4338l5) this.f57821a.f56214p).f57174d.set(true);
        if (this.f57842v) {
            ((C4338l5) this.f57821a.f56214p).f();
        }
    }

    public C4599vh(Y4 y10, C4066ah c4066ah, C4693zb c4693zb, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, M6 m10, PublicLogger publicLogger, yo yoVar, RequestBodyEncrypter requestBodyEncrypter) {
        this(y10, publicLogger, m10, c4066ah, yoVar, c4693zb, new C4052a3(1024000, "event value in ReportTask", publicLogger), AbstractC4658y1.a(), fullUrlFormer, requestDataHolder, responseDataHolder, requestBodyEncrypter);
    }

    public C4599vh(Y4 y10, PublicLogger publicLogger, M6 m10, C4066ah c4066ah, yo yoVar, C4693zb c4693zb, C4052a3 c4052a3, Rj rj2, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this.f57822b = new LinkedHashMap();
        this.f57827g = 0;
        this.f57828h = 0;
        this.f57829i = -1;
        this.f57842v = false;
        this.f57840t = new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.f57835o = c4066ah;
        this.f57821a = y10;
        this.f57825e = m10;
        this.f57832l = publicLogger;
        this.f57831k = c4052a3;
        this.f57833m = yoVar;
        this.f57837q = c4693zb;
        this.f57834n = rj2;
        this.f57838r = requestDataHolder;
        this.f57839s = responseDataHolder;
        this.f57836p = fullUrlFormer;
    }

    public static Z8[] a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        Z8[] z8Arr = new Z8[length];
        Iterator<String> itKeys = jSONObject.keys();
        int i10 = 0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Z8 z10 = new Z8();
                z10.f56275a = next;
                z10.f56276b = jSONObject.getString(next);
                z8Arr[i10] = z10;
            } catch (Throwable unused) {
            }
            i10++;
        }
        return z8Arr;
    }

    public final void a(boolean z10) {
        yo yoVar = this.f57833m;
        int i10 = this.f57841u;
        synchronized (yoVar) {
            zo zoVar = yoVar.f58037a;
            zoVar.a(zoVar.a().put("report_request_id", i10));
        }
        C4239h9[] c4239h9Arr = this.f57824d.f57088a;
        for (int i11 = 0; i11 < c4239h9Arr.length; i11++) {
            try {
                C4239h9 c4239h9 = c4239h9Arr[i11];
                long jLongValue = ((Long) this.f57826f.get(i11)).longValue();
                Wk wk2 = (Wk) Qf.f55799b.get(c4239h9.f56898b.f56805c);
                if (wk2 == null) {
                    wk2 = Wk.FOREGROUND;
                }
                this.f57825e.a(jLongValue, wk2.f56124a, c4239h9.f56899c.length, z10);
                Qf.a(c4239h9);
            } catch (Throwable unused) {
            }
        }
        M6 m10 = this.f57825e;
        long jA = this.f57821a.f56208j.a();
        m10.f55550b.lock();
        try {
            if (AbstractC4637x5.f57913a.booleanValue()) {
                m10.d();
            }
            SQLiteDatabase writableDatabase = m10.f55551c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("sessions", AbstractC4587v5.f57794c, new String[]{String.valueOf(jA)});
            }
        } catch (Throwable unused2) {
        }
        m10.f55550b.unlock();
    }

    @NonNull
    public final C4574uh a(@NonNull C4350lh c4350lh) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList3 = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor cursorA = a();
            if (cursorA != null) {
                JSONObject jSONObject2 = jSONObject;
                C4256i0 c4256i0 = null;
                while (cursorA.moveToNext() && this.f57828h < 100) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(cursorA, contentValues);
                        C4539t7 model = new C4564u7(null, 1, null).toModel(contentValues);
                        Long l10 = model.f57703a;
                        if (l10 != null) {
                            C4514s7 c4514s7 = model.f57706d;
                            C4290j9 c4290j9A = Qf.a(c4514s7.f57651a, c4514s7.f57652b, c4514s7.f57653c);
                            String locale = c4350lh.getLocale();
                            Wk wk2 = model.f57704b;
                            C4213g9 c4213g9 = new C4213g9();
                            c4213g9.f56803a = c4290j9A;
                            c4213g9.f56804b = locale;
                            if (wk2 != null) {
                                Integer num = (Integer) Qf.f55798a.get(wk2);
                                c4213g9.f56805c = num != null ? num.intValue() : 0;
                            }
                            int iComputeUInt64Size = this.f57827g + CodedOutputByteBufferNano.computeUInt64Size(1, Long.MAX_VALUE);
                            this.f57827g = iComputeUInt64Size;
                            int iComputeMessageSize = iComputeUInt64Size + CodedOutputByteBufferNano.computeMessageSize(2, c4213g9);
                            this.f57827g = iComputeMessageSize;
                            if (iComputeMessageSize >= 250880) {
                                break;
                            }
                            C4549th c4549thA = a(l10.longValue(), c4213g9, c4350lh, arrayList3, arrayList.size());
                            if (c4549thA == null) {
                                continue;
                            } else {
                                if (c4256i0 == null) {
                                    c4256i0 = c4549thA.f57732b;
                                } else {
                                    if (!c4256i0.equals(c4549thA.f57732b)) {
                                        break;
                                    }
                                    break;
                                }
                                arrayList2.add(l10);
                                arrayList.add(c4549thA.f57731a);
                                if (!TextUtils.isEmpty(c4549thA.f57732b.f56933a)) {
                                    try {
                                        jSONObject2 = new JSONObject(c4549thA.f57732b.f56933a);
                                    } catch (Throwable unused) {
                                    }
                                }
                                if (c4549thA.f57733c) {
                                    break;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorA;
                        jSONObject = jSONObject2;
                        try {
                            arrayList3.add(th);
                            mo.a(cursor);
                        } catch (Throwable th3) {
                            mo.a(cursor);
                            throw th3;
                        }
                    }
                }
                jSONObject = jSONObject2;
            }
            mo.a(cursorA);
        } catch (Throwable th4) {
            th = th4;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            this.f57834n.reportError("protobuf_serialization_error", (Throwable) it.next());
        }
        return new C4574uh(arrayList, arrayList2, jSONObject);
    }

    public static C4256i0 a(ContentValues contentValues) {
        C4185f7 model = new C4211g7(null, 1, null).toModel(contentValues);
        return new C4256i0((String) WrapUtils.getOrDefault(model.f56721g.f56645g, ""), ((Long) WrapUtils.getOrDefault(model.f56721g.f56646h, 0L)).longValue());
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00f7 A[Catch: all -> 0x010c, TRY_LEAVE, TryCatch #4 {all -> 0x010c, blocks: (B:7:0x0025, B:8:0x002b, B:10:0x0033, B:12:0x0039, B:28:0x006c, B:30:0x0072, B:39:0x0094, B:44:0x00a4, B:46:0x00b3, B:53:0x00bf, B:52:0x00be, B:49:0x00b9, B:54:0x00c5, B:57:0x00d7, B:60:0x00de, B:41:0x009d, B:65:0x00f1, B:67:0x00f7, B:63:0x00e6, B:26:0x0066), top: B:90:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x010e  */
    public final C4549th a(long j10, C4213g9 c4213g9, C4350lh c4350lh, ArrayList arrayList, int i10) {
        Cursor cursorA;
        C4549th c4549th;
        C4187f9 c4187f9A;
        int iComputeMessageSize;
        V8 v10;
        C4239h9 c4239h9 = new C4239h9();
        c4239h9.f56897a = j10;
        c4239h9.f56898b = c4213g9;
        Wk wk2 = (Wk) Qf.f55799b.get(c4213g9.f56805c);
        if (wk2 == null) {
            wk2 = Wk.FOREGROUND;
        }
        try {
            cursorA = a(j10, wk2);
            if (cursorA != null) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    C4256i0 c4256i0 = null;
                    while (true) {
                        boolean z10 = true;
                        if (cursorA.moveToNext() && this.f57828h < 100) {
                            ContentValues contentValues = new ContentValues();
                            DBUtils.cursorRowToContentValues(cursorA, contentValues);
                            try {
                                O8 o10 = new O8(contentValues);
                                EnumC4112cb enumC4112cb = o10.f55680h;
                                if (enumC4112cb != null) {
                                    v10 = (V8) Qf.f55801d.get(enumC4112cb);
                                } else {
                                    Map map = Qf.f55798a;
                                    v10 = null;
                                }
                                if (v10 == null) {
                                    v10 = V8.f56011i;
                                }
                                try {
                                    c4187f9A = v10.a(o10, c4350lh);
                                } catch (Throwable th2) {
                                    th = th2;
                                    arrayList.add(th);
                                    c4187f9A = null;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            if (c4187f9A != null) {
                                C4256i0 c4256i0A = a(contentValues);
                                if (c4256i0 == null) {
                                    if (this.f57829i < 0) {
                                        try {
                                            Z8[] z8ArrA = a(new JSONObject(c4256i0A.f56933a));
                                            if (z8ArrA != null) {
                                                iComputeMessageSize = 0;
                                                for (Z8 z11 : z8ArrA) {
                                                    iComputeMessageSize += CodedOutputByteBufferNano.computeMessageSize(7, z11);
                                                }
                                            } else {
                                                iComputeMessageSize = 0;
                                            }
                                        } catch (Throwable unused) {
                                        }
                                        this.f57829i = iComputeMessageSize;
                                        this.f57827g += iComputeMessageSize;
                                    }
                                    c4256i0 = c4256i0A;
                                } else {
                                    if (!c4256i0.equals(c4256i0A)) {
                                    }
                                    if (arrayList2.size() > 0) {
                                        c4239h9.f56899c = (C4187f9[]) arrayList2.toArray(new C4187f9[arrayList2.size()]);
                                        c4549th = new C4549th(c4239h9, c4256i0, z10);
                                    } else {
                                        c4549th = null;
                                    }
                                }
                                C4052a3 c4052a3 = this.f57831k;
                                byte[] bArr = c4187f9A.f56738e;
                                c4052a3.getClass();
                                byte[] bArrA = c4052a3.a(bArr);
                                byte[] bArr2 = c4187f9A.f56738e;
                                if (bArr2 != bArrA) {
                                    c4187f9A.f56742i = ((bArr2 == null ? 0 : bArr2.length) - (bArrA == null ? 0 : bArrA.length)) + c4187f9A.f56742i;
                                    c4187f9A.f56738e = bArrA;
                                }
                                this.f57827g += CodedOutputByteBufferNano.computeMessageSize(3, c4187f9A);
                                if (arrayList2.isEmpty() && i10 == 0) {
                                    if (this.f57827g >= 1048576) {
                                    }
                                } else if (this.f57827g >= 250880) {
                                }
                            }
                            arrayList2.add(c4187f9A);
                            this.f57828h++;
                        }
                        z10 = false;
                        if (arrayList2.size() > 0) {
                            c4239h9.f56899c = (C4187f9[]) arrayList2.toArray(new C4187f9[arrayList2.size()]);
                            c4549th = new C4549th(c4239h9, c4256i0, z10);
                        } else {
                            c4549th = null;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        arrayList.add(th);
                        return null;
                    } finally {
                        mo.a(cursorA);
                    }
                }
            } else {
                c4549th = null;
            }
            mo.a(cursorA);
            return c4549th;
        } catch (Throwable th5) {
            th = th5;
            cursorA = null;
        }
    }

    public final Cursor a() {
        Cursor cursorQuery;
        M6 m10 = this.f57825e;
        LinkedHashMap linkedHashMap = this.f57822b;
        m10.f55549a.lock();
        try {
            SQLiteDatabase readableDatabase = m10.f55551c.getReadableDatabase();
            cursorQuery = readableDatabase != null ? readableDatabase.query("sessions", null, M6.a(linkedHashMap), M6.a(new String[]{Long.toString(0L)}, linkedHashMap), null, null, "id ASC", null) : null;
        } catch (Throwable unused) {
        }
        m10.f55549a.unlock();
        return cursorQuery;
    }

    public final Cursor a(long j10, Wk wk2) {
        Cursor cursorQuery;
        M6 m10 = this.f57825e;
        m10.f55549a.lock();
        try {
            SQLiteDatabase readableDatabase = m10.f55551c.getReadableDatabase();
            cursorQuery = readableDatabase != null ? readableDatabase.query("events", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j10), Integer.toString(wk2.f56124a)}, null, null, "number_in_session ASC", null) : null;
        } catch (Throwable unused) {
        }
        m10.f55549a.unlock();
        return cursorQuery;
    }
}
