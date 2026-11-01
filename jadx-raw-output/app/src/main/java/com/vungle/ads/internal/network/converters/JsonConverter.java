package com.vungle.ads.internal.network.converters;

import androidx.exifinterface.media.ExifInterface;
import bk.l;
import ck.p;
import cl.a;
import cl.d;
import cl.m;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import jk.n;
import kotlin.Metadata;
import mj.r;
import okhttp3.ResponseBody;
import xk.h;
import yj.b;

/* JADX INFO: compiled from: JsonConverter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\fB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/vungle/ads/internal/network/converters/JsonConverter;", ExifInterface.LONGITUDE_EAST, "Lcom/vungle/ads/internal/network/converters/Converter;", "Lokhttp3/ResponseBody;", "responseBody", "convert", "(Lokhttp3/ResponseBody;)Ljava/lang/Object;", "Ljk/n;", "kType", "Ljk/n;", "<init>", "(Ljk/n;)V", VastTagName.COMPANION, "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class JsonConverter<E> implements Converter<ResponseBody, E> {
    private static final a json = m.b(null, new l<d, r>() { // from class: com.vungle.ads.internal.network.converters.JsonConverter$Companion$json$1
        @Override // bk.l
        public /* bridge */ /* synthetic */ r invoke(d dVar) {
            invoke2(dVar);
            return r.f64562a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(d dVar) {
            p.j(dVar, "$this$Json");
            dVar.f(true);
            dVar.d(true);
            dVar.e(false);
            dVar.c(true);
        }
    }, 1, null);
    private final n kType;

    public JsonConverter(n nVar) {
        p.j(nVar, "kType");
        this.kType = nVar;
    }

    @Override // com.vungle.ads.internal.network.converters.Converter
    public E convert(ResponseBody responseBody) throws IOException {
        if (responseBody != null) {
            try {
                String strString = responseBody.string();
                if (strString != null) {
                    E e10 = (E) json.b(h.b(a.f6073d.a(), this.kType), strString);
                    b.a(responseBody, null);
                    return e10;
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(responseBody, th2);
                    throw th3;
                }
            }
        }
        b.a(responseBody, null);
        return null;
    }
}
