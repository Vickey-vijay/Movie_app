package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.idsync.internal.model.NetworkType;
import io.appmetrica.analytics.idsync.internal.model.Preconditions;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import nj.b0;
import nj.l0;

/* JADX INFO: loaded from: classes10.dex */
public final class x implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m fromModel(RequestConfig requestConfig) {
        m mVar = new m();
        String type = requestConfig.getType();
        Charset charset = lk.c.f63591b;
        mVar.f54891a = type.getBytes(charset);
        l lVar = new l();
        lVar.f54889a = w.f54917a[requestConfig.getPreconditions().getNetworkType().ordinal()] != 1 ? 0 : 1;
        mVar.f54892b = lVar;
        mVar.f54893c = requestConfig.getUrl().getBytes(charset);
        Map<String, List<String>> headers = requestConfig.getHeaders();
        ArrayList arrayList = new ArrayList(headers.size());
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            k kVar = new k();
            kVar.f54886a = key.getBytes(lk.c.f63591b);
            int size = value.size();
            byte[][] bArr = new byte[size][];
            for (int i10 = 0; i10 < size; i10++) {
                bArr[i10] = value.get(i10).getBytes(lk.c.f63591b);
            }
            kVar.f54887b = bArr;
            arrayList.add(kVar);
        }
        Object[] array = arrayList.toArray(new k[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        mVar.f54894d = (k[]) array;
        mVar.f54895e = requestConfig.getResendIntervalForValidResponse();
        mVar.f54896f = requestConfig.getResendIntervalForInvalidResponse();
        mVar.f54897g = b0.N0(requestConfig.getValidResponseCodes());
        return mVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RequestConfig toModel(m mVar) {
        NetworkType networkType;
        byte[] bArr = mVar.f54891a;
        Charset charset = lk.c.f63591b;
        String str = new String(bArr, charset);
        l lVar = mVar.f54892b;
        if (lVar == null) {
            networkType = NetworkType.ANY;
        } else {
            if (lVar.f54889a == 1) {
                networkType = NetworkType.CELL;
            } else {
                networkType = NetworkType.ANY;
            }
            if (networkType == null) {
                networkType = NetworkType.ANY;
            }
        }
        Preconditions preconditions = new Preconditions(networkType);
        String str2 = new String(mVar.f54893c, charset);
        k[] kVarArr = mVar.f54894d;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ik.k.d(l0.f(kVarArr.length), 16));
        for (k kVar : kVarArr) {
            String str3 = new String(kVar.f54886a, lk.c.f63591b);
            byte[][] bArr2 = kVar.f54887b;
            ArrayList arrayList = new ArrayList(bArr2.length);
            for (byte[] bArr3 : bArr2) {
                arrayList.add(new String(bArr3, lk.c.f63591b));
            }
            Pair pairA = mj.h.a(str3, arrayList);
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        return new RequestConfig(str, str2, preconditions, linkedHashMap, mVar.f54895e, mVar.f54896f, nj.n.p0(mVar.f54897g));
    }
}
