package com.squareup.wire;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ProtoAdapter<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<Boolean> f45180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<Integer> f45181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<Integer> f45182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ProtoAdapter<Integer> f45183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ProtoAdapter<Integer> f45184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ProtoAdapter<Integer> f45185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ProtoAdapter<Long> f45186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ProtoAdapter<Long> f45187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ProtoAdapter<Long> f45188l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ProtoAdapter<Long> f45189m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ProtoAdapter<Long> f45190n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ProtoAdapter<Float> f45191o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ProtoAdapter<Double> f45192p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ProtoAdapter<String> f45193q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ProtoAdapter<ByteString> f45194r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FieldEncoding f45195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<?> f45196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ProtoAdapter<List<E>> f45197c;

    public static final class EnumConstantNotFoundException extends IllegalArgumentException {
        public final int value;

        public EnumConstantNotFoundException(int i10, Class<?> cls) {
            super("Unknown enum tag " + i10 + " for " + cls.getCanonicalName());
            this.value = i10;
        }
    }

    public class e extends ProtoAdapter<List<E>> {
        public e(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<E> c(ic.b bVar) throws IOException {
            return Collections.singletonList(ProtoAdapter.this.c(bVar));
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void g(ic.c cVar, List<E> list) {
            throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public int l(List<E> list) {
            throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(ic.c cVar, int i10, List<E> list) throws IOException {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                ProtoAdapter.this.k(cVar, i10, list.get(i11));
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public int m(int i10, List<E> list) {
            int size = list.size();
            int iM = 0;
            for (int i11 = 0; i11 < size; i11++) {
                iM += ProtoAdapter.this.m(i10, list.get(i11));
            }
            return iM;
        }
    }

    public static final class o<K, V> extends ProtoAdapter<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final ProtoAdapter<K> f45199s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final ProtoAdapter<V> f45200t;

        public o(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
            super(FieldEncoding.LENGTH_DELIMITED, null);
            this.f45199s = protoAdapter;
            this.f45200t = protoAdapter2;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> c(ic.b bVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void g(ic.c cVar, Map.Entry<K, V> entry) throws IOException {
            this.f45199s.k(cVar, 1, entry.getKey());
            this.f45200t.k(cVar, 2, entry.getValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Map.Entry<K, V> entry) {
            return this.f45199s.m(1, entry.getKey()) + this.f45200t.m(2, entry.getValue());
        }
    }

    public static final class p<K, V> extends ProtoAdapter<Map<K, V>> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final o<K, V> f45201s;

        public p(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
            super(FieldEncoding.LENGTH_DELIMITED, null);
            this.f45201s = new o<>(protoAdapter, protoAdapter2);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void g(ic.c cVar, Map<K, V> map) {
            throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public int l(Map<K, V> map) {
            throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Map<K, V> c(ic.b bVar) throws IOException {
            long jC = bVar.c();
            K kC = null;
            V vC = null;
            while (true) {
                int iF = bVar.f();
                if (iF == -1) {
                    break;
                }
                if (iF != 1) {
                    if (iF == 2) {
                        vC = this.f45201s.f45200t.c(bVar);
                    }
                } else {
                    kC = this.f45201s.f45199s.c(bVar);
                }
            }
            bVar.d(jC);
            if (kC != null) {
                if (vC != null) {
                    return Collections.singletonMap(kC, vC);
                }
                throw new IllegalStateException("Map entry with null value");
            }
            throw new IllegalStateException("Map entry with null key");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(ic.c cVar, int i10, Map<K, V> map) throws IOException {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                this.f45201s.k(cVar, i10, it.next());
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public int m(int i10, Map<K, V> map) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            int iM = 0;
            while (it.hasNext()) {
                iM += this.f45201s.m(i10, it.next());
            }
            return iM;
        }
    }

    public abstract E c(ic.b bVar) throws IOException;

    public abstract void g(ic.c cVar, E e10) throws IOException;

    public abstract int l(E e10);

    public class a extends ProtoAdapter<Float> {
        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Float f10) {
            return 4;
        }

        public a(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Float c(ic.b bVar) throws IOException {
            return Float.valueOf(Float.intBitsToFloat(bVar.i()));
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void g(ic.c cVar, Float f10) throws IOException {
            cVar.l(Float.floatToIntBits(f10.floatValue()));
        }
    }

    public class b extends ProtoAdapter<Double> {
        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Double d10) {
            return 8;
        }

        public b(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Double c(ic.b bVar) throws IOException {
            return Double.valueOf(Double.longBitsToDouble(bVar.j()));
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void g(ic.c cVar, Double d10) throws IOException {
            cVar.m(Double.doubleToLongBits(d10.doubleValue()));
        }
    }

    public class c extends ProtoAdapter<String> {
        public c(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public String c(ic.b bVar) throws IOException {
            return bVar.k();
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void g(ic.c cVar, String str) throws IOException {
            cVar.o(str);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(String str) {
            return ic.c.h(str);
        }
    }

    public class d extends ProtoAdapter<ByteString> {
        public d(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public ByteString c(ic.b bVar) throws IOException {
            return bVar.h();
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void g(ic.c cVar, ByteString byteString) throws IOException {
            cVar.k(byteString);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(ByteString byteString) {
            return byteString.size();
        }
    }

    public class f extends ProtoAdapter<Boolean> {
        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Boolean bool) {
            return 1;
        }

        public f(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Boolean c(ic.b bVar) throws IOException {
            int iL = bVar.l();
            if (iL == 0) {
                return Boolean.FALSE;
            }
            if (iL == 1) {
                return Boolean.TRUE;
            }
            throw new IOException(String.format("Invalid boolean value 0x%02x", Integer.valueOf(iL)));
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void g(ic.c cVar, Boolean bool) throws IOException {
            cVar.q(bool.booleanValue() ? 1 : 0);
        }
    }

    public class g extends ProtoAdapter<Integer> {
        public g(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Integer c(ic.b bVar) throws IOException {
            return Integer.valueOf(bVar.l());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void g(ic.c cVar, Integer num) throws IOException {
            cVar.n(num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Integer num) {
            return ic.c.e(num.intValue());
        }
    }

    public class h extends ProtoAdapter<Integer> {
        public h(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Integer c(ic.b bVar) throws IOException {
            return Integer.valueOf(bVar.l());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void g(ic.c cVar, Integer num) throws IOException {
            cVar.q(num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Integer num) {
            return ic.c.i(num.intValue());
        }
    }

    public class i extends ProtoAdapter<Integer> {
        public i(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Integer c(ic.b bVar) throws IOException {
            return Integer.valueOf(ic.c.a(bVar.l()));
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void g(ic.c cVar, Integer num) throws IOException {
            cVar.q(ic.c.c(num.intValue()));
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Integer num) {
            return ic.c.i(ic.c.c(num.intValue()));
        }
    }

    public class j extends ProtoAdapter<Integer> {
        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Integer num) {
            return 4;
        }

        public j(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Integer c(ic.b bVar) throws IOException {
            return Integer.valueOf(bVar.i());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void g(ic.c cVar, Integer num) throws IOException {
            cVar.l(num.intValue());
        }
    }

    public class k extends ProtoAdapter<Long> {
        public k(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Long c(ic.b bVar) throws IOException {
            return Long.valueOf(bVar.m());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void g(ic.c cVar, Long l10) throws IOException {
            cVar.r(l10.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Long l10) {
            return ic.c.j(l10.longValue());
        }
    }

    public class l extends ProtoAdapter<Long> {
        public l(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Long c(ic.b bVar) throws IOException {
            return Long.valueOf(bVar.m());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void g(ic.c cVar, Long l10) throws IOException {
            cVar.r(l10.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Long l10) {
            return ic.c.j(l10.longValue());
        }
    }

    public class m extends ProtoAdapter<Long> {
        public m(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Long c(ic.b bVar) throws IOException {
            return Long.valueOf(ic.c.b(bVar.m()));
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void g(ic.c cVar, Long l10) throws IOException {
            cVar.r(ic.c.d(l10.longValue()));
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Long l10) {
            return ic.c.j(ic.c.d(l10.longValue()));
        }
    }

    public class n extends ProtoAdapter<Long> {
        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Long l10) {
            return 8;
        }

        public n(FieldEncoding fieldEncoding, Class cls) {
            super(fieldEncoding, cls);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Long c(ic.b bVar) throws IOException {
            return Long.valueOf(bVar.j());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void g(ic.c cVar, Long l10) throws IOException {
            cVar.m(l10.longValue());
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        f45180d = new f(fieldEncoding, Boolean.class);
        f45181e = new g(fieldEncoding, Integer.class);
        f45182f = new h(fieldEncoding, Integer.class);
        f45183g = new i(fieldEncoding, Integer.class);
        FieldEncoding fieldEncoding2 = FieldEncoding.FIXED32;
        j jVar = new j(fieldEncoding2, Integer.class);
        f45184h = jVar;
        f45185i = jVar;
        f45186j = new k(fieldEncoding, Long.class);
        f45187k = new l(fieldEncoding, Long.class);
        f45188l = new m(fieldEncoding, Long.class);
        FieldEncoding fieldEncoding3 = FieldEncoding.FIXED64;
        n nVar = new n(fieldEncoding3, Long.class);
        f45189m = nVar;
        f45190n = nVar;
        f45191o = new a(fieldEncoding2, Float.class);
        f45192p = new b(fieldEncoding3, Double.class);
        FieldEncoding fieldEncoding4 = FieldEncoding.LENGTH_DELIMITED;
        f45193q = new c(fieldEncoding4, String.class);
        f45194r = new d(fieldEncoding4, ByteString.class);
    }

    public static <M> ProtoAdapter<M> n(Class<M> cls) {
        try {
            return (ProtoAdapter) cls.getField("ADAPTER").get(null);
        } catch (IllegalAccessException | NoSuchFieldException e10) {
            throw new IllegalArgumentException("failed to access " + cls.getName() + "#ADAPTER", e10);
        }
    }

    public static <E extends ic.e> ic.d<E> o(Class<E> cls) {
        return new ic.d<>(cls);
    }

    public static <K, V> ProtoAdapter<Map<K, V>> p(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        return new p(protoAdapter, protoAdapter2);
    }

    public final ProtoAdapter<List<E>> a() {
        ProtoAdapter<List<E>> protoAdapter = this.f45197c;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<List<E>> protoAdapterB = b();
        this.f45197c = protoAdapterB;
        return protoAdapterB;
    }

    public final ProtoAdapter<List<E>> b() {
        return new e(this.f45195a, List.class);
    }

    public final E d(InputStream inputStream) throws IOException {
        ic.a.a(inputStream, "stream == null");
        return e(Okio.buffer(Okio.source(inputStream)));
    }

    public final E e(BufferedSource bufferedSource) throws IOException {
        ic.a.a(bufferedSource, "source == null");
        return c(new ic.b(bufferedSource));
    }

    public final E f(byte[] bArr) throws IOException {
        ic.a.a(bArr, "bytes == null");
        return e(new Buffer().write(bArr));
    }

    public void k(ic.c cVar, int i10, E e10) throws IOException {
        if (e10 == null) {
            return;
        }
        cVar.p(i10, this.f45195a);
        if (this.f45195a == FieldEncoding.LENGTH_DELIMITED) {
            cVar.q(l(e10));
        }
        g(cVar, e10);
    }

    public int m(int i10, E e10) {
        if (e10 == null) {
            return 0;
        }
        int iL = l(e10);
        if (this.f45195a == FieldEncoding.LENGTH_DELIMITED) {
            iL += ic.c.i(iL);
        }
        return iL + ic.c.g(i10);
    }

    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> cls) {
        this.f45195a = fieldEncoding;
        this.f45196b = cls;
    }

    public final void h(OutputStream outputStream, E e10) throws IOException {
        ic.a.a(e10, "value == null");
        ic.a.a(outputStream, "stream == null");
        BufferedSink bufferedSinkBuffer = Okio.buffer(Okio.sink(outputStream));
        i(bufferedSinkBuffer, e10);
        bufferedSinkBuffer.emit();
    }

    public final void i(BufferedSink bufferedSink, E e10) throws IOException {
        ic.a.a(e10, "value == null");
        ic.a.a(bufferedSink, "sink == null");
        g(new ic.c(bufferedSink), e10);
    }

    public final byte[] j(E e10) {
        ic.a.a(e10, "value == null");
        Buffer buffer = new Buffer();
        try {
            i(buffer, e10);
            return buffer.readByteArray();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    public String q(E e10) {
        return e10.toString();
    }
}
