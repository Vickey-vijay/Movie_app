package kotlinx.serialization.json;

import bk.l;
import ck.i;
import ck.p;
import cl.t;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import dl.a1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import nj.b0;
import xk.f;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes8.dex */
@f(with = t.class)
public final class JsonObject extends b implements Map<String, b>, dk.a {
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, b> f63288b;

    /* JADX INFO: compiled from: JsonElement.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final xk.b<JsonObject> serializer() {
            return t.f6120a;
        }
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ b compute(String str, BiFunction<? super String, ? super b, ? extends b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ b computeIfAbsent(String str, Function<? super String, ? extends b> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ b computeIfPresent(String str, BiFunction<? super String, ? super b, ? extends b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean e(String str) {
        p.j(str, C3426d4.i.W);
        return this.f63288b.containsKey(str);
    }

    public boolean f(b bVar) {
        p.j(bVar, "value");
        return this.f63288b.containsValue(bVar);
    }

    public b g(String str) {
        p.j(str, C3426d4.i.W);
        return this.f63288b.get(str);
    }

    public Set<Map.Entry<String, b>> h() {
        return this.f63288b.entrySet();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f63288b.isEmpty();
    }

    public Set<String> j() {
        return this.f63288b.keySet();
    }

    public int l() {
        return this.f63288b.size();
    }

    public Collection<b> m() {
        return this.f63288b.values();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ b merge(String str, b bVar, BiFunction<? super b, ? super b, ? extends b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public b remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ b put(String str, b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends b> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ b putIfAbsent(String str, b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ b replace(String str, b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, b bVar, b bVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super b, ? extends b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JsonObject(Map<String, ? extends b> map) {
        super(null);
        p.j(map, "content");
        this.f63288b = map;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return e((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof b) {
            return f((b) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return p.e(this.f63288b, obj);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ b get(Object obj) {
        if (obj instanceof String) {
            return g((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f63288b.hashCode();
    }

    public String toString() {
        return b0.p0(this.f63288b.entrySet(), StringUtils.COMMA, h.f44171d, h.f44172e, 0, null, new l<Map.Entry<? extends String, ? extends b>, CharSequence>() { // from class: kotlinx.serialization.json.JsonObject.toString.1
            @Override // bk.l
            public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends b> entry) {
                return invoke2((Map.Entry<String, ? extends b>) entry);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final CharSequence invoke2(Map.Entry<String, ? extends b> entry) {
                p.j(entry, "<name for destructuring parameter 0>");
                String key = entry.getKey();
                b value = entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                a1.c(sb2, key);
                sb2.append(':');
                sb2.append(value);
                String string = sb2.toString();
                p.i(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, b>> entrySet() {
        return h();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return j();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return l();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<b> values() {
        return m();
    }
}
